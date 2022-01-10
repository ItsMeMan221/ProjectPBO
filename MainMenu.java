import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public GreenfootSound myMusic = new GreenfootSound("MainMenu.wav");
    Start start = new Start();
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1); 
        GreenfootImage myBg = new GreenfootImage("home.png"); 
        myBg.scale(getWidth(),getHeight()); 
        setBackground(myBg);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(start,436,311);
        start.setLocation(496,300);
        start.setLocation(438,295);
        start.setLocation(507,311);
        start.setLocation(449,289);

        help help = new help();
        addObject(help,48,43);
        help.setLocation(48,43);
    }

    public void act() {
        if(Greenfoot.mouseClicked(start)) {
            myMusic.stop();
        }
        else {
            myMusic.play();
        }
    }
}
