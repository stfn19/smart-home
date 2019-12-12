package com.example.piu.model;

public class DeviceRow {
    private Integer image;
    private String name;

    public DeviceRow(Integer image, String name) {
        this.image = image;
        this.name = name;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
