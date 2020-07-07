package edu.ahs.robotics.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distanceFromOrigin() {
        assertEquals(5,new Point(3,4).distanceFromOrigin(),.00001);

    }

    @Test
    public void getQuadrant() {
        assertEquals("Quadrant 1",new Point(3,4).getQuadrant());
        assertEquals("Quadrant 2",new Point(-4.5,6).getQuadrant());
        assertEquals("Quadrant 3",new Point(-1,-1).getQuadrant());
        assertEquals("Quadrant 4",new Point(19,-3.2215).getQuadrant());
        assertEquals("Axis",new Point(0,-7).getQuadrant());
        assertEquals("Axis",new Point(12,0).getQuadrant());
        assertEquals("Axis",new Point(0,0).getQuadrant());


    }
}