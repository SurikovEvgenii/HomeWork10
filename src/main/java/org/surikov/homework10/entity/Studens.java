package org.surikov.homework10.entity;

public class Studens {
    int id;
    String firstname;
    String lastname;
    int evaluation;

    public Studens(String firstname, String lastname, int evaluation) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.evaluation = evaluation;
    }

    public Studens(int id, String firstname, String lastname, int evaluation) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.evaluation = evaluation;
    }
}
