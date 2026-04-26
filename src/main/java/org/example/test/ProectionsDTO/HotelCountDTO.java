package org.example.test.ProectionsDTO;

public class HotelCountDTO {
    private String city;
    private Long count;
    private String amenities;

    public HotelCountDTO(Long count,String amenities){
        this.amenities=amenities;
        this.count=count;
    }
    public HotelCountDTO(String location,Long count){
        this.count=count;
        this.city=location;
    }

    public Long getCount() {return count;}
    public void setCount(Long count) {this.count = count;}

    public String getLocation() {return city;}
    public void setLocation(String location) {this.city = location;}
}
