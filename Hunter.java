import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class Turret here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hunter extends Hunters
{
    
    private GreenfootImage[] images;
    private int shootDelay = 10;
    private final int shootDelayMax = 11;
    public boolean shooting=false;
    public boolean stopLooking=false;
    private int noOfImages=5;
    private int position=0;
    /**
     * Act - do whatever the Turret wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Hunter() {
        int j;
       images = new GreenfootImage[noOfImages];
       for(int i=0; i < noOfImages; i++) {
          j=i+1;
          images[i] = new GreenfootImage("hunter" + j + ".png");
        }
        setImage(images[position]);    
    }
    public void act() 
    {
       //  shootDelay=shootDelay+1;
       //  aimAndShoot();
       if (Greenfoot.isKeyDown("left")){
            if (position<4)  {
               position++;
               if(position>=3){
                   setLocation(170,getY());
                }
               setImage(images[position]);
            }
        }
        
        if (Greenfoot.isKeyDown("right")){
            if (position>0)  {
               position--;
               if(position<=2){
                   setLocation(200,getY());
                }  
               setImage(images[position]);
            }
        }
        if (Greenfoot.isKeyDown("space")){
              shootBullet(position);
            }
    }
    public void delay()
    {
        if (shootDelay >= shootDelayMax)
        {
            shootBullet(position);
            shootDelay=0;
        }   
    }
    public void aimAndShoot()
    {
        java.util.List<Enemy> enemies = getObjectsInRange(200, Enemy.class);
        if(!enemies.isEmpty()) {
            Enemy target = enemies.get(0);
            setRotation((int)Math.toDegrees(Math.atan2(target.getY()-getY(), target.getX()-getX())));
        }
        if(!enemies.isEmpty())delay();
    }
}
