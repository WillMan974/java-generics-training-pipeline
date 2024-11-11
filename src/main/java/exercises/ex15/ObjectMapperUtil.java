package main.java.exercises.ex15;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static java.util.Objects.isNull;
import static java.util.Optional.empty;
import static java.util.Optional.ofNullable;

/**
 * Utility class for registering and utilizing mappers between different object types.
 * It enables the mapping of one class instance to another class instance using registered mappers.
 */
public class ObjectMapperUtil {
    private final Map<Class<?>, Map<Class<?>, Mapper<?, ?>>> mappers = new HashMap<>();

    public <S, T> void register(Class<S> sourceClass, Class<T> targetClass, Mapper<S, T> mapper) {
        mappers
                .computeIfAbsent(sourceClass, k -> new HashMap<>())
                .put(targetClass, mapper);
    }

    /**
     * Maps an instance of the source class to an instance of the target class using the registered mappers.
     *
     * @param <S> the source type
     * @param <T> the target type
     * @param source the source object to be mapped
     * @param targetClass the target class to map the source object to
     * @return an Optional containing the mapped object if a mapper is found, or an empty Optional if no mapper is found
     */
    @SuppressWarnings("unchecked")
    public <S, T> Optional<T> map(S source, Class<T> targetClass) {
        if (isNull(source)) {
            return empty();
        }
        Map<Class<?>, Mapper<?, ?>> targetMappers = mappers.get(source.getClass());
        if (isNull(targetMappers)) {
            return empty();
        }
        Mapper<S, T> mapper = (Mapper<S, T>) targetMappers.get(targetClass);
        if (isNull(mapper)) {
            return empty();
        }
        return ofNullable(mapper.map(source));
    }
}