package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Trainee;




@Repository("traineeRepository")
public interface ITraineeRepository extends JpaRepository<Trainee, Integer>{

}
