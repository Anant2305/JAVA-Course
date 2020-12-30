package com.example.seatandhashsets;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Pipe;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Random;
import java.util.concurrent.RunnableScheduledFuture;

public class Main {

    public static void main(String[] args) {
        try(FileOutputStream binFile = new FileOutputStream("data.txt");
            FileChannel binChannel = binFile.getChannel();) {

            //writing mixed data type blocks data to buffer before writing to file
            ByteBuffer buffer = ByteBuffer.allocate(100);

            //Chain put methods
//            byte[] outputBytes = "Hello World!".getBytes();
//            byte[] outputBytes2 = "Nice to meet you".getBytes();
//            buffer.put(outputBytes).putInt(245).putInt(-98765).put(outputBytes2).putInt(1000);
//            buffer.flip();

//            byte[] outputBytes = "Hello World!".getBytes();
//            buffer.put(outputBytes);
//            buffer.putInt(245);
//            buffer.putInt(-98765);
//            byte[] outputBytes2 = "Nice to meet you".getBytes();
//            buffer.put(outputBytes2);
//            buffer.putInt(1000);
//            buffer.flip();

            //Read File in reverse order
            byte[] outputBytes = "Hello World!".getBytes();
            buffer.put(outputBytes);
            long int1Pos = outputBytes.length;
            buffer.putInt(245);
            long int2Pos = int1Pos + Integer.BYTES;
            buffer.putInt(-98765);
            byte[] outputBytes2 = "Nice to meet you".getBytes();
            buffer.put(outputBytes2);
            long int3Pos = int2Pos + Integer.BYTES + outputBytes2.length;
            buffer.putInt(1000);
            buffer.flip();

            binChannel.write(buffer);

            RandomAccessFile ra = new RandomAccessFile("data.txt", "rwd");
            FileChannel channel = ra.getChannel();

            ByteBuffer readBuffer = ByteBuffer.allocate((Integer.BYTES));
            channel.position(int3Pos);
            channel.read(readBuffer);
            readBuffer.flip();
            System.out.println("int 3 = " + readBuffer.getInt());

            readBuffer.flip();
            channel.position(int2Pos);
            channel.read(readBuffer);
            readBuffer.flip();
            System.out.println("int 2 = " + readBuffer.getInt());

            readBuffer.flip();
            channel.position(int1Pos);
            channel.read(readBuffer);
            readBuffer.flip();
            System.out.println("int 1 = " + readBuffer.getInt());

            //Using File Chaneel to create copy of a file.
            RandomAccessFile copyFile = new RandomAccessFile("datacopy.dat", "rw");
            FileChannel copyChannel = copyFile.getChannel();
            channel.position(0);
//            long numTransferred = copyChannel.transferFrom(channel, 0, channel.size());
            long numTransferred = channel.transferTo(0, channel.size(), copyChannel);
            System.out.println("Num transferred = " + numTransferred);

            channel.close();
            ra.close();
            copyChannel.close();

            //Write random text to file and store in buffer positions
//            byte[] outputString = "Hello, WOrld!".getBytes();
//            long str1Pos = 0;
//            long newInt1Pos = outputString.length;
//            long newInt2Pos = newInt1Pos + Integer.BYTES;
//            byte[] outputString2 = "nice to meet you".getBytes();
//            long str2Pos = newInt1Pos + Integer.BYTES;
//            long newInt3Pos = str2Pos + outputBytes2.length;
//
//            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
//            intBuffer.putInt(245);
//            intBuffer.flip();
//            binChannel.position(newInt1Pos);
//            binChannel.write(intBuffer);
//
//            intBuffer.flip();
//            intBuffer.putInt(-98765);
//            intBuffer.flip();
//            binChannel.position(newInt2Pos);
//            binChannel.write(intBuffer);
//
//            intBuffer.flip();
//            intBuffer.putInt(-1000);
//            intBuffer.flip();
//            binChannel.position(newInt3Pos);
//            binChannel.write(intBuffer);
//
//            binChannel.position(str1Pos);
//            binChannel.write(ByteBuffer.wrap(outputString));
//            binChannel.position(str2Pos);
//            binChannel.write(ByteBuffer.wrap(outputString2));


            //read mixed data types in one go using random.
//            RandomAccessFile ra = new RandomAccessFile("data.txt", "rwd");
//            FileChannel channel = ra.getChannel();
//
//            ByteBuffer readBuffer = ByteBuffer.allocate(100);
//            channel.read(readBuffer);
//            readBuffer.flip();
//            byte[] inputString = new byte[outputBytes.length];
//            readBuffer.get(inputString);
//            System.out.println("inputString = " + new String(inputString));
//            System.out.println("int 1 = " + readBuffer.getInt());
//            System.out.println("int 2 = " + readBuffer.getInt());
//            byte[] inputString2 = new byte[outputBytes2.length];
//            readBuffer.get(inputString2);
//            System.out.println("inputString = " + new String(inputString2));
//            System.out.println("int 1 = " + readBuffer.getInt());



            //Read and write to a binary file
//            ByteBuffer buffer = ByteBuffer.allocate(outputBytes.length);
//            buffer.put(outputBytes);
//            buffer.flip();
//            int numBytes =  binChannel.write(buffer);
//            System.out.println("numBytes written was " + numBytes);
//
//            //write integer to binary files.
//            ByteBuffer intBuffer = ByteBuffer.allocate((Integer.BYTES));
//            intBuffer.putInt(245);
//            intBuffer.flip();
//            numBytes = binChannel.write(intBuffer);
//            System.out.println("numBytes written was: " + numBytes);
//
//            intBuffer.flip();
//            intBuffer.putInt(-98765);
//            intBuffer.flip();
//            numBytes = binChannel.write(intBuffer);
//            System.out.println("numBytes written was: " + numBytes);
//
//            //read STRING using JAVA NIO
//            RandomAccessFile ra = new RandomAccessFile("data.txt", "rwd");
//            FileChannel channel = ra.getChannel();
//            outputBytes[0] = 'a';
//            buffer.flip();
//            long numBytesRead = channel.read(buffer);
//            if(buffer.hasArray()){
//                System.out.println("byte buffer = " + new String(buffer.array()));
//                //System.out.println("byteBuffer =  " + new String(outputBytes));
//            }
//
//            //read INTEGER using JAVA NIO
//
//            //Relative Read
////            intBuffer.flip();
////            numBytesRead = channel.read(intBuffer);
////            intBuffer.flip();
////            System.out.println(intBuffer.getInt());
////            intBuffer.flip();
////            numBytesRead = channel.read(intBuffer);
////            intBuffer.flip();
////            System.out.println(intBuffer.getInt());
//
//            //absolute read
////            intBuffer.flip();
////            numBytesRead = channel.read(intBuffer);
////            System.out.println(intBuffer.getInt(0));
////            intBuffer.flip();
////            numBytesRead = channel.read(intBuffer);
////            System.out.println(intBuffer.getInt(0));
//
//            //Reading both relative and absolute reads
//            //Relative read requires further flip() usage.
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            System.out.println(intBuffer.getInt(0));  //absolute read
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt(0));  //absolute read
//            System.out.println(intBuffer.getInt());          //relative read
//            channel.close();
//            ra.close();

            //read using Random Access file method
//            RandomAccessFile ra = new RandomAccessFile("data.txt", "rwd");
//            byte[] b = new byte[outputBytes.length];
//            ra.read(b);
//            System.out.println(new String(b));
//
//            long int1 = ra.readInt();
//            long int2 = ra.readInt();
//            System.out.println(int1);
//            System.out.println(int2);

//            FileInputStream file = new FileInputStream("data.txt");
//            FileChannel channel = file.getChannel();

            //READ and Write to a text file
//            Path dataPath = FileSystems.getDefault().getPath("data.txt");
//            Files.write(dataPath, "\nLine 5".getBytes("UTF-8"), StandardOpenOption.APPEND);
//            List<String> lines = Files.readAllLines(dataPath);
//            for(String line : lines) {
//                System.out.println(line);
//            }
        } catch(IOException e ){
            e.printStackTrace();
        }

