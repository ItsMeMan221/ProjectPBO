import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BuyMage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuyMage extends BuyTower
{
    /**
     * Act - do whatever the BuyMage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BuyMage() {
        GreenfootImage myImage = getImage(); 
        int myWidth = (int)myImage.getWidth()/4; 
        int myHeight = (int)myImage.getHeight()/4;
        myImage.scale(myWidth, myHeight);
        setSnapY(-20); 
        setCost(65);
    }
    public Tower getTower() {
        return new Mage();
    }
}
