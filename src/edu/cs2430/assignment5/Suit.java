package edu.cs2430.assignment5;

public enum Suit
{
   CLUBS, DIAMONDS, HEARTS, SPADES;

   /**
    * Returns the string representation of the suit in lowercase
    * @return the string representation of the suit of the card
    */
   public java.lang.String toString()
   {
      return name().toLowerCase();
   }
}
