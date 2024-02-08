package com.pack.varotrafiaraoccasion.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.*;
@Document(collection = "message1")
public class Message{

    @Id
    private String id;
    private int to1;
    private int from2;
    private String content;
    private Date datesend;
    private Date datelecture;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTo1() {
        return to1;
    }

    public void setTo1(int to1) {
        this.to1 = to1;
    }

    public int getFrom2() {
        return from2;
    }

    public void setFrom2(int from2) {
        this.from2 = from2;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDatesend() {
        return datesend;
    }

    public void setDatesend(Date datesend) {
        this.datesend = datesend;
    }

    public Date getDatelecture() {
        return datelecture;
    }

    public void setDatelecture(Date datelecture) {
        this.datelecture = datelecture;
    }

    public Message() {

    }

    public Message(String id, int to1, int from2, String content, Date datesend, Date datelecture) {
        this.id = id;
        this.to1 = to1;
        this.from2 = from2;
        this.content = content;
        this.datesend = datesend;
        this.datelecture = datelecture;
    }
}

