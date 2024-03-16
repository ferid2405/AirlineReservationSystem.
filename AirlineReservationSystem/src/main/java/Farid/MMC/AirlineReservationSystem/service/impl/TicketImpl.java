package Farid.MMC.AirlineReservationSystem.service.impl;

import Farid.MMC.AirlineReservationSystem.dto.TicketRequest;
import Farid.MMC.AirlineReservationSystem.dto.TicketResponsePage;
import Farid.MMC.AirlineReservationSystem.entity.Ticket;
import Farid.MMC.AirlineReservationSystem.service.TicketService;

public class TicketImpl implements TicketService {
    @Override
    public TicketResponsePage getAll(int page, int count) {
        return null;
    }

    @Override
    public TicketResponsePage getByCategoryId(Integer id, int page, int count) {
        return null;
    }

    @Override
    public Ticket getById(Integer id) {
        return null;
    }

    @Override
    public void save(TicketRequest ticketSaveRequest) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Integer id, TicketRequest ticketUpdateRequest) {

    }
}
