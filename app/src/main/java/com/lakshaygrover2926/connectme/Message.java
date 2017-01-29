package com.lakshaygrover2926.connectme;

/**
 * Created by LAKSHAY on 1/29/2017.
 */

public class Message {

    private String text;
    private String name;
    private String photourl;

    public Message(){

    }
    public Message(String text, String name, String photourl){
        this.name = name;
        this.text = text;
        this.photourl = photourl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
