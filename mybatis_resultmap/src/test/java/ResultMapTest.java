import com.le.mybatis.mapper.EmpMapper;
import com.le.mybatis.pojo.Emp;
import com.le.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ResultMapTest {
    @Test
    public void testGetEmpByEmpIdOld(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        EmpMapper empMapper=sqlSession.getMapper(EmpMapper.class);
        Emp emp=empMapper.getEmpByEmpIdOld(1);
        System.out.println(emp);
        sqlSession.close();
    }
    @Test
    public void testGetEmpByEmpId(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        EmpMapper empMapper=sqlSession.getMapper(EmpMapper.class);
        Emp emp=empMapper.getEmpByEmpId(1);
        System.out.println(emp);
        sqlSession.close();
    }
}
