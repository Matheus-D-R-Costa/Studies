package com.api.pessoa.service;

import com.api.pessoa.model.PessoaModel;
import com.api.pessoa.repository.PessoaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<PessoaModel> findAll() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public PessoaModel findById(Long id) {
        Optional<PessoaModel> pessoa = repository.findById(id);
        if (pessoa.isEmpty()) throw new IllegalArgumentException("Essa pessoa não existe!");
        return pessoa.get();
    }

    @Transactional
    public void create(PessoaModel pessoaModel) {
        savePessoa(pessoaModel);
    }

    @Transactional
    public void updateById(Long id, PessoaModel pessoaModel) {
        PessoaModel pessoaInDatabase = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pessoa inexistente"));

        pessoaInDatabase.setNome(pessoaModel.getNome());
        pessoaInDatabase.setTelefone(pessoaModel.getTelefone());
        pessoaInDatabase.setEndereco(pessoaModel.getEndereco());
        pessoaInDatabase.setAtivo(pessoaModel.getAtivo());

        savePessoa(pessoaInDatabase);
    }

    private void savePessoa(PessoaModel pessoaModel) {
        repository.save(pessoaModel);
    }

    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }


}
