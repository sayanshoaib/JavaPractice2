package com.company.socket_programming.chat_application;

import java.io.Serializable;

public class Data implements Serializable, Cloneable {
    public String message;

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
