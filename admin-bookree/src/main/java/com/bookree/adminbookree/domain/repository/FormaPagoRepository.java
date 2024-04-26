package com.bookree.adminbookree.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookree.adminbookree.persistence.entity.impl.FormaPago;

@Repository
public interface FormaPagoRepository extends JpaRepository<FormaPago, Integer> {
}
