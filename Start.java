import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Button
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Start() {
        GreenfootImage myImage = getImage(); 
        int myWidth = (int)myImage.getWidth()/2; 
        int myHeight = (int)myImage.getHeight()/2;
        myImage.scale(myWidth, myHeight);
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            myMusic.play();
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
