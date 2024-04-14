/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecttest2;

import java.time.LocalDate;
import java.util.Date;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;

/**
 *
 * @author chonl
 */
public class MovieData {
    private String title;
    private String genre;
    private String duration;
    private LocalDate date;
    private Image image;
    private String current;
    
    //private ComboBox com;
    

    public MovieData(String title, String genre ,String duration, LocalDate date,Image image,String current) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.date = date;
        this.image = image;
        this.current = current;
    }
    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
       this.image = image;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    

}
