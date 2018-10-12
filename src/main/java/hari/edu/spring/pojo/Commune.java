package hari.edu.spring.pojo;

import java.util.Map;

public class Commune {

    String communeName;
    String communeAddress;
    Map<ResidentCard,Resident> residentDetails;

    public Commune() {
    }

    public Commune(String communeName, String communeAddress, Map<ResidentCard, Resident> residentDetails) {
        this.communeName = communeName;
        this.communeAddress = communeAddress;
        this.residentDetails = residentDetails;
    }

    public String getCommuneName() {
        return communeName;
    }

    public void setCommuneName(String communeName) {
        this.communeName = communeName;
    }

    public String getCommuneAddress() {
        return communeAddress;
    }

    public void setCommuneAddress(String communeAddress) {
        this.communeAddress = communeAddress;
    }

    public Map<ResidentCard, Resident> getResidentDetails() {
        return residentDetails;
    }

    public void setResidentDetails(Map<ResidentCard, Resident> residentDetails) {
        this.residentDetails = residentDetails;
    }
}
