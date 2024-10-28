package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("-------------------------- LEMENSE - CAR RENT --------------------------");
        System.out.println();
        System.out.println("Enter rental details");
        System.out.print("Car model.: ");
        String carModel = sc.nextLine();

        LocalDateTime start = null;
        LocalDateTime finish = null;

        try {
            System.out.print("Withdrawal (dd/MM/yyyy HH:mm).: ");
            start = LocalDateTime.parse(sc.nextLine(), fmt);
            System.out.print("Return (dd/MM/yyyy HH:mm).: ");
            finish = LocalDateTime.parse(sc.nextLine(), fmt);

        } catch(DateTimeParseException e) {
            System.out.println("Error parsing date and time. Please use the format dd/MM/yyyy");
            e.printStackTrace();
            sc.close();
            return;
        }

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Enter the price per hour.: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter the price per day.: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);
        System.out.println("Payment basic.: R$ " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Tax.: R$ " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Payment total.: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        sc.close();
    }
}












