package com.drug.druglist.controller;

import com.drug.druglist.entity.Drug;
import com.drug.druglist.repository.DrugRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("api/v1/drug")
public class DrugController {


    private final DrugRepository drugRepository;

    public DrugController(DrugRepository drugRepository) {
        this.drugRepository = drugRepository;
    }

    record drugRequest(
        String drugName,
        String brandName,
        Date dateCreate,
        boolean status
    )
      {

    }


    @GetMapping()
    public List<Drug> getDrugs(){
        return drugRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> addDrugs(@RequestBody DrugRequest drugRequest) {
        // Check if email already exists

        Drug drug = new Drug();
        drug.setDrugName(drug.getDrugName());
        drug.setBrandName(drug.getBrandName());
        drug.setDateCreated(drug.getDateCreated());
        drug.setStatus(drug.isStatus());
        drugRepository.save(drug);

        return ResponseEntity.ok("Drug record added successfully");
    }
}
