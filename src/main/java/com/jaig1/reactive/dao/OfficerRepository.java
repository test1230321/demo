package com.jaig1.reactive.dao;

import com.jaig1.reactive.entities.Officer;
import com.jaig1.reactive.entities.Rank;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface OfficerRepository extends ReactiveCrudRepository<Officer, String> {
    Flux<Officer> findByRank(@Param("rank") Rank rank);
    Flux<Officer> findByLast(@Param("last") String last);
}