package com.example.piu.services;

import com.example.piu.model.DeviceRow;

import java.util.ArrayList;
import java.util.List;

public class DeviceRowService {
    public static List<DeviceRow> getDevices(){
        List<DeviceRow> deviceRows = new ArrayList<DeviceRow>();
        return deviceRows;
    }
    public static DeviceRow createDeviceRow(Integer img, String name){
        DeviceRow deviceRow = new DeviceRow(img,name);
        return deviceRow;
    }
}
