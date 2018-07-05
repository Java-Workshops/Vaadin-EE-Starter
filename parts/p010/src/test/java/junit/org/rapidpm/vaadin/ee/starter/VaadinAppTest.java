package junit.org.rapidpm.vaadin.ee.starter;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.rapidpm.vaadin.addons.testbench.junit5.extension.unitest.WebUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@WebUnitTest
public class VaadinAppTest {

  @Test
  @DisplayName("Hello World - Click once")
  @Disabled("classloader challenges with Atmosphere")
  void test001(VaadinAppPageObject pageObject) {
    pageObject.loadPage();
    assertEquals(0, pageObject.clickCount());
    pageObject.click();
    pageObject.click(); // logical BUG so far
    assertEquals(1, pageObject.clickCount());
  }
}
