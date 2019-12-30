package dev.kooper.treinamentos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dev.kooper.treinamentos.model.Cliente;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("Clientes-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		Cliente cli = entityManager.find(Cliente.class, 1);
//		System.out.println(cli.getNome() + " safada!");
//		Cliente cliente = new Cliente();
//		cliente.setNome("Massarico");
//		Cliente cliente = entityManager.find(Cliente.class, 1);
//		entityManager.getTransaction().begin();
//		cliente.setNome(cliente.getNome() + " Alterado");
//		entityManager.getTransaction().commit();
		
		
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNome("KOOPER BRASIL");
		entityManager.getTransaction().begin();
		entityManager.merge(cliente);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
	}
}
