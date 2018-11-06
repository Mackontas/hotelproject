package model;

public interface Services {
    int getService_id();
    int getS_client_id();
    String getService_type();
    int getService_price();

    void setService_id(int value);
    void setS_client_id(int value);
    void setService_type(String value);
    void setService_price(int value);
}
