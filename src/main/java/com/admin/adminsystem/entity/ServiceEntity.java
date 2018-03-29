package com.admin.adminsystem.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Service")
public class ServiceEntity implements Serializable {
    @Id
    @GeneratedValue(generator = "xxx")
    @GenericGenerator(name = "xxx", strategy = "uuid")
    private String PK_SERVICE;

    @Column(name = "SERVICE_CODE")
    private String SERVICE_CODE;

    @Column(name = "SERVICE_VERSION")
    private String SERVICE_VERSION;

    @Column(name = "OWNER_ORG")
    private String OWNER_ORG;

    @Column(name = "OWNER")
    private String OWNER;

    @Column(name = "ENABLED_FLAG")
    private String ENABLED_FLAG;

    @Column(name = "TYPE")
    private String TYPE;

    @Column(name = "REMARK")
    private String REMARK;

    @Column(name = "INSERT_TIMESTAMP")
    private Date INSERT_TIMESTAMP;

    @Column(name = "LAST_UPDATE_TIMESTAMP")
    private Date LAST_UPDATE_TIMESTAMP;

    @Column(name = "CREATOR")
    private String CREATOR;

    @Column(name = "MODIFIER")
    private String MODIFIER;

    public String getPK_SERVICE() {
        return PK_SERVICE;
    }

    public void setPK_SERVICE(String PK_SERVICE) {
        this.PK_SERVICE = PK_SERVICE;
    }

    public String getSERVICE_CODE() {
        return SERVICE_CODE;
    }

    public void setSERVICE_CODE(String SERVICE_CODE) {
        this.SERVICE_CODE = SERVICE_CODE;
    }

    public String getSERVICE_VERSION() { return SERVICE_VERSION; }

    public void setSERVICE_VERSION(String SERVICE_VERSION) {
        this.SERVICE_VERSION = SERVICE_VERSION;
    }

    public String getOWNER_ORG() {
        return OWNER_ORG;
    }

    public void setOWNER_ORG(String OWNER_ORG) {
        this.OWNER_ORG = OWNER_ORG;
    }

    public String getOWNER() {
        return OWNER;
    }

    public void setOWNER(String OWNER) {
        this.OWNER = OWNER;
    }

    public String getENABLED_FLAG() {
        return ENABLED_FLAG;
    }

    public void setENABLED_FLAG(String ENABLED_FLAG) {
        this.ENABLED_FLAG = ENABLED_FLAG;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }

    public Date getINSERT_TIMESTAMP() {
        return INSERT_TIMESTAMP;
    }

    public void setINSERT_TIMESTAMP(Date INSERT_TIMESTAMP) {
        this.INSERT_TIMESTAMP = INSERT_TIMESTAMP;
    }

    public Date getLAST_UPDATE_TIMESTAMP() {
        return LAST_UPDATE_TIMESTAMP;
    }

    public void setLAST_UPDATE_TIMESTAMP(Date LAST_UPDATE_TIMESTAMP) {
        this.LAST_UPDATE_TIMESTAMP = LAST_UPDATE_TIMESTAMP;
    }

    public String getCREATOR() {
        return CREATOR;
    }

    public void setCREATOR(String CREATOR) {
        this.CREATOR = CREATOR;
    }

    public String getMODIFIER() {
        return MODIFIER;
    }

    public void setMODIFIER(String MODIFIER) {
        this.MODIFIER = MODIFIER;
    }
}
