import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmoothMover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Hunters extends Actor
{
    /**
     * Act - do whatever the SmoothMover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    public void shootBullet()
    {
        Bullet bullet=new Bullet();
        // need to use trig for positioning.
        getWorld().addObject(bullet,getX()+20,getY()-20);
        bullet.setRotation(getRotation());
        Greenfoot.playSound("gunshot.wav");
    }
       public void shootBullet(int position)
    {
         int bulletX, bulletY, bulletDirection;
        Bullet bullet=new Bullet();
        //we set the starting location of the bullet, and direction
        //based on position of the hunter
        switch (position) {
            case 0:
              bulletX=229;
              bulletY=263;
              bulletDirection=0;
              break;
            case 1:
              bulletX=225;
              bulletY=247;
              bulletDirection=325;
              break;
            case 2:
              bulletX=192;
              bulletY=238;
              bulletDirection=272;
              break;  
            default: 
              bulletX=229;
              bulletY=263;
              bulletDirection=0;
              break;
            }
        getWorld().addObject(bullet,bulletX,bulletY);
        bullet.setRotation(bulletDirection);
        Greenfoot.playSound("gunshot.wav");
    }
}
