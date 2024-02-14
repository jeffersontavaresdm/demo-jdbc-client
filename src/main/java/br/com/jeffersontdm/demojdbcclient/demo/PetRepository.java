package br.com.jeffersontdm.demojdbcclient.demo;

import java.util.List;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class PetRepository {

    private final JdbcClient jdbcClient;

    public PetRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<Pet> findAll() {
        return jdbcClient
                .sql("SELECT * FROM pet")
                .query(Pet.class)
                .list();
    }

    public Pet findById(Long id) {
        return jdbcClient
                .sql("SELECT * FROM pet WHERE id = :id")
                .param("id", id)
                .query(Pet.class)
                .single();
    }

    public void save(Pet pet) {
        jdbcClient
                .sql("""
                            INSERT INTO pet (id, name, age)
                            VALUES (:id, :name, :age)
                        """)
                .param("id", pet.id())
                .param("name", pet.name())
                .param("age", pet.age())
                .update();
    }

    public void update(Pet pet) {
        jdbcClient
                .sql("""
                            UPDATE pet SET name = :name, age = :age
                            WHERE id = :id
                        """)
                .param("id", pet.id())
                .param("name", pet.name())
                .param("age", pet.age())
                .update();
    }
    
    public void delete(Long id) {
        jdbcClient
                .sql("""
                            DELETE FROM pet
                            WHERE id = :id
                        """)
                .param("id", id)
                .update();
    }
}