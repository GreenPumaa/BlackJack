package edu.cs2430.assignment5;

public class BlackJackUtils {
   /**
    * Constant for te point value associated with an ACE
    */
   private static final int ACE_POINT_VALUE = 1;

   /**
    * Constant for te point value associated with an TWO
    */
   private static final int TWO_POINT_VALUE = 2;

   /**
    * Constant for te point value associated with an THREE
    */
   private static final int THREE_POINT_VALUE = 3;

   /**
    * Constant for te point value associated with an FOUR
    */
   private static final int FOUR_POINT_VALUE = 4;

   /**
    * Constant for te point value associated with an FIVE
    */
   private static final int FIVE_POINT_VALUE = 5;

   /**
    * Constant for te point value associated with an SIX
    */
   private static final int SIX_POINT_VALUE = 6;

   /**
    * Constant for te point value associated with an SEVEN
    */
   private static final int SEVEN_POINT_VALUE = 7;

   /**
    * Constant for te point value associated with an EIGHT
    */
   private static final int EIGHT_POINT_VALUE = 8;

   /**
    * Constant for te point value associated with an NINE
    */
   private static final int NINE_POINT_VALUE = 9;

   /**
    * Constant for te point value associated with an TEN
    */
   private static final int TEN_POINT_VALUE = 10;

   /**
    * Constant for te point value associated with an JACK
    */
   private static final int JACK_POINT_VALUE = 10;

   /**
    * Constant for te point value associated with an QUEEN
    */
   private static final int QUEEN_POINT_VALUE = 10;

   /**
    * Constant for te point value associated with an KING
    */
   private static final int KING_POINT_VALUE = 10;

   /**
    * Returns the point value associated with the card rank
    * @param rank //rank of the card
    * @return the point value of each card rank
    */
   public int getPointValue(Rank rank)
   {
      /*int value;
      switch(rank)
      {
         case ACE -> value = ACE_POINT_VALUE;
         case TWO -> value = TWO_POINT_VALUE;
         case THREE -> value = THREE_POINT_VALUE;
         case FOUR -> value = FOUR_POINT_VALUE;
         case FIVE -> value = FIVE_POINT_VALUE;
         case SIX -> value = SIX_POINT_VALUE;
         case SEVEN -> value = SEVEN_POINT_VALUE;
         case EIGHT -> value = EIGHT_POINT_VALUE;
         case NINE -> value = NINE_POINT_VALUE;
         case TEN -> value = TEN_POINT_VALUE;
         case JACK -> value = JACK_POINT_VALUE;
         case QUEEN -> value = QUEEN_POINT_VALUE;
         case KING -> value = KING_POINT_VALUE;
         default -> value = -1;
      }
      return value;*/

      if(rank.equals(Rank.ACE))
         return ACE_POINT_VALUE;
      else if(rank.equals(Rank.TWO))
         return TWO_POINT_VALUE;
      else if(rank.equals(Rank.THREE))
         return THREE_POINT_VALUE;
      else if(rank.equals(Rank.FOUR))
         return FOUR_POINT_VALUE;
      else if(rank.equals(Rank.FIVE))
         return FIVE_POINT_VALUE;
      else if(rank.equals(Rank.SIX))
         return SIX_POINT_VALUE;
      else if(rank.equals(Rank.SEVEN))
         return SEVEN_POINT_VALUE;
      else if(rank.equals(Rank.EIGHT))
         return EIGHT_POINT_VALUE;
      else if(rank.equals(Rank.NINE))
         return NINE_POINT_VALUE;
      else if(rank.equals(Rank.TEN))
         return TEN_POINT_VALUE;
      else if(rank.equals(Rank.JACK))
         return JACK_POINT_VALUE;
      else if(rank.equals(Rank.QUEEN))
         return QUEEN_POINT_VALUE;
      else if(rank.equals(Rank.KING))
         return KING_POINT_VALUE;
      else
         return -1;

   }
}
