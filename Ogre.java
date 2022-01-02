import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ogre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ogre extends Enemy
{
    /**
     * Act - do whatever the Ogre wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        //Global Variable
    private GreenfootImage ogreWalk = new GreenfootImage("ogrewalking.png");
    GreenfootImage ogreIdle = getImage();
    private int frame = 1; 
    private int animation = 1; 
    
    //Constructor scale and set health
    public Ogre() {
        ogreIdle.scale(60,60);
        ogreWalk.scale(60,60);
        getImage().mirrorHorizontally();
        ogreWalk.mirrorHorizontally();
        setImage(ogreIdle);
        setImage(ogreWalk);
        setHealth(6);
        setGold(8);
    }
    public void act()
    {
        setLocation(getX()-1,getY());
        animation++;
        if (animation % 45 == 0) {
          animate();  
        }
        checkPortal();
        checkHit();
    }
    
    //Method for animate the image
    public void animate() {
        if (frame==1) {
            setImage(ogreIdle);
        }
        else if (frame==2) {
            setImage(ogreWalk); 
            frame = 1; 
            return;
        }
        frame++;
    }
}
