package org.main;

import org.main.DBControl;

public class Main {
    public static void main(String[] args) {
        DBControl db = new DBControl();
        db.createNewCustomer("ff", "ff", "ff");
    }
}
