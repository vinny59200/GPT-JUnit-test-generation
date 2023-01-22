package com.example.gpt.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressTest {
    @Test
    public void testAddressFields() {
        Address address = Address.builder()
                                 .street( "123 Main St" )
                                 .city( "Anytown" )
                                 .state( "CA" )
                                 .zip( "12345" )
                                 .country( "USA" )
                                 .build();

        // Test street field
        assertEquals( "123 Main St", address.getStreet() );

        // Test city field
        assertEquals( "Anytown", address.getCity() );

        // Test state field
        assertEquals( "CA", address.getState() );

        // Test zip field
        assertEquals( "12345", address.getZip() );

        // Test country field
        assertEquals( "USA", address.getCountry() );
    }
}
