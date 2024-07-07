package com.mikhalych.storage_of_autoparts.repositories;

import com.mikhalych.storage_of_autoparts.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
}
