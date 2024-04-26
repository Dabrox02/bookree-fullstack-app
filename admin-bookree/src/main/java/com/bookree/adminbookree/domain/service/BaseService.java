package com.bookree.adminbookree.domain.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.repository.NoRepositoryBean;

import com.bookree.adminbookree.persistence.dto.BaseDTO;

@NoRepositoryBean
public interface BaseService<DTO extends BaseDTO> {
    Optional<DTO> find(Integer id);

    List<DTO> findAll();

    Map<String, String> create(DTO dto);

    void edit(Integer id, DTO dto);

    void delete(Integer id);

}
