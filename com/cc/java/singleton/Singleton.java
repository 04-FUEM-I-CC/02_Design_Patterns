package com.cc.java.singleton;

public class Singleton {

    private static Singleton instance;  // Klasse

    private int counter; // Objekt

    private Singleton(){

    }  

    // ... in der Klasse

    public static Singleton getInstance() {
    
        if (instance == null) {
            return instance = new Singleton();
        }
        return instance;   
        
        // return instance == null ? instance = new Singleton() : instance;
    
    }
    
        // ... im Objekt

        // Getter für counter
        public int getCounter() {
            return counter;
        }

        // Event? --> counter  = counter + 1
        public void actOnEvent() {
            counter ++;
        }








}
