package GFG;

import java.util.Arrays;

public class Weekly_113_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 99979997;
		System.out.println(maximumNumber(num));

	}
    public static int maximumNumber(int num) {
    	char[] c = Integer.toString(num).toCharArray();
    	for(int i = 0; i < c.length; i++) {
    		if (c[i] == '7') {
    			c[i] = '9';
    			break;
    		}
    	}
    	 int a = Integer.parseInt(String.valueOf(c));


		return a;

        
    }

}
