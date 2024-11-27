package com.example.paint_backend.shapes.implementation;

import com.example.paint_backend.shapes.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FreeHandLine implements Shape {
    Long shapeId;
    List<Double> points;
    String fillColor;
    double strokeWidth;

    public FreeHandLine(Map<String, Object> attributes) {
        this.fillColor = (String) attributes.get("strokeColor");
        this.strokeWidth = ((Number) attributes.get("strokeWidth")).doubleValue();
        this.points = new ArrayList<>(
                List.of(((Number) attributes.get("xStart")).doubleValue(),
                        ((Number) attributes.get("yStart")).doubleValue()));
    }

    @Override
    public void DimensionCalculate() {

    }

    //TODO: implement moving for line or make another interface for Movable
    @Override
    public Double getXStart() {
        return 0.0;
    }

    @Override
    public Double getYStart() {
        return 0.0;
    }

    @Override
    public void setEndPoints(double xEnd, double yEnd) {
        this.points.add(xEnd);
        this.points.add(yEnd);
    }

    @Override
    public void setStartPoints(double xStart, double yStart) {
        return;
    }

    public void setFillColor(String fillColor) {
        return;
    }

    public void setStrokeColor(String strokeColor) {
        return;
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
        return "freehand";
    }

    @Override
    public Map<String, Object> getAttributes() {
        return Map.of(
                "points", points,
                "strokeColor", fillColor,
                "strokeWidth", strokeWidth);
    }
}
