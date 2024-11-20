package coe3sm4_lab1;

public class Hands {
    
    private Card[] thisHand = new Card[5];
    private int HandType = 4;    // -1   Not a Hand, 
                                // 0    Flush
                                // 1    Full House
                                // 2    Four-of-a-Kind
                                // 3    Straight Flush
                                // 4    Royal Flush
                                // 5    Invalid Set

    private int checkSetType()
    {
        // First Check Flush
        sortHandByRank();        

        if(thisHand[0].rank == (thisHand[1].rank + 1) && thisHand[1].rank == (thisHand[2].rank + 1) &&
           thisHand[2].rank == (thisHand[3].rank + 1) && thisHand[3].rank == (thisHand[4].rank + 1))
        {            
            // If yes, then check Straight Flush
            if(thisHand[0].suite == thisHand[1].suite && thisHand[0].suite == thisHand[2].suite &&
               thisHand[0].suite == thisHand[3].suite && thisHand[0].suite == thisHand[4].suite)
            {
                if(thisHand[0].rank == 14) 
                    return 4; // if leading by Ace, Royal Flush
                else 
                    return 3; // return 3 if Straight Flush
            }

            // return 0 if not Straight Flush or Royal
            return 0;    
        }
        // If no, move on                   
            
        
        // Then check Full House or Four-of-a-Kind
        sortHandBySuite();
        
        // Check if Leading 3 or Trailing 3 are identical
        if( thisHand[0].rank == thisHand[1].rank && thisHand[0].rank == thisHand[2].rank )
        {            
            // if yes, Check if Trailing two or Leading 2 are identical
            if( thisHand[4].rank == thisHand[3].rank )
            {
                return 1; // If yes, return 1
            }
                
            // If no, Check if Second-Last or Second are identical to the first / last 3
            if( thisHand[0].rank == thisHand[3].rank )
            {
                return 2; // If yes, return 2
            }                
            
            // If no, move on
        }

        else if( thisHand[4].rank == thisHand[2].rank && thisHand[4].rank == thisHand[3].rank )
        {            
            // if yes, Check if Trailing two or Leading 2 are identical
            if( thisHand[0].rank == thisHand[1].rank )
            {
                return 1; // If yes, return 1
            }
                
            // If no, Check if Second-Last or Second are identical to the first / last 3
            if( thisHand[4].rank == thisHand[1].rank )
            {
                return 2; // If yes, return 2
            }                
        }        
        
        // If no, move on
            
        // If reaching the end, the hand is NOT our interested 5-card hand
        return -1;
    }


    // [Problem 1] - Deploy Simple Sorting for Short 5-Card Hand

    private void sortHandBySuite()  
    {
        // Deploy Selection Sort or Insertion Sort to sort the hand by Suite (C, D, H, or S)
    }

    private void sortHandByRank()  
    {
        // Deploy Selection Sort or Insertion Sort to sort the hand by Rank    
    }

    public Hands()
    {
        thisHand[0] = new Card(0, 'C');
        thisHand[1] = new Card(0, 'C');
        thisHand[2] = new Card(0, 'C');
        thisHand[3] = new Card(0, 'C');
        thisHand[4] = new Card(0, 'C');

        HandType = 5;  // invalid
    }
    
    public Hands(Card c1, Card c2, Card c3, Card c4, Card c5)
    {                
        thisHand[0] = c1;
        thisHand[1] = c2;
        thisHand[2] = c3;
        thisHand[3] = c4;
        thisHand[4] = c5;             

        // Internally sorted in Descending Order        
        HandType = checkSetType();

        // need to correct for four-of-a-kind - leading 4 is checked before checking the singlet
        if(HandType == 2 && thisHand[0].rank != thisHand[1].rank)  // four of a kind
        {
            Card temp = thisHand[0];
            for(int i = 1; i < 5; i++)
                thisHand[i-1] = thisHand[i];
            thisHand[4] = temp;
        }

        // need to correct for full house - leading 3 is checked before checking the pair 
        if(HandType == 1 && thisHand[1].rank != thisHand[2].rank)  // full house
        {
            Card temp0 = thisHand[0];
            Card temp1 = thisHand[1];
            for(int i = 2; i < 5; i++)
                thisHand[i-2] = thisHand[i];
            thisHand[3] = temp0;
            thisHand[4] = temp1;
        }
        
    }

    public int getHandType()
    {
        return HandType;
    }

    public boolean isAValidHand()
    {
        return (HandType < 5 && HandType > -1);
    }


    // [Problem 2] - Comparing Hand Sizes

    public boolean isMyHandLarger(Hands otherHand)
    {
        // Check if my hand is larger than the incoming otherHand

    }

    public boolean isMyHandSmaller(Hands otherHand)
    {
        // Check if my hand is smaller than the incoming otherHand

    }

    public boolean isMyHandEqual(Hands otherHand)
    {
        // Check if my hand is equal to the incoming otherHand
        
    }

    public Card getCard(int index)
    {        
        if(index < 0 || index > 4)
        {
            Card invalidCard = new Card(0, 'K');
            return invalidCard;
        }

        return thisHand[index];
    }

    public void printMyHand()
    {
        for(int i = 0; i < 5; i++)
            thisHand[i].printCard();        

        if(HandType == 0)
            System.out.println("Flush");
        else if(HandType == 1)
            System.out.println("Full House");
        else if(HandType == 2)
            System.out.println("Four of a Kind");
        else if(HandType == 3)
            System.out.println("Straight Flush");
        else if(HandType == 4)
            System.out.println("Royal Flush");
        else
            System.out.println("Not a Valid Hand");
    }


}
