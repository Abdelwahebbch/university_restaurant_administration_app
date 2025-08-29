package com.wahat.model;

import java.sql.Date;

public class StudentModel {
    private String RFIDCode ; 
    private String nomPrenom ; 
    private String CIN ; 
    private String tel ; 
    private Date Birthday ; 
    private String notes ;

    
    public StudentModel(String rFIDCode, String nomPrenom, String cIN) {
        RFIDCode = rFIDCode;
        this.nomPrenom = nomPrenom;
        CIN = cIN;
    }
    public StudentModel(String rFIDCode, String nomPrenom, String cIN, String tel, Date birthday, String notes) {
        RFIDCode = rFIDCode;
        this.nomPrenom = nomPrenom;
        CIN = cIN;
        this.tel = tel;
        Birthday = birthday;
        this.notes = notes;
    }
    public String getRFIDCode() {
        return RFIDCode;
    }
    public void setRFIDCode(String rFIDCode) {
        RFIDCode = rFIDCode;
    }
    public String getNomPrenom() {
        return nomPrenom;
    }
    public void setNomPrenom(String nomPrenom) {
        this.nomPrenom = nomPrenom;
    }
    public String getCIN() {
        return CIN;
    }
    public void setCIN(String cIN) {
        CIN = cIN;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public Date getBirthday() {
        return Birthday;
    }
    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    } 

    
}
