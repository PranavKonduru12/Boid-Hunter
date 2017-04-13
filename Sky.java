import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import java.awt.Color;

/**
 * A world for the boids.
 * 
 * @author Poul Henriksen 
 * @version 2.0
 */
public class Sky extends World
{

    /**
     * Constructor for objects of class Sky.
     * 
     */
    public Hunter h;
    public Sky()
    {    
        super(650, 450, 1);
   //     getBackground().setColor(new Color(188,164,255));
    //    getBackground().fill();
        
        h=new Hunter();
        addObject(h,200,260);
        populate(80);
    }
    
     public void populate(int number) {
        for(int i=0; i < number; i++) {            
             int x = (int) (Math.random() * getWidth());          
             int y = (int) (Math.random() * getHeight());
             Boid b = new Boid();
             addObject(b, x, y);
        }
    }
}
