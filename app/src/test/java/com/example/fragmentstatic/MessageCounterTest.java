package com.example.fragmentstatic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MessageCounterTest {
    @Test public void countsCharacters() {
        assertEquals(0, MessageCounter.countCharacters(null));
        assertEquals(0, MessageCounter.countCharacters(""));
        assertEquals(4, MessageCounter.countCharacters("Hola"));
        assertEquals(5, MessageCounter.countCharacters("Hola!"));
    }
}
