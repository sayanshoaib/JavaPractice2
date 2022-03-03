package com.company.socket_programming;

class NewThread implements Runnable {

    Thread t;
    int threadNum;
    int time;

    public NewThread(int threadNum, int time) {
        t = new Thread(this, "Runnable Thread");
        this.threadNum = threadNum;
        this.time = time;
        t.start();
    }

    @Override
    public void run() {
        for (int n = 1; n <= 5; n++) {
            System.out.println(threadNum + " - Child Thread: " + n);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Exiting child Thread...");
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        System.out.println("Main Thread started...");
        NewThread obj1 = new NewThread(1, 500);
        NewThread obj2 = new NewThread(2, 500);
        System.out.println("Thread 1 is alive: " + obj1.t.isAlive());
        System.out.println("Thread 2 is alive: " + obj2.t.isAlive());

        try {
            obj1.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exited...");

    }
}
