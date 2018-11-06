package model;

public interface Payments {
    int getPayment_id();
    int getP_client_id();
    String getPayment_method();

    void setPayment_id(int value);
    void setP_client_id(int value);
    void setPayment_method(String value);
}
