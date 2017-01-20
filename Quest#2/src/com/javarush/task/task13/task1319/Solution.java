package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Запись в файл с консоли
*/

public class Solution {
 public static void main(String[] args) throws IOException {
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(in.readLine())));

        while (true) {
        String inputLine = in.readLine();

        out.write(inputLine);
        out.newLine();
        if (inputLine.equals("exit")) break;
        }

        in.close();
        out.close();
        }
        }






//public class Solution {
  //  public static void main(String[] args) throws IOException {
     //   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     //   String s = reader.readLine();
    //    BufferedWriter writer = new BufferedWriter(new FileWriter("c:/+" + s + ".txt"));
    //    writer.write(s+"\r\n");
    //    while (true) {

    //        String b = reader.readLine();
    //        writer.write(b);
   //        if (b.equals("exit")) {

    //            break;
   //         }
    //        writer.newLine();
   //     }
  //      writer.close();
//
 //   }
//}


       //String b = reader.readLine();
     //  while (b.available > 0)



     //   while (inStream.available() > 0)
     //   {
      //     int data = inStream.read()
       // }
  //
      //  InputStream inStream = new FileInputStream("c:/source.txt");
       // OutputStream outStream = new FileOutputStream("c:/result.txt");
// while (inStream.available() > 0)
       // {
       //     int data = inStream.read(); //читаем один байт из потока для чтения
       //    outStream.write(data); //записываем прочитанный байт в другой поток.
       // }

       // inStream.close(); //закрываем потоки
       // outStream.close();






   // }
//}
