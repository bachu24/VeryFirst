public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount p =new BankAccount("Wang","TaLu","Male","Actor","SIIT","000-000-0000",10.0);
	
	
	/*System.out.println("Name: "+p.person.name);
	System.out.println("Surname: "+p.person.surname);
	System.out.println("Sex: "+p.person.sex);
	System.out.println("Occupation: "+p.person.occupation);
	System.out.println("Organization: "+p.person.organization);
	System.out.println("Account Number: "+p.accountNumber);
	System.out.println("Balance: "+p.balance);*/
	
	p.printInFo();
	
	p.person.name="Bachu";
	p.person.surname="Pelden";
	p.person.sex="female";
	System.out.println("Name: "+p.person.name);
	System.out.println("Surname: "+p.person.surname);
	System.out.println("Sex: "+p.person.sex);
	
	p.desposit(15000000);
	System.out.println("Balance: "+p.balance);
	
	p.withdraw(5000000);
	System.out.println("Balance: "+p.balance);
	
	System.out.println("Balance in THB: "+p.convertBalanceToTHB());

	}

}
