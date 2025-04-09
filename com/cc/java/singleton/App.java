package com.cc.java.singleton;

import com.cc.java.tools.Helper;

public class App {

    public static void main(String[] args) {

        // Klassische Instanziierung

        Singleton obj = new Singleton();
        Helper.output(obj);

        Singleton obj1 = new Singleton();
        Helper.output(obj1);
        
    }


}
