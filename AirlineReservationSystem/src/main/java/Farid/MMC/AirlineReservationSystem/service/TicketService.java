package Farid.MMC.AirlineReservationSystem.service;

import Farid.MMC.AirlineReservationSystem.dto.TicketRequest;
import Farid.MMC.AirlineReservationSystem.dto.TicketResponsePage;
import Farid.MMC.AirlineReservationSystem.entity.Ticket;

public interface TicketService {

    TicketResponsePage getAll(int page,int count);
    TicketResponsePage getByCategoryId(Integer id,int page,int count);
    Ticket getById(Integer id);
    void  save(TicketRequest ticketSaveRequest);
    void delete(Integer id);
    void update(Integer id,TicketRequest ticketUpdateRequest);
}
