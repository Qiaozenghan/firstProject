package com.example.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws IOException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10,
                TimeUnit.HOURS, new LinkedBlockingQueue<>(1),
                Executors.defaultThreadFactory(),
                new RejectedExecutionHandler() {
                    @Override
                    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

                    }
                }
        );

        threadPoolExecutor.execute(()->{
            for(int i = 0; i < 10; i++){
                try {
                    Thread.currentThread().sleep(500);
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("a===>"+i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadPoolExecutor.execute(()->{
            for(int i = 10; i < 20; i++){
                try {
                    System.out.println("b===>"+i);
                    System.out.println(Thread.currentThread().getName());

                    Thread.currentThread().sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadPoolExecutor.execute(()->{
            for(int i = 20; i < 30; i++){
                try {
                    System.out.println("c===>"+i);
                    System.out.println(Thread.currentThread().getName());

                    Thread.currentThread().sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadPoolExecutor.shutdown();


//        Proxy.newProxyInstance();

    }

    //two 1
    //a
}
