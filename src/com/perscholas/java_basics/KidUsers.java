package com.perscholas.java_basics;

public class KidUsers implements LibraryUser{

    // fields
    public int age;
    public String bookType;

    public KidUsers(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    // methods
    @Override
    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have successfully registered as a kid");
        } else if (age > 12) {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if(this.bookType == "Kids") {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }

    }

} // class
