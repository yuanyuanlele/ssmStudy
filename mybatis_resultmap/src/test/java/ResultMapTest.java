import com.le.mybatis.mapper.DeptMapper;
import com.le.mybatis.mapper.EmpMapper;
import com.le.mybatis.pojo.Dept;
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
    @Test
    public void testGetEmpAndDeptByEmpId(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        EmpMapper empMapper=sqlSession.getMapper(EmpMapper.class);
        Emp emp=empMapper.getEmpAndDeptByEmpId(1);
        System.out.println(emp);
        sqlSession.close();
    }
    @Test
    public void testGetEmpAndDeptByStepResultMap(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        EmpMapper empMapper=sqlSession.getMapper(EmpMapper.class);
        Emp emp=empMapper.getEmpAndDeptByStep1(1);
        System.out.println(emp.getEmpname());
        sqlSession.close();
    }
    @Test
    public void testGetDeptAndEmpByDeptId(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        DeptMapper deptMapper=sqlSession.getMapper(DeptMapper.class);
        Dept dept=deptMapper.getDeptAndEmpByDeptId(1);
        System.out.println(dept);
        sqlSession.close();
    }
    @Test
    public void testGetDeptAndEmpByStep(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        DeptMapper deptMapper=sqlSession.getMapper(DeptMapper.class);
        Dept dept=deptMapper.getDeptAndEmpByStep1(1);
        System.out.println(dept);
        sqlSession.close();
    }
}
