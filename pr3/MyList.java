package ru.mirea2.pr3;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyList implements List<String> {

    List<String> myList = new ArrayList<>();
    private Lock lock = new ReentrantLock();

    @Override
    public String toString() {
        lock.lock();
        try {
            return "MyList{" +
                    "myList=" + myList +
                    ", lock=" + lock +
                    '}';
        } finally {
            lock.unlock();
        }
    }

    @Override
    public int size() {
        lock.lock();
        try {
            return myList.size();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean isEmpty() {
        lock.lock();
        try {
            return myList.isEmpty();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean contains(Object o) {
        lock.lock();
        try {
            return myList.contains(o);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public Iterator<String> iterator() {
        lock.lock();
        try {
            return myList.iterator();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public Object[] toArray() {
        lock.lock();
        try {
            return myList.toArray();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public <T> T[] toArray(T[] a) {
        lock.lock();
        try {
            return myList.toArray(a);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean add(String s) {
        lock.lock();
        try {
            return myList.add(s);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean remove(Object o) {
        lock.lock();
        try {
            return myList.remove(o);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        lock.lock();
        try {
            return myList.containsAll(c);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        lock.lock();
        try {
            return myList.addAll(c);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        lock.lock();
        try {
            return myList.addAll(index, c);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        lock.lock();
        try {
            return myList.removeAll(c);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        lock.lock();
        try {
            return myList.retainAll(c);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void clear() {
        lock.lock();
        try {
            myList.clear();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String get(int index) {
        lock.lock();
        try {
            return myList.get(index);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String set(int index, String element) {
        lock.lock();
        try {
            return myList.set(index, element);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void add(int index, String element) {
        lock.lock();
        try {
            myList.add(index, element);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String remove(int index) {
        lock.lock();
        try {
            return myList.remove(index);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public int indexOf(Object o) {
        lock.lock();
        try {
            return myList.indexOf(o);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public int lastIndexOf(Object o) {
        lock.lock();
        try {
            return myList.lastIndexOf(o);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public ListIterator<String> listIterator() {
        lock.lock();
        try {
            return myList.listIterator();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        lock.lock();
        try {
            return myList.listIterator(index);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        lock.lock();
        try {
            return myList.subList(fromIndex, toIndex);
        } finally {
            lock.unlock();
        }
    }
}
