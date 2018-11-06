package model;

public interface Bookings {
    int getBooking_id();
    int getB_client_id();
    int getB_room_number();

    void setBooking_id(int value);
    void setB_client_id(int value);
    void setB_room_number(int value);
}
