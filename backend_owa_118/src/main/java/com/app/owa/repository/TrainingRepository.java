package com.app.owa.repository;

import com.app.owa.model.Training;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class TrainingRepository extends SimpleJpaRepository<Training, String> {
    private final EntityManager em;
    public TrainingRepository(EntityManager em) {
        super(Training.class, em);
        this.em = em;
    }
    @Override
    public List<Training> findAll() {
        return em.createNativeQuery("Select * from \"owa\".\"Training\"", Training.class).getResultList();
    }
}