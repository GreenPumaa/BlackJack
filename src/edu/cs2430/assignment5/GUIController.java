package edu.cs2430.assignment5;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class GUIController {
   //public Button startbtn, hitbtn, staybtn, quitbtn;
   //public Label playerHand, dealersHand;

   private Assignment5 BlackJackGame = new Assignment5();
   private CardGroup deck = Deck.createStandardDeck();
   private CardGroup[] hands = BlackJackGame.createHands();

   public void setUp()
   {
      deck.shuffle(739493);
      BlackJackGame.dealHands(deck, hands);
      System.out.println("the deck has been shuffled and dealt");
      System.out.println("the player has " +
              hands[0].getCard(0).toString() + " and " +
              hands[0].getCard(1).toString());
   }

   public void btnHit(ActionEvent actionEvent)
   {
         BlackJackGame.playerHit(deck, hands);
         int k = BlackJackGame.calculateHandValue(hands, 0);
         if(k > 21)
         {
            BlackJackGame.hasPlayerBust();
            btnQuit(actionEvent);
         }
   }

   public void btnStay(ActionEvent actionEvent)
   {
      BlackJackGame.stay();
      System.out.println("dealer's turn");
      BlackJackGame.opponentTurn(deck, hands);
      if(BlackJackGame.hasDealerWon)
         btnQuit(actionEvent);
   }

   public void btnQuit(ActionEvent actionEvent) {
      Platform.exit();
   }

}
