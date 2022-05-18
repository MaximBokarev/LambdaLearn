package lambda2;

import lambda1.Apple;
import lambda1.Color;

import java.util.Arrays;
import java.util.List;

import static lambda2.FilterApple1.filterApples;

public class App {
    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED));
        List<Apple> greenApples = filterApples(inventory, Color.GREEN, 0, true);
        List<Apple> redApples = filterApples(inventory, Color.RED, 150, false);

    }
}
