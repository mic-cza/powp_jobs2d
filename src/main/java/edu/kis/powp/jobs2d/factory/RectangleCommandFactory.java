package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.awt.*;

public class RectangleCommandFactory extends ShapeCommandFactory{
    private final Point p1;
    private final Point p2;
    private final Point p3;
    private final Point p4;


    public RectangleCommandFactory(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    @Override
    public DriverCommand createCommand() {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(p1.x, p1.y));
        command.addCommand(new OperateToCommand(p2.x, p2.y));
        command.addCommand(new OperateToCommand(p3.x, p3.y));
        command.addCommand(new OperateToCommand(p4.x, p4.y));
        command.addCommand(new OperateToCommand(p1.x, p1.y));
        return command;
    }
}
