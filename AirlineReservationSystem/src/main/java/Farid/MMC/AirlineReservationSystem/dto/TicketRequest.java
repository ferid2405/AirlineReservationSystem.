package Farid.MMC.AirlineReservationSystem.dto;

import java.time.LocalDate;

public record TicketRequest(
        String country,
        LocalDate addedDate,
        Integer mark
) {
}
