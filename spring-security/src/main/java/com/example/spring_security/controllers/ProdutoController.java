package com.example.spring_security.controllers;

import com.example.spring_security.models.ProdutoModel;
import com.example.spring_security.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<ProdutoModel>> findAll(){
        List<ProdutoModel> requeste = produtoService.findAll();
        return ResponseEntity.ok().body(requeste);
    }

    @PostMapping
    public ResponseEntity<ProdutoModel> criarProduto(@RequestBody ProdutoModel produtoModel){
        ProdutoModel requeste = produtoService.criarProduto(produtoModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").
                buildAndExpand(produtoModel.getId()).toUri();
        return ResponseEntity.created(uri).body(requeste);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarProduto(@PathVariable Long id){
        produtoService.deletarProduto(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ProdutoModel buscarPorId(@PathVariable Long id){
        return produtoService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public ProdutoModel atualizarProduto(@PathVariable Long id, ProdutoModel produtoModel){
        return produtoService.atualizarProduto(id, produtoModel);
    }
}
