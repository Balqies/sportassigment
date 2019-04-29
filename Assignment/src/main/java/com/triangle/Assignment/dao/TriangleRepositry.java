package com.triangle.Assignment.dao;

import org.springframework.data.repository.CrudRepository;

import com.triangle.Assignment.model.Triangle;

public interface TriangleRepositry extends CrudRepository<Triangle, Integer> {

}
