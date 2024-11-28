package com.example.paint_backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.paint_backend.dto.command_requests.MoveRequest;
import com.example.paint_backend.dto.ShapeDTO;
import com.example.paint_backend.service.ShapeCommandsService;


@RestController
@RequestMapping("/api/shapes/")
@CrossOrigin(origins = "${app.cors.allowed-origins}")
public class ShapesCommandsController {

    private final ShapeCommandsService shapeService;

    public ShapesCommandsController(ShapeCommandsService shapeService) {
        this.shapeService = shapeService;
    }

    @PutMapping("{shapeId}/move")
    public ResponseEntity<ShapeDTO> moveShape(@PathVariable Long shapeId, @RequestBody MoveRequest request) {
        System.out.println("Received move request for shape ID: " + shapeId);
        ShapeDTO movedShape = shapeService.moveShape(shapeId, request);
        return ResponseEntity.ok(movedShape);
    }
    @DeleteMapping("{shapeId}/erase")
    public ResponseEntity<String> eraseShape(@PathVariable Long shapeId) {
        System.out.println("Received erase request for shape ID: " + shapeId);
        String erasedShape = shapeService.eraseShape(shapeId);
        return ResponseEntity.ok(erasedShape);
    }

    @PutMapping("{shapeId}/recolor")
    public ResponseEntity<ShapeDTO> recolorShape(@PathVariable Long shapeId, @RequestBody String newFillColor) {
        return ResponseEntity.ok(shapeService.recolorShape(shapeId, newFillColor));
    }
}
