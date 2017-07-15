# Simulation-of-the-IPL-bidding-sytem
In this code I will be  implementing the simulation of the IPL bidding system for one player where the player is auctioned before a fixed number of franchises (bidders). Each bidder has a fixed budget available before participating in the auction. When a bidder bids for a certain price, all the bidders will know the value the player is bid for. After one bidder, another bidder can start to bid above that price.
The class design would look like this :
1. Player - holds all the bidder objects that are to be notified
              Private members - 
                  <String> playerName
                  <int> biddingPrice, bidderId
                  Bidders and bidder count
              Public functions -
                  public Player(String playerName)
                  public void attach( Observer o )
                  public int [] getBidderAndPrice()
                  public void setBidderAndPrice(int bidderId, int biddingPrice)
                  public void completeDeal(int bidderId, int biddingPrice)
              Private functions - 
                  private void notifyBidding()
                  private void notifyDeal()
 
 
2. Bidder - extends from Observer and overrides its methods.
              Private members - 
                  <int> bidderId, budget

3. AuctionStage - has the main function and takes the input from the user

The focus is mostly on the implementation of the design pattern. So, not to worry about case like, whether bidder has the sufficient budget to bid for the player etc. The input values will handle it correctly. Here is how you will read the input in the main program and rest of the program flow. Check the input file for the below mentioned inputs. 

sachin - Read player name. Use this playerName to create a Player object

5 - Count of number of bidders participating in the auction
101,5000
102,4200
103,3600     {Read these 5 inputs each representing the bidderId and the available budget}
104,8400
105,6150

Loop over the count (5) and read the above values as strings, split them on ',' and convert them to integers. Everytime an input is read, a new bidder object is created with bidderId and budget. The bidder gets registered/attached to the already created player object.

At this stage, you have created 'n' bidders and each bidder initialised with an ID and the initial budget. All bidders attached to one player object.

4 - Count of the number of bids to be simulated for that player
102,2000 
104,3500
101,4000     {Read these 4 inputs each representing the bidderId and the bid price quoted by that bidder}
105,5200

Loop over the count (4) and read the above values as strings, split them on comma and convert them to integers. Everytime an input is read, set the biddingPrice of the Player and notify all the bidders that the biddingPrice has changed. All bidders will then query for the bidderId and biddingPrice from the player.  On getting the changes of Player object, each bidder will check if the bidderId is matching its bidderId. If there is a match, that bidder will be charged with 10 as service fee for bidding from their budget. All bidders will output <their bidderid> : [currentBidder,biddingPrice]

The final bid is the winner's bid.
The bidder with that bidderId will have the final bid amount deducted from his budget.
Each bidder will print the budget left with them and the bidderId, who wins the bid.

Bid Winner
101 : [4990, 105]
102 : [4190, 105]
103 : [3600, 105]                   {1st number - this.budgetId, 2nd number - Winning bidderId, 3rd number - Budget left in this.budget}
104 : [8390, 105]
105 : [950, 105]

Print 'bidding starts' at the start of the bid and 'Bid Winner' before the last bid as seen in the output.txt

