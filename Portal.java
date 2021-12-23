import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal extends Actor
{
    /**
     * Act - do whatever the Portal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Portal() {
        GreenfootImage myImage = getImage(); 
        myImage.scale(100,100);
        setImage(myImage);
    }
    public void act()
    {
        checkTouchEnm();
    }
    public void checkTouchEnm() {
       // if (isTouching(Enemy.class)) {
        //    MyWorld.lives.add(-1);
       //     removeTouching(Enemy.class);
    //        }
    }
}
