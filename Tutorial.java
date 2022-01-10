import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends World
{

    /**
     * Constructor for objects of class Tutorial.
     * 
     */
    private Platform selectedPlatform = null;
    private int timer = 350; 
    Label txt = new Label("", 30); 
    Label txt2 = new Label("", 30); 
    Label txt3 = new Label("", 30); 
    Label txt4 = new Label("", 30); 
    Label txt5 = new Label("Don't Let the enemy go through the portal", 30); 
    Label obct = new Label("Survive 8 wave to win", 100); 
    Platform plat = new Platform();
    Platform pl = new Platform(); 
    Skeleton skel = new Skeleton(); 
    Portal port = new Portal(); 
    Portal port2 = new Portal(); 
    Goblin gob = new Goblin();
    Back back = new Back(); 
    public Platform getSelectedPlatform() {
        return selectedPlatform;
    }
     
    public void setSelectedPlatform(final Platform platform) {
        selectedPlatform = platform;
    }
    public Tutorial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare(); 
    }
    public void prepare() {
        addObject(plat, 300, 200);
        addObject(pl, 300, 550);
        addObject(obct, 447, 55);
        txt.setValue("Click 1 of the platform");
        addObject(txt, 300, 135);
        addObject(back, 798, 555);
        addObject(port, 23, 201);
        addObject(port2, 23, 550);
    }
    public void act() {
        if (Greenfoot.mouseClicked(plat) || Greenfoot.mouseClicked(pl) && getObjects(Tower.class).isEmpty()) {
            obct.setValue(""); 
            txt.setValue("Choose one of the tower");
            txt.setLocation(400, 300); 
            txt2.setValue("if you select another platform while the select box currently in the world,");
            txt3.setValue("the tower that you select will be built in the platform you last clicked");
            addObject(txt2, 451, 245);
            addObject(txt3, 460, 270);
            back.setLocation(90, 49);
        }
        else if (!getObjects(Tower.class).isEmpty() && Greenfoot.mouseClicked(plat) || Greenfoot.mouseClicked(pl)) {
            txt4.setValue("You cannot sell the tower that you built"); 
            addObject(txt4, 451, 245);
        }
        else if (!getObjects(Tower.class).isEmpty()) {
            addObject(skel, 900, 200); 
            addObject(gob, 900, 550);
            addObject(txt5, 481, 52);
        }
    }
}
