import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Demon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demon extends Enemy
{
    /**
     * Act - do whatever the Demon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage demonWalk = new GreenfootImage("boss-moving.png");
    GreenfootImage demonIdle = getImage();
    private int frame = 1; 
    private int animation = 1;
    public Demon() {
        demonIdle.scale(80,80);
        demonWalk.scale(80,80);
        getImage().mirrorHorizontally();
        demonWalk.mirrorHorizontally();
        setImage(demonIdle);
        setImage(demonWalk);
        setHealth(8);
    }
    public void act()
    {
        setLocation(getX()-2,getY());
        animation++;
        if (animation % 45 == 0) {
          animate();  
        }
        checkPortal();
        checkHit();
    }
        public void animate() {
        if (frame==1) {
            setImage(demonIdle);
        }
        else if (frame==2) {
            setImage(demonWalk);  
            frame = 1; 
            return;
        }
        frame++;
    }
}
