package com.example.learingthread;

import android.os.Handler;
import android.os.HandlerThread;

public class TaskHandlerThread extends HandlerThread {
    private Handler mTaskHandler;

    public TaskHandlerThread(String name) {
        super(name);
    }

    public void postTask(Runnable task) {
        mTaskHandler.post(task);
    }

    public void prepareHandler() {
        mTaskHandler = new Handler(getLooper());
    }
}
