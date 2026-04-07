package com.bridgelabz.hospital_Management.service;

import com.bridgelabz.hospital_Management.dto.PatientDto;
import com.bridgelabz.hospital_Management.entity.Patient;
import com.bridgelabz.hospital_Management.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository repo;

    public Patient create(PatientDto dto) {
        Patient p = new Patient();
        p.setName(dto.getName());
        p.setAge(dto.getAge());
        p.setGender(dto.getGender());
        p.setDisease(dto.getDisease());
        p.setAddress(dto.getAddress());
        p.setPhoneNumber(dto.getPhoneNumber());
        return repo.save(p);
    }

    public List<Patient> getAll() {
        return repo.findAll();
    }

    public Patient getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public Patient update(Long id, PatientDto dto) {
        Patient p = getById(id);
        p.setName(dto.getName());
        return repo.save(p);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}