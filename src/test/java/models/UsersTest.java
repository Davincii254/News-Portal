package models;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UsersTest {
    @Test
    public void testEquals_ReturnBothInstancesTrue() {
        Users users = new Users("john","manager","drifter",1);
        Users users1 = new Users("john","manager","drifter",1);
        assertEquals(users, users1);
    }

    @Test
    public void getName_savesNameCorrectly() {
        Users users = new Users("john","manager","drifter",1);
        assertEquals("john", users.getName());
    }

    @Test
    public void setName_changesNameSuccessfully() {
        Users users = new Users("john","manager","drifter",1);
        users.setName("john");
        assertEquals("john", users.getName());
    }

    @Test
    public void getPosition_returnsPositionCorrectly() {
        Users users = new Users("john","manager","drifter",1);
        assertEquals("manager", users.getPosition());
    }

    @Test
    public void setPosition_changesPosition() {
        Users users = new Users("john","manager","drifter",1);
        users.setPosition("drifter");
        assertEquals("drifter", users.getPosition());
    }

    @Test
    public void getRole_returnsRoleSuccessfully() {
        Users users = new Users("john","manager","drifter",1);
        assertEquals("drifter", users.getRole());
    }

    @Test
    public void setRole_changesRoleSuccessfully() {
        Users users = new Users("john","manager","drifter",1);
        users.setRole("drifter");
        assertEquals("drifter", users.getRole());
    }

    @Test
    public void getDepartmentId_returnsDepartmentId() {
        Users users = new Users("john","manager","drifter",1);
        assertEquals(1, users.getDepartmentId());
    }

    @Test
    public void setDepartmentId_changesDepartmentID() {
        Users users = new Users("john","manager","drifter",1);
        users.setDepartmentId(2);
        assertEquals(2, users.getDepartmentId());
    }
}




