package Farid.MMC.AirlineReservationSystem.dto;

import java.util.List;

public record TicketResponsePage(
        List<TicketResponse> elements,
        long totalElements,
        int totalPages,
        boolean hasNext
) {
}
