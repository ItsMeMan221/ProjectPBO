import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Archer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Archer extends Tower
{
    /**
     * Act - do whatever the Archer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound myMusic = new GreenfootSound("Archer.wav");
    int delayShoot = 0; 
    public Archer() {
        GreenfootImage myImage = getImage(); 
        int myWidth = (int)myImage.getWidth()/4; 
        int myHeight = (int)myImage.getHeight()/4;
        myImage.scale(myWidth, myHeight);
    }
    public void act()
    {
        delayShoot += 1;
        if (getWorld().getObjects(Enemy.class).isEmpty()) {
            delayShoot = 0;
        }
        else if (!getWorld().getObjects(Enemy.class).isEmpty() ) {
            if (delayShoot >= 75 ) {
                shoot();
                delayShoot = 0;
            }
        }
    }
    public void shoot() {
        Arrow bullet = new Arrow();
        getWorld().addObject(bullet, getX(),getY());
        myMusic.play();
  
    }
}
