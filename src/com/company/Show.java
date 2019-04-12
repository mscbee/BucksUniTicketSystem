package com.company;

public class Show implements ShowInterface {

    private String showName;
    private String showDate;
    private String showTime;

    public Show(String showName, String showDate, String showTime) {
        this.showName = showName;
        this.showDate = showDate;
        this.showTime = showTime;
    }

    public Show() {

    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    @Override
    public void selectShow(String showName, String showDate) {
        
    }

    @Override
    public String selectTime() {
        return null;
    }
}
