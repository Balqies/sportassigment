package com.triangle.Assignment.service;

import java.util.Optional;

import com.triangle.Assignment.model.Triangle;

public interface ITriangleService {
	

		public String addTriangle(Triangle triangle);

		public  Optional<Triangle> getTriangleById(int id);

		public void deleteTriangleByID(int id);

		public String getTriangleType(double a, double b, double c);

	}


