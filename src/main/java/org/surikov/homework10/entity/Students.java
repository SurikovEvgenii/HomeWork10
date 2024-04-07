package org.surikov.homework10.entity;

public class Students {
    int id;
    String firstname;
    String lastname;
    int evaluation;

    public Students(String firstname, String lastname, int evaluation) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.evaluation = evaluation;
    }

    public Students(int id, String firstname, String lastname, int evaluation) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.evaluation = evaluation;
    }
}
