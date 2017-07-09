package com.lolita.example;


import com.lolita.annotations.TimingDebug;

/**
 * Created by HuaChao on 2016/7/4.
 */
public class AlphaTest {

    public AlphaTest() {
        eat();
        sleep(1, 10,  "gg");
    }

    private int a = 0;

    @TimingDebug
    public void eat() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a = 5;
    }

//    @ParameterDebug
    private void sleep(int begin, double second , String hah) {
        a = 10;
    }

    private void run() {
        a = 15;
    }

}