import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Projectile
{
    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Arrow() {
        GreenfootImage myImage = getImage(); 
        myImage.scale(60,60); 
        turn(180);
        setImage(myImage);
    }
    public void act()
    {
        setLocation(getX() + 2,getY()); 
        damage = 2;
        erase();
    }
    public void erase() {
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
