package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("001", "Quan", new Clazz("1","C0621H1")));
        students.add(new Student("002", "Quan1", new Clazz("1","C0621H1")));
        students.add(new Student("003", "Quan2", new Clazz("1","C0621H1")));
        students.add(new Student("004", "Quan3", new Clazz("1","C0621H1")));
        writeToBinaryFile(students);
//        List<Student> studentListFromFile = new ArrayList<>();
//        studentListFromFile = readObjectFromFile();
//        for (Student student:studentListFromFile) {
//            System.out.println(student);
//        }
    }

    private static List<Student> readObjectFromFile() {
        List<Student> studentListFromFile = new ArrayList<>();
        try {
            InputStream is = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(is);
            studentListFromFile = (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return studentListFromFile;
    }

    private static void writeToBinaryFile(List<Student> students) {
        try {
            OutputStream os = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(students);
            oos.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
