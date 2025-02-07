package com.bitdottech.Shield.models;

import com.google.firebase.firestore.DocumentId;
import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class Guardian {

    private @DocumentId
    String id;
    private String guardianAddress ;
    private String guardianName;
    private String guardianNumber;
    private @ServerTimestamp
    Date timestamp;

    public Guardian() {
    }

    public Guardian(String guardianAddress, String guardianName, String guardianNumber) {
        this.guardianAddress = guardianAddress;
        this.guardianName = guardianName;
        this.guardianNumber = guardianNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getguardianAddress() {
        return guardianAddress;
    }

    public void setguardianAddress(String guardianAddress) {
        this.guardianAddress = guardianAddress;
    }

    public String getguardianName() {
        return guardianName;
    }

    public void setguardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getguardianNumber() {
        return guardianNumber;
    }

    public void setguardianNumber(String guardianNumber) {
        this.guardianNumber = guardianNumber;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Guardian{" +
                "id='" + id + '\'' +
                ", guardianAddress='" + guardianAddress + '\'' +
                ", guardianName='" + guardianName + '\'' +
                ", guardianNumber='" + guardianNumber + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
