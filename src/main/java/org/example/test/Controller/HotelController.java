package org.example.test.Controller;

import org.example.test.Entity.Hotel;
import org.example.test.ProectionsDTO.HotelCountDTO;
import org.example.test.ProectionsDTO.HotelDTO;
import org.example.test.Service.HotelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelController {

    private final HotelService service;

    public HotelController(HotelService service) {this.service = service;}

    @GetMapping("/hotels")
    public List<HotelDTO> getAllHotels(){
        return service.getAllHotels();
    }
    @GetMapping("/hotels/{id}")
    public Hotel getHotelById(@PathVariable Long id){
        return service.getHotelById(id);
    }
    @PutMapping("/hotels/{id}")
    public Hotel updateHotelById(@RequestBody Hotel hotel,@PathVariable Long id){
        return service.updateHotelById(id,hotel);
    }
    @PostMapping("/hotels")
    public Hotel createHotel(@RequestBody Hotel hotel){
        return service.createHotel(hotel);
    }
    @DeleteMapping("/hotels/{id}")
    public void deleteHotel(@PathVariable Long id){
        service.deleteHotelById(id);
    }

    @PostMapping("/hotels/{id}/amenities")
    public void addAmenities(@PathVariable Long id,@RequestBody String amenities){
        service.addAmenities(id,amenities);
    }
    @GetMapping("/count/{param}")
    public List<HotelCountDTO> getCount(@PathVariable String param){
return service.count(param);
    }
}
