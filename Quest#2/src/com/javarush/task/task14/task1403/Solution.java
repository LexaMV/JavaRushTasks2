package com.javarush.task.task14.task1403;

/* 
Building и School
*/

public class Solution {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool()
    {
          School school = new School();        //измените null на объект класса Building или School
        return school;
    }

    public static Building getBuilding() {

        Building shop = new Building();//измените null на объект класса Building или School
        return shop;
    }

    static class School extends Building/*Добавьте сюда ваш код*/ {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building /*Добавьте сюда ваш код*/ {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
