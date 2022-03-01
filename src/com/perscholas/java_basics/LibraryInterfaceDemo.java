package com.perscholas.java_basics;

public class LibraryInterfaceDemo {
    public void run() {
        KidUsers kid1 = new KidUsers(10, "Kids");
        KidUsers kid2 = new KidUsers(18, "Fiction");

        AdultUser adult1 = new AdultUser(5, "Kids");
        AdultUser adult2 = new AdultUser(23, "Fiction");

        kid1.registerAccount();
        kid1.requestBook();
        kid2.registerAccount();
        kid2.requestBook();

        adult1.registerAccount();
        adult1.requestBook();
        adult2.registerAccount();
        adult2.requestBook();
    }
}
