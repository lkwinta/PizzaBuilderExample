package org.pizza_builder_pattern;

import static org.common.PizzaPropertiesTypes.Meat;
import static org.common.PizzaPropertiesTypes.Cheese;
import static org.common.PizzaPropertiesTypes.Size;

public class Main {
    private static void getMediumCapricciosa(IPizzaBuilder builder){
        builder.setSize(Size.Medium);
        builder.setCheeseType(Cheese.Mozzarella);
        builder.setMeatType(Meat.Ham);
        builder.setMushrooms(true);
        builder.setOlives(true);
    }

    public static void main(String[] args){
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        PizzaMenuEntryBuilder pizzaMenuBuilder = new PizzaMenuEntryBuilder();

        getMediumCapricciosa(pizzaBuilder);
        getMediumCapricciosa(pizzaMenuBuilder);

        Pizza mediumCapriciosaPizza = pizzaBuilder.build();
        PizzaMenuEntry mediumcCapriciosaPizzaEntry = pizzaMenuBuilder.build();

        pizzaBuilder.setSize(Size.Large);
        pizzaMenuBuilder.setSize(Size.Large);
        Pizza largeCapricciosaPizza = pizzaBuilder.build();
        PizzaMenuEntry largeCapricciosaPizzaEntry = pizzaMenuBuilder.build();

        System.out.println(mediumCapriciosaPizza);
        System.out.println(mediumcCapriciosaPizzaEntry);

        var salamiPizza = new PizzaBuilderChainingExample()
                .setCheeseType(Cheese.Mozzarella)
                .setSize(Size.Large)
                .setMushrooms(true)
                .setOlives(false)
                .build();

        System.out.println(salamiPizza);
    }
}
