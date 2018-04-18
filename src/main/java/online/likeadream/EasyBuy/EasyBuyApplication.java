package online.likeadream.easybuy;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import online.likeadream.easybuy.domain.Produto;
import online.likeadream.easybuy.repositories.ProdutoRepository;

@SpringBootApplication
public class EasybuyApplication implements CommandLineRunner {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(EasybuyApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Produto prod1 = new Produto("Farinha", 5, 5);
		Produto prod2 = new Produto("Milho", 5, 5);
		
		produtoRepository.saveAll(Arrays.asList(prod1,prod2));
	}
}
