package com.su.mohed.tables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Masterdata {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String tagname;
    private String value;

    public Masterdata() {
    }

    public Masterdata(String tagname, String value) {
        this.tagname = tagname;
        this.value = value;
    }

    public Masterdata(int id, String tagname, String value){
        this.id = id;
        this.tagname = tagname;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Masterdata { " +
                "id " + id +
                "tagname " + tagname +
                "value " + value +
                "}";
    }
}
