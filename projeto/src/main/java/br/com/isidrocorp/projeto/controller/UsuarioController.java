package br.com.isidrocorp.projeto.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.projeto.dao.UsuarioDAO;
import br.com.isidrocorp.projeto.model.usuario;

@RestController
public class UsuarioController {

	@Autowired //injecao de dependencia
	private UsuarioDAO dao;	
	
	@GetMapping("/usuarios")
	public ArrayList<usuario> listarTudo(){
		ArrayList<usuario> lista = (ArrayList<usuario>)dao.findAll();
		return lista;
	
	}	
		@PostMapping("/login")
		public usuario login(@RequestBody usuario userEmailSenha) {
			usuario user = dao.findByEmailAndSenha(userEmailSenha.getEmail(),userEmailSenha.getSenha());
			return user;
		}
	
/*
	
	/*@PostMapping("/login")
	public usuario login(@RequestBody usuario incompleto) {
		if (incompleto.getEmail() != null) { //meu usuario do parametro vei com email
			System.out.println("recuperado pelo email");
			resultado = dao.find
			return resultado;
		}else {
			
		}

}*/
	
	
}
	
	
	

