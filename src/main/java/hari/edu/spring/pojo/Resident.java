package hari.edu.spring.pojo;

public class Resident {

    String name;
    long mobileNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String toString(){
        return "Resident Info >> Name : "+name+" ; Mobile Number: "+mobileNumber;
    }
}
