package org.pizza_builder_pattern;

import org.common.PizzaPropertiesTypes;

public class PizzaBuilderChainingExample {
    private PizzaPropertiesTypes.Size size = PizzaPropertiesTypes.Size.Small;
    private PizzaPropertiesTypes.Cheese cheeseType = PizzaPropertiesTypes.Cheese.Mozzarella;
    private PizzaPropertiesTypes.Meat meatType = PizzaPropertiesTypes.Meat.None;
    private boolean mushrooms = false;
    private boolean olives = false;

    public PizzaBuilderChainingExample setSize(PizzaPropertiesTypes.Size size) {
        this.size = size;
        return this;
    }

    public PizzaBuilderChainingExample setCheeseType(PizzaPropertiesTypes.Cheese cheeseType){
        this.cheeseType = cheeseType;
        return this;
    }

    public PizzaBuilderChainingExample setMeatType(PizzaPropertiesTypes.Meat meatType) {
        this.meatType = meatType;
        return this;
    }

    public PizzaBuilderChainingExample setMushrooms(boolean mushrooms){
        this.mushrooms = mushrooms;
        return this;
    }

    public PizzaBuilderChainingExample setOlives(boolean olives){
        this.olives = olives;
        return this;
    }

    public Pizza build(){
        return new Pizza(size, cheeseType, meatType, mushrooms, olives);
    }
}
