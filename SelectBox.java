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
    Label lbl = new Label("Cost: 15", 20); 
    Label lbl2 = new Label("Cost: 30", 20); 
    Label lbl3 = new Label("Cost: 65", 20);
    public SelectBox() {
        GreenfootImage myImage = getImage(); 
        int myWidth = (int)myImage.getWidth()*2 + 75; 
        int myHeight = (int)myImage.getHeight()/2 + 20;
        myImage.scale(myWidth, myHeight);
    }
    
    public void act()
    { 
        
    }
    public void appearContent() {
        getWorld().addObject(arch, 224, 435);
        getWorld().addObject(can, 359, 419);
        getWorld().addObject(mage, 500, 424);
        getWorld().addObject(lbl, 227, 472);
        getWorld().addObject(lbl2, 353, 472);
        getWorld().addObject(lbl3, 500, 472);
    }
    public void destroyAll() { 
        getWorld().removeObject(this); 
        getWorld().removeObject(arch);
        getWorld().removeObject(can);
        getWorld().removeObject(mage);
    }
}
