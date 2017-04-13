import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
* Write a description of class Bullet here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class Bullet extends Ammo
{
private double dist=0; /*keep track of each bullet's distance */
private double inc=15.0; /* how far we move the lead bullet
through each act loop */
public int trans=255; /*starting transparency */

public Bullet(){

}
/**
* Act - do whatever the Bullet wants to do. This method is called whenever
* the 'Act' or 'Run' button gets pressed in the environment.
*/
public void act()
{

move(inc);
dist+=inc; /* keep track of the overall distance each bullet
has moved */

List<Bullet> bList = getObjectsInRange((int)dist, Bullet.class);
for(Bullet b : bList) {

if (b.dist < dist && Math.abs(dist-b.dist)>(2*inc)){
b.fade(); /* fade the bullets behind the one looking here. */
}
}
shootBoid();
if (trans<25){
getWorld().removeObject(this); 
}
}
public void fade(){
trans= (int)(.98 * trans);
GreenfootImage bg=getImage();
bg.setTransparency(trans);
}
}