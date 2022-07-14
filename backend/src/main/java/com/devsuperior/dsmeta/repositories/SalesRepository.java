package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsmeta.entities.Sale;

@Repository
public interface SalesRepository extends JpaRepository<Sale,Long >{

}
