package com.admin.adminsystem.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ROUTE_CONFIG")
public class Route_configEntity implements Serializable{
    @Id
    @GeneratedValue(generator = "xxx")
    @GenericGenerator(name = "xxx", strategy = "uuid")
    private String PK_ROUTE;

    @Column(name = "SERVICE_CODE")
    private String SERVICE_CODE;

    @Column(name = "SERVICE_VERSION")
    private String SERVICE_VERSION;

    @Column(name = "SENDER_ORG")
    private String SENDER_ORG;

    @Column(name = "SENDER")
    private String SENDER;

    @Column(name = "RECEIVER_ORG")
    private String RECEIVER_ORG;

    @Column(name = "RECEIVER")
    private String RECEIVER;

    @Column(name = "ENABLED_FLAG")
    private Long ENABLED_FLAG;

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

    public String getPK_ROUTE() {
        return PK_ROUTE;
    }

    public void setPK_ROUTE(String PK_ROUTE) {
        this.PK_ROUTE = PK_ROUTE;
    }

    public String getSERVICE_CODE() {
        return SERVICE_CODE;
    }

    public void setSERVICE_CODE(String SERVICE_CODE) {
        this.SERVICE_CODE = SERVICE_CODE;
    }

    public String getSERVICE_VERSION() {
        return SERVICE_VERSION;
    }

    public void setSERVICE_VERSION(String SERVICE_VERSION) {
        this.SERVICE_VERSION = SERVICE_VERSION;
    }

    public String getSENDER_ORG() {
        return SENDER_ORG;
    }

    public void setSENDER_ORG(String SENDER_ORG) {
        this.SENDER_ORG = SENDER_ORG;
    }

    public String getSENDER() {
        return SENDER;
    }

    public void setSENDER(String SENDER) {
        this.SENDER = SENDER;
    }

    public String getRECEIVER_ORG() {
        return RECEIVER_ORG;
    }

    public void setRECEIVER_ORG(String RECEIVER_ORG) {
        this.RECEIVER_ORG = RECEIVER_ORG;
    }

    public String getRECEIVER() {
        return RECEIVER;
    }

    public void setRECEIVER(String RECEIVER) {
        this.RECEIVER = RECEIVER;
    }

    public Long getENABLED_FLAG() {
        return ENABLED_FLAG;
    }

    public void setENABLED_FLAG(Long ENABLED_FLAG) {
        this.ENABLED_FLAG = ENABLED_FLAG;
    }

    public String getREMARK() { return REMARK; }

    public void setREMARK(String REMARK) { this.REMARK = REMARK; }

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
