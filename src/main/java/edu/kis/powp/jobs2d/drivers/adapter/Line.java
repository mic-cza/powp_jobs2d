package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.*;

public class Line extends AbstractLine {


    public Line(Color color, float thickness, boolean dotted) {
        super();
        this.color = color;
        this.thickness = thickness;
        this.dotted = dotted;
    }
    public Line(Color color, boolean dotted) {
        super();
        this.color = color;
        this.thickness = 3.0F;
        this.dotted = dotted;
    }
    public Line(Color color) {
        super();
        this.color = color;
        this.thickness = 3.0F;
        this.dotted = false;
    }
    public Line() {
        super();
        this.color = Color.BLACK;
        this.thickness = 3.0F;
        this.dotted = false;
    }
    public Line(boolean dotted) {
        super();
        this.color = Color.BLACK;
        this.thickness = 3.0F;
        this.dotted = dotted;
    }
    public Line(float thickness, boolean dotted) {
        super();
        this.color = Color.BLACK;
        this.thickness = thickness;
        this.dotted = dotted;
    }
    public Line(float thickness) {
        super();
        this.color = Color.BLACK;
        this.thickness = thickness;
        this.dotted = false;
    }
}

