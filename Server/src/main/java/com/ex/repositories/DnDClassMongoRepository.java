package com.ex.repositories;

import com.ex.pojos.player.DnDClass;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DnDClassMongoRepository extends MongoRepository<DnDClass, String> {
    DnDClass findByName(String name);
}