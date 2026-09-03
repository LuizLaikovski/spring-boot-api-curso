package com.spring_boot_api.luiz_laikovski.controller;

import com.spring_boot_api.luiz_laikovski.dto.ResponseDTO;
import com.spring_boot_api.luiz_laikovski.entity.PeopleEntity;
import com.spring_boot_api.luiz_laikovski.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @GetMapping(value = "/{id}"    )
    public PeopleEntity findById(@PathVariable("id") Long id) {
        return peopleService.findById(id);
    }

    @GetMapping
    public List<PeopleEntity> findAll() {
        return peopleService.findByAll();
    }

    @PostMapping
    public PeopleEntity create(@RequestBody PeopleEntity peopleEntity) {
        return peopleService.create(peopleEntity);
    }

    @PutMapping
    public PeopleEntity alterPeople(@RequestBody PeopleEntity peopleEntity) {
        return peopleService.update(peopleEntity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePeople(@PathVariable("id") Long id) {
        peopleService.deletePeople(id);
    }
}
