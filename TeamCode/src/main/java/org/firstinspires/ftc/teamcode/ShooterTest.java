package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "ShooterTest", group = "testing")
// @Disabled
public class ShooterTest extends OpMode {

DcMotor shooter;
DcMotor indexer;
DcMotor intake;

boolean shooterFlag = false;
boolean indexerFlag = false;
boolean intakeFlag = false;
    @Override
    public void init() {
        shooter = hardwareMap.get(DcMotor.class, "shooter");
        indexer = hardwareMap.get(DcMotor.class, "indexer");
        intake = hardwareMap.get(DcMotor.class, "intake");




    }

    @Override
    public void loop() {
        if(gamepad1.right_trigger>0){
            shooterFlag = !shooterFlag;
        }
        if (shooterFlag){
            shooter.setPower(-1);

        }
        else{
            shooter.setPower(0);
        }




        if(gamepad1.bWasPressed()){
            indexerFlag = !indexerFlag;
        }
        if (indexerFlag){
            indexer.setPower(-1);

        }
        else{
            indexer.setPower(0);
        }




        if(gamepad1.aWasPressed()){
            intakeFlag = !intakeFlag;
        }
        if (intakeFlag){
            intake.setPower(-1);

        }
        else{
            intake.setPower(0);
        }

    }
}
