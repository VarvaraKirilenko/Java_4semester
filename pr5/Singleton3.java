package ru.mirea2.pr5;

public class Singleton3 {

    private Singleton3(){}

    private static class Singleton3Holder{
        public static final Singleton3 holderInstance = new Singleton3();
    }

    private static Singleton3 getInstance(){
        return Singleton3Holder.holderInstance;
    }
}
