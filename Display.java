package clock;

public class Display {
	private int value = 0;
	private int limit = 0; //不写0也没关系,但是这是强化自己的好习惯
	
	public Display(int limit) {
		this.limit = limit;
	}
	
	public void increase() {
		value++;
		if ( value == limit )
		{
			value = 0;
		}
	}
	
	public int getValue() {
		return value;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d = new Display(24);
		for ( ;; ) {
			d.increase();
			System.out.println(d.getValue());
		}
	}

}
