package com.xworkz.courseregistration.repository;

import com.xworkz.courseregistration.entity.CourseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class CourseRepositoryImpl implements CourseRepository{
    @Autowired
    EntityManagerFactory emf;

    @Override
    public boolean save(CourseEntity entity) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {

            et.begin();
            em.persist(entity);
            et.commit();
        }catch (Exception e)
        {
            if(et.isActive())
            {
                et.rollback();
            }
            e.printStackTrace();
        }finally {
            em.close();
        }




        return true;
    }

    @Override
    public CourseEntity getName(String email, String password) {
        EntityManager em = emf.createEntityManager();
        CourseEntity s = null;
        Query query = em.createNamedQuery("findById",CourseEntity.class);
        query.setParameter("em", email);
        query.setParameter("pass",password);
        s = (CourseEntity) query.getSingleResult();


        return s;
    }
}
