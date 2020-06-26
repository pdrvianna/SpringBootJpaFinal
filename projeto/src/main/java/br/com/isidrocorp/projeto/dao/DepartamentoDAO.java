package br.com.isidrocorp.projeto.dao;

import br.com.isidrocorp.projeto.model.Departamento;
import org.springframework.data.repository.CrudRepository;

public interface DepartamentoDAO extends CrudRepository<Departamento,Integer>{
	

}
