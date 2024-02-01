package ru.course.spring.hibernate_one_to_one.entities;

import jakarta.persistence.*;

@Entity
@Table(name="details")
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="city")
    private String city;
    @Column(name="phone_number")
    private String phoneNumber
            ;
    @Column(name="email")
    private String email;
    @OneToOne(mappedBy = "empDetail",
    cascade = CascadeType.ALL)
    private Employee employee;

    @Override
    public String  toString() {
        return "Details{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +

                '}';
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Details(String city, String phone, String email) {
        this.city = city;
        this.phoneNumber = phone;
        this.email = email;
    }
    public Details(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
