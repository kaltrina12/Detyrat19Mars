import javax.swing.*;
public class prova {
	public static void main(String[]args)
	{
		int numriIllogariseB=13243;
		int numriIllogariseA=12345;
		String s=JOptionPane.showInputDialog("ju lutem shkruani numrin e llogarise");
		int s1=new Integer(s).intValue();
		if(s1==numriIllogariseA)// numri i llogarise se personit A eshte 12345
	 		
		{
			
			
			personiAA k=new personiAA();
			k.Apersoni();
		}
		else
		{
			
			if(s1==numriIllogariseB)//numri i llogarise se personit B eshte 13243
			  {
				 personiBB j=new personiBB();
				 j. Bpersoni();
				 

			  }
		
		
		
		
		
	   
		else
		{
			JOptionPane.showMessageDialog(null, "gabim:ky nuk eshte numri juaj i llogarise");
			throw new RuntimeException("Error");
		}

		//BT eshte personi qe ka qasje ne te dy llogarite por nuk ka llogari te veten.Pasi qe qasja  ne llogari behet
			//me ane te numrave identifikues atehere BT mund te kete qasje ne te 2 llogarite duke i ditur ata numra...
		
	
	

		}
	}
}
