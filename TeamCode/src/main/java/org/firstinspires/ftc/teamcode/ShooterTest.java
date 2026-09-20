package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "ShooterTest", group = "testing")
// @Disabled
public class ShooterTest extends OpMode {

DcMotor shooter;

boolean shooterFlag = false;
    @Override
    public void init() {
        shooter = hardwareMap.get(DcMotor.class, "shooter");

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

    }
}
