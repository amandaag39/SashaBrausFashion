package main.java.sashabrausfashion.utilities;
import java.lang.reflect.Method;

public interface Payment {

    boolean processPayment(double amount);

    boolean refundPayment(double amount);
    String getPaymentMethod();

    void setPaymentMethod(String paymentMethod);
}
