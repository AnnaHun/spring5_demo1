package dao;

import entity.Book;

import java.util.List;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description
 * @date 2021/8/30-12:07 下午
 * @motto: Never say die Never give up
 */
public interface BookDao {
    void add(Book book);

    void updateBook(Book book);

    void delete(String id);

    int selectCount();

    Book findBookInfo(String id);

    List<Book> findAllBook();

    void batchAddBook(List<Object[]> batchArgs);

    void batchUpdateBook(List<Object[]> batchArgs);

    void batchDeleteBooks(List<Object[]> batchArgs);
}
