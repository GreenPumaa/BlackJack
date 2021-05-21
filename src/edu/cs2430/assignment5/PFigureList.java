package edu.cs2430.assignment5;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class manages a list of PFigures.
 * It allows the program to add and remove figures, as well as update their
 * positions on screen.
 * @author Nathan Sandvig, Daniel Hungness
 */
public class PFigureList
{
    /**
     * The list of PFigures being managed by the class
     */
    private LinkedList<PFig> figures;

    /**
     * Default constructor
     */
    public PFigureList()
    {
        figures = new LinkedList<PFig>();
    }

    /**
     * Returns a figure
     * @return The requested figure
     */
    public PFig figure(int index)
    {
        return figures.get(index);
    }

//    /**
//     * Returns the size of the list
//     * @return The size of the list
//     */
//    public int size()
//    {
//        return figures.size();
//    }
//
//    /**
//     * Returns a listIterator over figures
//     * @return The listIterator
//     */
//    public ListIterator<PFig> toListIterator()
//    {
//        return figures.listIterator();
//    }

    /**
     * Adds a new PFigure to the list
     * @param p The PFigure being added
     */
    public void add(PFig p)
    {
        figures.add(p);
    }

    /**
     * Removes a PFigure from the list
     * @param p The PFigure being removed
     */
    public void remove(PFig p)
    {
        figures.remove(p);
    }

    /**
     * Clears the list
     */
    public void clear()
    {
        figures.clear();
    }

    /**
     * Updates the onscreen position of all PFigures
     */
    public void update()
    {
        figures.forEach(PFig::hide);
        figures.forEach(PFig::move);
        figures.forEach(PFig::draw);
    }

//    /**
//     * Updates the onscreen position of all PFigures
//     */
//    public void update(PFigureList bullets, PlayerFigure player)
//    {
//        figures.forEach(PFig::hide);
//        figures.forEach(PFig::move);
//        figures.forEach(PFig::draw);
//        for(int i = 0; i < figures.size(); i++)
//        {
//            ((EnemyFigure)figures.get(i)).shoot(bullets, player);
//        }
//    }
}
