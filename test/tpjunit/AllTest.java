/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package tpjunit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 *
 * @author axm
 */
@RunWith(Suite.class)
@SuiteClasses(value = { MoneyTest.class, MoneyBagTest.class })
public class AllTest {
    
    public AllTest() {
    }
}
