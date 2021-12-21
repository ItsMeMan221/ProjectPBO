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
    int delayShoot = 0; 
    GreenfootSound myMusic = new GreenfootSound("Archer.wav");
    public Archer() {
        GreenfootImage myImage = getImage(); 
        int myWidth = (int)myImage.getWidth()/4; 
        int myHeight = (int)myImage.getHeight()/4;
        myImage.scale(myWidth, myHeight);
    }
    public void act()
    {
        delayShoot += 1;
        if (getWorld().getObjects(enemyImitate.class).isEmpty()) {
            delayShoot = 0;
        }
        else {
            if (delayShoot >= 150) {
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