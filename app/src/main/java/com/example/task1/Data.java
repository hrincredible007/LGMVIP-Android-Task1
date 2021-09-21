package com.example.task1;
public class Data {
    private String districtName, confirmed, deceased, recovered, active, confirmeddelta, deceaseddelta, recovereddelta;


    public Data(String name, String confirmed, String deceased, String recovered, String active, String confirmeddelta, String deceaseddelta, String recovereddelta) {
        this.districtName = name;
        this.confirmed = confirmed;
        this.active = active;
        this.deceased = deceased;
        this.recovered = recovered;
        this.confirmeddelta = confirmeddelta;
        this.deceaseddelta = deceaseddelta;
        this.recovereddelta = recovereddelta;


    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;

    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;

    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;

    }

    public String getDeceased() {
        return deceased;

    }

    public void setDeceased(String deceased) {
        this.deceased = deceased;

    }


    public String getConfirmeddelta() {
        return confirmeddelta;
    }

    public void setConfirmeddelta(String confirmeddelta) {
        this.confirmeddelta = confirmeddelta;

    }

    public String getDeceaseddelta() {
        return deceaseddelta;
    }

    public void setDeceaseddelta(String deceaseddelta) {
        this.deceaseddelta = deceaseddelta;

    }

    public String getRecovereddelta() {
        return recovereddelta;
    }

    public void setRecovereddelta(String recovereddelta) {
        this.recovereddelta = recovereddelta;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }
}



