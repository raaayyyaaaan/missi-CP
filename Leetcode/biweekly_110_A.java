package Leetcode;

public class biweekly_110_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(accountBalanceAfterPurchase(4));

	}
    public static int accountBalanceAfterPurchase(int purchaseAmount) {
    	int round = 0;
    	if (purchaseAmount % 10 >= 5) {
    		round = purchaseAmount + (10 - (purchaseAmount % 10));
    	}
    	else round = purchaseAmount - ((purchaseAmount % 10));
		return 100-round;
        
    }

}
