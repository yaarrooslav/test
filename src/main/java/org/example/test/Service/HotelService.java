package org.example.test.Service;

import org.example.test.Entity.Hotel;
import org.example.test.ProectionsDTO.HotelCountDTO;
import org.example.test.ProectionsDTO.HotelDTO;
import org.example.test.Repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService {
    private final HotelRepository repository;
    public HotelService(HotelRepository repository) {
        this.repository = repository;
    }

    public Hotel getHotelById(Long id){
        return repository.findById(id).orElseThrow(()-> new RuntimeException("Hotel not found"));
    }
    public List<HotelDTO> getAllHotels(){
        List<Hotel> list = repository.findAll();
        List<HotelDTO> listDTO = new ArrayList<>();
        for(Hotel hotel : list){
        listDTO.add(new HotelDTO(hotel.getName(), hotel.getAddress()));
        }
        return listDTO;
    }

    public Hotel createHotel(Hotel hotel){
        return repository.save(hotel);
    }

    public Hotel updateHotelById(Long id, Hotel hotel){
        Hotel newData = repository.findById(id).orElseThrow(()-> new RuntimeException("Hotel not found"));

        if(hotel.getName() != null){newData.setName(hotel.getName());}

        if(hotel.getAddress()!=null){newData.setAddress(hotel.getAddress());}

        if(hotel.getDescription()!=null){newData.setDescription(hotel.getDescription());}

        if(hotel.getPhone()!=null){newData.setPhone(hotel.getPhone());}

        if (hotel.getAmenities()!=null){newData.setAmenities(hotel.getAmenities());}

        if(hotel.getCity()!=null){newData.setCity(hotel.getCity());}

        if(hotel.getCountry()!=null){newData.setCountry(hotel.getCountry());}

        if(hotel.getContacts()!=null){newData.setContacts(hotel.getContacts());}

        return repository.save(newData);
    }
    public void deleteHotelById(Long id){repository.deleteById(id);}

    public Hotel returnAllHotelDetails(Long id){
       return repository.findById(id).orElseThrow(()->new RuntimeException("hotel not found"));
    }
    public void addAmenities(Long id,String amenities){
        Hotel hotel = repository.findById(id).orElseThrow(()->new RuntimeException("hotel not found"));
        String newAmen = amenities+hotel.getAmenities();
        hotel.setAmenities(newAmen);
        repository.save(hotel);
    }
    public List<HotelCountDTO> count(String param){
        if(param.equalsIgnoreCase("city")){
            return repository.location();
        }
        if(param.equalsIgnoreCase("amenities")){
            return repository.amenities();
        }
        return null;
    }
}
