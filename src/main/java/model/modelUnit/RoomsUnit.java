package model.modelUnit;

import model.Rooms;

public class RoomsUnit implements Rooms {
    private int room_number;
    private int r_client_id;
    private int room_price;

    public RoomsUnit() {}

    public RoomsUnit(int room_number,int r_client_id, int room_price){
        setRoom_number(room_number);
        setR_client_id(r_client_id);
        setRoom_price(room_price);
    }


    @Override
    public int getRoom_price() {
        return this.room_price;
    }

    @Override
    public int getR_client_id() {
        return this.r_client_id;
    }

    @Override
    public int getRoom_number() {
        return this.room_number;
    }

    @Override
    public void setRoom_price(int value) {
        this.room_price = value;
    }

    @Override
    public void setR_client_id(int value) {
        this.r_client_id = value;
    }

    @Override
    public void setRoom_number(int value) {
        this.room_number = value;
    }
}
