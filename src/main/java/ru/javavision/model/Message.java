package ru.javavision.model;

public class Message {
    private int id;
    private String content;

    public Message(int id, String content) {
        this.content = content;
        this.id = id;
    }

    public Message(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
//public class Message {
//
//    private String id;
//
//    private String content;
//
//
//
//    public Message(String id, String content) {
//        this.content = content;
//        this.id = id;
//    }
//
//    public Message() {
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//


