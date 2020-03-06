package com.sdd.restapi.repository;

import com.sdd.restapi.domain.Mcustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Mcustomer, Integer> {
}
