package Farid.MMC.AirlineReservationSystem.repository;
import Farid.MMC.AirlineReservationSystem.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
