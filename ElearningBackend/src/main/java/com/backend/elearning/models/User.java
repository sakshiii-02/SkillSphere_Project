package com.backend.elearning.models;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Column(name = "username")
    private String userName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "pass")
    private String pass;

    @Column(name = "phone_no")
    private String phoneNo;

    @Column(name = "address")
    private String address;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "user")
    private List<Course> courses;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;

    // Default constructor
    public User() {
    }

    // Constructor with all parameters
    public User(Long userId, String userName, String firstName, String lastName, String email, String pass,
                String phoneNo, String address, Category category, List<Course> courses) {
        this.userId = userId;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.pass = pass;
        this.phoneNo = phoneNo;
        this.address = address;
        this.category = category;
        this.courses = courses;
    }

    // Getters and Setters

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
                + lastName + ", email=" + email + ", pass=" + pass + ", phoneNo=" + phoneNo + ", address=" + address
                + ", category=" + category + "]";
    }
}
