import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Class;
/**
 * Write a description of class enemyImitate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemyImitate extends Actor
{
    /**
     * Act - do whatever the enemyImitate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health = 30;
    public void act()
    {
        setLocation(getX()-1,getY()); 
        eraseEnm();  
    }
    
    public void eraseEnm() {
        if (getX() <= 2) {
            getWorld().removeObject(this);
        }
        
    }
}
