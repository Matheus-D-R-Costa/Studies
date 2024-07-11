package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Named;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionsTest {

    @Test
    @EnabledOnJre(JRE.JAVA_8) // false
    @EnabledOnOs(OS.MAC) // false
    @EnabledIfEnvironmentVariable(named = "USER", matches = "TTEU") //true
    void ValidateSomethingIfUserIsNotRoot() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
