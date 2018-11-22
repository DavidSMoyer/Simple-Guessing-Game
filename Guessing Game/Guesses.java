import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Guesses here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guesses extends Actor
{
    // The guess count.
    private int guesses = 0;
    // A variable that holds an image that can be edited.
    private GreenfootImage img = new GreenfootImage(100,200);
    /**
     * The constructor for the class.
     */
    public Guesses()
    {
        img.setColor(Color.BLACK);
        img.setFont(new Font("Helvetica", 20));
        img.drawString("Guesses: " + guesses,0,100);
        setImage(img);
    }  
    /**
     * Adds one to the guess counter and updates the image.
     * 
     * @param None There are no parameters.
     * @return Returns nothing.
     */
    public void addGuess()
    {
        guesses++;
        img.clear();
        img.setColor(Color.BLACK);
        img.setFont(new Font("Helvetica",20));
        img.drawString("Guesses: " + guesses,0,100);
        setImage(img);
    }
}
