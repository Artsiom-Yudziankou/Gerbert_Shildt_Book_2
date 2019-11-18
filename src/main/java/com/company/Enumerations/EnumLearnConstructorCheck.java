package com.company.Enumerations;

// Enum variables are variables of class "Enum", so initiating the variable - initiating the Object of "Enum" class.
// Constructors can be produced for Enum vars, the example is below.
// Some methods are available for use from "Enum" class:
//                                                          ordinal() - to get the enumerated number.
//                                                          compareTo(enum_type e) - to comapre enumerated numbers.
//                                                          equals() - to compare if both objects are equal constants in one "Enum"

public class EnumLearnConstructorCheck {
    public static void main(String[] args) {
        Apple apples;
        System.out.println("Apple of the sort of Winesap costs " + Apple.Winesap.getPrice() + "$");
        System.out.println("The price of the all sorts of apples: ");
        for (Apple a: Apple.values()
             ) {
            System.out.println(a + " costs " + a.getPrice() + "$");
            System.out.println("number is " + a.ordinal());
        }
    }
}


enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price;

    Apple(int price) {
        this.price = price;
    }

    int getPrice() {
        return this.price;
    }
}