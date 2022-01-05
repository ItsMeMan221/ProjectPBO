import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mage extends Tower
{
    /**
     * Act - do whatever the Mage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delayShoot = 0; 
    GreenfootSound myMusic = new GreenfootSound("Fireball.wav");
    public Mage() {
        GreenfootImage myImage = getImage(); 
        int myWidth = (int)myImage.getWidth()/3; 
        int myHeight = (int)myImage.getHeight()/3;
        myImage.scale(myWidth, myHeight);
    }
    public void act()
    {
        delayShoot += 1;
        if (getWorld().getObjects(Enemy.class).isEmpty()) {
            delayShoot = 0;
        }
        else if (!getWorld().getObjects(Enemy.class).isEmpty()) {
            if (delayShoot >= 200) {
                shoot();
                delayShoot = 0;
            }
        }
    }
    public void shoot() {
        Fireball bullet = new Fireball();
        getWorld().addObject(bullet, getX(),getY());
        myMusic.play();
  
    }
}

