package mangment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mangment.Repository.HotelRepository;
import mangment.entities.Hotel;
import mangment.services.HotelService;
import mangment.services.HotelServiceImp;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	  @Autowired
	    private   HotelRepository hotelRepository;

	  @GetMapping("/active")
	    public List<Hotel> getHotelsByActive( ) {
	      List<Hotel> hotels = hotelRepository.findByActiveTrue();
		  return hotels ;
}
	  
	  @GetMapping("/inactive")
	    public List<Hotel> getHotelsByinActive( ) {
		  List<Hotel> hotels =  hotelRepository.findByActiveFalse() ;
		  return hotels ;
}
}

