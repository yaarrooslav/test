package org.example.test.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Locale;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String address;
    private String phone;
    private String contacts;
    private String amenities;
    private String city;
    private String country;


    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}

    public String getContacts(){return contacts;}
    public void setContacts(String contacts) {this.contacts = contacts;}

    public String getAmenities() {return amenities;}
    public void setAmenities(String amenities) {this.amenities = amenities;}

    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}

    public String getCountry() {return country;}
    public void setCountry(String country) {this.country = country;}

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
}
