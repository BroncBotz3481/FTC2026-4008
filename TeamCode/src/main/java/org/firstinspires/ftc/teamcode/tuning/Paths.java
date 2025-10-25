package org.firstinspires.ftc.teamcode.tuning;//package org.firstinspires.ftc.teamcode.tuning;

import androidx.annotation.NonNull;

import com.acmerobotics.dashboard.config.Config;
import com.acmerobotics.dashboard.telemetry.TelemetryPacket;
import com.acmerobotics.roadrunner.Action;
import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.acmerobotics.roadrunner.ftc.Actions;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.MecanumDrive;

@Config
@Autonomous(name = "Coordinate System Test", group = "Autonomous")
public class Paths extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        MecanumDrive drive = new MecanumDrive(hardwareMap, new Pose2d( 0, 0, 0));

        waitForStart();


        Actions.runBlocking(
                drive.actionBuilder(new Pose2d(0, 0, 0))
                        .lineToXConstantHeading(10)// To find where positive x is
                        .waitSeconds(2)

                        .lineToXConstantHeading(-10) // To find where negative x is
                        .waitSeconds(2)

                        .lineToYConstantHeading(10) // To find where positive y is
                        .waitSeconds(2)

                        .lineToYConstantHeading(-10)// To find where negative y is
                        .waitSeconds(2)

                        .build());
    }}

//                        .splineToConstantHeading(new Vector2d(32,5),Math.toRadians(270))
//                        .waitSeconds(1)
//                        .splineToConstantHeading(new Vector2d(42, 40), Math.toRadians(180))
//                        .splineToConstantHeading(new Vector2d (10,55),Math.toRadians(270))
//                        .waitSeconds(0.1)//50-y
//                        .lineToX(60)
//                        .lineToX(40)

//                    .splineToConstantHeading(new Vector2d (52,50),Math.toRadians(270))//50




//                    .splineToConstantHeading(new Vector2d(36, -25), Math.toRadians(270))
//                    .lineToX(49)
//                    .lineToY(-59)


