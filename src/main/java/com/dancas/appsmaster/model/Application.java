package com.dancas.appsmaster.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Application {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String mail;

    public Application(){
        this.name = "";
        this.mail = "";
    }

    public Application(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public Application setName(String name) {
        this.name  = name;
        return this;
    }

    public String getMail(){
        return mail;
    }

    public Application setMail(String mail){
        this.mail = mail;
        return this;
    }

    @Override
    public String toString() {
        return "Application{" + "id=" + id + ", name=" + name + ", mail=" + mail + '}';
    }

}
