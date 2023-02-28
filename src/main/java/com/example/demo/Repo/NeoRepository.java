package com.example.demo.Repo;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.example.demo.Model.NeoEntity;

public interface NeoRepository extends Neo4jRepository<NeoEntity, Long> {
}
