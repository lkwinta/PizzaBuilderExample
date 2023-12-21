package org.pizza_normal;

import static org.common.PizzaPropertiesTypes.Meat;
import static org.common.PizzaPropertiesTypes.Size;
import static org.common.PizzaPropertiesTypes.Cheese;

public class PizzaMenuEntry {
    private String entryString;
    private int price = 0;

    public PizzaMenuEntry(Size size){
        entryString = "Delicious %s Pizza with: mozzarella".formatted(size);
        price += size.toPrice() + Cheese.Mozzarella.toPrice();
    }

    public PizzaMenuEntry(Size size, Cheese cheeseType) {
        entryString = "Delicious %s Pizza with: %s".formatted(size, cheeseType);
        price += size.toPrice() + cheeseType.toPrice();
    }

    public PizzaMenuEntry(Size size, Cheese cheeseType, Meat meatType) {
        entryString = "Delicious %s Pizza with: %s, %s".formatted(size, cheeseType, meatType);
        price += size.toPrice() + cheeseType.toPrice() + meatType.toPrice();
    }

    public PizzaMenuEntry(Size size, Cheese cheeseType, boolean mushrooms) {
        entryString = "Delicious %s Pizza with %s".formatted(size, cheeseType);
        price += size.toPrice() + cheeseType.toPrice();
        if (mushrooms) {
            entryString += ", mushrooms";
            price += 3;
        }
    }

    public PizzaMenuEntry(Size size, Cheese cheeseType, Meat meatType, boolean mushrooms){
        entryString = "Delicious %s Pizza with %s, %s".formatted(size, cheeseType, meatType);
        price += size.toPrice() + cheeseType.toPrice() + meatType.toPrice();
        if (mushrooms) {
            entryString += ", mushrooms";
            price += 3;
        }
    }

    public PizzaMenuEntry(Size size, Cheese cheeseType, Meat meatType, boolean mushrooms, boolean olives){
        entryString = "Delicious %s Pizza with %s, %s".formatted(size, cheeseType, meatType);
        price += size.toPrice() + cheeseType.toPrice() + meatType.toPrice();
        if (mushrooms){
            entryString += ", mushrooms";
            price += 3;
        }
        if (olives) {
            entryString += ", olives";
            price += 2;
        }
    }

    @Override
    public String toString(){
        return entryString + " : at good price: " + price;
    }
}
