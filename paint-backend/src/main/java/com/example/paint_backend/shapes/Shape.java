package com.example.paint_backend.shapes;

import java.util.Map;

public interface Shape {
    public void DimensionCalculate();

    public Double getX();

    public Double getY();

<<<<<<<<<<<<<<  ✨ Codeium Command ⭐ >>>>>>>>>>>>>>>>
    /**
     * Sets the starting points of the shape.
     *
     * @param xStart the x-coordinate of the starting point
     * @param yStart the y-coordinate of the starting point
     */

<<<<<<<  0d25f13f-fc20-4adc-9dd9-273724b88fc1  >>>>>>>
    public void setStartPoints(double xStart, double yStart);

    public void setEndPoints(double xEnd, double yEnd);

    public void setFillColor(String fillColor);

    public void setStrokeColor(String Stroke);

    public Long getShapeId();

    public void setShapeId(Long id);

    String getShapeType();

    Map<String, Object> getAttributes();
}
