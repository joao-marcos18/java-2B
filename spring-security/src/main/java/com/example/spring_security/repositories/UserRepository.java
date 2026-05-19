package com.example.spring_security.repositories;

import com.example.spring_security.models.UserModel;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

/*
 * Repository responsável por acessar os dados
 * da entidade User no banco de dados.
 *
 * JpaRepository já fornece métodos prontos como:
 * - save()
 * - findAll()
 * - findById()
 * - delete()
 *
 * Não é necessário escrever SQL manualmente
 * para operações básicas.
 */



public interface UserRepository extends JpaRepository<UserModel, Long> {


    /*
     * Metodo responsável por buscar um usuário
     * através do login.
     *
     * O Spring Data JPA cria a consulta automaticamente
     * baseado no nome do metodo.
     *
     * Exemplo gerado:
     * SELECT * FROM users WHERE login = ?
     *
     * Retorna um UserDetails,
     * utilizado pelo Spring Security
     * no processo de autenticação.
     */

    UserDetails findByLogin(String role);
}
