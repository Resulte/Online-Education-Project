package cn.resulte.excel;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
//        String filePath = "D:/student.xlsx";
//        EasyExcel.write(filePath,Student.class).sheet("学生列表").doWrite(getList());
        String filePath = "D:/student.xlsx";
        EasyExcel.read(filePath,Student.class,new ExcelListener()).sheet().doRead();
    }

    private static List<Student> getList() {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setSno(i);
            student.setSname("Lily"+i);
            students.add(student);
        }
        return students;
    }
}
