package com.xworkz.xworkmodule.repository;

import com.xworkz.xworkmodule.entity.ModuleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
@Repository
public class ModuleRepoImpl implements ModuleRepo{
    @Autowired
    private EntityManagerFactory emf;
    @Override
    public boolean save(ModuleEntity entity) {

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
                et.getRollbackOnly();
            }
            e.printStackTrace();
        }finally {
            emf.close();
            em.close();
        }


        return true;
    }

    @Override
    public String getName(String email, String password) {

        return "";
    }


    @Override
    public Long countName(String name) {

            EntityManager em = emf.createEntityManager();
            Long count = 0L;
                count = (Long) em.createNamedQuery("countName")
                        .setParameter("SetName", name)
                        .getSingleResult();

                return count;
    }

    @Override
    public Long countByEmail(String email) {

        EntityManager em = emf.createEntityManager();
        Long count = (Long) em.createNamedQuery("countEmail")
                .setParameter("SetEmail",email)
                .getSingleResult();
        return count;
    }

    @Override
    public Long countByAltEmail(String altEmail) {
        EntityManager em = emf.createEntityManager();

        Long count = (Long) em.createNamedQuery("countAltEmail")
                .setParameter("SetAltEmail", altEmail)
                .getSingleResult();

        return count;
    }

    @Override
    public Long countByPhone(String phone) {
        EntityManager em = emf.createEntityManager();

        Long    count = (Long) em.createNamedQuery("countPhone")
                    .setParameter("setPhone", phone)
                    .getSingleResult();

            return count;
    }

    @Override
    public Long countByAltPhone(String altPhone) {
        EntityManager em = emf.createEntityManager();
        Long count = (Long) em.createNamedQuery("countAltPhNo")
                .setParameter("setAltPhNo",altPhone)
                .getSingleResult();
        return count;
    }


}
