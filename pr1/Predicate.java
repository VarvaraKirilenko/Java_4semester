package ru.mirea2.pr1;

@FunctionalInterface
public interface Predicate<T>{
    boolean test(T t);
}
