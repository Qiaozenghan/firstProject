package com.example.demo.test;

import com.alibaba.fastjson.JSON;
import org.springframework.scheduling.concurrent.CustomizableThreadFactory;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @ClassName TT
 * @Description TODO
 * @Author qzh
 * @Date 2022/1/3 1:18 下午
 * @Version 1.0
 **/
public class TT {
    public static void main(String[] args) throws InterruptedException {
//        ByteBuffer allocate = ByteBuffer.allocate(10);
//        System.out.println(allocate.position());
//        allocate.put((byte)1);
//        System.out.println(allocate.position());
//        RestTemplate restTemplate = new RestTemplate();
//        ArrayBlockingQueue


//
//        String path = "/users/qiaozenghan/downloads/01.txt";
//        ZipOutputStream zipOutputStream = null;
//        try{
//            zipOutputStream = new ZipOutputStream(new FileOutputStream("/users/qiaozenghan/downloads/02.zip"));
//            String line = "aaa";
//            zipOutputStream.putNextEntry(new ZipEntry("02.txt"));
//            zipOutputStream.write(line.getBytes(StandardCharsets.UTF_8));
//
//
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }finally {
//            if(zipOutputStream != null ){
//                try {
//                    zipOutputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }


//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (; ; ) {
//                    if (Thread.currentThread().interrupted()) {
//                        System.out.println("===>" + true);
//                        System.out.println(Thread.currentThread().isInterrupted());
//                        break;
//                    } else {
//                        System.out.println("===>" + false);
//                    }
//                }
//            }
//        });
//        thread.start();
//        Thread.currentThread().sleep(10);
//        thread.interrupt();


        System.out.println(String.class.getName());
    }
}
