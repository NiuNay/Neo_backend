package com.project.neo.BabyRepository;

import com.project.neo.Baby.Baby;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
/* Reference 2: https://github.com/Java-Techie-jt/spring-mongodb/tree/master/src/main/java/com/javatechie/spring/mongo/api
Integrating MongoDB with spring boot
 */
/**
 * This interface represents the Data layer of the application that provides direct access to objects in the MongoDB
 * database.
 */
@Repository
public interface Babyrepository extends MongoRepository<Baby, Integer> {
    @Query(value = "{'id':?0}")
    Optional<Baby> getBabyById(Integer id);

    long count();

}
