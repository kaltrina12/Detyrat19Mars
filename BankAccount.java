import javax.swing.JOptionPane;
import javax.swing.*;
public class BankAccount {
	public int balance;
	public BankAccount(int amount)
	{
		if(amount>=0)
		{
			balance=amount;
		}
		else
		{
			balance=0;
		}
	}
	public boolean deposit(int amount)
	{
		boolean result=false;
		if(amount<0)
		{
			JOptionPane.showMessageDialog(null, "gabim:hyrje negative "+amount);
		}
		else
		{
			balance=balance+amount;
			//result=true;
		}
		return result;
	}
	public boolean withdraw(int amount)
	{
		boolean result=false;
		if(amount<0)
		{
			JOptionPane.showMessageDialog(null, "gabim:terheqja "+amount);
			
		}
		else
			if(amount>balance)
		{
			JOptionPane.showMessageDialog(null, "gabim :terheqja tejkalon balansin ");
		}
			else
			{
				 balance=balance-amount;
				 //JOptionPane.showMessageDialog(null, "Balanci juaj momental eshte "+ balance);
				result=true;
			}
	return result;
	}
	public int getBalance()
	{
		return balance;
	}
	/*public static void main(String[] args)
	{ BankAccount a = new BankAccount(100);
	String y=JOptionPane.showInputDialog("shkurani shumen e parave qe doni te terhiqni");
	int i = new Integer(y).intValue();
	boolean result = a.deposit(i);
	//String s=JOptionPane.showInputDialog("shkruani shumen e parave qe doni te depononi");
	//int s1=new Integer(s).intValue();
	//boolean result1=a.deposit(s1);
	System.out.println(result);
	JOptionPane.showMessageDialog(null,"shuma momentale ne llogarin tuaj eshte  "+ a.getBalance()+" euro");
	}
*/
}
