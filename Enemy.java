import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monsters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Enemy extends Actor
{
int monsterLife;
int b=0;
boolean moveUp;
boolean moveRight;
boolean moveLeft;
boolean moveDown;

   

    private int lastX;
    private int lastY;
    
    
    /**
     * Act - do whatever the Monsters wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean getHit(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
    public void booleans()
    {
        if(moveUp==true)
        {
            moveUp();
        }
        if(moveRight==true)
        {
            moveRight();
        }
        if(moveDown==true)
        {
            moveDown();
        }
        if(moveLeft==true)
        {
            moveLeft();
        }
    }
    public void moveUp()
    {
        setLocation(getX()  , getY() -1);
    }
    public void moveDown()
    {
        setLocation(getX()  , getY() +1);
    }
    public void moveRight()
    {
        setLocation(getX() +1 , getY() );
    }
    public void moveLeft()
    {
        setLocation(getX() -1 , getY() );
    }
    public void checkLocation()
    {
        if(getX() == 75 && getY() == 90)
        {
            moveUp=false;
            moveRight=true;
        }
        if(getX() == 75 && getY() == 600)
        {
            moveUp=true;
            moveRight=false;
        }
        if(getX() == 165 && getY() == 90)
        {
            moveDown=true;
            moveRight=false;
        }
        if(getX() == 165 && getY() == 510)
        {
            moveDown=false;
            moveRight=true;
        }
        if(getX() == 525 && getY() == 510)
        {
            moveRight=false;
            moveUp=true;
        }
        if(getX() == 525 && getY() == 420)
        {
            moveUp=false;
            moveLeft=true;
        }
        if(getX() == 255 && getY() == 420)
        {
            moveUp=true;
            moveLeft=false;
        }
        if(getX() == 525 && getY() == 330)
        {
            moveRight=false;
            moveUp=true;
        }
        if(getX() == 525 && getY() == 240)
        {
            moveUp=false;
            moveLeft=true;
        }
        if(getX() == 255 && getY() == 330)
        {
            moveRight=true;
            moveUp=false;
        }
        if(getX() == 255 && getY() == 150)
        {
            moveRight=true;
            moveUp=false;
        }
        if(getX() == 525 && getY() == 150)
        {
            moveRight=false;
            moveUp=true;
        }
        if(getX() == 255 && getY() == 240)
        {
            moveLeft=false;
            moveUp=true;
        }
    }
    
    
 

 //   public Gamepiece(){

        
  //  }
   
  //  public void act() 
  //  {
        // Add your action code here.
   //     moveNextSquare(direction);
  //  }    
     
 
}
