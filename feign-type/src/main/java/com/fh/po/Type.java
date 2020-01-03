package com.fh.po;

import com.fh.common.Page;

import java.io.Serializable;

public class Type extends Page implements Serializable {
    private int id;
    private String genre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
