package lyw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import lyw.mapper.BookMapper;
import lyw.model.Page;
import lyw.pojo.Book;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookMapper mapper; 

	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void InsertBook(Book book) {
		// TODO Auto-generated method stub
		//测试spring声明式事务
		mapper.deleteByPrimaryKey("A0002");
		mapper.insert(book);
		
	}

	@Override
	public List<Book> FindBookList() {
		// TODO Auto-generated method stub
		List<Book> list = mapper.selectBookList();
		return list;
	}

	@Override
	public List<Book> FindPageList(Page page) {
		// TODO Auto-generated method stub
		page.calc(mapper.findBookCount());
		List<Book> list = mapper.selectBookList(page);
		return list;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void UpdateBook(Book book) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKey(book);
		
	}

	@Override
	public void DeleteBook(String id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public Book FindBook(String id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}
	
}
