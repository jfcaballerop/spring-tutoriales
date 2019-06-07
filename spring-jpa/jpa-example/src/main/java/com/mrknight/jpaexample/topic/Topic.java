package com.mrknight.jpaexample.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

    @Id
    private String id;
    private String name;
    private String descr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Override
    public String toString() {
        return "Topic [descr=" + descr + ", id=" + id + ", name=" + name + "]";
    }

    public Topic(String id, String name, String descr) {
        this.id = id;
        this.name = name;
        this.descr = descr;
    }

    public Topic() {

    }

}