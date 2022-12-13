package com.nayeem.sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

@FunctionalInterface
public interface Sort<T> {

    T[] doSort(T[] list);

    default void print(T[] list, boolean isSorted){
        System.out.print((isSorted ? "" : "un") + "sorted: ");
        System.out.println(Arrays.stream(list)
                .map(i -> String.valueOf(i))
                .collect(Collectors.joining(",")));
    }

}
