package ru.netology.user.forms;

public class FormDate {
    private int day;
    private int month;
    private int year;

    public FormDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String printBirthday() {
        return day + "." + month + "." + year;
    }

    //setters
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //getters
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

}
