package hari.edu.spring.pojo;

public class Address {
    String streetName;
    String country;
    int zipCode;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String toString(){
        return "Street Name : " + streetName + "; Country : "+ country + "; ZipCode : " + zipCode ;
    }
}
