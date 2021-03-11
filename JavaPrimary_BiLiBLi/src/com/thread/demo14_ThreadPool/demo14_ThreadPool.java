package com.thread.demo14_ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Christine
 * @date 2020-06-19 8:47
 */
public class demo14_ThreadPool {
    public static void main(String[] args) {
        //1.使用线程池的工厂类
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new RunnableImpl());  //pool-1-thread-1创建了一个新的线程
        executorService.submit(new RunnableImpl());  //pool-1-thread-1创建了一个新的线程
        executorService.submit(new RunnableImpl());  //pool-1-thread-2创建了一个新的线程
    }
}
