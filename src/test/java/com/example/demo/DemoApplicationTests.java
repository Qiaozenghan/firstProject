package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("ttttt");
        System.out.println("loud");
    }

    @Test
    void inputChannel() throws IOException {

        //通过file创建Channel
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile("/Users/qiaozenghan/Downloads/sfsf.txt", "rw");
//            FileInputStream fileInputStream = new FileInputStream("/Users/qiaozenghan/Downloads/sfsf.txt");
//            FileChannel channel = fileInputStream.getChannel();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        FileChannel channel = randomAccessFile.getChannel();

        //创建buffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        //读取
        int read = 0;
        while ((read = channel.read(byteBuffer)) != -1) {
            System.out.println("duqu==>" + read);
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                System.out.println((char) byteBuffer.get());
            }
            byteBuffer.clear();
        }
        randomAccessFile.close();

    }

    @Test
    void outputChannel() throws IOException {
        //创建channel
        RandomAccessFile file = new RandomAccessFile("/Users/qiaozenghan/Downloads/01.txt", "rw");
        FileChannel channel = file.getChannel();

        //创建缓冲区和数据
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        String str = "我是恁爹";

        //写入缓冲区
        byteBuffer.put(str.getBytes());
        byteBuffer.flip();

        //最终写入Channel
        while (byteBuffer.hasRemaining()) {
            channel.write(byteBuffer);
        }
        file.close();
        channel.close();


    }

    @Test
    void transferFromAndTo() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/qiaozenghan/Downloads/sfsf.txt");
        FileChannel channelFrom = fileInputStream.getChannel();

        FileOutputStream fileOutputStream = new FileOutputStream("/Users/qiaozenghan/Downloads/01.txt");
        FileChannel channelTo = fileOutputStream.getChannel();

        int position = 0;
        long size = channelFrom.size();
        channelTo.transferFrom(channelFrom, position, size);

        channelTo.close();
        fileOutputStream.close();
        channelFrom.close();
        fileInputStream.close();


    }

    @Test
    void test1() throws IOException {


    }

}
