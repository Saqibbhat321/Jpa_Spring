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
}
