import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Button
{
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Back() {
        GreenfootImage myImage = getImage(); 
        int myWidth = (int)myImage.getWidth()/2; 
        int myHeight = (int)myImage.getHeight()/2;
        myImage.scale(myWidth, myHeight);
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            myMusic.setVolume(100);
            myMusic.play();
            Greenfoot.setWorld(new MainMenu());
        }
    }
}
