import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform extends Actor
{
    /**
     * Act - do whatever the Platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Platform() {
        GreenfootImage myImage = getImage(); 
        int myWidth = (int)myImage.getWidth()/7; 
        int myHeight = (int)myImage.getHeight()/7;
        myImage.scale(myWidth, myHeight);
    }
    }
