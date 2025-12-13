package edu.kis.powp.jobs2d.factory;

import edu.kis.powp.jobs2d.command.DriverCommand;

public abstract class ShapeCommandFactory {
    public abstract DriverCommand createCommand();
}