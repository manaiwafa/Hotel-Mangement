package mangment.Repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mangment.entities.Hotel;
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

	List<Hotel> findByActiveTrue();
	List<Hotel> findByActiveFalse();


}
