package Leetcode;

public class weekly_357_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(finalString("string"));
		

	}

    public static String finalString(String s) {
    	String res = "";
		StringBuilder sb=new StringBuilder(res);
    	char[] c = s.toCharArray();
    	for (char i : c) {
    		if ( i == 'i') {
    			sb.reverse();
    		}
    		else sb.append(i);
    	}
    	
		return sb.toString();
    	
    }

}
