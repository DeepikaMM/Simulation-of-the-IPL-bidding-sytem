import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Bidder extends Observer {

	int BId,money;
        public Bidder(Player player,int BId, int money)
        {
	   this.player=player;
           this.BId=BId;
           this.money=money;
	  // player.attach(this);
        }
       // Player playerObject = new Player();

	@Override
	public void updateBidding() {
         int x[]=player.getBidderAndPrice();
         System.out.println(BId + ": [" + x[0] + "," + x[1] + "]" );
	
    
		
		
	}

	@Override
	public void updateFinalDeal() {
		 int d[]=player.getBidderAndPrice();
            System.out.println(BId + ": [" + money + "," + d[0]  + "]");
		
	}

}
