package br.ifba.gincana.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ifba.gincana.backend.model.ProvaModel;

@Repository
public interface ProvaRepository extends JpaRepository<ProvaModel, Long>{

}
