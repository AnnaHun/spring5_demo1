package dao;

import entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description
 * @date 2021/8/30-12:07 下午
 * @motto: Never say die Never give up
 */
@Repository
public class BookDaoImpl implements BookDao {

    //    注入jdbctemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //    添加的方法
    @Override
    public void add(Book book) {
        String sql = "insert into t_book values(?,?,?)";
        Object[] args = {book.getUserId(), book.getUserName(), book.getuStatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }
}
