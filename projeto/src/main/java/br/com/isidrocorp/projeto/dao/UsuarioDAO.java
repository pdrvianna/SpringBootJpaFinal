package br.com.isidrocorp.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.projeto.model.usuario;

public interface UsuarioDAO extends CrudRepository<usuario, Integer>{

	public usuario findByEmailAndSenha(String email, String senha);
	public usuario findByRacfAndSenha(String racf, String senha);
	public usuario findByRacfAndEmail(String racf, String senha);
	
}
