package com.example.Hadasim;

import javax.persistence.*;

@Entity
@Table
public class Client {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String city;
    private String street;
    private Integer numOfHouse;
    private String dateOfBirth;
    private String phone;
    private String cellPhone;
    private String coronaVaccine;
    private String manufacturer;
    private String possiveAnswer;
    private String recovery;

    public Client() {
    }

    public Client(String firstName, String lastName, Long id, String city, String street, Integer numOfHouse, String dateOfBirth, String phone, String cellPhone, String coronaVaccine,
             String manufacturer, String possiveAnswer, String recovery) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.city = city;
        this.street = street;
        this.numOfHouse = numOfHouse;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.cellPhone = cellPhone;
        this.coronaVaccine = coronaVaccine;
        this.manufacturer = manufacturer;
        this.possiveAnswer = possiveAnswer;
        this.recovery = recovery;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public Integer getNumOfHouse() {
        return numOfHouse;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public String getCoronaVaccine() {
        return coronaVaccine;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPossiveAnswer() {
        return possiveAnswer;
    }

    public String getRecovery() {
        return recovery;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumOfHouse(Integer numOfHouse) {
        this.numOfHouse = numOfHouse;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public void setCoronaVaccine(String coronaVaccine) {
        this.coronaVaccine = coronaVaccine;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPossiveAnswer(String possiveAnswer) {
        this.possiveAnswer = possiveAnswer;
    }

    public void setRecovery(String recovery) {
        this.recovery = recovery;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", numOfHouse=" + numOfHouse +
                ", dateOfBirth=" + dateOfBirth +
                ", phone='" + phone + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                '}';
    }
}
