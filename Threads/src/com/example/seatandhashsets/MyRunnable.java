package com.example.seatandhashsets;

import static com.example.seatandhashsets.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED+"Hello From Runnable");
    }
}
