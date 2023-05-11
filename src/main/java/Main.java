import sashabrausfashion.enums.*;
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
import sashabrausfashion.models.Product;
import sashabrausfashion.models.ShoppingCart;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleToIntFunction;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    private final static Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        //5 lambda functions from the java.util.function package

        //instantiate a product
        Dresses vintageDress = new Dresses("Vintage Dress", 300.00, "Small", "Mustard", 1, "This is a vintage, 40s style mustard-color dress.", "A-line");

        // 1. Predicate
        Predicate<Product> underOneHundred = vintageDress.underOneHundred();
        boolean isUnderOneHundred = underOneHundred.test(vintageDress);
        System.out.println("Is the product under $100" + isUnderOneHundred);

        //2. Consumer (Print's product's name)
        vintageDress.printName().accept(vintageDress);

        //3. Function
        Function<Product,String> getDescription = vintageDress.getDescriptionFunction();
        System.out.println(getDescription.apply(vintageDress));

        // 4. Supplier
        List<Product> dresses = vintageDress.createProducts(10);
        for(Product d: dresses) {
            System.out.println(d.toString());
        }

        // 5. UnaryOperator
        double priceWithTax = vintageDress.applyTax(price ->price * 1.05);
        System.out.println("Price with tax: $" + priceWithTax);


        // 5 Complex enum examples:

        //1 of 5 ClothingSize
        ClothingSize small = ClothingSize.SMALL;
        ClothingSize medium = ClothingSize.MEDIUM;
        ClothingSize large = ClothingSize.LARGE;

        System.out.println(small.getSize()); // Output: Small
        System.out.println(medium.getIndex()); // Output: 1
        System.out.println(large.toString()); // Output: LARGE

        //2 of 5 ItemType
        ItemType itemType = ItemType.BOTTOMS;
        String displayName = itemType.getDisplayName();
        System.out.println("Item type: " + displayName); // Output: Item type: Bottoms

        //3 of 5 Color
        System.out.println(Color.RED.getHexCode());

        //4 of 5 Seasons
        Season season = Season.SUMMER;
        String displaySeasonName = season.getDisplayName();
        System.out.println("Season: " + displaySeasonName); // Output: Season: Summer

        //5 of 5
        OccasionType occasion1 = OccasionType.WEDDING;
        OccasionType occasion2 = OccasionType.FORMAL;

        occasion1.addClothingItem("Wedding Dress");
        occasion1.addClothingItem("Wedding Suit");
        occasion1.addClothingItem("Wedding Shoes");

        occasion2.addClothingItem("Formal Dress");
        occasion2.addClothingItem("Formal Suit");
        occasion2.addClothingItem("Formal Shoes");

        for (OccasionType occasionType : OccasionType.values()) {
            System.out.println("Available clothing items for " + occasionType.getOccasion() + " occasion type:");
            for (String item : occasionType.getAvailableClothingItems()) {
                System.out.println("- " + item);
            }
        }

        //FileUtils
        try {
            String text = FileUtils.readFileToString(new File("C:\\Users\\Owner\\OneDrive\\Documents\\GitHub\\SashaBrausFashion\\TestFile"), "UTF-8");

            //Split text into words using StringUtils.split
            String[] words = StringUtils.split(text);

            //count number of Unique words
            Set<String> uniqueWords = new HashSet<String>(Arrays.asList(words));
            int uniqueWordCount = uniqueWords.size();

            //write the result to a file:
            FileUtils.writeStringToFile(new File("result.text"), "Unique word count: " + uniqueWordCount, "UTF-8");
//            System.out.println(text);
        }
        catch (IOException e) {
            e.printStackTrace();
        }


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


        //Test some methods

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