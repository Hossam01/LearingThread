package com.example.learingthread;

import android.util.Log;

public class Test extends Thread {
    @Override
    public void run() {
        Log.d("tttt", "test class thread is   >"+Thread.currentThread().getName());
    }
}
