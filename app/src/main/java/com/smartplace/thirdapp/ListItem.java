package com.smartplace.thirdapp;

import android.graphics.drawable.Drawable;

/**
 * Created by Roberto on 07/11/2014.
 */
public class ListItem {

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getSubHeader() {
        return subHeader;
    }

    public void setSubHeader(String subHeader) {
        this.subHeader = subHeader;
    }

    private String header;
    private String subHeader;

    public Drawable getImageUser() {
        return imageUser;
    }

    public void setImageUser(Drawable imageUser) {
        this.imageUser = imageUser;
    }

    private Drawable imageUser;

}
