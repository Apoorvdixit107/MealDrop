package com.example.zomato;

import android.widget.ImageView;

public class Model {
    private ImageView img;

    public ImageView getImg() {
        return img;
    }

    public void setImg(ImageView img) {
        this.img = img;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Model(ImageView img, String text) {
        this.img = img;
        this.text = text;
    }

    private String text;
}
