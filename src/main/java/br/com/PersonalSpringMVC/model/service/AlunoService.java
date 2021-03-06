package br.com.PersonalSpringMVC.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.PersonalSpringMVC.model.repository.IAlunoRepository;
import br.com.PersonalSpringMVC.negocio.Aluno;

@Service
public class AlunoService {

	@Autowired
	private IAlunoRepository repository;

	public List<Aluno> obterLista(){
		return (List<Aluno>)repository.findAll();
	}
	
	public Optional<Aluno> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Aluno aluno) {
		repository.save(aluno);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IAlunoRepository getRepository() {
		return repository;
	}
	public void setRepository(IAlunoRepository repository) {
		this.repository = repository;
	}
}