package lyw.service;

import java.util.List;

import lyw.model.Page;
import lyw.pojo.Book;

public interface BookService {
	public void InsertBook(Book book);
	public void UpdateBook(Book book);
	public void DeleteBook(String id);
	public List<Book> FindBookList();
	public List<Book> FindPageList(Page page);
	public Book FindBook(String id);
}
