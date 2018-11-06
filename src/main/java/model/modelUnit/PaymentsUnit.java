package model.modelUnit;

import model.Payments;

public class PaymentsUnit implements Payments {
    private int payment_id;
    private int p_client_id;
    private String payment_method;

    public PaymentsUnit(){}

    public PaymentsUnit(int payment_id, int p_client_id, String payment_method){
        setPayment_id(payment_id);
        setP_client_id(p_client_id);
        setPayment_method(payment_method);
    }

    @Override
    public int getPayment_id() {
        return this.payment_id;
    }

    @Override
    public int getP_client_id() {
        return this.p_client_id;
    }

    @Override
    public String getPayment_method() {
        return this.payment_method;
    }

    @Override
    public void setPayment_id(int value) {
        this.payment_id = value;
    }

    @Override
    public void setP_client_id(int value) {
        this.p_client_id = value;
    }

    @Override
    public void setPayment_method(String value) {
        this.payment_method = value;
    }
}
