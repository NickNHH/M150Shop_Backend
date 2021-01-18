package ch.bbw.shop.article;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ArticleDAO {

	private List<Article> articles;

	public ArticleDAO() {
		List<Size> sizes1 = Arrays.asList(
			new Size(1, "S", 1),
			new Size(2, "M", 2),
			new Size(3, "L", 3),
			new Size(4, "XL", 4)
		);
		List<Size> sizes2 = Arrays.asList(
			new Size(5, "onesize", 1)
		);
		List<Size> sizes3 = Arrays.asList(
			new Size(6, "250g", 1),
			new Size(7, "500g", 2),
			new Size(8, "1Kg", 3)
		);

		articles = new ArrayList<>();
		articles.add(new Article(1, "0001", "Java T-Shirt", "Ein wunderschönes T-Shirt (unisex)", 39.90));
		articles.add(new Article(2, "0002", "Java Tasse", "3dl Tasse für langen heissen Kaffeegenuss", 12.90));
		articles.add(new Article(3, "0003", "Java Bohnen", "500g original Java Bohnen (direktimport)", 15.00));
		articles.add(new Article(4, "0004", "BBW Sticker rund", "Klassische BBW Sticker (Variante rund 5cm Durchmesser)", 15.00));
		articles.add(new Article(5, "0005", "BBW Sticker quadratisch", "Klassische BBW Sticker (Variante eckig 4 x 3cm)", 15.00));

		articles.get(0).setImage("images/0001.jpg");
		articles.get(1).setImage("images/0002.jpg");
		articles.get(2).setImage("images/0003.jpg");
		articles.get(3).setImage("images/0004.jpg");
		articles.get(4).setImage("images/0005.jpg");

		SizeGroup sizeGroup1 = new SizeGroup(1, "Kleidergrössen", sizes1);
		SizeGroup sizeGroup2 = new SizeGroup(1, "Tassengrössen", sizes2);
		SizeGroup sizeGroup3 = new SizeGroup(1, "Kaffegrössen", sizes3);
		articles.get(0).setSizeGroup(sizeGroup1);
		articles.get(1).setSizeGroup(sizeGroup2);
		articles.get(2).setSizeGroup(sizeGroup3);
	}

	public Optional<Article> getArticleById(int id) {
		return articles.stream()
			.filter(a -> a.getId()==id)
			.findFirst();
	}

	public List<Article> getArticles() {
		return articles;
	}
	public void setArticlees(List<Article> articles) {
		this.articles = articles;
	}

}
