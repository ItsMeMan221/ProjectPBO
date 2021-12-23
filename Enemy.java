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
    public int health;
    public void setHealth(int newHealth) {
        this.health = newHealth;
    }
    public int getHealth() { 
        return this.health;
    }
    public void act() {
        checkPortal();
    }
    public void checkHit() {
        if (getWorld() != null) {
            if (isTouching(Projectile.class)) {
                Projectile dmg  = (Projectile) getIntersectingObjects(Projectile.class).get(0);
                int damage = dmg.getDamage();
                health = health - damage;
                removeTouching(Projectile.class);
                if (health <= 0) {
                    getWorld().removeObject(this);
                    
                }
            }
        }
    }
    public void checkPortal() {
        if (getWorld() != null) {
        if (isTouching(Portal.class) && this.getX() <=2) {
            getWorld().removeObject(this);
            MyWorld.lives.add(-1);
        }
    }
    }
}
