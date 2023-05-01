package main.java.sashabrausfashion.models;

import main.java.sashabrausfashion.utilities.Payment;

public class PayPalPayment implements Payment {
    private String paymentMethod;

    public PayPalPayment(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public boolean processPayment(double amount) {
        // TODO: Implement payment processing logic
        // For now, just return a placeholder value of true
//            if (paymentSuccessful) {
//                return true;
//            } else {
//                System.out.println("Payment failed. Please try again.");
//                return false;
//            }
//        }
        return true;
    }
    @Override
    public boolean refundPayment(double amount) {
        // TODO: Implement refund processing logic
        // For now, just return a placeholder value of true
//            if (refundSuccessful) {
//                return true;
//            } else {
//                System.out.println("Refund failed. Please try again.");
//                return false;
//            }
//        }
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

}
