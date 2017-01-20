package com.javarush.task.task12.task1224;

/* 
Что это? «Кот», «Тигр», «Лев», «Бык», «хз»
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String s = null;
        if(o.getClass().getSimpleName().equals("Cat"))
        {
           s = "Кот";
        }

            else if(o.getClass().getSimpleName().equals("Tiger"))

        {
            s = "Тигр";
        }
        else if(o.getClass().getSimpleName().equals("Lion"))
        {
            s = "Лев";
        }
        else if(o.getClass().getSimpleName().equals("Bull"))
        {
            s = "Бык";
        }
        else
        {
             s = "хз";
        }

                        return s;//напишите тут ваш код


    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
