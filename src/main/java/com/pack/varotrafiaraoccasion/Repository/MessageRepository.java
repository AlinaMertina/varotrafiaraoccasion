package com.pack.varotrafiaraoccasion.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pack.varotrafiaraoccasion.Entity.Message;
import java.util.*;

public interface MessageRepository extends MongoRepository<Message, String> {

   /* @Query("{'$or': [{'to': ?0}, {'from': ?0}]}")
    public List<Message> findMessagesByClientId(@Param("id") Long idClient);


    // @Query("{'email': ?0, 'motdepasse': ?1}")
    // public java.util.Optional<Message> findUser(@Param("email") String email, @Param("motdepasse") String password);

    // @Query("{'idMessage': ?0}")
    // public String getMessage(@Param("idMessage") Long idclient);

    @Query("{}")
    public List<Message> getClientAll();

    Message save(Message message);*/
   List<Message> findByTo1(int to);
   List<Message> findByTo1OrFrom2(int to1, int from2);

   Optional<Message> findById(String id);
}