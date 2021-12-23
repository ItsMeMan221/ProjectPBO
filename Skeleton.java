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
    int damage = 0; 
    public Skeleton() {
        skelIdle.scale(60,60);
        skelWalk.scale(60,60);
        getImage().mirrorHorizontally();
        skelWalk.mirrorHorizontally();
        setImage(skelIdle);
        setImage(skelWalk);
    }
    public void act()
    {
        setLocation(getX()-1,getY());
        animation++;
        if (animation % 45 == 0) {
          animate();  
        }
        destroy();
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
    public void destroy() {
        if (isTouching(Projectile.class)) {
            removeTouching(Projectile.class);
            damage += 1;
            if (damage >= 2) {
                getWorld().removeObject(this);
                
            }
        }
        else if (this.getX() <= 2) {
            MyWorld.lives.add(-1);
            getWorld().removeObject(this);
        }
    }
}
