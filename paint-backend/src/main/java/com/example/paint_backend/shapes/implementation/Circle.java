package com.example.paint_backend.shapes.implementation;

import com.example.paint_backend.shapes.Shape;

import java.util.Map;

public class Circle implements Shape {
    Long shapeId;

    private double xEnd;
    private double yEnd;
    private double xStart;
    private double yStart;
    private final double strokeWidth;
    private double radius;
    private String fillColor;
    private String strokeColor;

    public Circle(Map<String, Object> attributes) {
        this.xStart = ((Number) attributes.get("xStart")).doubleValue();
        this.yStart = ((Number) attributes.get("yStart")).doubleValue();
        this.fillColor = (String) attributes.get("fillColor");
        this.strokeColor = (String) attributes.get("strokeColor");
        this.strokeWidth = ((Number) attributes.get("strokeWidth")).doubleValue();
        // ! initially the circle is just a point
        this.xEnd = xStart;
        this.yEnd = yStart;

    }

    @Override
    public void setEndPoints(double xEnd, double yEnd) {
        this.xEnd = xEnd;
        this.yEnd = yEnd;
    }

    @Override
    public void setStartPoints(double xStart, double yStart) {
        this.xStart = xStart;
        this.yStart = yStart;
    }

    @Override
    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

    @Override
    public void DimensionCalculate() {
        this.radius = Math.sqrt((xStart - xEnd) * (xStart - xEnd) + (yStart - yEnd) * (yStart - yEnd));
    }

    @Override
    public Double getX() {
        return xStart;
    }

    @Override
    public Double getY() {
        return yStart;
    }

    @Override
    public Long getShapeId() {
        return shapeId;
    }

    @Override
    public void setShapeId(Long id) {
        this.shapeId = id;
    }

    @Override
    public String getShapeType() {
        return "circle";
    }

    @Override
    public Map<String, Object> getAttributes() {
        return Map.of(
                "radius", radius,
                "x", xStart,
                "y", yStart,
                "fill", fillColor,
                "stroke", strokeColor,
                "strokeWidth", strokeWidth);
    }
}
