package com.admin.adminsystem.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Clob;
import java.sql.Timestamp;
import java.util.Comparator;

@Entity
@Table(name = "MSGFLOW_LOG")
public class Msgflow_LogEntity implements Serializable, Comparator<Msgflow_LogEntity> {

    @Id
    @GeneratedValue(generator = "xxx")
    @GenericGenerator(name = "xxx", strategy = "uuid")
    private String PK_LOG;

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

    @Column(name = "SERIAL_NUMBER")
    private String SERIAL_NUMBER;

    @Column(name = "MSG")
    private String MSG;

    @Column(name = "MSG_TYPE")
    private long MSG_TYPE;

    @Column(name = "ERROR_MSG")
    private String ERROR_MSG;

    @Column(name = "LOG_TIMESTAMP")
    private String LOG_TIMESTAMP;


    @Column(name = "CREATOR")
    private String CREATOR;

    public String getPK_LOG() {
        return PK_LOG;
    }

    public void setPK_LOG(String PK_LOG) {
        this.PK_LOG = PK_LOG;
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

    public String getSERIAL_NUMBER() {
        return SERIAL_NUMBER;
    }

    public void setSERIAL_NUMBER(String SERIAL_NUMBER) {
        this.SERIAL_NUMBER = SERIAL_NUMBER;
    }

    public String getMSG() {
        return MSG;
    }

    public void setMSG(String MSG) {
        this.MSG = MSG;
    }

    public long getMSG_TYPE() {
        return MSG_TYPE;
    }

    public void setMSG_TYPE(long MSG_TYPE) {
        this.MSG_TYPE = MSG_TYPE;
    }

    public String getERROR_MSG() {
        return ERROR_MSG;
    }

    public void setERROR_MSG(String ERROR_MSG) {
        this.ERROR_MSG = ERROR_MSG;
    }

    public String getLOG_TIMESTAMP() {
        return LOG_TIMESTAMP;
    }

    public void setLOG_TIMESTAMP(String LOG_TIMESTAMP) {
        this.LOG_TIMESTAMP = LOG_TIMESTAMP;
    }

    public String getCREATOR() {
        return CREATOR;
    }

    public void setCREATOR(String CREATOR) {
        this.CREATOR = CREATOR;
    }

    @Override
    public int compare(Msgflow_LogEntity o1, Msgflow_LogEntity o2) {
        if(Timestamp.valueOf(o1.getLOG_TIMESTAMP()).before(Timestamp.valueOf(o2.getLOG_TIMESTAMP()))){
            return 1;
        }else{
            return -1;
        }
    }
}
