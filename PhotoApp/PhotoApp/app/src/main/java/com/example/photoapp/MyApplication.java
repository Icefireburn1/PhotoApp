package com.example.photoapp;

import android.app.Application;
import android.net.Uri;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application {
    public List<Uri> getUriList() {
        return uriList;
    }

    public void setUriList(List<Uri> uriList) {
        this.uriList = uriList;
    }

    List<Uri> uriList = new ArrayList<>();

    public MyApplication() {
        this.uriList = new ArrayList<>();
    }
}
