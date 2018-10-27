package com.cobertura.unit;

import static junit.framework.Assert.assertFalse;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;


import org.junit.Before;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    //создаем объект baos из класса - import java.io.ByteArrayOutputStream
    private ByteArrayOutputStream baos = new ByteArrayOutputStream();
    //присваиваем новый объект классу отображения инфо - import java.io.PrintStream;
    private PrintStream PrintHerhu = new PrintStream(baos);

    //preporation
    @Before
    public void setup() {
        System.setOut(PrintHerhu);
    }

    //Требования к тестам: быстрота выполнения, время выполнения теста не должно учитывать пре\пост условия,
    //тесты должны быть простыми в понимании, не должны возникать случайные ошибки выполнения, из trace'a должна быть понятна причина ошибки.
    @Test
    public void shouldPrintTimeToConsole() {
        App.main(new String[] { });

        assertThat(output(), containsString("The current local time is:"));
    }

    @Test
    public void shouldPrintHelloWorldToConsole() {
        App.main(new String[] { });

        assertThat(output(), containsString("Hello world!"));
    }

    @Test
    public void Сложение(){
        Addition additions = new Addition();
        assertEquals(1000000000, additions.calculate(999999999,1));
    }

    @Test
    public void Деление(){
        Division divisions = new Division();
        assertEquals(10000000, divisions.calculate(1000000000,100));
    }

    @Test
    public void testAssertions() {
        //test data
        String str1 = new String ("abc");
        String str2 = new String ("abc");
        String str3 = null;
        String str4 = "abc";
        String str5 = "abc";

        int val1 = 5;
        int val2 = 6;

        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray =  {"one", "two", "three"};

        //Check that two objects are equal
        assertEquals(str1, str2);

        //Check that a condition is true
        assertTrue (val1 < val2);

        //Check that a condition is false
        assertFalse(val1 > val2);

        //Check that an object isn't null
        assertNotNull(str1);

        //Check that an object is null
        assertNull(str3);

        //Check if two object references point to the same object
        assertSame(str4,str5);

        //Check if two object references not point to the same object
        assertNotSame(str1,str3);

        //Check whether two arrays are equal to each other.
        assertArrayEquals(expectedArray, resultArray);
    }

    private String output() {
        return new String(baos.toByteArray(), StandardCharsets.UTF_8);
    }
}
