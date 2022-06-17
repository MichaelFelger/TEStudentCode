package src.main.java;

public class CheckoutProcess {
    GuestList guestList;
    HotelReservation hotelReservation;

    CheckoutProcess(){
    this.guestList = new GuestList();
    this.hotelReservation = new HotelReservation();

    }

        public void checkOutPartOne() {
            System.out.println("Let's get you checked out");


        }

}
