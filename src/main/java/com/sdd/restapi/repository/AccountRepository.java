package com.sdd.restapi.repository;

import com.sdd.restapi.domain.Maccount;
import com.sdd.restapi.domain.Mcustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Maccount, Integer> {
}
