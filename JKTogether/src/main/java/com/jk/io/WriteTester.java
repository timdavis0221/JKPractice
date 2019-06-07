package com.jk.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {
//        createAnyNecessaryFolderAndWriteOut();
        createOneFolderAndWriteOut();
    }

    private static void createOneFolderAndWriteOut() throws IOException {
        File jkDir = new File("D:\\jk");
        if (jkDir.mkdir()) {
            FileWriter fileWriter = new FileWriter(jkDir.getAbsolutePath() + "\\out.txt");
            fileWriter.write("abcd");
            fileWriter.flush();
            fileWriter.close();
            System.out.println("create folder and write some contents success");
        }
        else {
            System.out.println("create failed");
        }
    }

    private static void createAnyNecessaryFolderAndWriteOut() throws IOException {
        File jkDir = new File("D:\\bb\\haha\\ya");
        if (jkDir.mkdirs()) {
            /*
             * new FileWriter("out.txt");
             * out.txt will save under project
             */
            FileWriter fileWriter = new FileWriter(jkDir.getAbsolutePath() + "\\out.txt");
            fileWriter.write("abc");
            fileWriter.flush();
            fileWriter.close();
            System.out.println("create any necessary parent folder success !");
        }
        else {
            System.out.println("create failed");
        }
    }
}
