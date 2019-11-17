package com.jakubhnilica;

public class LoggedIn {

    private static LoggedIn instance = null;

    private static int id;

    private LoggedIn(int id) {
        this.id = id;
    }

    public int getId() { return LoggedIn.id; }

    public static LoggedIn getInstance() {
        if (instance == null)
            instance = new LoggedIn(LoggedIn.id);
        return instance;
    }
}
