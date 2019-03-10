package lyw.mapper;

import java.util.List;

import lyw.model.Page;
import lyw.pojo.Book;

public interface BookMapper {
    int deleteByPrimaryKey(String id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
    
    List<Book> selectBookList(Page page);
    
    List<Book> selectBookList();
    
    int findBookCount();
}