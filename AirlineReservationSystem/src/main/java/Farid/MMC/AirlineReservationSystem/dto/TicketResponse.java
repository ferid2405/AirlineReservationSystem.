package Farid.MMC.AirlineReservationSystem.dto;

import java.time.LocalDate;

public record TicketResponse(
        Integer id,
        String country,
        LocalDate addedDate,
        Integer mark
) {
}
