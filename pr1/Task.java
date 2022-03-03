package ru.mirea2.pr1;

public class Task implements Predicate<Integer>{

    int n;
    public Task (Integer n) {
        this.n = n;
    }

    @Override
    public boolean test(Integer n) {
        int i = 1;
        while (i<n) {
            i = i * 2;
            if (n == i)
                return true;
        }
        return false;
    };
}
