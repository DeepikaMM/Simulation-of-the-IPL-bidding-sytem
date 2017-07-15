import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.lang.*;
public class Player {
	private String playerName=" ";
	ArrayList<Integer> money = new ArrayList<Integer>();
	int  Price;
	int id=-999;
	
	int bidderCount=0;
        private int le1,le2;
        ArrayList<Bidder> bidderObject=new ArrayList<Bidder>();	
	
      public Player(String p)
	{
		playerName=p;
	}
     
	

   /* public Player(String playerName)
   {
	   playerName.concat(playerName);
	  
   }*/
   
   public void attach(Bidder a)
   {
		bidderObject.add(a);
  		 
   }
   
  public int [] getBidderAndPrice()
   {
	int[] a =new int[2];
         a[0]= id;
         a[1]=Price;
         return a;
         
   }
   
   public void setBidderAndPrice(int bId, int bidPrice)
   {
         if(id==-999)
         {
            id=bId;
          }
         else
          {
 
	    int j=0;
	    while((bidderObject.get(j).BId)!=id)
             {
                 j++;
             }
         Bidder b=bidderObject.get(j);
         b.money=b.money -10;
         
        this.id=bId;
        this.Price=bidPrice;
       
   }
	notifyy();
   }
   
   public void completeDeal(int bId, int bidPrice)
   {
        int j=0;
	    while(bidderObject.get(j).BId!=id)
             {
                 j++;
             }
         Bidder b=bidderObject.get(j);
         b.money=b.money -10;
         
        this.id=bId;
        j=0;
        while(bidderObject.get(j).BId!=bId)
             {
                 j++;
             }
         b=bidderObject.get(j);
         b.money=b.money -bidPrice;
        this.Price=bidPrice;
	 notifyDeal(); 
		
   }
   
public void notifyy()
   {
	 System.out.println(bidderObject.size());
         Bidder b;
        for(int i=0;i<bidderObject.size();i++)
	  {
           
	b=bidderObject.get(i);
	b.updateBidding();
		
          }
   }

   public void notifyDeal()
   {
         Bidder b;
        for(int i=0;i<bidderObject.size();i++)
	  {
           
	b=bidderObject.get(i);
	b.updateFinalDeal();
		
          }
   }

}
