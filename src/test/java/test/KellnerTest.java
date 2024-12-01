package test;

import org.junit.jupiter.api.Test;

import vorlage.Kellner;
import vorlage.Kunde;

import static org.junit.jupiter.api.Assertions.*;

public class KellnerTest {

    @Test
    public void testKellnerConstructor() throws Exception {
        Kellner kellner = new Kellner("Anna Schmidt", 101);
        assertEquals("Anna Schmidt", kellner.getName());
        assertEquals(101, kellner.getmitarbeiterID());
    }

    @Test
    public void testSetName() throws Exception {
        Kellner kellner = new Kellner("Anna Schmidt", 101);
        kellner.setName("Peter Müller");
        assertEquals("Peter Müller", kellner.getName());
    }

    @Test
    public void testSetKellnerID() throws Exception {
        Kellner kellner = new Kellner("Anna Schmidt", 101);
        kellner.setID(102);
        assertEquals(102, kellner.getmitarbeiterID());
    }
    @Test
    public void testNamensgebung() throws Exception {
        
        
        Exception exception = assertThrows(Exception.class, () -> {
        	Kellner kellner = new Kellner("bob", 555);// Try to create a Person with an invalid name
        });

        // Verify the exception message
        assertEquals("Der name ist zu kurz bitte langen namen verwenden", exception.getMessage());
    }
}

