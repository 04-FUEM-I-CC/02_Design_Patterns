package com.cc.java.singleton;

import com.cc.java.tools.Helper;

public class App {

    public static void main(String[] args) {

        // Klassische Instanziierung

        // Singleton obj = new Singleton();  // das geht nicht mehr !
        // Helper.output(obj);

        Singleton obj1 = Singleton.getInstance();
        Helper.output(obj1);


        Singleton obj2 = Singleton.getInstance();
        Helper.output(obj2);


        
        Singleton obj3 = Singleton.getInstance();
        Helper.output(obj3);


        
    }


}
