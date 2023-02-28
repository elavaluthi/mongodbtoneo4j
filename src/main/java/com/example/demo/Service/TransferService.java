package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.MongoEntity;
import com.example.demo.Model.NeoEntity;
import com.example.demo.Repo.MongoRepository;
import com.example.demo.Repo.NeoRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransferService {

    @Autowired
    private MongoRepository mongoRepository;

    @Autowired
    private NeoRepository neoRepository;

    public void transferData() {
        // Get MongoDB data
        List<MongoEntity> mongoEntities = mongoRepository.findAll();

        // Convert to Neo4j entities
        List<NeoEntity> neoEntities = mongoEntities.stream()
                .map(mongoEntity -> new NeoEntity(mongoEntity.getName()))
                .collect(Collectors.toList());

        // Save to Neo4j
        neoRepository.saveAll(neoEntities);
    }
}