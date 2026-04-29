package com.example.spring_security.services;

import com.example.spring_security.models.ProdutoModel;
import com.example.spring_security.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    public List<ProdutoModel> findAll(){
        return produtoRepository.findAll();
    }

    public ProdutoModel criarProduto(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }

    public void deletarProduto (Long id){
        produtoRepository.deleteById(id);
    }

    public ProdutoModel buscarPorId(Long id){
        return produtoRepository.findById(id).get();
    }

    public ProdutoModel atualizarProduto(Long id, ProdutoModel produtoModel){
        ProdutoModel newprodutomodel = produtoRepository.findById(id).get();
        return produtoRepository.save(produtoModel);
    }

}
