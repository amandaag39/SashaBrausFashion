package main.java.sashabrausfashion.utilities;

import main.java.sashabrausfashion.exceptions.NegativeWeightException;
import main.java.sashabrausfashion.models.CartItem;

import java.util.List;

public interface ShippingCalculator {
    String getDestinationAddress();

    void setDestinationAddress(String destinationAddress);

    double getWeight(CartItem item) throws NegativeWeightException;

    void setWeight(double weight);

    double calculateShippingCost(List<CartItem> items);
}

