package com.mycompany.bai3_thread_runnable;

public class Bai3_Thread_Runnable {

    public static void main(String[] args) {
        WorkerThread thread1 = new WorkerThread();
        thread1.start();

        WorkerRunnable runnable = new WorkerRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}