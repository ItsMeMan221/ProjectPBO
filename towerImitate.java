import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Class;
/**
 * Write a description of class towerImitate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class towerImitate extends Actor
{
    /**
     * Act - do whatever the towerImitate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delayShoot = 0; 
    public void act()
    {
        delayShoot += 1;
        if (getWorld().getObjects(enemyImitate.class).isEmpty()) {
            delayShoot = 0;
        }
        else {
            if (delayShoot == 50) {
                shoot();
                delayShoot = 0;
            }
        }
        
    }
    
    public void shoot() {
        towerBullet bullet = new towerBullet();
        getWorld().addObject(bullet, getX(),getY());
    }
}
