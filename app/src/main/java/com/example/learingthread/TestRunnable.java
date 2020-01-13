package com.example.learingthread;

import android.util.Log;

public class TestRunnable implements Runnable {
    @Override
    public void run() {
        Log.d("tttt", "testRunnable class thread is >"+Thread.currentThread().getName());
    }

}
