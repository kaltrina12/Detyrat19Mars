import javax.swing.JOptionPane;
import java.awt.*;



public class personiAA {
	
	 
	
	public void Apersoni()
	{
int amountA=100;//supozojme se personi A ka 100 euro tashme ne llogarin e tij
		
		
		BankAccount personiA=new BankAccount(amountA);
		
		
		
		int numriIllogariseA=12345;//supozojme se personi A e ka te krijuar nje llogari me kete numer identifikues(12345)
		
	    String s=JOptionPane.showInputDialog("Ju lutem verifikoni edhe njeher  numrin e llogarise suaj ");
	    int s1=new Integer(s).intValue();
	    //if(s1==numriIllogariseA)
	   
	    if(s1==numriIllogariseA)
	    {
	    	 
	    	JOptionPane.showInputDialog("ne vazhdim mund te zgjedhni komandat per qasje ne llogarine tuaj.Ju mund te perdorni 2 komanda: Per depozitim ose terheqje ");
	    	String g=JOptionPane.showInputDialog("Nese doni te depozitoni para ju lutem shkruani 1 perndryshe shtypni '0(zerro)' ashtu qe te vazhdoni me komanden per terheqje");
               int g1=new Integer(g).intValue();
               
             
               if(g1>0)
	    	{
            	  
            	   String y=JOptionPane.showInputDialog("ju lutem shkruani shumen qe doni te depozitoni");
            		int i = new Integer(y).intValue();
            		boolean result = personiA.deposit(i);
            		
            		
            		System.out.println(result);
            		JOptionPane.showMessageDialog(null,"shuma momentale ne llogarin tuaj eshte  "+ personiA.getBalance()+" euro");
            	 
	    		
	    	}
              
               amountA=amountA+g1;
                
               
               
            	   if(g1<0)
               {
            	   JOptionPane.showMessageDialog(null,"gabim: hyrje negative :( ");
               }
            	   amountA=amountA+g1;
            		   if(g1==0)
            		   {
            			 //  String e=JOptionPane.showInputDialog("nese doni te terhiqni para shtypni numrin 1 perndryshe shtypni '2' per te nderprere aplikacionin");
            			   String e1=JOptionPane.showInputDialog("Shkruni shumen e parave qe doni te terhiqni");
            			   int e2=new Integer(e1).intValue();
            			   
            			   if(e2<0 && e2<amountA){
            				   JOptionPane.showMessageDialog(null, "gabim: nuk mund te terhiqni me shum se qe keni ne llogari");
            			   }
            			  
            	
            			               			  
            			   
            			   else
            			   {
            				   int i = new Integer(e1).intValue();
                          		boolean result = personiA.withdraw(i);
                          		System.out.println(result);
                          		JOptionPane.showMessageDialog(null,"shuma momentale ne llogarin tuaj eshte  "+ personiA.getBalance()+" euro");      		    
                          		JOptionPane.showMessageDialog(null, "Llogaria juaj u mbyll,faleminderit per kohen tuaj,paqi nje dite te mire");
            			   }
            			  
            			   
            			   
            			   

               
               
            			   
            		   }
	    
            		  

            		   
            		  
	
	

	
	
	


}
	    
	    
	    	
	   
            		   
               
	    }
	
	   
	}


