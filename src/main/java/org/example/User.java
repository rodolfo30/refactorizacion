package org.example;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private boolean membership;

    public User(String firstName, String lastName, int age, boolean membership) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.membership = membership;
    }

    // Métodos
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean hasMembership() {
        return membership;
    }
}
