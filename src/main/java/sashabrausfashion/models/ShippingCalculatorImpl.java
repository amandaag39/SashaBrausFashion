package sashabrausfashion.models;


import sashabrausfashion.exceptions.NegativeWeightException;
import sashabrausfashion.utilities.ShippingCalculator;

import java.util.List;

public class ShippingCalculatorImpl implements ShippingCalculator {
    private CustomerInfo customerInfo;
    private double weight;

    public ShippingCalculatorImpl(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    public String getDestinationAddress() {
        return customerInfo.getShippingAddress();
    }

    public void setDestinationAddress(String destinationAddress) {
        customerInfo.setShippingAddress(destinationAddress);
    }

    @Override
    public double getWeight(CartItem item) throws NegativeWeightException {
        double weight = item.getProduct().getWeight() * item.getQuantity();
        if (weight < 0) {
            throw new NegativeWeightException("Weight of item " + item.getProduct().getName() + " is negative: " + weight);
        }
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculateShippingCost(List<CartItem> items) {
        //Set default shipping cost to 0.0
        double shippingCost = 0.0;

        //retrieve shipping a billing addresses from the customer info object
        String shippingAddress = customerInfo.getShippingAddress();

        //Calculate the total weight of all items in the list
        double totalWeight = 0.0;
        for(CartItem item : items) {
            totalWeight += item.getWeight();
        }

        //Calculate the shipping cost based on the destination address and total weight
        if(getDestinationAddress().contains("USA")) {
            if(totalWeight <= 5) {
                shippingCost = 5.99;
            } else if (totalWeight <= 10) {
                shippingCost = 9.99;
            } else {
                shippingCost = 14.99;
            }
        } else if (getDestinationAddress().contains("Canada")) {
            if(totalWeight <=5) {
                shippingCost = 10.99;
            } else if (totalWeight <= 10) {
                shippingCost =14.99;
            } else {
                shippingCost = 19.99;
            }
        } else {
            //For all other international destinations, use flat rate of $24.99
            shippingCost = 24.99;
        }
        return shippingCost;
    }
}
