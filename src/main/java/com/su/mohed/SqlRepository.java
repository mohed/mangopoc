package com.su.mohed;

import com.su.mohed.tables.Masterdata;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by mohed on 2017-04-26.
 */
public interface SqlRepository extends CrudRepository<Masterdata, Integer> {
	
	Masterdata save(Masterdata md);
	
	Masterdata findById(int id);
	
	List<Masterdata> findAll();
	
}
