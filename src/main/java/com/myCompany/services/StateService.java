package com.myCompany.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myCompany.model.State;

@Repository
public interface StateService extends CrudRepository<State, Integer> {

}

