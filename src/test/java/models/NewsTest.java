package models;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class NewsTest  {
    @Test
    public void testNews_getTitle_String(){
        News news = new News("Science","aliens", 7);
        assertEquals("Science",news.getTitle());
    }

    @Test
    public void testNews_getContent_String(){
        News news = new News("Science","aliens", 7);
        assertEquals("aliens",news.getContent());
    }

    @Test
    public void testNews_getDepartmentId_Int(){
        News news = new News("Science","aliens", 7);
        assertEquals(1,news.getId());
    }

    @Test
    public void setNewTitle_String(){
        News news = new News("Science","aliens",7);
        news.setTitle("science");
        assertEquals("science", news.getTitle());
    }

    @Test
    public void setNewContent_String(){
        News news = new News("Science","aliens", 7);
        news.setContent("science");
        assertEquals("science", news.getContent());
    }

    @Test
    public void setNewId_Int(){
        News news = new News("Science","aliens", 7);
        news.setId(7);
        assertEquals(7, news.getId());
    }

    @Test
    public void setNewDepartmentId_Int(){
        News news = new News("Science","aliens", 7);
        news.setDepartmentId(7);
        assertEquals(7, news.getDepartmentId());
    }
}