import static org.junit.Assert.*;
import org.junit.*;

public class StudentRecordTest {
    private StudentRecord record;

    @Before
    public void setUp() {
        record = new StudentRecord();
    }

    @Test
    public void testCreateStudent() {
        // Test createStudent method
        Student student = new Student(1, "Alice", 20);
        record.createStudent(student);
        assertNotNull(record.readStudent(1));
    }

    @Test
    public void testReadStudent() {
        // Test readStudent method
        Student student = new Student(2, "Bob", 22);
        record.createStudent(student);
        assertEquals("Bob", record.readStudent(2).getName());
    }

    @Test
    public void testUpdateStudent() {
        // Test updateStudent method
        Student student = new Student(3, "Charlie", 25);
        record.createStudent(student);
        record.updateStudent(3, "David", 30);
        assertEquals("David", record.readStudent(3).getName());
        assertEquals(30, record.readStudent(3).getAge());
    }

    @Test
    public void testDeleteStudent() {
        // Test deleteStudent method
        Student student = new Student(4, "Eve", 28);
        record.createStudent(student);
        record.deleteStudent(4);
        assertNull(record.readStudent(4));
    }
}
