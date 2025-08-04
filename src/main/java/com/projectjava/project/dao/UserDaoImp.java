package com.projectjava.project.dao;

import com.projectjava.project.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserDaoImp  implements  UserDao{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<User> getUsers() {
        String query = "FROM User";
         return entityManager.createQuery(query).getResultList();

    }

    @Override
    public void Delete(Long id){
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }

    @Override
    public void Register(User user){
        entityManager.merge(user);
    }
}
