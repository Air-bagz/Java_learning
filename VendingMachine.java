package vendingmachine;

public class VendingMachine {
	int price = 80;
	int balance = f();
	int total;
	
	VendingMachine()	// 构造函数
	{
		total = 0;
	}
	
	VendingMachine(int price)
	{
		this.price = price;
	}
	
	int f()
	{
		return 10;
	}
	
	void setPrice(int price)
	{
		this.price = price;
	}
	
	void showPrompt()
	{
		System.out.println("Welcome");
	}
	
	void insertMoney(int amount)
	{
		balance = balance + amount;
	}
	
	void showBalance()
	{
		System.out.println(balance);
	}
	
	void getFood()
	{
		if ( balance >= price ) {
			System.out.println("Here you are.");
			balance = balance - price;
			total = total + price ;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine vm = new VendingMachine();
		vm.showPrompt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
		VendingMachine vm1 = new VendingMachine(100);	
		vm1.insertMoney(200);
		//vm vm1 两个对象变量管理着不同的对象
		vm.showBalance();
		vm1.showBalance();
		//vm.setPrice(10);
	}

}
