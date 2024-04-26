package com.bookree.adminbookree.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookree.adminbookree.persistence.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
