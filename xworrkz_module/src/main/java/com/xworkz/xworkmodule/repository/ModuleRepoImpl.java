package com.xworkz.xworkmodule.repository;

import com.xworkz.xworkmodule.entity.ModuleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

@Repository
public class ModuleRepoImpl implements ModuleRepo {
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
        } catch (Exception e) {
            et.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }


        return true;
    }

    @Override
    public String getName(String email, String password) {
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("findNameThroughLogin");
        String name = (String) query.setParameter("pass", password).setParameter("email", email).getSingleResult();
        return name;
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
                .setParameter("SetEmail", email)
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
    public Long countByPhone(double phone) {
        EntityManager em = emf.createEntityManager();

        Long count = (Long) em.createNamedQuery("countPhone")
                .setParameter("setPhone", phone)
                .getSingleResult();

        return count;
    }

    @Override
    public Long countByAltPhone(double altPhone) {
        EntityManager em = emf.createEntityManager();
        Long count = (Long) em.createNamedQuery("countAltPhNo")
                .setParameter("setAltPhNo", altPhone)
                .getSingleResult();
        return count;
    }

    @Override
    public ModuleEntity getEntityByEmail(String email) {
//try block
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Query query = em.createNamedQuery("getEntityByEmail");
        query.setParameter("setEmail", email);

        return (ModuleEntity) query.getSingleResult();
    }

    @Override
    public ModuleEntity findByEmail(String email) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        ModuleEntity moduleEntity = null;

        try {
            et.begin();
            Query query = em.createNamedQuery("getDataByEmail");
            query.setParameter("byEmail", email);
            moduleEntity = (ModuleEntity) query.getSingleResult();
            et.commit();
//            System.out.println("from findByEmail" + moduleEntity);

        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
        } finally {
            em.close();
        }
        return moduleEntity;

    }

    @Override
    public void onUpdate(ModuleEntity entity) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            System.out.println(entity);
            et.begin();
            em.merge(entity);
            et.commit();
        }catch (Exception e)
        {
            et.rollback();
            e.printStackTrace();
        }finally {
            em.close();
        }
    }

    @Override
    public boolean updateDetailsByName(ModuleEntity entity) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try{
            et.begin();
            Query query = em.createNamedQuery("updateDetailsByName");
            query.setParameter("email",entity.getEmail());
            query.setParameter("alterEmail", entity.getAlterEmail());
            query.setParameter("phNo",entity.getPhNo());
            query.setParameter("alterPhNo",entity.getAlterPhNo());
            query.setParameter("location",entity.getLocation());
            query.setParameter("name", entity.getName()); // Include this line to set the name parameter
            int rowsAffected = query.executeUpdate();
            System.out.println("rows affected "+rowsAffected);
            et.commit();
            return  rowsAffected>0;
        }catch (Exception e)
        {
            if(et.isActive())
            {
                et.rollback();
            }
            e.printStackTrace();
            return false;
        }finally {
            em.close();
        }

    }

    @Override
    public boolean resetPasswordAndLoginCount(String email, String password) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try{
            et.begin();
            Query query = em.createNamedQuery("resetPasswordAndLoginCount");
            query.setParameter("email",email);
            query.setParameter("newPassword",password);
            query.setParameter("loginCount",0);
            query.setParameter("accountLocked",false);
            int rowAffected = query.executeUpdate();
            et.commit();
            System.out.println("email in repository "+email);
            System.out.println("Password in repository "+password);
            System.out.println("rows affected "+rowAffected);
            return rowAffected>0;
        }catch (Exception e)
        {
            if(et.isActive())
            {
                et.rollback();
            }
            e.printStackTrace();
            return false;
        }finally {
            em.close();
        }
    }


}
