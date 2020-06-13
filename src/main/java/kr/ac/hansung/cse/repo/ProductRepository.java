package kr.ac.hansung.cse.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.ac.hansung.cse.model.Product;

//id가 int 타입이라 Integer로 주어야 한다
public interface ProductRepository extends CrudRepository<Product, Integer>{
	List<Product> findByCategory(String category);
}