package ru.mirea2.pr3;

import java.util.Collection;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

public class MySet implements Set<String> {

    private Set<String> hashSet =  new HashSet<>();

    @Override
    public synchronized String toString() {
        return "MySet{" +
                "hashSet=" + hashSet +
                '}';
    }

    @Override
    public synchronized int size() {
        return hashSet.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return hashSet.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o) {
        return hashSet.contains(o);
    }

    @Override
    public synchronized Iterator<String> iterator() {
        return hashSet.iterator();
    }

    @Override
    public synchronized Object[] toArray() {
        return hashSet.toArray();
    }

    @Override
    public synchronized <T> T[] toArray(T[] a) {
        return hashSet.toArray(a);
    }

    @Override
    public synchronized boolean add(String s) {
        return hashSet.add(s);
    }

    @Override
    public synchronized boolean remove(Object o) {
        return hashSet.remove(o);
    }

    @Override
    public synchronized boolean containsAll(Collection<?> c) {
        return hashSet.containsAll(c);
    }

    @Override
    public synchronized boolean addAll(Collection<? extends String> c) {
        return hashSet.addAll(c);
    }

    @Override
    public synchronized boolean retainAll(Collection<?> c) {
        return hashSet.retainAll(c);
    }

    @Override
    public synchronized boolean removeAll(Collection<?> c) {
        return hashSet.removeAll(c);
    }

    @Override
    public synchronized void clear() {
        hashSet.clear();
    }
}
