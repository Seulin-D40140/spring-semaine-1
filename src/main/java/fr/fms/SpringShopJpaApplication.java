package fr.fms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fms.dao.ArticleRepository;
import fr.fms.dao.CategoryRepository;
import fr.fms.entities.Article;
import fr.fms.entities.Category;

@SpringBootApplication
public class SpringShopJpaApplication implements CommandLineRunner{
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ArticleRepository articleRepository;
	
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringShopJpaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception
	{
//		Category smartphone = categoryRepository.save(new Category("smartphone"));
//		Category tablet = categoryRepository.save(new Category("tablet"));
//		Category pc = categoryRepository.save(new Category("pc"));
//		
//		articleRepository.save( new Article("s9" , "Samsung" , 250 , smartphone));
//		articleRepository.save( new Article("x1" , "Sony" , 350 , smartphone));
//		articleRepository.save( new Article("s10" , "Samsung" , 450 , smartphone));
//		articleRepository.save( new Article("s20" , "Samsung" , 500 , smartphone));
//		articleRepository.save( new Article("xz" , "Sony" , 150 , smartphone));
//		articleRepository.save( new Article("s21" , "Samsung" , 1000 , smartphone));
//		articleRepository.save( new Article("predator" , "msi" , 2600 , pc));
//		articleRepository.save( new Article("galaxy tab" , "Samsung" , 650 , tablet));
		
		for (Article article : articleRepository.findByCategoryId(1))
		{
			System.out.println(article);
		}
	}
}
