package com.gameracer.shutaweb.modal;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne
    private User user;
    @OneToMany
    private Set<PhoneNo> phoneNo =new HashSet<>();
    private String email;
    @OneToOne
    private Location location;
    private String address;

    public Teacher(User user, Set<PhoneNo> phoneNo, String email, Location location, String address) {
        this.user = user;
        this.phoneNo = phoneNo;
        this.email = email;
        this.location = location;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<PhoneNo> getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Set<PhoneNo> phoneNo) {
        this.phoneNo = phoneNo;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
