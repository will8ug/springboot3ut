package me.will.springboot3ut.service;

import me.will.springboot3ut.components.IrrelevantComponent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class NoInterfaceServiceTest {
    @Mock
    private IrrelevantComponent mockedComponent;
    @InjectMocks
    private NoInterfaceService noInterfaceService;

    @Test
    public void testIsPositive_PositiveNumber() {
        assertTrue(noInterfaceService.isPositive(1));
    }

    @Test
    public void testIsPositive_NegativeNumber() {
        assertFalse(noInterfaceService.isPositive(-1));
    }

    @Test
    public void testIsPositive_Zero() {
        assertFalse(noInterfaceService.isPositive(0));
    }

    @Test
    public void testDoSomethingSafely() {
        assertDoesNotThrow(() -> noInterfaceService.doSomethingSafely());
    }
}
