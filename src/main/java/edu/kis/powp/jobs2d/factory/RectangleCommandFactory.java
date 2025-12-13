package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.awt.*;

public class RectangleCommandFactory extends ShapeCommandFactory{
    private final Job2dDriver driver;
    private final Point p1;
    private final Point p2;
    private final Point p3;
    private final Point p4;
    private ComplexCommand command;


    public RectangleCommandFactory(Job2dDriver driver,Point p1, Point p2, Point p3, Point p4) {
        this.driver = driver;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    @Override
    public DriverCommand createCommand() {
        command.addCommand(new SetPositionCommand(driver, p1.x, p1.y));
        command.addCommand(new OperateToCommand(driver, p2.x, p2.y));
        command.addCommand(new OperateToCommand(driver, p3.x, p3.y));
        command.addCommand(new OperateToCommand(driver, p4.x, p4.y));
        command.addCommand(new OperateToCommand(driver, p1.x, p1.y));
        return command;
    }
}
