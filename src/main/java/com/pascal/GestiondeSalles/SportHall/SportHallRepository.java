package com.pascal.GestiondeSalles.SportHall;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportHallRepository extends JpaRepository<SportHallModel, Long> {

}


