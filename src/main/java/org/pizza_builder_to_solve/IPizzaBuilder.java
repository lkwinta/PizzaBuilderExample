package org.pizza_builder_to_solve;

import org.common.PizzaPropertiesTypes.Cheese;
import org.common.PizzaPropertiesTypes.Meat;
import org.common.PizzaPropertiesTypes.Size;

public interface IPizzaBuilder {
    void setSize(Size size);
    void setCheeseType(Cheese cheeseType);
    void setMeatType(Meat meatType);
    void setMushrooms(boolean mushrooms);
    void setOlives(boolean olives);
}
