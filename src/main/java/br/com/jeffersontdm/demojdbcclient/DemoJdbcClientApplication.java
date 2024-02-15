package br.com.jeffersontdm.demojdbcclient;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.jeffersontdm.demojdbcclient.demo.Pet;
import br.com.jeffersontdm.demojdbcclient.demo.PetRepository;

@SpringBootApplication
public class DemoJdbcClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJdbcClientApplication.class, args);
	}

	@Bean
	ApplicationRunner runner(PetRepository repository) {
		return args -> {
			Long ID = 100L;
			Pet pet = new Pet(ID, "Garfield", 10);

			repository.save(pet);
			System.out.println(repository.findById(ID));

			Pet newpet = new Pet(ID, "Puss in Boots", 5);

			repository.update(newpet);
			System.out.println(repository.findById(ID));

			repository.delete(ID);
			try {
				repository.findById(ID);
			} catch (Exception e) {
				System.out.println("PET WITH ID '" + ID + "' WAS NOT FOUND");
			}

			System.out.println(repository.findAll());
		};
	}
}