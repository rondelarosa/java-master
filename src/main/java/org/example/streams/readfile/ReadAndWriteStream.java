package org.example.streams.readfile;

import java.io.*;
import java.util.Objects;

public class ReadAndWriteStream {
     public static void process() {
         // crete input stream

         readingOneByteAtATime();
         readingOneCharAtATime();
         readLine();
         readingArrayOfBytes();
         readingArrayOfCharacters();
         writeByte();
         writeChar();
     }


    public static void readingOneByteAtATime() {
        // crete input stream
        try (InputStream input = ReadAndWriteStream.class.getResourceAsStream("/inputstream.txt")) {
            int intVal;
            while((intVal = input.read()) >= 0) {
                byte byteVal = (byte) intVal;
                System.out.println("Content > " + byteVal);

            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readingOneCharAtATime() {
        // crete input stream
        try (InputStream input = ReadAndWriteStream.class.getResourceAsStream("/inputstream.txt")) {
            int intVal;
            while((intVal = input.read()) >= 0) {
                char charVal = (char) intVal;
                System.out.println("Content > " + charVal);

            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * BufferReader is an efficient way to read the file in stream
     * @throws IOException
     */
    public static void readLine() {
        // crete input stream
        try (InputStream input = ReadAndWriteStream.class.getResourceAsStream("/inputstream.txt")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println("Content > " + line);

            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readingArrayOfBytes() {
        try (InputStream input = ReadAndWriteStream.class.getResourceAsStream("/inputstream.txt")) {
            int length;
            byte[] byteBuff = new byte[10];
            while((length = input.read(byteBuff)) >= 0) {
                for(int i=0; i< length; i++) {
                    byte byteVal = byteBuff[i];
                    System.out.println("Content > " + byteVal);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readingArrayOfCharacters() {
        try (Reader read = new BufferedReader(new InputStreamReader(Objects.requireNonNull(ReadAndWriteStream.class.getResourceAsStream("/inputstream.txt"))))) {
            int length;
            char[] charBuff = new char[10];
            while((length = read.read(charBuff)) >= 0) {
                for(int i=0; i< length; i++) {
                    char charVal = charBuff[i];
                    System.out.println("Content > " + charVal);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * OutputStream:
     * write(byte)
     * write(byte[])
     */
    public static void writeByte() {
        try (OutputStream output = new FileOutputStream("/Users/ron.dela-rosa/git/hello/Hello/src/main/resources/outputstream.txt")) {
            byte byteVal = 100;
            output.write(byteVal);

            byte[] byteBuff = { 0, 63, 127};
            output.write(byteBuff);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeChar() {

        /**
         * BufferedWriter - maintains an internal buffer of 8192 characters, faster operation.
         * During the write operation, the characters are written to the internal buffer instead of the disk.
         * Once the buffer is filled or the writer is closed, the whole characters in the buffer are written to the disk.
         * Hence, the number of communication to the disk is reduced.
         * This is why writing characters is faster using BufferWriter
         */
        try (
                FileWriter file = new FileWriter("/Users/ron.dela-rosa/git/hello/Hello/src/main/resources/outputstream.txt");
                BufferedWriter output = new BufferedWriter(file)
        ) {
            char charVal = 't';
            output.write(charVal);

            output.newLine();
            char[] charBuff = {'a', 'b', 'c'};
            output.write(charBuff);

            output.newLine();
            String stringVal = "Hello world";
            output.write(stringVal);

            output.newLine();
            String appendVal = "Hello world in new line";
            output.append(appendVal);

            // To clear the internal buffer.
            // This method forces the writer to write all data present in the buffer to the destination file.
            output.flush();

            // not needed as it's enclosed with try-resource which inherited auto-closeable interface
//            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
