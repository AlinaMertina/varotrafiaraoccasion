package com.pack.varotrafiaraoccasion.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.*;
@Document(collection = "message")
public class Message{

    @Id
    private String _id;
    private Long to;
    private Long from;
    private String content;
    private Date date_sender;
    private Date date_read;
    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }
    public Long getTo() {
        return to;
    }
    public void setTo(Long to) {
        this.to = to;
    }
    public Long getFrom() {
        return from;
    }
    public void setFrom(Long from) {
        this.from = from;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Date getDate_sender() {
        return date_sender;
    }
    public void setDate_sender(Date date_sender) {
        this.date_sender = date_sender;
    }
    public Date getDate_read() {
        return date_read;
    }
    public void setDate_read(Date date_read) {
        this.date_read = date_read;
    }
    public Message(String _id, Long to, Long from, String content, Date date_sender, Date date_read) {
        this._id = _id;
        this.to = to;
        this.from = from;
        this.content = content;
        this.date_sender = date_sender;
        this.date_read = date_read;
    }
    
}

