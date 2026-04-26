package org.example.test.Repository;

import org.example.test.Entity.Hotel;
import org.example.test.ProectionsDTO.HotelCountDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

@Query("SELECT new org.example.test.ProectionsDTO.HotelCountDTO(h.city,COUNT(h))"+"FROM Hotel h GROUP BY h.city")
List<HotelCountDTO> location();

@Query("SELECT new org.example.test.ProectionsDTO.HotelCountDTO(COUNT(h),h.amenities)"+"FROM Hotel h GROUP BY h.amenities")
List<HotelCountDTO> amenities();
}
