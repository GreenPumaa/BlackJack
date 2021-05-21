package edu.cs2430.assignment5;

import java.util.Objects;

public class Card
{
   private final Rank rank;
   private final Suit suit;

   /**
    * Constructs a card with the given rank and suit
    * Assigns parameters to their corresponding instance variables
    *
    * @param rank // rank of the card
    * @param suit // suit of the card
    */
   public Card(Rank rank, Suit suit) {
      this.rank = rank;
      this.suit = suit;
   }

   /**
    * Copy constructor
    * Constructs a card with the rank and suit from the other card
    * Assigns the rank and suit of the other card to the rank and suit
    * of this card
    *
    * @param otherCard // reference for the object in the method call
    */
   public Card(Card otherCard) {
      this.rank = otherCard.rank;
      this.suit = otherCard.suit;
   }

   /**
    * Getter method
    *
    * @return rank of the card
    */
   public Rank getRank() {
      return this.rank;
   }

   /**
    * Getter method
    *
    * @return suit of the card
    */
   public Suit getSuit() {
      return this.suit;
   }

   @Override
   public boolean equals(java.lang.Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Card card = (Card) o;
      return rank == card.rank && suit == card.suit;
   }

   @Override
   public int hashCode() {
      return Objects.hash(rank, suit);
   }

   /**
    * Returns the string representation of the card
    *
    * @return the string representation of a card
    */
   @Override
   public String toString() {
      return rank.toString() + " of " + suit.toString();
   }
}