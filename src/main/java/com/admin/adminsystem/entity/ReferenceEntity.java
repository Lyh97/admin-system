package com.admin.adminsystem.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "REFERENCE")
public class ReferenceEntity {
    @Id
    @GeneratedValue(generator = "xxx")
    @GenericGenerator(name = "xxx", strategy = "uuid")
    private String PK_REF;

    @Column(name = "TYPE")
    private String TYPE;

    @Column(name = "VALUE")
    private String VALUE;

    @Column(name = "SEQUENCE")
    private long SEQUENCE;

    @Column(name = "DESCRIPTION")
    private String DESCRIPTION;

    @Column(name = "PARENT")
    private String PARENT;

    @Column(name = "INSERT_TIMESTAMP")
    private Date INSERT_TIMESTAMP;

    @Column(name = "LAST_UPDATE_TIMESTAMP")
    private Date LAST_UPDATE_TIMESTAMP;

    @Column(name = "CREATOR")
    private String CREATOR;

    @Column(name = "MODIFIER")
    private String MODIFIER;

    public String getPK_REF() {
        return PK_REF;
    }

    public void setPK_REF(String PK_REF) {
        this.PK_REF = PK_REF;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getVALUE() {
        return VALUE;
    }

    public void setVALUE(String VALUE) {
        this.VALUE = VALUE;
    }

    public long getSEQUENCE() {
        return SEQUENCE;
    }

    public void setSEQUENCE(long SEQUENCE) {
        this.SEQUENCE = SEQUENCE;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
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

    public String getPARENT() {
        return PARENT;
    }

    public void setPARENT(String PARENT) {
        this.PARENT = PARENT;
    }
}
