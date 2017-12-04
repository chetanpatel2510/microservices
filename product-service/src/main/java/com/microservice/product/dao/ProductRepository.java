/**
 *
 */
package com.microservice.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.product.domain.Product;

/**
 * @author Chetan
 *
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
