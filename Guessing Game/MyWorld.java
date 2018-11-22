import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author David Scott Moyer 
 * @version 22/11/2018
 */
public class MyWorld extends greenfoot.World
{
    // Creates a variable for the Text object that can be edited.
    private Text text = new Text("Guess a number between 1 and 100.");
    // Finds a random number.
    private int random = Greenfoot.getRandomNumber(101);
    // Creates a variable for the Guesses object that can be edited.
    private Guesses guesses = new Guesses();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1); 
        prepare();
        Greenfoot.start();
    }
    /**
     * Runs every time 'run ' or 'act' is called.
     * 
     * @param None There are no parameters.
     * @return Returns nothing.
     */
    public void act()
    {
        Greenfoot.delay(100);
        guess();
    }
    /**
     * Creates the text and guess count.
     * 
     * @param None There are no parameters.
     * @return Returns nothing.
     */
    private void prepare()
    {
        addObject(text,200,200);
        addObject(guesses,300,50);
    }
    /**
     * Asks the user what they guess. After answering, it adds one to the guess count
     * in the Guesses object and tells you if the number is higher, lower, or if you won.
     * 
     * @param None There are no parameters.
     * @return Returns nothing.
     */
    private void guess()
    {
        String guess = Greenfoot.ask("What do you guess?");
        guesses.addGuess();
        if (Integer.parseInt(guess) > random)
        {
            text.setText("Lower.");
        }
        else if (Integer.parseInt(guess) < random)
        {
            text.setText("Higher.");
        }
        else if (Integer.parseInt(guess) == random)
        {
            text.setText("You got it!");
            Greenfoot.stop();
        }
    }
}
