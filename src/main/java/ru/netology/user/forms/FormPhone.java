package ru.netology.user.forms;

public class FormPhone {
    private int countryCode;
    private int zoneCode;
    private int abonentNumber;

    public FormPhone(int countryCode, int zoneCode, int abonentNumber) {
        this.countryCode = countryCode;
        this.zoneCode = zoneCode;
        this.abonentNumber = abonentNumber;
    }

    public String printPhone() {
        return "+" + countryCode + "(" + zoneCode + ")" + abonentNumber;
    }

    //setters
    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public void setZoneCode(int zoneCode) {
        this.zoneCode = zoneCode;
    }

    public void setAbonentNumber(int abonentNumber) {
        this.abonentNumber = abonentNumber;
    }

    //TODO: getters
}

