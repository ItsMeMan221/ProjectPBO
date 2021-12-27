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
    int timerSpawn = 5; 
    int limitSpawn;
    int rand;
    int randSpawn;
    int spawnRate = 2;
    int counter = 60*(timerSpawn + limitSpawn*spawnRate);
    public static Counter lives = new Counter();
    public static Score score = new Score();
    int counterWave = 0; 
    GreenfootSound myMusic = new GreenfootSound("InGameSoundOPT2.wav");
    
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
        score.setPrefix("Wave : ");
        score.setValue(counterWave);

        //Background in-game
        GreenfootImage myBg = new GreenfootImage("background.png"); 
        myBg.scale(getWidth(),getHeight()); 
        setBackground(myBg);

        //Platform
        Platform platform = new Platform();
        addObject(platform,90,355);
        Platform platform2 = new Platform();
        addObject(platform2,90,215);
        Platform platform3 = new Platform();
        addObject(platform3,300,215);
        Platform platform4 = new Platform();
        addObject(platform4,300,355);
        Platform platform5 = new Platform();
        addObject(platform5,550,355);
        Platform platform6 = new Platform();
        addObject(platform6,550,215);

        //Archer
        Archer archer = new Archer();
        addObject(archer,90,351);
        Archer archer2 = new Archer();
        addObject(archer2,90,211);

        //Mage Tower 
        Mage mage = new Mage();
        addObject(mage,300,325);
        Mage mage2 = new Mage();
        addObject(mage2,300,186);

        //Canon 
        Canon canon = new Canon();
        addObject(canon,570,346);

        //Portal
        Portal portal = new Portal();
        addObject(portal,24,333);
        Portal portal2 = new Portal();
        addObject(portal2,17,198);
        portal2.setLocation(14,218);
        portal.setLocation(16,360);
        portal.setLocation(17,355);
        platform5.setLocation(557,357);
        platform5.setLocation(554,361);
    }

    public void act() { 
        rand = (int)(Math.random()*10)+1;
        randSpawn = (int)(Math.random()*10)+1;
        myMusic.play();
        if (counter != 60*timerSpawn) {
            if (counter--==0) {
                newWave();
                counterWave++;
                score.setValue(counterWave);
                limitSpawn += 5;
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
            myMusic.stop();
        }
    }
    
    public void spawningEnemy () {
        Skeleton skel = new Skeleton();
        Goblin goblin = new Goblin(); 
        if (counterWave >= 1 && counterWave < 3) {
            if (rand >= 0 && rand <= 5) {
                addObject(skel,900,351);
            }
            else if (rand <= 10 && rand>= 6) {
                addObject(skel,900,211);
            }
        }
        else if (counterWave >= 3) {
           if (rand >= 0 && rand <= 5) {
                if (rand >= 0 && rand <= 2) {
                    addObject(goblin,900,351);
                }
                else if(rand>=3 && rand <=5) {
                    addObject(goblin,900,211);
                }
            }
            else if (rand <= 10 && rand>= 6) {
                if (rand >= 0 && rand <= 2) {
                    addObject(skel,900,351);
                }
                else if(rand>=3 && rand <=5) {
                    addObject(skel,900,211);
                }
            } 
        }
    }
    public void newWave() {
        counter = 60*(timerSpawn + limitSpawn*spawnRate);
    }
}
