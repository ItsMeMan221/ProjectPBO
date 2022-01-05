import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BuyArcher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuyArcher extends BuyTower
{
    /**
     * Act - do whatever the BuyArcher wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BuyArcher() {
        GreenfootImage myImage = getImage(); 
        int myWidth = (int)myImage.getWidth()/4; 
        int myHeight = (int)myImage.getHeight()/4;
        myImage.scale(myWidth, myHeight);
        setSnapY(-4);
        setCost(15);
    }
    public Tower getTower() {
        return new Archer();
    }   
}
