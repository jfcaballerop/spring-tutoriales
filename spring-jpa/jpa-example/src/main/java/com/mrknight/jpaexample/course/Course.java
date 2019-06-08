package com.mrknight.jpaexample.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.mrknight.jpaexample.topic.Topic;

@Entity
public class Course {

    @Id
    private String id;
    private String name;
    private String descr;
    @ManyToOne
    private Topic topic;

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
        return "Course [descr=" + descr + ", id=" + id + ", name=" + name + "]";
    }

    public Course(String id, String name, String descr, String topicid) {
        this.id = id;
        this.name = name;
        this.descr = descr;
        this.topic = new Topic(topicid, "", "");
    }

    public Course() {

    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

}