package stringDateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class StringDateTime {
    public static void main(String[] args) {
        // String Handling
        String name = "Java" ;
        System.out.println("Original: " + name);
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Substring: " + name.substring(1, 3));
        System.out.println("Replaced: " + name.replace('a', '@'));

        // Date and Time API
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Current Date-Time: " + now.format(format));

        // Period example
        LocalDate startDate = LocalDate.of(2025, 1, 1);
        Period diff = Period.between(startDate, LocalDate.now());
        System.out.println("Difference: " + diff.getYears() + " years, " + diff.getMonths() + " months");
    }
}
