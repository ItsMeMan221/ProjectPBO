import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Goblin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Goblin extends Enemy
{
    /**
     * Act - do whatever the Goblin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Global Variable
    private GreenfootImage goblinWalk = new GreenfootImage("goblinwalking.png");
    GreenfootImage goblinIdle = getImage();
    private int frame = 1; 
    private int animation = 1; 
    
    //Constructor scale and set health
    public Goblin() {
        goblinIdle.scale(60,60);
        goblinWalk.scale(60,60);
        getImage().mirrorHorizontally();
        goblinWalk.mirrorHorizontally();
        setImage(goblinIdle);
        setImage(goblinWalk);
        setHealth(4);
        setGold(4);
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
    
    //Method for animate the image
    public void animate() {
        if (frame==1) {
            setImage(goblinIdle);
        }
        else if (frame==2) {
            setImage(goblinWalk); 
            frame = 1; 
            return;
        }
        frame++;
    }
}
