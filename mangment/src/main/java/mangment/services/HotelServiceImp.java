package mangment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mangment.Repository.HotelRepository;
import mangment.entities.Hotel;
@Service
public class HotelServiceImp implements HotelService {
	@Autowired
	 public HotelRepository hotelRepository;

	@Override
	public List<Hotel> findByActiveTrue() {
		// TODO Auto-generated method stub
		return hotelRepository.findByActiveTrue();
	}

	@Override
	public List<Hotel> findByActiveFalse() {
		// TODO Auto-generated method stub
		return hotelRepository.findByActiveFalse();
	}







}
