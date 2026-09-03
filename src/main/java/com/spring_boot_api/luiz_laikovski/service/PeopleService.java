package com.spring_boot_api.luiz_laikovski.service;

import com.spring_boot_api.luiz_laikovski.exception.ResourceNotFoundException;
import com.spring_boot_api.luiz_laikovski.entity.PeopleEntity;
import com.spring_boot_api.luiz_laikovski.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PeopleService {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PeopleService.class.getName());

    @Autowired
    PeopleRepository peopleRepository;

    public List<PeopleEntity> findByAll() {
        return peopleRepository.findAll();
    }

    public PeopleEntity findById(Long id) {
        return peopleRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado registro no banco correspondente a este ID"));
    }

    public PeopleEntity create(PeopleEntity peopleEntity) {
        return peopleRepository.save(peopleEntity);
    }

    public PeopleEntity update(PeopleEntity peopleEntity) {
        PeopleEntity entity = peopleRepository.findById(peopleEntity.getId()).orElseThrow(() ->
                new ResourceNotFoundException("Não foi encontrado registro no banco correspondente a este ID"));

        entity.setName(peopleEntity.getName());
        entity.setAddRess(peopleEntity.getAddRess());
        entity.setGender(peopleEntity.getGender());
        entity.setBirthday(peopleEntity.getBirthday());

        return peopleRepository.save(peopleEntity);
    }

    public void deletePeople(Long id) {
        PeopleEntity entity = peopleRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Não foi encontrado registro no banco correspondente a este ID"));
        peopleRepository.deleteById(entity.getId());
    }
}
