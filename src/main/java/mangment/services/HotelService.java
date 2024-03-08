package mangment.services;

import java.util.List;

import mangment.entities.Hotel;

public interface HotelService {
	 List<Hotel> findByActiveTrue();
	 List<Hotel> findByActiveFalse();
}
