package fr.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.fms.entities.Article;

public interface ArticleRepository  extends JpaRepository<Article,Long>
{
	public List<Article> findByBrand(String brand);
	public List<Article> findByBrandContains(String brand);
	public List<Article> findByBrandAndPrice(String brand , double price); 
	
	@Query("select A from Article A where A.brand like %:x% and A.price > :y")
	public List<Article> searchArticle(@Param("x") String brand , @Param("y")double price);
	
	public List<Article> findByCategoryId(int categoryId);
	
	//exo 1.2
	public List<Article> findByDescription(String description);
	public List<Article> findAll();
}
