package lambda5;

import lambda1.Apple;
import lambda1.Color;
import lambda3.FilterApple2;

import java.util.Arrays;
import java.util.List;

import static lambda3.FilterApple2.filterApples;

public class LambdaUse {
    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED));

        List<Apple> result = filterApples(inventory, (Apple apple) -> Color.RED.equals(apple.getColor()));

    System.out.println("Shold be: " + result.size());
    }

}
