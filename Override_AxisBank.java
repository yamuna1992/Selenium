package Week3.Day1;

public class Override_AxisBank extends Override_BankInfo{
	
	public void deposit() {

		System.out.println("Deposite Account in AXIS BANK");
	}

	public static void main(String[] args) {
		Override_AxisBank Oab = new Override_AxisBank();
		Oab.deposit();
		System.out.println("Method Override in Deposit ");
	}

}
