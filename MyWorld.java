import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int timerSpawn = 15; 
    int limitSpawn;
    int spawnRate = 2;
    int counter = 60*(timerSpawn + limitSpawn*spawnRate);
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        limitSpawn =5;   
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        enemyImitate enemyImitate = new enemyImitate();
        addObject(enemyImitate,549,311);
        towerImitate towerImitate = new towerImitate();
        addObject(towerImitate,38,313);
        enemyImitate.setLocation(548,312);
        removeObject(enemyImitate);
    }

    public void act() { 
        if (counter != 60*timerSpawn) {
            if (counter--==0) {
                newWave();
                limitSpawn += 10;
            }
            else if (counter >= 60*timerSpawn && (counter-60*timerSpawn)%(60*spawnRate) == 0) {
                spawningEnemy();
                
            }
        }
        else if (getObjects(enemyImitate.class).isEmpty()) {
            counter--;
        }
        
    }
    
    public void spawningEnemy () {
        enemyImitate enemy = new enemyImitate();
        addObject(enemy,600,311);
        
    }
    public void newWave() {
        counter = 60*(timerSpawn + limitSpawn*spawnRate);
    }
}
