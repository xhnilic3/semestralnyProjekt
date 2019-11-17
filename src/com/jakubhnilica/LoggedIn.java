package com.jakubhnilica;

public class LoggedIn {

    private static LoggedIn instance = null;

    private static int id;

    private LoggedIn(int id) {
        LoggedIn.id = id;
    }

    public static int getId() { return LoggedIn.id; }
    public static void setId(int id) {LoggedIn.id = id; }

    public static LoggedIn getInstance() {
        if (instance == null)
            instance = new LoggedIn(LoggedIn.id);
        return instance;
    }
}
