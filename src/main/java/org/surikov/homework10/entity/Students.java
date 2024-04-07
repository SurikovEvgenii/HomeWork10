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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname + " " + evaluation;
    }
}
