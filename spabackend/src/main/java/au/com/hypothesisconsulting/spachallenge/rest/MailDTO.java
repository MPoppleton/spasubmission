package au.com.hypothesisconsulting.spachallenge.rest;

import java.util.ArrayList;
import java.util.List;

public class MailDTO {

    String subject;
    String body;
    String from;
    List<String> to;
    List<String> cc;
    List<String> bcc;

    public MailDTO() {
        this.to = new ArrayList<>();
        this.cc = new ArrayList<>();
        this.bcc = new ArrayList<>();
    }

    public MailDTO(String subject, String body, String from, List<String> to, List<String> cc, List<String> bcc) {
        this.subject = subject;
        this.body = body;
        this.from = from;
        this.to = to;
        this.cc = cc;
        this.bcc = bcc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public List<String> getTo() {
        return to;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public List<String> getCc() {
        return cc;
    }

    public void setCc(List<String> cc) {
        this.cc = cc;
    }

    public List<String> getBcc() {
        return bcc;
    }

    public void setBcc(List<String> bcc) {
        this.bcc = bcc;
    }
}
