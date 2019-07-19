package com.gameracer.shutaweb.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PhoneNo {
    @Id
    private long id;
    private int phoneNo;

    public PhoneNo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
}
