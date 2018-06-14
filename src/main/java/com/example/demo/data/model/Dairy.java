package com.example.demo.data.model;

import org.joda.time.DateTime;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "dairy")
public class Dairy {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "date_time")
    private Date date;

    @Column(name = "content")
    private String content;

    @Column(name = "tags")
    private String tags;

    public Dairy() {
    }

    public Dairy(java.util.Date date, String content) {
        this.date = new Date(date.getTime());
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
