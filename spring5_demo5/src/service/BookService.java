package service;

import dao.BookDao;
import entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void addBook(Book book){
        bookDao.add(book);
    }
}

