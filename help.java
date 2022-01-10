import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class help extends Button
{
    /**
     * Act - do whatever the help wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public help() {
        GreenfootImage myImage = getImage(); 
        int myWidth = (int)myImage.getWidth()/5; 
        int myHeight = (int)myImage.getHeight()/5;
        myImage.scale(myWidth, myHeight);
    }
    public void act()
    {
         if (Greenfoot.mouseClicked(this)) {
            myMusic.play();
            Greenfoot.setWorld(new Tutorial());
        }
    }
}
