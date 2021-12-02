import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Class;
/**
 * Write a description of class towerBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class towerBullet extends Actor
{
    /**
     * Act - do whatever the towerBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
