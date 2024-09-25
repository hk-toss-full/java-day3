import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 arr  배열 특징 인덱스가 있다. 길이가 정해져 있다.
 list  길이가 가변적 데이터를 뽑아올때 index 로  (숫자)
 seunzu 승주
 qwerasdfxzdcv 최승혁
 map 데이터를 뽑아올때 내가 원하는 key로 뽑아는 것
 key와 value
 set 특징 중복 x
 */
public class Main{

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("seunzu", "승주");
        map.put("qwerasdfxzdcv", "최승혁");
        Set<String> key=  map.keySet();
        System.out.println(key);
        map.put("seunzu", "서승주");
        System.out.println(map);
    }
}