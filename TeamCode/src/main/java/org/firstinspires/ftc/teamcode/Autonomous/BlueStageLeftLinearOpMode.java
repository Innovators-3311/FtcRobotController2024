package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Controller.MecanumSynchronousDriver;

import java.io.IOException;

@Autonomous(name = "Blue Stage Left", group = "Group3311")
public class BlueStageLeftLinearOpMode extends LinearOpMode
{

    /** Drive control */
    MecanumSynchronousDriver driver;
    private final double ticksPerInch = (8192 * 1) / (2 * 3.1415); // == 1303
    private final double ticksPerDegree = (ticksPerInch * 50.24) / 360;

    @Override
    public void runOpMode() throws InterruptedException
    {
        try
        {
            driver = new MecanumSynchronousDriver(this.hardwareMap, this);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        waitForStart();
        start();

        //Your code goes in this function.   You can make other plans as well.  (two shells are
        //provided.
        planAlpha();
        //planBeta();

        //Sample Test Programs
        //aroundyTest();
        //rotateTest();


        while (opModeIsActive())
        {

        }
    }

    /**
     * Plan Alpha.  You will design different routes based on what intel the other team provides.
     * We don't want to run into their robot, so we need different plans.
     */
    public void planAlpha()
    {
        //So to start you off, you are going to want to push the pixel to the second line.  So, a
        //forward command is in order.  You will need to measure the distance.  From there you will
        //probably need to back up a bit before rotating to your end goal.  I will let you figure
        //out what route that will be.

        //Go forward 24 inches at speed of .5  (24 is just a filler.  you need to figure out how far it is
        driver.forward(25,1,0.6);

        sleep(500);

        driver.forward(5,-1,0.6);

        sleep(500);

        driver.turn(90, -1, .4);

        sleep(500);

        driver.forward(31, 1, 0.6);



    }


    /**
     * There is always a plan B.  ;)
     */
    public void planBeta()
    {



    }


    /**
     * This test rotates in place. Each step has a 3 second pause.
     * 1.  Rotate right 90 degrees.
     * 2.  Rotate left 90 degrees.
     * 3.  Rotate left 180 degrees.
     * 4.  Rotate right 360 degrees.
     */
    public void rotateTest()
    {
        double rotateSpeed = 0.5;

        sleep(3000);
        driver.turn(90, 1, rotateSpeed);

        sleep(3000);
        driver.turn(90, -1, rotateSpeed);

        sleep(3000);
        driver.turn(180, -1, rotateSpeed);

        sleep(3000);
        driver.turn(360, 1, rotateSpeed);
    }

    /**
     * This is a sample run that drives in a "O" shape counter clockwise.
     *
     */
    public void aroundyTest()
    {
        driver.forward(12 * 4,1,0.8);
        sleep(100);
        driver.turn(90, -1, .5);
        sleep(100);
        driver.forward(12 * 1.5,1,0.8);
        sleep(100);
        driver.turn(90, -1, .5);
        sleep(100);
        driver.forward(12 * 4,1,0.8);
        sleep(100);
        driver.turn(90, -1, .5);
        sleep(100);
        driver.forward(12 * 1.5,1,0.8);
        sleep(100);
        driver.turn(90, -1, .5);
    }

}


