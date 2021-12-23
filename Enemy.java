import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static Projectile dmg = new Projectile();
    public int health = 2;
    public void act()
    {
         checkHitnPortal();
    }
    public void checkHitnPortal() {
        if (isTouching(Projectile.class)) {
            removeTouching(Projectile.class);
            health = health - dmg.damage;
            if (health <= 0) {
                getWorld().removeObject(this);
                
            }
        }
        else if (isTouching(Portal.class) && this.getX() <=2) {
            getWorld().removeObject(this);
            MyWorld.lives.add(-1);
        }
    }
}
