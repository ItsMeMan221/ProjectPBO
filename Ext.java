import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ext here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ext extends Button
{
    /**
     * Act - do whatever the Ext wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ext() {
        GreenfootImage myImage = getImage(); 
        int myWidth = (int)myImage.getWidth()/4; 
        int myHeight = (int)myImage.getHeight()/4;
        myImage.scale(myWidth, myHeight);
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            disappear();
        }
    }
    private void disappear() {
        getWorld().removeObjects(getWorld().getObjects(SelectBox.class));
        getWorld().removeObjects(getWorld().getObjects(BuyTower.class));
        getWorld().removeObjects(getWorld().getObjects(Ext.class));
    }
}
