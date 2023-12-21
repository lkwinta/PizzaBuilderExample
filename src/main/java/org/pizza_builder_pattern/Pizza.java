package org.pizza_builder_pattern;

import static org.common.PizzaPropertiesTypes.Meat;
import static org.common.PizzaPropertiesTypes.Size;
import static org.common.PizzaPropertiesTypes.Cheese;

public class Pizza {
    private final Size size;
    private final Cheese cheeseType;
    private final Meat meatType;
    private final boolean mushrooms;
    private final boolean olives;

    public Pizza(Size size, Cheese cheeseType, Meat meatType, boolean mushrooms, boolean olives) {
        this.size = size;
        this.cheeseType = cheeseType;
        this.meatType = meatType;
        this.mushrooms = mushrooms;
        this.olives = olives;
    }

    public Size getSize() {
        return size;
    }

    public Cheese getCheeseType() {
        return cheeseType;
    }

    public Meat getMeatType() {
        return meatType;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public boolean isOlives() {
        return olives;
    }

    @Override
    public String toString(){
        String str = "Size: %s, Ingredients: %s, %s".formatted(size, cheeseType, meatType);
        if (mushrooms)
            str += ", mushroom";
        if (olives)
            str += ", olives";

        return str;
    }
}
