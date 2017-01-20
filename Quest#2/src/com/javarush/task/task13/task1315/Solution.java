package com.javarush.task.task13.task1315;

/* 
Dog, Cat и Mouse
*/

public class Solution {
    public static void main(String[] args) {

    }
    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Eatable {
        void eaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    public abstract class Mouse implements Eatable, Movable
    {

    }

    public abstract class Cat implements Eatable, Movable, Eat
    {

    }

    public abstract class Dog implements Eat, Movable
    {

    }
}