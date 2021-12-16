import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;
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
    int rand = (int)(Math.random()*3)+1;
    int spawnRate = 2;
    int counter = 60*(timerSpawn + limitSpawn*spawnRate);
    public static Counter lives = new Counter();
    public static Score score = new Score();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1); 
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
        enemyImitate.setLocation(548,312);
        addObject(lives,46,19);
        lives.setPrefix("Lives : ");
        lives.setValue(20);
        addObject(score,549,19);
        score.setPrefix("Score : ");
        score.setValue(0);
        GreenfootImage myBg = new GreenfootImage("background.png"); 
        myBg.scale(getWidth(),getHeight()); 
        setBackground(myBg);
        score.setLocation(850,19);
        Platform platform = new Platform();
        addObject(platform,173,300);
        platform.setLocation(90,303);
        Archer archer = new Archer();
        addObject(archer,86,269);
        archer.setLocation(90,298);
        Platform platform2 = new Platform();
        addObject(platform2,137,192);
        platform2.setLocation(90,203);
        Archer archer2 = new Archer();
        addObject(archer2,90,200);
    }

    public void act() { 
        rand = (int)(Math.random()*3)+1;
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
        if (lives.getValue() <= 0) {
            Greenfoot.setWorld(new GameOver());
        }
    }
    
    public void spawningEnemy () {
        enemyImitate enemy = new enemyImitate();
        if (rand == 1) {
            addObject(enemy,900,311);
        }
        else if (rand == 2) {
            addObject(enemy,900,211);
        }
         else if (rand == 3) {
            addObject(enemy,900,111);
        }
        
    }
    public void newWave() {
        counter = 60*(timerSpawn + limitSpawn*spawnRate);
    }
}
