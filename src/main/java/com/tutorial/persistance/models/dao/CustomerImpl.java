package com.tutorial.persistance.models.dao;

import com.tutorial.persistance.models.entity.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CustomerImpl implements ICustomerDao {

    @PersistenceContext
    private EntityManager anEntityManager;

    @Transactional(readOnly = true)
    @Override
    public List<Customer> findAll() {
        return anEntityManager.createQuery("from Customer").getResultList();
    }

    @Override
    @Transactional
    public void save(Customer aCustomer) {
        anEntityManager.persist(aCustomer);
    }
}
