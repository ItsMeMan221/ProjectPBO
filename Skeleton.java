import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skeleton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skeleton extends Enemy
{
    /**
     * Act - do whatever the Skeleton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage skelWalk = new GreenfootImage("SkeletonWalk.png");
    GreenfootImage skelIdle = getImage();
    private int frame = 1; 
    private int animation = 1; 
    public Skeleton() {
        skelIdle.scale(40,40);
        skelWalk.scale(40,40);
        getImage().mirrorHorizontally();
        skelWalk.mirrorHorizontally();
        setImage(skelIdle);
        setImage(skelWalk);
        setHealth(2);
        setGold(2);
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
            setImage(skelIdle);
        }
        else if (frame==2) {
            setImage(skelWalk); 
            frame = 1; 
            return;
        }
        frame++;
    }
}
