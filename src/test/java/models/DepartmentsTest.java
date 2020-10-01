package models;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class DepartmentsTest {
    @Test
    public void testDepartments_getCorrectName_String() {
        Departments departments = new Departments("Science","Science fiction", 8);
        assertEquals("Science", departments.getName());
    }

    @Test
    public void testDepartments_getCorrectDescription_String() {
        Departments departments = new Departments("Science","Science fiction", 8);
        assertEquals("Science fiction", departments.getDescription());
    }

    @Test
    public void testDepartments_getCorrectNumberOfEmployees_Int() {
        Departments departments = new Departments("Science","Science fiction", 8);
        assertEquals(8, departments.getNumOfEmployees());
    }

    @Test
    public void testDepartments_UpdatesName_String(){
        Departments departments = new Departments("Science","Science fiction", 8);
        departments.setName("Science");
        assertEquals("Science", departments.getName());
    }

    @Test
    public void testDepartments_UpdatesDescription_String(){
        Departments departments = new Departments("Science","Science fiction", 8);
        departments.setDescription("Science fiction");
        assertEquals("Science fiction", departments.getDescription());
    }

    @Test
    public void testDepartments_UpdatesNumberOfEmployees_Int(){
        Departments departments = new Departments("Science","Science fiction", 8);
        departments.setNumOfEmployees(8);
        assertEquals(8, departments.getNumOfEmployees());
    }


}