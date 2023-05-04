import sashabrausfashion.models.CartItem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sashabrausfashion.accessories.Bags;
import sashabrausfashion.accessories.Hats;
import sashabrausfashion.accessories.Jewelry;
import sashabrausfashion.clothing.Bottoms;
import sashabrausfashion.clothing.Dresses;
import sashabrausfashion.clothing.Tops;
import sashabrausfashion.models.CustomerInfo;
import sashabrausfashion.models.ShoppingCart;

import java.util.function.DoubleToIntFunction;

public class Main {

    private final static Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        //Loggers
        LOGGER.info("Some message");
        LOGGER.error("Now I should see some message");

        //Instantiate some Products

        Dresses myDress = new Dresses("Tiffany", 149.99, "Small", "Floral", 1, "A small floral dress","Sundresses");
        Tops tops = new Tops("Minimalist Tank", 155.49, "Large", "White", 1.0, "A white large tanktop.","Tanks");
        Bottoms bottoms = new Bottoms("Intense Bell-bottoms", 189.97, "Extra-Small","Black",1.8, "An extra-small black pair of pants","Pants");
        Bags bags = new Bags("Fiona", 127.49, "Free","Emerald",1,"This is a backpack style bag.", "Backpack");
        Jewelry jewelry = new Jewelry("Butterfly Kisses", 349.99, "Free","Silver",0.01, "A silver necklace.","Necklace");
        Hats hats = new Hats("Chelsea",115,"Small", "Beige",0.2, "A sun hat.","Sun Hat");

        //Create a ShoppingCart
        ShoppingCart cart = new ShoppingCart();

        //CartItems
        CartItem cartItem1 = new CartItem(myDress,2);
        CartItem cartItem2 = new CartItem(bags, 1);

        // add the cart items to the shopping cart
        cart.addItem(cartItem1);
        cart.addItem(cartItem2);

        //calculate total
        double total = cart.getTotal();
        double discount = cart.calculateDiscount(cartItem1);

        //print Cart info
        System.out.println("Total: " + total);
        System.out.println("Discount: " + discount);

        //Instance of Customer
        CustomerInfo customerInfo = new CustomerInfo("Jamie","Potter","jpotter@gmail.com","StrongPassword123","123 Fake Street Chicago, IL 60617", "123 Fake Street Chicago, IL 60617", "773-867-5309");

        //Test the methods


        double priceOfDress = myDress.getPrice();
//        System.out.println(priceOfDress); //This will print "149.99"
        LOGGER.info(priceOfDress);

        String topsSize = tops.getSize();
//        System.out.println(topsSize); //This will print "Large"
        LOGGER.warn(topsSize);

        String bottomsType1 = bottoms.getBottomsType();
//        System.out.println(bottomsType1); //This will print "Pants"
        LOGGER.error(bottomsType1);

        String bagsType1 = bags.getBagsType();
//        System.out.println(bagsType1); //This will print "Backpack"
        LOGGER.trace(bagsType1);

        String jewelryName = jewelry.getName();
//        System.out.println(jewelryName); //This will print "Butterfly Kisses"
        LOGGER.fatal(jewelryName);

        double hatsPrice = hats.getPrice();
//        System.out.println(hatsPrice); //This will print "115.00"
        LOGGER.debug(hatsPrice);

        String customerInfoLastName = customerInfo.getLastName();
//        System.out.println(customerInfoLastName); //This will print "Potter"
        LOGGER.info(customerInfoLastName);
    }
}