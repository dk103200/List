package com.example.lists;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class Profile {
    private String  name;
    private String address,phone;
    
    private Integer hinh;

    public Profile(String name, String address, String phone, Integer hinh) {
        this.name = name;
        this.address = address;
        this.hinh = hinh;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

      public Integer getHinh() {
        return hinh;
    }

    public void setHinh(Integer hinh) {
        this.hinh = hinh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
