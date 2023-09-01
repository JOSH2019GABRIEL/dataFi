package com.drug.druglist.repository;

import com.drug.druglist.entity.Drug;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DrugRepository extends JpaRepository<Drug, UUID> {

}
