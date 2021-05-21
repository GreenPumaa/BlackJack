package edu.cs2430.assignment5;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.util.Random;

public class PicFig extends PFig
{
   private Random random = new Random();
   private int xVel;
   private int yVel;
   private ImageView imageView;

   public PicFig(Pane p, String file)
   {
      super(50,  50,  110,  78, p );
       try
       {
          xVel = random.nextInt(50);
          yVel = random.nextInt(50);
          imageView = new ImageView(file);
          draw();

       }
       catch ( Exception e )
       {
          System.out.println("Crashing: " + e);
            // Whatever???
       }
   }

   public void move()
   {
      if ( xVel < 0 && x <= 0 ||
           xVel > 0 && x + width >= pane.getWidth() )
         xVel = - xVel;
      if ( yVel < 0 && y <= 0 ||
           yVel > 0 && y + height >= pane.getHeight() )
         yVel = - yVel;
      x = x + xVel;
      y = y + yVel;
   }

   public void draw()
   {
      if( imageView != null )
      {
         imageView.setX(x);
         imageView.setY(y);
         imageView.setFitHeight(height);
         imageView.setFitWidth(width);
         getChildren().clear();
         getChildren().add(imageView);
         pane.setVisible(true);
      }
   }


}
