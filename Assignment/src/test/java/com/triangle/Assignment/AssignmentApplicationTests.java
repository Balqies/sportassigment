package com.triangle.Assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.triangle.Assignment.dao.TriangleRepositry;
import com.triangle.Assignment.model.Triangle;
import com.triangle.Assignment.service.ITriangleService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AssignmentApplicationTests {

	@Autowired
	private TriangleRepositry repository;

	@Autowired
	ITriangleService service;

	@Test
	public void saveEntities() {
		repository.deleteAll();
		repository.save(new Triangle(4, 4, 5));
		repository.save(new Triangle(2, 2, 5));
		repository.save(new Triangle(4, 3, 5));
		repository.findAll().forEach(System.out::println);
		System.out.println("_______________________________");

	}

	@Test
	public void GettingTheRightTypeIncorrect() {
		Triangle t1 = new Triangle(-1, -5, -8);
		String type = service.getTriangleType(t1.getA(), t1.getB(), t1.getC());
		System.out.println(type);
		System.out.println("_____________________");
		assertEquals("Incorrect Triangle", type);

	}

	@Test
	public void GettingTheRightTypeIncorrectEquilateral() {
		Triangle t2 = new Triangle(4, 4, 4);
		String type2 = service.getTriangleType(t2.getA(), t2.getB(), t2.getC());
		System.out.println(type2);
		System.out.println("_____________________");

		assertEquals("Equilateral Triangle", type2);

	}

	@Test
	public void GettingTheRightTypeIsosceles() {
		Triangle t3 = new Triangle(4, 4, 5);
		String type3 = service.getTriangleType(t3.getA(), t3.getB(), t3.getC());
		System.out.println(type3);
		System.out.println("_____________________");

		assertEquals("Isosceles Triangle", type3);

	}

	@Test
	public void GettingTheRightTypeScalene() {

		Triangle t4 = new Triangle(3, 4, 5);
		String type4 = service.getTriangleType(t4.getA(), t4.getB(), t4.getC());
		System.out.println(type4);
		System.out.println("_____________________");

		assertEquals("Scalene Triangle", type4);

	}
}
