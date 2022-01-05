import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Canon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Canon extends Tower
{
    /**
     * Act - do whatever the Canon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     int delayShoot = 0; 
    GreenfootSound myMusic = new GreenfootSound("Cannon.wav");
    public Canon() {
        GreenfootImage myImage = getImage(); 
        int myWidth = (int)myImage.getWidth()/2; 
        int myHeight = (int)myImage.getHeight()/2;
        myImage.scale(myWidth, myHeight);
    }
    public void act()
    {
        delayShoot += 1;
        if (getWorld().getObjects(Enemy.class).isEmpty()) {
            delayShoot = 0;
        }
        else if (!getWorld().getObjects(Enemy.class).isEmpty()) {
            if (delayShoot >= 150) {
                shoot();
                delayShoot = 0;
            }
        }
    }
    public void shoot() {
        CBullet bullet = new CBullet();
        getWorld().addObject(bullet, getX(),getY());
        myMusic.play();
  
    }
}
