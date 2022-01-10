import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BuyTower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class BuyTower extends Actor
{
    /**
     * Act - do whatever the BuyTower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int snapX; 
    int snapY; 
    int cost; 
    GreenfootSound constTower = new GreenfootSound("ConstructTower.wav");
    public void setCost(int newCost) {
        this.cost = newCost;
    }
    public void setSnapX(int newSnapX) {
        this.snapX = newSnapX;
    }
    public void setSnapY(int newSnapY) {
        this.snapY = newSnapY;
    }
    
    public void act()
    {
        if (getWorld() instanceof MyWorld){
            final MyWorld platformWorld = (MyWorld)getWorld();
            if (platformWorld != null) {
                final Platform platform = platformWorld.getSelectedPlatform();
                if (platform != null && Greenfoot.mouseClicked(this)) {
                    if (MyWorld.golds.getValue() >= cost) { 
                        MyWorld.golds.add(-cost);
                        platformWorld.addObject(getTower(), platform.getX()+snapX, platform.getY()+snapY);
                        constTower.play();
                        platformWorld.setSelectedPlatform(null);
                        delete();
                    }
                }
            }
        }
        if (getWorld() instanceof Tutorial){
            final Tutorial platformWorld = (Tutorial)getWorld();
            if (platformWorld != null) {
                final Platform platform = platformWorld.getSelectedPlatform();
                if (platform != null && Greenfoot.mouseClicked(this)) {
                        platformWorld.addObject(getTower(), platform.getX()+snapX, platform.getY()+snapY);
                        constTower.play();
                        platformWorld.setSelectedPlatform(null);
                        delete();
                    }
                }
            }
        }
     
    protected abstract Tower getTower();
    
    private void delete() {
        getWorld().removeObjects(getWorld().getObjects(SelectBox.class));
        getWorld().removeObjects(getWorld().getObjects(Label.class));
        getWorld().removeObjects(getWorld().getObjects(BuyTower.class));
    }
}
