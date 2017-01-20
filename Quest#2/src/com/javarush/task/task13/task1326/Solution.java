package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
       // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        InputStream inStream= new FileInputStream(scanner.nextLine());

       // ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt())
        {
            int g = scanner.nextInt();
            if (g % 2 == 0)
                System.out.println(g);
            else continue;
        }

       // for ( Integer text : list)
       // {
       //     System.out.println(text);
      //  }
        inStream.close();
        scanner.close();
       // Collections.sort(list);
       // for (int i = 0; i < list.size(); i++)
       // {
       //     int b = list.get(i);
       //     if (b % 2 == 0)
               // System.out.println(b);
        //    else continue;
        }
    }





/*
    InputStream inStream= new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while (inStream.available() > 0)
        {
            System.out.println(inStream.readline);



           // list.add(inStream.read());// напишите тут ваш код
        }

        for ( Integer text : list)
        {
            System.out.println(text);
        }
        reader.close();
        inStream.close();
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++)
        {
            int b = list.get(i);
            if (b % 2 == 0)
                System.out.println(b);
            else continue;
        }
    }
}
*/