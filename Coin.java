package coin;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	private HashMap<Integer, String> coinnames = new HashMap<Integer, String>();
	
	public Coin() {
		coinnames.put(1, "penny");
		coinnames.put(10, "dime");
		coinnames.put(25, "quarter");
		coinnames.put(50, "half-dolor");
		coinnames.put(50, "五毛");
		System.out.println(coinnames.keySet().size()); //HashMap不能直接告诉有多少，但是可以生成一个key的HashSet
		System.out.println(coinnames);//容器可以直接输出，也有toString()
		for ( Integer k : coinnames.keySet() ) {	//对key的集合做for-each
			String s = coinnames.get(k);
			System.out.println(s);
		}
	}
	
	public String getName(int amount) {
		if ( coinnames.containsKey(amount) )
			return coinnames.get(amount);
		else 
			return "NOT FOUND";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		Coin coin = new Coin();
		String name = coin.getName(amount);
		System.out.println(name);
	}

}
