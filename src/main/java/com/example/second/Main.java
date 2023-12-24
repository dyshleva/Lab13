package com.example.second;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorization authorization = new Authorization();
        if (authorization.login(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
