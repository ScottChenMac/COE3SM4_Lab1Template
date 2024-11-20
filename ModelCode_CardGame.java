package coe3sm4_lab1;



public class ModelCode_CardGame {

    public static final int HANDSIZE = 25;

    public static CardPool myCardPool;
    public static HandsMaxHeap myMaxHeap;

    public static Card[] myCards, tempCards;
    public static int handSize = HANDSIZE;

    // [Problem 4] Develop the two supporting functions for the main code

    // [Problem 4-1] Generate All Possible Permutated Hands from the Pocket Cards
    public static void generateHands(Card[] thisHand, int handSize)
    {
        // If handSize is less than or equal to 5, no need to permutate hands.  Just return.
        
        // Otherwise, think about how to find all the permutated hands from teh pocket card.
        //   Once a valid Hand is found in the permutation process, insert the hand into the heap        
    }

    // [Problem 4-2] Sort all the cards in myCards array using Insertion Sort or Selection Sort  
    public static void sortCards()
    {
        
    }



    public static void main(String args[]) throws Exception
    {
        Hands myMove;        
        
        myCardPool = new CardPool();        
        myCardPool.printPool();

        myCards = new Card[handSize];
        myCards = myCardPool.getRandomCards(HANDSIZE);
        sortCards();
            
        // [Problem 5] Implementing Game Logic Part 1 - Aggresive AI: Always the Strongest Hand
        for(int i = 0; handSize > 4; i++)
        {            
            System.out.println("My Pocket Cards:");
            for(int j = 0; j < handSize; j++)
            {            
                myCards[j].printCard();
            }
            System.out.println();

            // Step 1: 
            // - Instantiate the Max Heap with handSize^2 (or whichever size that makes sense)
            // - Then generate all the permutated hands from the pocket cards and insert all the valid hands into the Max Heap
            //  - You should print out the heap after insertion and confirm the correctness of the heap implementation
            
            // Step 2:
            // - Check if the Max Heap contains any valid hands after heap construction
            //   - if yes, remove the Largest Hand from the heap as the current Move
            //   - otherwise, we are out of valid hands.  Just pick any 5 cards from the pocket as a "Pass Move"
            // - Once a move is chosen, print the Hand out for confirmation. MUST PRINT FOR VALIDATION!!
            
            // Step 3:
            // - Remove the Cards used in the move from the pocket cards
            // - Recompute a new Max Heap using the updated pocket cards (shorter by 5 cards)
            
        }
        
    }

}
