/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialexercises;

/**
 *
 * @author jaime
 */
public class Time {
     private int hour;
    private int minute;
    private int second;
    //Initialize atributes
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = hour;
        this.second = second;
    }
    //getters and setters
    public int getHour() {
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
    }

    @Override
    public String toString() { //returns String
        return String.format("%02d",this.hour) + "/" //%02d for 2 digits double
               + String.format("%02d",this.minute) + "/"
               + String.format("%02d",this.second);
    }
    public Time nextSecond(){ //show the next second
        ++this.second; //this all increase second,minute and hour by 1
        if(this.second>=60){ //if second is greater than 60 or equals this is equals 0
            this.second = 0; 
            ++this.minute; 
            if(this.minute>=60){ //the same that second
                this.minute=0; 
                ++this.hour; 
                if(this.hour>=24){ //the same that second
                    this.hour = 0; 
                }
            }
        }
        return this;
    }
    public Time previousSecond(){
        --this.second; //decrease second by 1
        if(this.second<0){ 
            this.second = 59;
            --this.minute; 
            if(this.minute<0){ 
                this.minute=59; 
                --this.hour; 
                if(this.hour<0){ 
                    this.hour = 23; 
                }
            }
        }
        return this;
    }
}
