package com.example.learingthread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    TaskHandlerThread mTaskHandlerThread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Test().start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Log.d("tttt", "thread is >" + Thread.currentThread().getName());
            }
        };
        runnable.run();


        new Thread(new TestRunnable()).start();


        TaskHandlerThread mTaskHandlerThread = new TaskHandlerThread("TaskHandlerThread");
        mTaskHandlerThread.start();
        mTaskHandlerThread.prepareHandler();
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                //Main task execution logic here
                Log.d("tttt", "Handler thread is >" + Thread.currentThread().getName());

            }
        };
        mTaskHandlerThread.postTask(myRunnable);

    }
    @ Override
    protected void onDestroy() {
        mTaskHandlerThread.quit();
        super.onDestroy();
    }
}
