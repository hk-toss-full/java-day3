package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(9);
        int target = 9;
//      안에 있는 수 2개 더해서 target 이 되어야함
//      1 =< list 안에 있는 수 =< 10
//       answer는 순서 o
        int[] answer = new int[2];
        Integer[] tmp = new Integer[11];
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if(tmp[num] == null) tmp[num] = i;
        } // 100_000_000
        System.out.println(Arrays.toString(tmp));
//        for (int i = 1; i < tmp.length; i++) {  // 10
//            if(!tmp[i]) continue;
//            if(tmp[target-i]) {
//                answer[0] = i;
//                answer[1] = target-i;
//                break;
//            }
//        }

//        // 100_000_000!
//        for(int i = 0; i<list.size()-1;i++){ // 0 1 2 ... 99999
//            for(int j = i + 1; j<list.size();j++){ // 99999 99998 99997+ ..... 1
//                answer[0] = list.get(i);
//                answer[1] = list.get(j);
//                if(answer[0] + answer[1]==target) break;
//            }
//            if(answer[0]+answer[1]==target) break;
//        }




        System.out.println(Arrays.toString(answer)); // {2,9}
    }
}