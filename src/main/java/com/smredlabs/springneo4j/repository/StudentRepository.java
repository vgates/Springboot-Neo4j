package com.smredlabs.springneo4j.repository;

import com.smredlabs.springneo4j.entity.Student;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends Neo4jRepository<Student,String> {
}
