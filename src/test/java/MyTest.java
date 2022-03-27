import cn.wujitao.domain.Student;
import cn.wujitao.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void Test01(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = (StudentService) ctx.getBean("studentService");
        Student student = new Student();
        student.setAge(18);
        student.setName("Wu Jitao");
        studentService.addStudent(student);

    }
}
