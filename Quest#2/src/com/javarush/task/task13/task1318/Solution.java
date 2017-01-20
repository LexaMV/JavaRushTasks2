package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/


                public class Solution
                {
                    public static void main(String[] args) throws IOException
                    {
                        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                        String name = reader.readLine();
                        InputStream inStream = new FileInputStream("d:/" + name);
                        while (inStream.available()>0)
                        {
                            System.out.print((char)inStream.read());
                        }
                        inStream.close();
                        reader.close();
                    }
                }





