import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinMenu extends World
{

    /**
     * Constructor for objects of class WinMenu.
     * 
     */
    public WinMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage myBg = new GreenfootImage("win.png"); 
        myBg.scale(getWidth(),getHeight()); 
        setBackground(myBg);
        prepare();
    }
        private void prepare()
    {
        Back back = new Back();
        addObject(back,304,273);
    }
}
