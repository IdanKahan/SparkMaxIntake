package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class EngineWatcher extends SubsystemBase {
    private CANSparkMax sparkMax;
    public EngineWatcher(){
        sparkMax = new CANSparkMax(4416,CANSparkLowLevel.MotorType.kBrushless);
    }
    public void FullSpeed(){
        sparkMax.set(1);
    }
    public void stopIntake(){
        sparkMax.set(0);
    }
    public void SaveLogs(){
        SmartDashboard.putNumber("current speed -1 - 1:",sparkMax.get());
        RelativeEncoder encoder = sparkMax.getEncoder();
        SmartDashboard.putNumber("current rpm:",encoder.getVelocity());
    }

}
