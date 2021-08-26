package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
//        writeToBinaryFile("demo.txt");
        readBinaryFile();
    }

    private static void readBinaryFile() {
        try {
            FileInputStream fis = new FileInputStream("demo.txt");
            DataInputStream dis = new DataInputStream(fis);
            while (true) {
                System.out.print((char) dis.readByte());
            }
        } catch (EOFException ex) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToBinaryFile(String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            DataOutputStream dos = new DataOutputStream(fos);
            String message = "Hello";
            dos.writeBytes(message);
            dos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
