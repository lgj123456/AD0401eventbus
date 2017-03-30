package com.example.yhdj.ad0401eventbus;

/**
 * Created by yhdj on 2017/3/30.
 */

public class MyEvent {
    private String message;
    public MyEvent(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
