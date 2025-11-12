package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.repoository.Address;
import com.example.demo.repoository.AddressRepository;
import com.example.demo.repoository.Customer;
import com.example.demo.repoository.CustomerNative;
import com.example.demo.repoository.CustomerRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class CustomerRepositoryTest {

	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	AddressRepository addressRepository;

	@Disabled
	@Test
	public void 고객_조회() {
		// given
		String name = "손오공";
		String phone = "1234";
		Customer customer = Customer.builder().name(name).phone(phone).build();
		customerRepository.save(customer);
		// when
		List<Customer> customerList = (List<Customer>) customerRepository.findAll();
		// thenEquals
		assertEquals(customerList.get(0).getName(), name);
		log.info("조회된	고객	이름: {}", customerList.get(0).getName());

	}

	@Disabled
	@Test
	public void 고객_수정() {
		// given - 초기 데이터 저장
		String name = "손오공";
		String phone = "1234";
		Customer saved = customerRepository.save(Customer.builder().name(name).phone(phone).build());
		// when - 고객 정보 수정
		Customer customer = customerRepository.findById(saved.getId()).orElse(new Customer());
		customer.updateNameAndEmail("둘리", "");
		Customer updated = customerRepository.save(customer);

		customer.updateNameAndEmail("손오공", "a@a.a");
		updated = customerRepository.save(customer);

		// then
		assertEquals(updated.getName(), customer.getName());
		log.info("수정된	고객	이름:	{}", updated.getName());
	}

	@Disabled
	@Test
	public void 이름_조회() {
		// given
		String name = "둘리";

		// when
		List<Customer> list = customerRepository.findByName(name);
		List<Customer> list2 = customerRepository.findByNameLike("%동%");
		List<Customer> list3 = customerRepository.findByNameContainingOrEmailContaining("%동%", "%a%");
		list2.stream().forEach(cust -> System.out.println(cust.getName()));

		// then
		assertEquals(list.get(0).getName(), name);
	}

	@Test
	public void 네이티브_쿼리() {
//		List<Object[]> list = customerRepository.findAllNative("011", "둘리");
//		for( Object[] info : list ) {
//			System.out.println(info[0] + ":" + info[1]);
//		}

		List<CustomerNative> list2 = customerRepository.findAllNativeVO("011", "둘리");
		for (CustomerNative info : list2) {
			System.out.println(info.getId() + ":" + info.getName() + ", " + info.getEmail() + ", " + info.getPhone());
		}
	}

	@Test
	public void jpql_test() {
		List<Customer> list = customerRepository.findAllQuery();
		list.stream().forEach(cust -> System.out.println(cust.getId() + cust.getName()));
	}

	@Test
	public void 일대일() {
		//given(준비)
		//고객등록
		Customer customerentity = Customer.builder()
						.name("길동").phone("019")
						.email("c@c.c").build();
		Customer saved = customerRepository.save(customerentity);
		
		addressRepository.save( Address.builder()
								.zipcode("01000").address("서울")
								.customer(customerentity)
								.build() );
		
		addressRepository.save( Address.builder()
								.zipcode("04411").address("대구")
								.customer(customerentity)
								.build() );
		// when(실행)
		//고객조회 (주소록조회)
		Customer customer = customerRepository.findById(saved.getId()).get();
		customer.getAddress().forEach(addr -> System.out.println(
				addr.getZipcode() + ":" + addr.getAddress()));
		
		// then(검증)
		assertEquals("04411", customer.getAddress().get(0).getZipcode());
	}
}
