package stask4;

import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateandTimeAPI {

    public static void main(String[] args) {
        // Legacy Date class
        Date legacyDate = new Date();
        System.out.println("Legacy Date: " + legacyDate);

        // Legacy Calendar class
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.APRIL, 27, 10, 30, 0);
        Date calendarDate = calendar.getTime();
        System.out.println("Legacy Calendar Date: " + calendarDate);

        // Modern Java Time API - LocalDate (date only)
        LocalDate localDate = LocalDate.now();
        System.out.println("Modern LocalDate: " + localDate);

        // Modern Java Time API - LocalDateTime (date and time)
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Modern LocalDateTime: " + localDateTime);

        // Formatting LocalDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = localDateTime.format(formatter);
        System.out.println("Formatted Modern LocalDateTime: " + formattedDateTime);

        // Convert legacy Date to LocalDateTime
        LocalDateTime fromLegacyDate = legacyDate.toInstant()
            .atZone(ZoneId.systemDefault())
            .toLocalDateTime();
        System.out.println("Converted from Legacy Date to LocalDateTime: " + fromLegacyDate);

        // Convert LocalDateTime to legacy Date
        Date fromLocalDateTime = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("Converted from LocalDateTime to Legacy Date: " + fromLocalDateTime);
    }
}

