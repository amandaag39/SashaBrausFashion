package sashabrausfashion.utilities;

import sashabrausfashion.accessories.Bags;
import sashabrausfashion.models.Product;

import java.lang.reflect.*;

public class ReflectionExample {

    public static void runReflectionExample() {
        // Get the class object for Bags
        Class<Bags> bagsClass = Bags.class;

        // Accessing constructors
        Constructor<?>[] constructors = bagsClass.getConstructors();
        System.out.println("Constructors:");
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        // Accessing methods
        Method[] methods = bagsClass.getMethods();
        System.out.println("Methods:");
        for (Method method : methods) {
            System.out.println(method);
        }

        // Accessing fields
        Field[] fields = bagsClass.getFields();
        System.out.println("Fields:");
        for (Field field : fields) {
            System.out.println(field);
        }

        // Creating an instance using reflection
        try {
            Constructor<Bags> constructor = bagsClass.getConstructor(String.class, double.class, String.class, String.class, double.class, String.class, String.class);
            Bags bagsInstance = constructor.newInstance("Bag 1", 99.99, "Medium", "Black", 0.5, "Description", "Tote");
            System.out.println("Created instance: " + bagsInstance);

            // Accessing methods dynamically
            Method printDescriptionMethod = bagsClass.getMethod("printDescription");
            printDescriptionMethod.invoke(bagsInstance);

            // Accessing fields dynamically
            Field priceField = Product.class.getDeclaredField("price");
            priceField.setAccessible(true);
            double currentPrice = (double) priceField.get(bagsInstance);
            System.out.println("Current price: " + currentPrice);

            // Modifying fields dynamically
            priceField.set(bagsInstance, 149.99);
            System.out.println("Modified instance: " + bagsInstance);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
