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

    @Override
    @Transactional(readOnly = true)
    public List<Customer> findAll() {
        return anEntityManager.createQuery("from Customer").getResultList();
    }

    @Override
    @Transactional
    public void save(Customer aCustomer) {
        anEntityManager.persist(aCustomer);
    }

    @Override
    @Transactional(readOnly = true)
    public Customer findOne(Long id) {
        return anEntityManager.find(Customer.class, id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        anEntityManager.remove(findOne(id));
    }
}
