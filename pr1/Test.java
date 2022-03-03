package ru.mirea2.pr1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        Task t = new Task(n);
        System.out.println(t.test(n));
    }
}
