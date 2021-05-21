package edu.cs2430.assignment5;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class CardGroup
{

   private Card[] cardArray = new Card[DEFAULT_ARRAY_SIZE];
   public int handSize;
   private int currentSize = 51;
   private static final int DEFAULT_ARRAY_SIZE = 52;

   /**
    * Constructs a new CardGroup and initializes cardArray to be an
    * empty array of size DEFAULT_ARRAY_SIZE
    * Initializes currentSize to zero
    */
   public CardGroup()
   {
      this.cardArray = new Card[DEFAULT_ARRAY_SIZE];
      this.handSize = 0;
   }

   /**
    * Copy constructor
    * Constructs a group of cards from another CardGroup
    * @param otherGroup // reference for the object the method
    *                     is called with
    */
   public CardGroup(CardGroup otherGroup)
   {
      this.cardArray = otherGroup.cardArray;
      this.handSize = otherGroup.handSize;
   }

   /**
    * Getter method
    * @param index // index of the cardArray
    * @return card at specific index
    */
   public Card getCard(int index)
   {
      return cardArray[index];
   }

   /**
    * Getter method
    * @return cardArray
    */
   public Card[] getCardArray()
   {
      return this.cardArray;
   }

   /**
    * Adds the given card to the cardArray
    * If the array is full grow() is called
    * @param card // the card that is to be added
    */
   public void addCard(Card card)
   {
      this.cardArray[handSize++] = card;
   }

   /**
    * Removes the last card in the card group
    * @return the card that was removed
    */
   public Card removeLastCard()
   {
      return cardArray[currentSize--];
   }


   /**
    * Getter method for the last card in the deck
    * @return last card in the deck
    */
   public Card getLastCard()
   {
      if(handSize == 0)
         return null;
      else
         return cardArray[handSize];
   }

   /**
    * Determines is the card group is empty
    * @return true if the deck is empty, false otherwise
    */
   public boolean isEmpty()
   {
      if(handSize == 0)
         return true;
      else
         return false;
   }

   /**
    * Shuffles the deck of cards.
    * Creates a Random object with the given seed and calls
    * shuffle(Random)
    * @param seed // seed for the random method
    */
   public void shuffle(int seed)
   {
      Random random = new Random(seed);
      shuffle(random);
   }

   /**
    * Shuffles the deck of cards
    * @param random // object of Random Class
    */
   public void shuffle(Random random)
   {
      Card[] tempDeck = new Card[cardArray.length];
      for(int i = 0; i < cardArray.length; i++)
      {
         int j = random.nextInt(cardArray.length);
         tempDeck[i] = cardArray[i];
         cardArray[i] = cardArray[j];
         cardArray[j] = tempDeck[i];
      }
   }

   /**
    * Clears the cardArray by setting all elements to null
    */
   public void clear()
   {
      for(int i = 0; i < cardArray.length; i++)
      {
         cardArray[i] = null;
      }
   }

   /**
    * Overrides equals in java.lang.Object
    * @param o // reference for the object in teh method call
    * @return true if the objects are equal and false if the objects
    * are not equal
    */
   @Override
   public boolean equals(java.lang.Object o)
   {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      CardGroup cardGroup = (CardGroup) o;
      return handSize == cardGroup.handSize &&
              Arrays.equals(cardArray, cardGroup.cardArray);
   }

   /**
    * Overrides hashcode in java.lang.Object
    * @return the hashcode of the object
    */
   @Override
   public int hashCode()
   {
      int result = Objects.hash(handSize);
      result = 31 * result + Arrays.hashCode(cardArray);
      return result;
   }

   /**
    * Returns the string representation of the card group
    * @return the string representation of the card group
    */
   @Override
   public String toString()
   {
      return "CardGroup{" +
              "cardArray=" + Arrays.toString(cardArray) +
              ", currentSize=" + handSize +
              '}';
   }
}
