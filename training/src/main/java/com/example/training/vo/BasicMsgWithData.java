package com.example.training.vo;

public class BasicMsgWithData<T> extends BasicMsg {
    private T data;

    public BasicMsgWithData() {
    }

    public BasicMsgWithData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}