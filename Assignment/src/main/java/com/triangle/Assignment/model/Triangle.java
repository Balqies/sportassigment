package com.triangle.Assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Triangle")
public class Triangle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "triangle_id")
	private Integer id;

	@Column(name = "side_a")
	private double a;

	@Column(name = "side_b")
	private double b;

	@Column(name = "side_c")
	private double c;

	public Triangle() {

	}

	public Triangle(double a, double b, double c) {

		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
