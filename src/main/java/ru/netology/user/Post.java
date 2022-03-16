package ru.netology.user;

import ru.netology.user.forms.FormDate;
import ru.netology.user.forms.FormPassport;
import ru.netology.user.forms.FormPhone;

public class Post {
    private String name;
    private String patronymic;
    private String surname;
    private FormPassport passport;
    private FormPhone phone;
    private FormDate birthday;
    private boolean subscription;

    public Post(String name, String patronymic, String surname, int series, int number, int countryCode,
                int zoneCone, int abonentNumber, int day, int month, int year, boolean subscription) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.passport = new FormPassport(series, number);
        this.phone = new FormPhone(countryCode, zoneCone, abonentNumber);
        this.birthday = new FormDate(day, month, year);
        this.subscription = subscription;
    }

    public Post(){

    }

    public void printPost() {
        System.out.println("Name: " + name +
                "\nPatronymic: " + patronymic +
                "\nSurname: " + surname +
                "\nPassport: " + passport.printPassport() +
                "\nPhone: " + phone.printPhone() +
                "\nBirthday: " + birthday.printBirthday() +
                "\nSubscription: " + subscription);
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setBirthday(int day, int month, int year) {
        this.birthday = new FormDate(day, month, year);
    }

    public void setPassport(int series, int number) {
        this.passport = new FormPassport(series, number);
    }

    public void setPhone(int countryCode, int zodeCode, int abonentNumber) {
        this.phone = new FormPhone(countryCode, zodeCode, abonentNumber);
    }

    public void setSubscription(boolean subscription) {
        this.subscription = subscription;
    }

}
