package com.dancas.appsmaster.model;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Entity
public class Application {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String mail;
    private String description;
    private Date initdate;


    //@OneToMany(mappedBy = "application")
    //private List<AppEntity> appEntity;

    public Application(){

    }

    public Application(Long id, String name, String mail, String description, Date initdate, List<AppEntity> appEntity) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.description = description;
        this.initdate = initdate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getInitdate() {
        return initdate;
    }

    public void setInitdate(Date initDate) {
        this.initdate = initdate;
    }
/**
    public List<AppEntity> getAppEntity() {
        return appEntity;
    }

    public void setAppEntity(List<AppEntity> appEntity) {
        this.appEntity = appEntity;
    }
*/
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
        return "Application{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", description='" + description + '\'' +
                ", initDate=" + initdate +
   //             ", appEntity=" + appEntity +
                '}';
    }
}
