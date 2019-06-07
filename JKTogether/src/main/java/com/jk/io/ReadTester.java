package com.jk.io;

import java.io.*;

public class ReadTester {
    public static void main(String[] args) {
//        fileInputStreamSample();
//        fileReaderSample();
        bufferedReaderSample();
    }

    private static void bufferedReaderSample() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));
            String readLine = bufferedReader.readLine();
            while (readLine != null) {
                System.out.println(readLine);
                readLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileReaderSample() {
        try {
            FileReader fileReader = new FileReader("data.txt");
            int read = fileReader.read();
            while (read != -1) {
                System.out.print((char)read);
                read = fileReader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileInputStreamSample() {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());

        try {
            // read contents in file
            InputStream inputStream = new FileInputStream(file);
            int readNumOfByte = inputStream.read();
            while (readNumOfByte != -1) {
                System.out.print((char)readNumOfByte);
                readNumOfByte = inputStream.read();
            }
            System.out.println();
        } catch (IOException e) {
            // for develop stage
            e.printStackTrace();
            // for prod.
            System.out.println(e.getMessage());
        }
        System.out.println("open file success");
    }
}
