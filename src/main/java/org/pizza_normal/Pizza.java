package org.pizza_normal;

import static org.common.PizzaPropertiesTypes.Meat;
import static org.common.PizzaPropertiesTypes.Size;
import static org.common.PizzaPropertiesTypes.Cheese;

public class Pizza {
    private final Size size;
    private final Cheese cheeseType;
    private final Meat meatType;
    private final boolean mushrooms;
    private final boolean olives;

    public Pizza(Size size){
        this.size = size;
        this.cheeseType = Cheese.Mozzarella;
        this.meatType = Meat.None;
        this.mushrooms = false;
        this.olives = false;
    }
    public Pizza(Size size, Cheese cheeseType) {
        this.size = size;
        this.cheeseType = cheeseType;
        this.meatType = Meat.None;
        this.mushrooms = false;
        this.olives = false;
    }
    public Pizza(Size size, Cheese cheeseType, Meat meatType) {
        this.size = size;
        this.cheeseType = cheeseType;
        this.meatType = meatType;
        this.mushrooms = false;
        this.olives = false;
    }
    public Pizza(Size size, Cheese cheeseType, boolean mushrooms) {
        this.size = size;
        this.cheeseType = cheeseType;
        this.meatType = Meat.None;
        this.mushrooms = mushrooms;
        this.olives = false;
    }
    public Pizza(Size size, Cheese cheeseType, Meat meatType, boolean mushrooms){
        this.size = size;
        this.cheeseType = cheeseType;
        this.meatType = meatType;
        this.mushrooms = mushrooms;
        this.olives = false;
    }
    public Pizza(Size size, Cheese cheeseType, Meat meatType, boolean mushrooms, boolean olives){
        this.size = size;
        this.cheeseType = cheeseType;
        this.meatType = meatType;
        this.mushrooms = mushrooms;
        this.olives = olives;
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
    /*
    public Pizza(Size size, Cheese cheeseType, boolean olives) {

    }*/
}
