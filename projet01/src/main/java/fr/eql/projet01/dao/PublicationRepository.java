package fr.eql.projet01.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import fr.eql.projet01.entity.Publication;

//@Repository Optional annotation while using CrudRepository
public interface PublicationRepository extends CrudRepository<Publication, Long> {
	List<Publication> findByTitreIgnoreCase(String titre);
	public Page<Publication> findByTitreIgnoreCaseContains(String mc, Pageable pageable);
	
}
