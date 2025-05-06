package appointment;

import java.util.ArrayList;

public class Assignment1 {

    public static void main(String[] args) {

        Appointment appointment1 = new Appointment("1", "2023-04-23", "04:00 - 08:00");
        Appointment appointment2 = new Appointment("2", "2040-04-23", "10:00 - 14:00");
        Appointment appointment3 = new Appointment("3", "2040-04-23", "10:00 - 14:00");

        Customer customer1 = new Customer("1", "Siomay Racing", "08123823022", "Jalan Padi Sigma");
        Customer customer2 = new Customer("2", "Yanto Icikiwir", "08123831232", "Jawa Nesia Acikow");
        Customer customer3 = new Customer("3", "Siomay Racing", "08123823022", "Cihuy Slebew SatuDoeTiga");
    
        customer1.setAppointment(appointment1);
        customer2.setAppointment(appointment2);
        customer3.setAppointment(appointment3);
        
        customer1.showReservation();
        customer2.showReservation();
        customer3.showReservation();
    }
}

class Appointment {
    private String appointmentId;
    private String appointmentDate;
    private String appointmentTime;
    private Customer making;

    public Appointment(String appointmentId, String appointmentDate, String appointmentTime) {
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
    }

    public String getAppointmentId() { return this.appointmentId; }
    public String getAppointmentDate() { return this.appointmentDate; }
    public String getAppointmentTime() { return this.appointmentTime; }
    public Customer getMaking() { return this.making; }
    public void setMaking(Customer making) { this.making = making; }
}

class Customer {
    private String customerId;
    private String name;
    private String phoneNumber;
    private String street;
    private ArrayList<Appointment> reservation;

    public Customer(String customerId, String name, String phoneNumber, String street) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.reservation = new ArrayList<Appointment>();
    }

    public String getName() { return this.name; }

    public void setAppointment(Appointment appointment) {
        this.reservation.add(appointment);
        appointment.setMaking(this);
    }

    public void showReservation() {
        System.out.println("================================");
        System.out.println("Customer ID = " + this.customerId);
        System.out.println("Name = " + this.name);
        System.out.println("Phone Number = " + this.phoneNumber);
        System.out.println("Alamat = " + this.street);
        System.out.println("Appointments:");
        if (reservation.isEmpty()) {
            System.out.println("No appointments");
        } else {
            for (Appointment apt : reservation) {
                System.out.println("  - ID: " + apt.getAppointmentId() + 
                                 ", Date: " + apt.getAppointmentDate() + 
                                 ", Time: " + apt.getAppointmentTime());
            }
        }
        System.out.println("================================");
    }
}

