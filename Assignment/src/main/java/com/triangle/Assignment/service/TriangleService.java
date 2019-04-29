package com.triangle.Assignment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triangle.Assignment.dao.TriangleRepositry;
import com.triangle.Assignment.model.Triangle;

@Service
public class TriangleService implements ITriangleService {

	@Autowired
	public TriangleRepositry triangleDAO;

	@Override
	public String addTriangle(Triangle triangle) {
		String type = getTriangleType(triangle.getA(), triangle.getB(), triangle.getC());
		triangleDAO.save(triangle);
		return type;

	}

	@Override
	public Optional<Triangle> getTriangleById(int id) {
		return triangleDAO.findById(id);

	}

	@Override
	public void deleteTriangleByID(int id) {
		triangleDAO.deleteById(id);

	}

	@Override
	public String getTriangleType(double a, double b, double c) {
		String type = null;

	

		if (a <= 0 || b <= 0 || c <= 0) {
			type = "Incorrect Triangle";
		}

		else if (a == b && b == c) {
			type = "Equilateral Triangle";
		}

		else if (a == b && b != c || b == c && c != a || a == c && c != b) {
			type = "Isosceles Triangle";
		}

		else 

			type = "Scalene Triangle";

		return type;
	}

}
