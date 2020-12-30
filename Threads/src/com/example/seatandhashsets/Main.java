package com.example.seatandhashsets;

import static com.example.seatandhashsets.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello From Main Thread");

        Thread anotherThread = new anotherThread();
        anotherThread.setName(ANSI_CYAN+"== Another Thread ==");
        anotherThread.start();

        new Thread(() -> System.out.println(ANSI_GREEN+"Hello From an Anonymous Class")).start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED+"Hello From the Anonymous class's implementation of run");
                try{
                    anotherThread.join();
                    System.out.println(ANSI_RED+"Another Thread terminated or Timed Out, so I'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED+"I couldn't wait after all. I was interrupted");
                }
            }
        });
        myRunnableThread.start();
        //anotherThread.interrupt();

        System.out.println(ANSI_PURPLE+"Hello Again from Main Thread");

    }
}
