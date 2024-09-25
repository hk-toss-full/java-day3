package test;

import gtest.Food;

import java.util.HashSet;
import java.util.Set;
// array 배열 길이가 선언시 정해진다
// list 길이가 가변
//        <type> 제네릭
//        StoreAction action = new Store()
/*

    al    ll
c   win
r   win
d          win

 */

public class SetMain {
    // set 순서없다 중복도 없다
    public static void main(String[] args) {
        Set<Food> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            Food food = new Food("dsa"+ i);
            set.add(food);
        }
        for(Food food : set){
            System.out.println(food);
        }
        System.out.println(set);
    }
}