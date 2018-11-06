package model.modelUnit;

import model.Bookings;

public class BookingsUnit implements Bookings {
    private int booking_id;
    private int b_client_id;
    private int b_room_number;

    public BookingsUnit(){}

    public BookingsUnit(int booking_id, int b_client_id, int b_room_number){
        setBooking_id(booking_id);
        setB_client_id(b_client_id);
        setB_room_number(b_room_number);
    }

    @Override
    public int getBooking_id() {
        return this.booking_id;
    }

    @Override
    public int getB_client_id() {
        return this.b_client_id;
    }

    @Override
    public int getB_room_number() {
        return this.b_room_number;
    }

    @Override
    public void setBooking_id(int value) {
        this.booking_id = value;
    }

    @Override
    public void setB_client_id(int value) {
        this.b_client_id = value;
    }

    @Override
    public void setB_room_number(int value) {
        this.b_room_number = value;
    }

}
