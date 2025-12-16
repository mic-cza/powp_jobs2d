package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.awt.*;

public class TriangleCommandFactory extends ShapeCommandFactory{
    private final Point p1;
    private final Point p2;
    private final Point p3;


    public TriangleCommandFactory(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public DriverCommand createCommand() {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(p1.x, p1.y));
        command.addCommand(new OperateToCommand(p2.x, p2.y));
        command.addCommand(new OperateToCommand(p3.x, p3.y));
        command.addCommand(new OperateToCommand(p1.x, p1.y));
        return command;
    }
}
