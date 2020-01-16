package com.example.piu.model;

public class SavedRule {
    private String name;
    private Integer removeImg;

    public SavedRule(String name, Integer removeImg) {
        this.name = name;
        this.removeImg = removeImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRemoveImg() {
        return removeImg;
    }

    public void setRemoveImg(Integer removeImg) {
        this.removeImg = removeImg;
    }
}
