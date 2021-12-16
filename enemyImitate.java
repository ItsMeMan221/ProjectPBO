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
    int damage = 0; 
    public void act()
    {
        setLocation(getX()-1,getY());   
        destroy();
    } 
    public void destroy() {
        if (isTouching(Projectile.class)) {
            removeTouching(Projectile.class);
            damage += 1;
            if (damage >= 2) {
                getWorld().removeObject(this);
                MyWorld.score.add(10);
                damage = 0; 
                
            }
        }
        else if (this.getX() <= 2) {
            MyWorld.lives.add(-1);
            getWorld().removeObject(this);
        }
    }
}
