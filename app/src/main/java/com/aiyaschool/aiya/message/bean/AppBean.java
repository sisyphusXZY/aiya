package com.aiyaschool.aiya.message.bean;

/**
 * Created by ShootHzj on 2016/11/2.
 */

public class AppBean {

    private int id;
    private int icon;
    private String funcName;

    public int getIcon() {
        return icon;
    }

    public String getFuncName() {
        return funcName;
    }

    public int getId() {
        return id;
    }

    public AppBean(int icon, String funcName){
        this.icon = icon;
        this.funcName = funcName;
    }
}