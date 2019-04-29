package com.triangle.Assignment.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.triangle.Assignment.model.Triangle;
import com.triangle.Assignment.service.ITriangleService;

@RestController
@RequestMapping("/Triangle")
public class TriangleController {

	@Autowired
	ITriangleService service;

	@GetMapping("/triangle/{id}")
	public ResponseEntity<Optional<Triangle>> getTriangleById(@PathVariable("id") Integer id) {
		Optional<Triangle> triangle = service.getTriangleById(id);

		return new ResponseEntity<Optional<Triangle>>(triangle, HttpStatus.OK);

	}

	@PostMapping("/triangle")
	public ResponseEntity<String> addTriangle(@RequestBody Triangle triangle) {
		String type = service.addTriangle(triangle);
		return new ResponseEntity<String>(type, HttpStatus.CREATED);

	}

	@PostMapping("/triangletype/{sides}")
	public ResponseEntity<Triangle> addTriangle(@PathVariable("sides") double side1,
			@PathVariable("sides") double side2, @PathVariable("sides") double side3) {
		Triangle triangle = new Triangle();
		service.addTriangle(triangle);
		return new ResponseEntity<Triangle>(triangle, HttpStatus.CREATED);

	}

}
