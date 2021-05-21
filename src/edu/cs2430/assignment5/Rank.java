package edu.cs2430.assignment5;

public enum Rank
{
   ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK,
   QUEEN, KING;

   /**
    * Returns the string representation of the rank in lowercase
    * @return the rank in string representation in lowercase
    */
   public java.lang.String toString()
   {
      return name().toLowerCase();
   }

}