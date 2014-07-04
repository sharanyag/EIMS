package com.imac.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@SuppressWarnings("unused")

@Entity
@Table(name="USER")
public class UserEntity {
     
    @Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;
    
    
    @Column(name="LOGINNAME")
    private String loginname;
 
    @Column(name="LASTNAME")
    private String lastname;
 
    @Column(name="FIRSTNAME")
    private String firstname;
     
    @Column(name="DIVISION")
    private String division;
     
    @Column(name="ACTIVE")
    private boolean active;
    
    public String getLoginName() {
        return loginname;
    }
    public void setLoginName(String loginname) {
        this.loginname = loginname;
    }
    public String getFirstName() {
        return firstname;
    }
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }
    public String getLastName() {
        return lastname;
    }
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }
    public String getDivision() {
        return division;
    }
    public void setDivision(String division) {
        this.division = division;
    }
    public boolean getActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}