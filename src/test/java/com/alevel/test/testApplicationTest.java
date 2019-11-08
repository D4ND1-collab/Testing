package com.alevel.test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testApplicationTest {
 private   testApplication testApplicationInstance;
@Before 
public void before(){
    System.out.println("Before running ");
   testApplicationInstance = new testApplication();
}
    @Test
    public void SumTest(){
    int a= 2;
    int b = 2;
    int c = 4;
    int result = testApplicationInstance.sum(a, b);
    assertEquals(c , result);
}
}