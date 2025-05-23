package com.nextgen.data.platform.datafoundation.builder_pattern.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class GenericBuilder<T> {
    private final Supplier<T> supplier;

    private final List<Function<T,T>> modifiers = new ArrayList<>();

    private GenericBuilder(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public static <T> GenericBuilder<T> of(Supplier<T> supplier) {
        return new GenericBuilder<>(supplier);
    }

    public GenericBuilder<T> with(Function<T,T> modifier) {
        modifiers.add(modifier);
        return  this;

    }

    public T build() {
        T value = supplier.get();
        for (Function<T, T> modifier : modifiers) {
            value = modifier.apply(value);
        }
        return value;
    }
}
