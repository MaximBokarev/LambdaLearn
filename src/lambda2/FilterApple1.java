package lambda2;

import lambda1.Apple;
import lambda1.Color;

import java.util.ArrayList;
import java.util.List;

public class FilterApple1 {
    public static List<Apple> filterApples(List<Apple> inventory, Color color, int weight, boolean flag){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(flag && apple.getColor().equals(color) ||
                    (!flag && apple.getWeight() > weight)){
                result.add(apple);
            }
        }

        return result;
    }


}
