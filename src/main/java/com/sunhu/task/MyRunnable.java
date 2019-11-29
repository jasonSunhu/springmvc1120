package com.sunhu.task;

import java.util.Date;

/**
 * Created by Administrator on 2019/11/28.
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.print("业务执行了" + new Date());
    }
}
