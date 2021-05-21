package edu.cs2430.assignment5;

import javafx.scene.layout.Pane;

public abstract class PFig extends Pane
{
   protected int x, y;           // Current position of the figure
   protected int width, height;  // Drawn or displayed this size
   protected Pane pane;        // Pane the figure lives on

   public PFig ( int startX, int startY, int _width, int _height,
                 Pane p )
   {
       x = startX;
       y = startY;
       width = _width;
       height = _height;
       pane = p;
   }

   public boolean collidedWith(PFig p)
   {
      if (  p == null )
         return false;

      return ( x + width ) >= p.x && ( p.x + p.width ) >= x &&
             ( y + height ) >= p.y && ( p.y + p.height ) >= y;
   }
   
   public void move ( int deltaX, int deltaY )
   {
      x = x + deltaX;
      y = y + deltaY;
   }
   
   public void move()
   {
   }

   // Draw the figure.
   abstract public void draw();
   
   public void hide()
   {
       pane.setVisible(false);

   }


}