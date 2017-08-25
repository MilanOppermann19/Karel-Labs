package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    
    
    public void shuttleRace() {
        turnRight();
        move();
        turnLeft();
        moveTwo();
        turnLeft();
        moveTwo();
        turnRight();
        moveTwo();
        turnRight();
        moveTwo();
        turnRight();
        moveTwo();
        turnRight();
        moveTwo();
        turnLeft();
        moveTwo();
        turnRight();
        turnLeft();
        turnLeft();
        move();
    }
    public void moveTwo() {
        move();
        move();
    }
   public void turnRight() {
       turnLeft();
       turnLeft();
       turnLeft();
    }
    
   
}