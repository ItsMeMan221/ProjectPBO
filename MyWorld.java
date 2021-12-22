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
    int counterWave = 0; 
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
        //Lives Counter
        addObject(lives,46,19);
        lives.setPrefix("Lives : ");
        lives.setValue(20);
        
        //Score Counter
        addObject(score,850,19);
        score.setPrefix("Score : ");
        score.setValue(0);
        
        //Background in-game
        GreenfootImage myBg = new GreenfootImage("background.png"); 
        myBg.scale(getWidth(),getHeight()); 
        setBackground(myBg);
        
        //Platform
        Platform platform = new Platform();
        addObject(platform,90,355);
        Platform platform2 = new Platform();
        addObject(platform2,90,215);
        
        //Archer
        Archer archer = new Archer();
        addObject(archer,90,351);
        Archer archer2 = new Archer();
        addObject(archer2,90,211);
    }

    public void act() { 
        rand = (int)(Math.random()*2)+1;
        if (counter != 60*timerSpawn) {
            if (counter--==0) {
                newWave();
                counterWave++;
                limitSpawn += 10;
            }
            else if (counter >= 60*timerSpawn && (counter-60*timerSpawn)%(60*spawnRate) == 0) {
                spawningEnemy();
                
            }
        }
        else if (getObjects(Enemy.class).isEmpty()) {
            counter--;
        }
        if (lives.getValue() <= 0) {
            Greenfoot.setWorld(new GameOver());
        }
    }
    
    public void spawningEnemy () {
        if (counterWave >= 1) {
            Skeleton enemy = new Skeleton();
            if (rand == 1) {
                addObject(enemy,900,351);
            }
            else if (rand == 2) {
                addObject(enemy,900,211);
            }
        }
    }
    public void newWave() {
        counter = 60*(timerSpawn + limitSpawn*spawnRate);
    }
}
