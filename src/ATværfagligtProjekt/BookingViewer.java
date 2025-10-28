package ATværfagligtProjekt;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BookingViewer {
    private Map<LocalDate, List<LocalTime>> availableSlots = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BookingViewer viewer = new BookingViewer();
        viewer.initializeSlots();
        viewer.run();
    }

    public void initializeSlots() {
        LocalDate today = LocalDate.now();
        for (int i = 0; i < 5; i++) {
            LocalDate date = today.plusDays(i);
            List<LocalTime> times = Arrays.asList(
                    LocalTime.of(9, 0),
                    LocalTime.of(10, 0),
                    LocalTime.of(11, 0),
                    LocalTime.of(13, 0),
                    LocalTime.of(14, 0)
            );
            availableSlots.put(date, new ArrayList<>(times));
        }
    }


    public void run() {

        System.out.print("Indtast dato (dd-mm-yyyy): ");
        String input = scanner.nextLine();
        LocalDate selectedDate;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            selectedDate = LocalDate.parse(input, formatter);
        } catch (Exception e) {
            System.out.println("Ugyldigt datoformat. Brug venligst dd-mm-yyyy.");
            return;
        }


        showAvailableSlots(selectedDate);
    }


    public void showAvailableSlots(LocalDate date) {
        List<LocalTime> slots = availableSlots.get(date);
        if (slots == null || slots.isEmpty()) {
            System.out.println("Ingen ledige tider på " + date);
        } else {
            System.out.println("Ledige tider på " + date + ":");
            for (LocalTime time : slots) {
                System.out.println("- " + time);
            }
        }
    }
}