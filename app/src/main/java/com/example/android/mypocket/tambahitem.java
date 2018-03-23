package com.example.android.mypocket;

/**
 * Created by Kizuna on 23-Mar-18.
 */

public class tambahitem {
    String id;
    String name;
    String temp;
    String Desc;

    public tambahitem(){

    }

    public tambahitem(String id, String name, String temp, String desc) {
        this.id = id;
        this.name = name;
        this.temp = temp;
        Desc = desc;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTemp() {
        return temp;
    }

    public String getDesc() {
        return Desc;
    }
}
