package catolica.mini.curso.jenkins.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceTest {
    private CalculadoraService calculadoraService;

    @BeforeEach
    public void init(){
        calculadoraService = new CalculadoraService();
    }

    @Test
    public void deveriaRetornarUmaMensagem(){
        String hello = "Bem vindo ao curso de Jenkins!";
        Assertions.assertEquals(hello, calculadoraService.hello());
    }
    @Test
    public void deveriaSomarDoisValores(){
        int a = 2;
        int b = 2;
        int result = 4;
        Assertions.assertEquals(result, calculadoraService.somar(a, b));
    }

    @Test
    public void deveriaSubtrairDoisValores(){
        int a = 8;
        int b = 2;
        int result = 6;
        Assertions.assertEquals(result, calculadoraService.subtrair(a, b));
    }
}
