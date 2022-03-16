package ru.netology.user.forms;

public class FormPassport {
    private int series;
    private int number;

    public FormPassport(int series, int number) {
        this.series = series;
        this.number = number;
    }

    public String printPassport() {
        return series + " № " + number;
    }

    //setters
    public void setSeries(int series) {
        this.series = series;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //getters
    public int getSeries() {
        return series;
    }

    public int getNumber() {
        return number;
    }
}
