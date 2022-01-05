import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectBox extends Actor
{
    /**
     * Act - do whatever the SelectBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    BuyArcher arch = new BuyArcher(); 
    BuyCanon can = new BuyCanon(); 
    BuyMage mage = new BuyMage(); 
    Ext ext = new Ext(); 
    public SelectBox() {
        GreenfootImage myImage = getImage(); 
        int myWidth = (int)myImage.getWidth()*3; 
        int myHeight = (int)myImage.getHeight()/2;
        myImage.scale(myWidth, myHeight);
    }
    
    public void act()
    { 
        
    }
    public void appearContent() {
        getWorld().addObject(arch, 225, 449);
        getWorld().addObject(can, 359, 436);
        getWorld().addObject(mage, 519, 436);
        getWorld().addObject(ext, 633, 441);
    }
    public void destroyAll() {
        getWorld().removeObject(this); 
        getWorld().removeObject(arch);
        getWorld().removeObject(can);
        getWorld().removeObject(mage);
        getWorld().removeObject(ext);
    }
}
