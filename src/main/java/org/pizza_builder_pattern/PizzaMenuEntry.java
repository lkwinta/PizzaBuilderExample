package org.pizza_builder_pattern;

import static org.common.PizzaPropertiesTypes.Meat;
import static org.common.PizzaPropertiesTypes.Size;
import static org.common.PizzaPropertiesTypes.Cheese;

public class PizzaMenuEntry {
    private final int price;
    private final String entryString;

    public PizzaMenuEntry(int price, String entryString){
        this.price = price;
        this.entryString = entryString;
    }

    public int getPrice() {
        return price;
    }

    public String getEntryString() {
        return entryString;
    }

    @Override
    public String toString(){
        return entryString + " : at good price: " + price;
    }
}
