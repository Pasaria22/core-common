package com.example.demo.utils;

import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Log4j2
public class ConverterUtils {

    private ConverterUtils() {
    }

    public static <E, T> E convert(T source, Class<E> target) {
        if (source != null) {
            try {
                return new ModelMapper().map(source, target);
            } catch (Exception e) {
                log.error("Error converting object", e);
            }
        }
        return null;
    }

    public static <E, T> List<E> convert(Collection<T> source, Class<E> target) {
        if (source == null) {
            return new ArrayList<>();
        }
        return source.stream().map(o -> convert(o, target)).filter(Objects::nonNull).collect(Collectors.toList());
    }

    public static <E, T> List<E> convert(Iterable<T> source, Class<E> target) {
        if (source == null) {
            return new ArrayList<>();
        }
        return StreamSupport.stream(source.spliterator(), false).map(o -> convert(o, target)).filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
