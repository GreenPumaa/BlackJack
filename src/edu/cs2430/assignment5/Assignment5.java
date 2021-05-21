package edu.cs2430.assignment5;

import java.util.Random;

public class Assignment5
{
   private static final int NUMBER_OF_PLAYERS = 2;
   private static final int NUMBER_OF_CARDS_IN_HAND = 2;
   private static final int PLAYER_INDEX = 0;
   private static final int OPPONENT_INDEX = 1;
   private static final int TEN_POINT_VALUE = 10;

   private final BlackJackUtils util = new BlackJackUtils();

   public boolean isTurnOver = false, doubleOrNothing = false;
   public boolean isBust = false, hasDealerWon;
   public boolean isPlayerBust;
   Random random = new Random();
   public Assignment5()
   {
      CardGroup deck = Deck.createStandardDeck();
   }
   /**
    * Creates the hands in the game
    *
    * @return Returns an array of CarsGroup objects representing each player's hand
    */
   public CardGroup[] createHands()
   {
      CardGroup[] hands = new CardGroup[NUMBER_OF_PLAYERS];

      for (int i=0; i<NUMBER_OF_PLAYERS; i++)
      {
         hands[i] = new CardGroup();
      }

      return hands;
   }

   /**
    * Deals four cards to all players.<br>
    * When a card is dealt to a hand, the integer value of the deck array is assigned into the hand array <br>
    * The value in the deck array (where the card was just dealt from) is then set to -1.
    *
    * @param deck The deck of cards to deal from
    * @param hands The hands for all players
    */
   public void dealHands(CardGroup deck, CardGroup[] hands)
   {
      for(int i=0; i<NUMBER_OF_CARDS_IN_HAND; i++)
      {
            hands[PLAYER_INDEX].addCard(deck.removeLastCard());
            hands[OPPONENT_INDEX].addCard(deck.removeLastCard());
      }
   }

   public void playerHit(CardGroup deck, CardGroup[] hands)
   {
      hands[PLAYER_INDEX].addCard(deck.removeLastCard());
      System.out.println("Player has chosen hit");
      System.out.println("player draws a " + hands[PLAYER_INDEX].getLastCard());
   }

   public void opponentHit(CardGroup deck, CardGroup[] hands)
   {
      hands[OPPONENT_INDEX].addCard(deck.removeLastCard());
      System.out.println("The dealer hits");
   }

   public boolean stay()
   {
      System.out.println("The player stays");
      return isTurnOver = true;
   }

   public boolean doubleOrNothing()
   {
      System.out.println("The player raises the bet to double or nothing");
      return doubleOrNothing = true;
   }

   public boolean hasPlayerBust()
   {
      System.out.println("player has bust");
      return isPlayerBust = true;
   }

   public void opponentTurn(CardGroup deck, CardGroup[] hands)
   {
      int playerScore = calculateHandValue(hands, PLAYER_INDEX);
      int dealerScore = calculateHandValue(hands, OPPONENT_INDEX);
      while(dealerScore < 17){
         opponentHit(deck, hands);
         dealerScore = calculateHandValue(hands, OPPONENT_INDEX);
      }
      if(dealerScore > 21)
      {
         System.out.println("dealer has bust");
         isBust = true;
      }
      else if(dealerScore < playerScore)
      {
         System.out.println("player has won");
         hasDealerWon = false;
      }
      else if(dealerScore > playerScore)
      {
         System.out.println("dealer has won");
         hasDealerWon = true;
      }
   }

   public int calculateHandValue (CardGroup[] hand, int handNum)
   {
      /*boolean hasAce = false;
      int value = 0;

      for(int i = 0; i < hand.length; i++)
      {
         if(BlackJackUtils.getPointValue(hand[j].getCard(i).getRank()) != 11)
            value = value + BlackJackUtils.getPointValue(hand[j].getCard(i).getRank());
         else
         {
            hasAce = true;
            value = value + 1;
         }
      }
      if(value > 11)
         return value;
      else
         return value + TEN_POINT_VALUE;*/
      int value = 0;
      for(int i = 0; i < hand[handNum].handSize; i++)
      {
         CardGroup newHand = hand[handNum];
         Card card = newHand.getCard(i);
         Rank rank = card.getRank();
         value += util.getPointValue(rank);
         //value += util.getPointValue(hand[handNum].getCard(i).getRank());
      }
      return value;
   }
}
