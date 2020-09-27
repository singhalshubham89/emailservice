package com.shubham.emailservice.model;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Email {

    @NonNull
    private String from;

    @NonNull
    private ArrayList<String> to;

    private ArrayList<String> bcc;

    private ArrayList<String> cc;

    private String subject;

    private String content;

    @NonNull
    public String getFrom() {
        return from;
    }

    public void setFrom(@NonNull String from) {
        this.from = from;
    }

    @NonNull
    public ArrayList<String> getTo() {
        return to;
    }

    public void setTo(@NonNull ArrayList<String> to) {
        this.to = to;
    }

    public ArrayList<String> getBcc() {
        return bcc;
    }

    public void setBcc(ArrayList<String> bcc) {
        this.bcc = bcc;
    }

    public ArrayList<String> getCc() {
        return cc;
    }

    public void setCc(ArrayList<String> cc) {
        this.cc = cc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
