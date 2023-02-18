package com.codingtest.newsapp.model;

public class CountryModel {

    public String countryName;
    public String countryIsoCode;




    public CountryModel(String countryName,String countryIsoCode) {
        this.countryName = countryName;
        this.countryIsoCode = countryIsoCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getcountryIsoCode() {
        return countryIsoCode;
    }

    public void setcountryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
    }
    @Override
    public String toString() {
        return countryName ;
    }

}
