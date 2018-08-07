package org.androidtown.myfirebase;

/**
 * Created by user on 2017-09-20.
 */

public class ChatData {
    private String userName;
    private String message;

    public ChatData() { }

    public ChatData(String userName, String message) {
        this.userName = userName;
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
