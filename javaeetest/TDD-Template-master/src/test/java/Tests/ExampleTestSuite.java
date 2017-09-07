package Tests;

import ExamplePackage.ExampleClass;

import static org.junit.Assert.*;

import org.junit.*;


public class ExampleTestSuite {

    @BeforeClass
    public static void beforeClass() {
    }

    @Before
    public void beforeTest() {

    }

    @Test
    public void createBook(){
        ExampleClass ec = new ExampleClass();

        Assert.assertEquals(ec.TestMe(), "TestMe");
    }
    
    @Test
    public void searchBook(){
        fail("not implemented yet");
    }
    
   
    
   

    @After
    public void afterTest() {
    }

    @AfterClass
    public static void afterClass() {

    }

}

