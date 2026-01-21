package com.myproject.New_spring_application.Entyty;
import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Builder
public class WomenUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String Lastname;

    @Column(length = 11)
    private String phoneNo;
    private String address;
    private String emailId;

    public WomenUser(Long id, String firstName, String lastname, String phoneNo, String address, String emailId) {
        this.id = id;
        this.firstName = firstName;
        Lastname = lastname;
        this.phoneNo = phoneNo;
        this.address = address;
        this.emailId = emailId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "WomenUser{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", address='" + address + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
