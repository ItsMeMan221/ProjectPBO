import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends Projectile
{
    /**
     * Act - do whatever the Fireball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Fireball() {
        GreenfootImage myImage = getImage(); 
        myImage.scale(30,30); 
        setImage(myImage);
        setDamage(4);
    }
    public void act()
    {
        setLocation(getX() + 2,getY()); 
        erase();
    }
    public void erase() {
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
