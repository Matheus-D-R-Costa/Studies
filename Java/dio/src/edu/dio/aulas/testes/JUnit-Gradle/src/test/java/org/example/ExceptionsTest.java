package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validateTransfer() {
        Account kylian = new Account();
        Account joe = new Account();
        kylian.deposit(50d);
        Assertions.assertDoesNotThrow(() -> kylian.transfer(kylian, joe, 25));
    }
    
}
