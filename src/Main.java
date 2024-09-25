import gtest.Food;
import gtest.Order;
import gtest.Product;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
// array 배열 길이가 선언시 정해진다
// list 길이가 가변
//        <type> 제네릭
//        StoreAction action = new Store()
public class Main{
    public static void main(String[] args) {
        String[] strs = {"h", "e", "l", "l", "o"};

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list); // Arrays.toString(strs)
        System.out.println(list.get(0)); // strs[0]
        list.remove(0); // remove
        System.out.println(list);
        System.out.println(list.size());  // 길이 strs.length

    }
}