package test;

import com.lala.pojo.Goods;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class TestGoods1 {
    @Test
    public void testgoods1() throws IOException {
        Goods goods=new Goods();
        goods.setId(19);
        goods.setName("a");
        goods.setRemark("io");
        InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=factory.openSession();
        String statement="com.lala.dao.TestDao.insertObject";
        int rows=session.insert(statement,goods);
        System.out.println(rows);
        Long a=10L;
        int b=10;
        Boolean c=(a==b);
        System.out.println(c);
        session.commit();
        session.close();

    }
}
