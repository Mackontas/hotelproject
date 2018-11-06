package model.modelUnit;

import model.Services;

public class ServicesUnit implements Services {
    private int service_id;
    private int s_client_id;
    private String service_type;
    private int service_price;

    public ServicesUnit (){}

    public ServicesUnit(int service_id, int s_client_id, String service_type, int service_price){
        setService_id(service_id);
        setS_client_id(s_client_id);
        setService_type(service_type);
        setService_price(service_price);
    }
    @Override
    public int getService_id() {
        return this.service_id;
    }

    @Override
    public int getS_client_id() {
        return this.s_client_id;
    }

    @Override
    public String getService_type() {
        return this.service_type;
    }

    @Override
    public int getService_price() {
        return this.service_price;
    }

    @Override
    public void setService_id(int value) {
        this.service_id = value;
    }

    @Override
    public void setS_client_id(int value) {
        this.s_client_id = value;
    }

    @Override
    public void setService_type(String value) {
        this.service_type = value;
    }

    @Override
    public void setService_price(int value) {
        this.service_price = value;
    }
}
