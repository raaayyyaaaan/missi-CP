import java.util.*;
import java.io.*;

public class CF_1857_B {
    public static boolean flag;
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
//    	int t = sc.nextInt();
//    	while (t-- > 0) {
    	int n = sc.nextInt();
    	String num = Integer.toString(n);
    	char[] numChar = num.toCharArray();
    	List<Character> list = new ArrayList<>();
    	list.add('0');
    	for(char i : numChar) {
    		list.add(i);
    		}
    	int i = 1;
    	while(i-- > 0) {
    		list = CF_1857_B.action(list);
    	}
    	System.out.println(list);



//    		
//    	}
    }
    public static List<Character> action(List<Character> list) {
    	for(int i = 1; i < list.size(); i++) {
    		if (Integer.valueOf(list.get(i)) >= 5) {
    			list.set(i-1, (char)((Integer.valueOf(list.get(i-1))+1+'0')));
    			if (Integer.valueOf(list.get(i)) >= 5) CF_1857_B.flag = true;
    			CF_1857_B.flag = false;
    			for(int j = i; j < list.size(); j++) {
    				list.set(j, '0');
    			}
    		}
    		
    	}
		return list;
    	
    }
}

