package org.pizza_builder_pattern;

import org.common.PizzaPropertiesTypes;

public class PizzaMenuEntryBuilder implements IPizzaBuilder {
    private int price = 0;
    private String entryString = "Delicious Pizza with: ";

    @Override
    public void setSize(PizzaPropertiesTypes.Size size) {
        entryString += "Size %s ".formatted(size);
        price += size.toPrice();
    }

    @Override
    public void setCheeseType(PizzaPropertiesTypes.Cheese cheeseType) {
        entryString += "Cheese %s ".formatted(cheeseType);
        price += cheeseType.toPrice();
    }

    @Override
    public void setMeatType(PizzaPropertiesTypes.Meat meatType) {
        entryString += "Meat %s ".formatted(meatType);
        price += meatType.toPrice();
    }

    @Override
    public void setMushrooms(boolean mushrooms) {
        if(mushrooms) {
            entryString += "Mushrooms ";
            price += 3;
        }
        else
            entryString += "No Mushrooms ";
    }

    @Override
    public void setOlives(boolean olives) {
        if(olives) {
            entryString += "Olives ";
            price += 2;
        }
        else
            entryString += "No Olives ";
    }

    public PizzaMenuEntry build() {
        return new PizzaMenuEntry(price, entryString);
    }
}
