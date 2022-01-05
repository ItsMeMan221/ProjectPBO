import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BuyCanon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuyCanon extends BuyTower
{
    /**
     * Act - do whatever the BuyCanon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BuyCanon() {
        GreenfootImage myImage = getImage(); 
        int myWidth = (int)myImage.getWidth()/2; 
        int myHeight = (int)myImage.getHeight()/2;
        myImage.scale(myWidth, myHeight);
        setSnapX(14);
        setSnapY(-12);
    }
     public Tower getTower() {
        return new Canon();
    }

}
