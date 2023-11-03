package com.studentApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.studentApp.entity.StudentEntity;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity, Long> {
	
    @Modifying
    @Transactional
	@Query(value = "update stud set mobile=?2 where id=?1", nativeQuery = true)
	int updateMoById(long id, String mobile);

    @Modifying
    @Transactional
	@Query(value = "select * from stud where classNo=?1", nativeQuery = true)
	List<StudentEntity> findByClass(String classNO);

}
