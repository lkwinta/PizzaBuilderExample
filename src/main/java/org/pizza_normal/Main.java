package org.pizza_normal;

import static org.common.PizzaPropertiesTypes.Meat;
import static org.common.PizzaPropertiesTypes.Size;
import static org.common.PizzaPropertiesTypes.Cheese;

public class Main {
    public static void main(String[] args) {
        Pizza capriciosaPizza =
                new Pizza(Size.Medium,
                        Cheese.Mozzarella,
                        Meat.Ham,
                        true,
                        true);
        PizzaMenuEntry capriciosaPizzaEntry =
                new PizzaMenuEntry(
                        Size.Medium,
                        Cheese.Mozzarella,
                        Meat.Ham,
                        true,
                        true);

        System.out.println(capriciosaPizza);
        System.out.println(capriciosaPizzaEntry);
    }
}