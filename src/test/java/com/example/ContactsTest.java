package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactsTest {

    @Test
    void getPassNumber() {
        Contacts contacts = new Contacts("Anna", "Karenina", "8A804730");
        assertEquals("8A804730", contacts.getPassNumber());
    }
    
}