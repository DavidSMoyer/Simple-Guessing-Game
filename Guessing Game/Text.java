import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
    // A variable that holds an image that can be edited.
    private GreenfootImage img = new GreenfootImage(300,200);
    /**
     * The constructor of the class.
     */
    public Text(String text)
    {
        img.setColor(Color.BLACK);
        img.setFont(new Font("Helvetica", 15));
        img.drawString(text,0,100);
        setImage(img);
    }
    /**
     * Sets new text and updates the image.
     * 
     * @param text The text to be displayed.
     * @return Returns nothing.
     */
    public void setText(String text)
    {
        img.clear();
        img.setColor(Color.BLACK);
        img.setFont(new Font("Helvetica", 20));
        img.drawString(text,0,100);
        setImage(img);
    }
}
