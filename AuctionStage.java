import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.lang.*;

public class AuctionStage {

	public static void main(String[] input) throws Exception{
		

            String player;
            String temp[];
             int l=0;
             int le1=0;
               int le2=0;
   
	int count=0;
	int thisBID=0;
	int min=0;
	int minI=0;
	int cnt=0;
        
	BufferedReader reader=null;
       
        Player playerObject;
         
		
		
	
	
	    String line=null;
	    
  	   
  	        reader=new BufferedReader(new FileReader("input.txt"));
  		     	
  		            
  		                player=reader.readLine();
				count++;
				playerObject=new Player(player);



  		                 String l1 = reader.readLine();
  		                 int len1=Integer.parseInt(l1);
  		                 le1=len1;
				
  		                    
  		               
  		           
  		  
  		          count=0;
  		        
  		      while( count<le1)
  		      {
  		            String delimiter=",";
  		            line=reader.readLine();
  		            temp=line.split(delimiter);
  		           // BID.add(Integer.parseInt(temp[0]));
  		           // money.add(Integer.parseInt(temp[1]));
  		            count++;
                            Bidder bidderObject= new Bidder(playerObject,Integer.parseInt(temp[0]),Integer.parseInt(temp[1]));
                            playerObject.attach(bidderObject);
                            
  		      }
             		
			String l2 = reader.readLine();
             		int len2=Integer.parseInt(l2);
             		le2=len2;
             		count=0;
             		
             	     while(count<le2-1)
  		      {
  		            String delimiter=",";
  		            line=reader.readLine();
  		            temp=line.split(delimiter);
  		            //bidders.add(Integer.parseInt(temp[0]));
  		           //bidMoney.add(Integer.parseInt(temp[1]));
  		            count++;
			   
                            playerObject.setBidderAndPrice(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]));
                            
                            
  		      }

			 String delimiter=",";
  		            line=reader.readLine();
  		            temp=line.split(delimiter);
			 playerObject.completeDeal(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]));
                      //Player Object= new Player(le1,le2);
          
	    
  		    
	      
  
		/*Scanner sn= new Scanner(System.in);
		
		Player p= new Player("Sachin");
		Observer o= new Bidder();
		
		p.attach(o);
		for(int i=0; i<input.length; i++)
		System.out.println(input[i]);*/
		
		
		
	}
      
      

}
