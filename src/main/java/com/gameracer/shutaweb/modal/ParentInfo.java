package com.gameracer.shutaweb.modal;

import javax.persistence.*;

@Entity
public class ParentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String parentfname;
    private String parentLname;
    private int parentphone;
    private String Address;
    private String email;
    @OneToOne
    private Location location;

    public ParentInfo(String parentfname, String parentLname, int parentphone, String address, String email, Location location) {
        this.parentfname = parentfname;
        this.parentLname = parentLname;
        this.parentphone = parentphone;
        Address = address;
        this.email = email;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getParentfname() {
        return parentfname;
    }

    public void setParentfname(String parentfname) {
        this.parentfname = parentfname;
    }

    public String getParentLname() {
        return parentLname;
    }

    public void setParentLname(String parentLname) {
        this.parentLname = parentLname;
    }

    public int getParentphone() {
        return parentphone;
    }

    public void setParentphone(int parentphone) {
        this.parentphone = parentphone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}

