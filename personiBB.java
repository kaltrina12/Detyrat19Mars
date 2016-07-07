import javax.swing.JOptionPane;

public class personiBB {
	public void Bpersoni()
	{
int amountB=150;//supozojme se personi A ka 150 euro tashme ne llogarin e tij
		
		
		BankAccount personiB=new BankAccount(amountB);
		
		
		int numriIllogariseB=13243;//supozojme se personi B e ka te krijuar nje llogari me kete numer identifikues(13243)
		
	    String s=JOptionPane.showInputDialog("Ju lutem verifikoni edhe njeher  numrin e llogarise suaj ");
	    int s1=new Integer(s).intValue();
	    //if(s1==numriIllogariseA)
	   
	    if(s1==numriIllogariseB)
	    {
	    	 
	    	JOptionPane.showInputDialog("ne vazhdim mund te zgjedhni komandat per qasje ne llogarine tuaj.Ju mund te perdorni 2 komanda: Per depozitim ose terheqje ");
	    	String g=JOptionPane.showInputDialog("Nese doni te depozitoni para ju lutem shkruani 1 perndryshe shtypni '0(zerro)' ashtu qe te vazhdoni me komanden per terheqje");
               int g1=new Integer(g).intValue();
               
             
               if(g1>0)
	    	{
            	   String y=JOptionPane.showInputDialog("ju lutem shkruani shumen qe doni te depozitoni");
            		int i = new Integer(y).intValue();
            		boolean result = personiB.deposit(i);
            		
            		
            		System.out.println(result);
            		JOptionPane.showMessageDialog(null,"shuma momentale ne llogarin tuaj eshte  "+ personiB.getBalance()+" euro");
            	 
	    		
	    	}
              
               amountB=amountB+g1;
                
               
               
            	   if(g1<0)
               {
            	   JOptionPane.showMessageDialog(null,"gabim: hyrje negative :( ");
               }
            	   amountB=amountB+g1;
            		   if(g1==0)
            		   {
            			 //  String e=JOptionPane.showInputDialog("nese doni te terhiqni para shtypni numrin 1 perndryshe shtypni '2' per te nderprere aplikacionin");
            			   String e1=JOptionPane.showInputDialog("Shkruni shumen e parave qe doni te terhiqni");
            			   int e2=new Integer(e1).intValue();
            			   
            			   if(e2<0 && e2<amountB){
            				   JOptionPane.showMessageDialog(null, "gabim: nuk mund te terhiqni me shum se qe keni ne llogari");
            			   }
            			  
            	
            			               			  
            			   
            			   else
            			   {
            				   int i = new Integer(e1).intValue();
                          		boolean result = personiB.withdraw(i);
                          		System.out.println(result);
                          		JOptionPane.showMessageDialog(null,"shuma momentale ne llogarin tuaj eshte  "+ personiB.getBalance()+" euro");      		    
                          		JOptionPane.showMessageDialog(null, "Llogaria juaj u mbyll,faleminderit per kohen tuaj,paqi nje dite te mire");
            			   }
            			   
            			   
            			   
            		   
               
               
            			   
	    }
            		   
            		   
            		  
	
	

	
	
	


}
	    
	}
	

}
