package lambda4;

import lambda1.Apple;
import lambda1.Color;
import lambda3.ApplePredicate;


import java.util.Arrays;
import java.util.List;

import static lambda3.FilterApple2.filterApples;

public class AppAnonimClass {
    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED));
        List<Apple> redApples = filterApples(inventory, new ApplePredicate() {
            public boolean test(Apple apple) {
                return Color.RED.equals(apple.getColor());
            }
        });
        System.out.println("Length" + redApples.size());

    }
}
