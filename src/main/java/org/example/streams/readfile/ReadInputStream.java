package org.example.streams.readfile;

import java.io.*;

public class ReadInputStream {
     public static void process() {
         // crete input stream
         try {
//             readingOneByteAtATime();
//             readingOneCharAtATime();
             readLine();
         } catch(Exception ex) {
             ex.printStackTrace();
         }
     }

    public static void readingOneByteAtATime() throws IOException {
        // crete input stream
        try (InputStream input = ReadInputStream.class.getResourceAsStream("/inputstream.txt")) {
            int intVal;
            while((intVal = input.read()) >= 0) {
                byte byteVal = (byte) intVal;
                System.out.println("Content > " + byteVal);

            }
        }
    }

    public static void readingOneCharAtATime() throws IOException {
        // crete input stream
        try (InputStream input = ReadInputStream.class.getResourceAsStream("/inputstream.txt")) {
            int intVal;
            while((intVal = input.read()) >= 0) {
                char charVal = (char) intVal;
                System.out.println("Content > " + charVal);

            }
        }
    }

    /**
     * BufferReader is an efficient way to read the file in stream
     * @throws IOException
     */
    public static void readLine() throws IOException {
        // crete input stream
        try (InputStream input = ReadInputStream.class.getResourceAsStream("/inputstream.txt")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println("Content > " + line);

            }
        }
    }
}
