package org.common;

public class PizzaPropertiesTypes {
    public enum Size {
        Small("Small"),
        Medium("Medium"),
        Large("Large");
        private final String stringRepresentation;
        Size(String representation){stringRepresentation = representation;}
        @Override
        public String toString(){
            return stringRepresentation;
        }

        public int toPrice(){
            return switch(this) {
                case Small -> 10;
                case Medium -> 15;
                case Large -> 20;
            };
        }

    }
    public enum Cheese {
        Mozzarella("Mozzarella"),
        Provolone("Provolone"),
        Cheddar("Cheddar"),
        Parmesan("Parmesan"),
        Gouda("Gouda");
        private final String stringRepresentation;
        Cheese(String representation){stringRepresentation = representation;}
        @Override
        public String toString(){
            return stringRepresentation;
        }

        public int toPrice(){
            return switch(this) {
                case Mozzarella -> 2;
                case Provolone -> 3;
                case Cheddar -> 4;
                case Parmesan -> 7;
                case Gouda -> 5;
            };
        }
    }
    public enum Meat {
        None ("None"),
        Ham ("Ham"),
        Salami ("Salami"),
        Chicken ("Chicken"),
        Sausage ("Sausage");

        private final String stringRepresentation;
        Meat(String representation){stringRepresentation = representation;}
        @Override
        public String toString(){
            return stringRepresentation;
        }

        public int toPrice(){
            return switch(this) {
                case None -> 0;
                case Ham -> 5;
                case Salami -> 7;
                case Chicken -> 10;
                case Sausage -> 9;
            };
        }
    }
}
