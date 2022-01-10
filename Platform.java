import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform extends Actor
{
    /**
     * Act - do whatever the Platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */ 
    SelectBox box = new SelectBox();
    public Platform() 
    {
        GreenfootImage myImage = getImage(); 
        int myWidth = (int)myImage.getWidth()/7; 
        int myHeight = (int)myImage.getHeight()/7;
        myImage.scale(myWidth, myHeight);
    }
    @Override
    public void act() 
    {
        if(getWorld() instanceof MyWorld) {
            final MyWorld platform = (MyWorld)getWorld();
            if (platform != null && Greenfoot.mouseClicked(this)) {
            appearBox();
            platform.setSelectedPlatform(this);
            }
        } 
        else if(getWorld() instanceof Tutorial) {
            final Tutorial platform = (Tutorial)getWorld();
            if (platform != null && Greenfoot.mouseClicked(this)) {
            appearBox();
            platform.setSelectedPlatform(this);
            }
        } 
    }
    public void appearBox() 
    {
        getWorld().addObject(box, 400, 436);
        box.appearContent();
    }
}
