package Atcoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class q_2 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        List<String> list = new ArrayList<>();

        while (N-- > 0){
            list.add(scan.next());
        }

        List<String> list2 = new ArrayList<>();

        while (M-- > 0){
            list2.add(scan.next());
        }

        int basePrice = scan.nextInt();

        List<Integer> list3 = new ArrayList<>();
        while (M-- > 0){
            list3.add(scan.nextInt());
        }

        HashMap<String, Integer> map = new HashMap <>();
        for (int i = 0; i < M; i++){
            map.put(list2.get(i), list3.get(i));
        }
        int count = 0;
        for (int i = 0; i < N; ++i){
            if (map.containsKey(list.get(i))) count += map.get(list.get(i));
            else count += basePrice;
        }
        
        System.out.println(count);
        scan.close();


    }

}
