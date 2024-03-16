package Farid.MMC.AirlineReservationSystem.dto.mapper;

import Farid.MMC.AirlineReservationSystem.dto.TicketRequest;
import Farid.MMC.AirlineReservationSystem.dto.TicketResponse;
import Farid.MMC.AirlineReservationSystem.entity.Ticket;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TicketMapper {
    Ticket toTicket(TicketRequest ticketRequest);
    TicketResponse toTicketResponse(Ticket ticket);
}
