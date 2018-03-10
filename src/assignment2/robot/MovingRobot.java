package assignment2.robot;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by KayLee on 08/03/2018.
 * A moving robot is a robot so we extend it (inheritance)
 *
 */
public class MovingRobot extends Robot{
    ArrayList<Integer> moves = new ArrayList<>();
    int nextMove;

    /**
     * This method validates the next move for the robot that is checks if the move will be within the limits or not
     * @return
     */
    public boolean validateNextMove(){
        int nextX = this.x;
        int nextY = this.y;


        switch (this.nextMove){
            case Robot.UP:
                nextY--;
                break;
            case Robot.DOWN:
                nextY++;
                break;
            case Robot.LEFT:
                nextX--;
                break;
            case Robot.RIGHT:
                nextX++;
                break;
            case Robot.LEFT_UP_CORNER:
                nextX--;
                nextY--;
                break;
            case Robot.LEFT_DOWN_CORNER:
                nextX--;
                nextY++;
                break;
            case Robot.RIGHT_UP_CORNER:
                nextX++;
                nextY--;
                break;
            case Robot.RIGHT_DOWN_CORNER:
                nextX++;
                nextY++;
                break;
        }

        if(nextX < 0 || nextX > 9)
            return false;

        if(nextY < 0 || nextY > 9)
            return false;

        return true;
    }

    /*
        This method generates a move for the robot from the list of possible moves for robots.
        It achieves this by generating a random number from 1 to 8.
     */
    public int generateNextMove(){
        this.nextMove = (new Random()).nextInt(8) + 1;
        return this.nextMove;
    }


    public MovingRobot(int x, int y){
        super(x, y);
    }

    /*
        This method checks if two robots are in the same place
     */
    public static boolean sameSlot(Robot r1, Robot r2){
        return ((r1.x == r2.x) && (r1.y == r2.y));
    }

    /*
        This method returns a string representing all the moves the given robot took on its way to the same spot
     */
    public String printMoves(){
        String output = "";

        for(int m: moves){
            output += m;
        }

        return output;
    }

    /*
        Move the robot based on a randomly generated next move
     */
    public void move(){
        do{
            generateNextMove();
        }while (!validateNextMove());

        switch (this.nextMove){
            case Robot.UP:
                this.y--;
                break;
            case Robot.DOWN:
                this.y++;
                break;
            case Robot.LEFT:
                this.x--;
                break;
            case Robot.RIGHT:
                this.x++;
                break;
            case Robot.LEFT_UP_CORNER:
                this.x--;
                this.y--;
                break;
            case Robot.LEFT_DOWN_CORNER:
                this.x--;
                this.y++;
                break;
            case Robot.RIGHT_UP_CORNER:
                this.x++;
                this.y--;
                break;
            case Robot.RIGHT_DOWN_CORNER:
                this.x++;
                this.y++;
                break;
        }

        this.moves.add(this.nextMove);
    }

    public static void main(String[] args) {
        MovingRobot r1 = new MovingRobot(0, 0);
        MovingRobot r2 = new MovingRobot(9, 9);

        while(!(MovingRobot.sameSlot(r1, r2))){
            r1.move();
            r2.move();
        }

        System.out.println("They are now in the same place. R1: " + r1.x + ", " + r1.y + " R2: " + r2.x + ", " + r2.y);

        System.out.println(r1.printMoves());
        System.out.println(r2.printMoves());

        System.out.println(r1.x + " " + r1.y + " " + r2.x + " " + r2.y);
    }
}
