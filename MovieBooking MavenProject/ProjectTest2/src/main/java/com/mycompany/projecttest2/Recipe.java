/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecttest2;

import java.time.LocalDate;
import java.time.LocalTime;
import javafx.beans.property.IntegerProperty;

/**
 *
 * @author chonl
 */
public class Recipe {
    private String type;
    private String movieTitle;
    private String total;
    private String seatNumber;
    private String datecheck;
    private String timecheck;
   // IntegerProperty
    
    public Recipe(){
        type = "";
        movieTitle = "";
        total = "";
        seatNumber = "1";
        datecheck = null;
        timecheck = null;
    }

    

    public Recipe(String type, String movieTitle, String total,String seatNumber,String datecheck,String timecheck) {
        this.type = type;
        this.movieTitle = movieTitle;
        this.total = total;
        this.seatNumber = seatNumber;
        this.datecheck = datecheck;
        this.timecheck = timecheck;
    }

    public String getDatecheck() {
        return datecheck;
    }

    public void setDatecheck(String datecheck) {
        this.datecheck = datecheck;
    }

    public String getTimecheck() {
        return timecheck;
    }

    public void setTimecheck(String timecheck) {
        this.timecheck = timecheck;
    }

    
    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String ticketNumber) {
        this.seatNumber = ticketNumber;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    
    
}
