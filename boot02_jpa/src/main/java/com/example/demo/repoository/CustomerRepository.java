package com.example.demo.repoository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	List<Customer> findByName(String name);
	List<Customer> findByNameLike(String name);
	//특정단어가 포함된 이메일 조회 &&
	List<Customer> findByNameContainingOrEmailContaining(String name, String email);
	//특정단어가 이름 또는 이메일에 포함된 경우
	
	//@Query(value="select * from customer where = ?1 or name = ?2", nativeQuery = true)
	@Query(value="select * from customer where phone = :phone or name = :name", nativeQuery = true)
	List<Object[]> findAllNative(@Param("phone") String phone, @Param("name")String name);
	
	@Query(value="select * from customer where phone = :phone or name = :name", nativeQuery = true)
	List<CustomerNative> findAllNativeVO(@Param("phone") String phone, @Param("name")String name);
	
	//JPQL
	@Query("select c from Customer c order by id DESC") //클래스명과 컬럼명은 대소문자 구분함
	List<Customer> findAllQuery();
}
