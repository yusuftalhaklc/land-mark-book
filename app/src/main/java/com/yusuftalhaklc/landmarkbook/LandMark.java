package com.yusuftalhaklc.landmarkbook;
import java.io.Serializable;
public class LandMark implements Serializable {

    String name;
    String country;
    int imageId;

    public LandMark(String name, String country, int imageId){
        this.name = name;
        this.country = country;
        this.imageId = imageId;

    }

}
