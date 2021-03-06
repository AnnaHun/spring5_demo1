package service;

import dao.BookDao;
import entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description
 * @date 2021/8/30-12:07 下午
 * @motto: Never say die Never give up
 */
@Service
public class BookService {

    //    注入dao
    @Autowired
    private BookDao bookDao;

    //    添加方法
    public void addBook(Book book) {
        bookDao.add(book);
    }

    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    public void deleteBook(String id) {
        bookDao.delete(id);
    }

    public int findCount() {
        return bookDao.selectCount();
    }

    public Book findOne(String id) {
        return bookDao.findBookInfo(id);
    }

    public List<Book> findAll() {
        return bookDao.findAllBook();
    }

    public void batchAdd(List<Object[]> batchArgs) {
        bookDao.batchAddBook(batchArgs);
    }

    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdateBook(batchArgs);
    }

    public void batchDelete(List<Object[]> batchArgs){
        bookDao.batchDeleteBooks(batchArgs);
    }
}