        //Create a file using pipe and thread method
        try{
            Pipe pipe = Pipe.open();
            Runnable writer = new Runnable() {
                @Override
                public void run() {

                    //WRITE METHOD
                    try{
                        Pipe.SinkChannel sinkChannel = pipe.sink();
                        ByteBuffer buffer = ByteBuffer.allocate(56);

                        for(int i=0; i<10; i++) {
                            String currentTime = "The time is: " + System.currentTimeMillis();

                            buffer.put(currentTime.getBytes());
                            buffer.flip();

                            while(buffer.hasRemaining()){
                                sinkChannel.write(buffer);
                            }
                            buffer.flip();
                            Thread.sleep(100);
                        }

                    }catch(Exception e ){
                        e.printStackTrace();
                    }
                }
            };

            //READ METHOD
            Runnable reader = new Runnable() {
                @Override
                public void run() {
                    try{
                        Pipe.SourceChannel sourceChannel = pipe.source();
                        ByteBuffer buffer = ByteBuffer.allocate(50);

                        for(int i=0; i<10; i++){
                            int byteRead = sourceChannel.read(buffer);
                            byte[] timeString = new byte[byteRead];
                            buffer.flip();
                            buffer.get(timeString);
                            System.out.println("Read Thread: = " + new String(timeString));
                            buffer.flip();
                            Thread.sleep(100);
                        }

                    }catch(Exception e ){
                        e.printStackTrace();
                    }
                }
            };

            new Thread(writer).start();
            new Thread(reader).start();

        } catch(IOException e ){
        e.printStackTrace();
    }
    }
}
