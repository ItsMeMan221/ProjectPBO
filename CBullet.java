import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CBullet extends Projectile
{
    /**
     * Act - do whatever the CBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public CBullet() {
        GreenfootImage myImage = getImage(); 
        myImage.scale(30,30); 
        setImage(myImage);
        setDamage(2);
    }
    public void act()
    {
        setLocation(getX() + 4,getY()); 
        erase();
    }
    public void erase() {
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
