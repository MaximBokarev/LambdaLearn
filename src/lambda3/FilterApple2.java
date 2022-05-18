package lambda3;

import lambda1.Apple;
import lambda1.Color;

import java.util.ArrayList;
import java.util.List;

public class FilterApple2 {
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

}
