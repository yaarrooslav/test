package org.example.test.ProectionsDTO;

public class HotelDTO{
    private String name;
    private String address;

    public HotelDTO(String name,String address){
        this.name=name;
        this.address=address;
    }

    public String getAddress() {return address;}
    public String getName() {return name;}

}
