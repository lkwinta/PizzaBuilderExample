package org.pizza_builder_pattern;

import static org.common.PizzaPropertiesTypes.Meat;
import static org.common.PizzaPropertiesTypes.Size;
import static org.common.PizzaPropertiesTypes.Cheese;

public class PizzaBuilder implements IPizzaBuilder {
    private Size size = Size.Small;
    private Cheese cheeseType = Cheese.Mozzarella;
    private Meat meatType = Meat.None;
    private boolean mushrooms = false;
    private boolean olives = false;

    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void setCheeseType(Cheese cheeseType){
        this.cheeseType = cheeseType;
    }

    @Override
    public void setMeatType(Meat meatType) {
        this.meatType = meatType;
    }

    @Override
    public void setMushrooms(boolean mushrooms){
        this.mushrooms = mushrooms;
    }

    @Override
    public void setOlives(boolean olives){
        this.olives = olives;
    }

    public Pizza build(){
        return new Pizza(size, cheeseType, meatType, mushrooms, olives);
    }
}
