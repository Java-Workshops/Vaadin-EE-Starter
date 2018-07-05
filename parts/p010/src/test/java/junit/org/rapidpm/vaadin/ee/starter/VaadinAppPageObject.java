package junit.org.rapidpm.vaadin.ee.starter;

import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.html.testbench.LabelElement;
import org.openqa.selenium.WebDriver;
import org.rapidpm.vaadin.addons.testbench.junit5.pageobject.AbstractVaadinPageObject;

import static java.lang.Integer.valueOf;
import static org.rapidpm.vaadin.ee.starter.VaadinApp.BTN_CLICK_ME;
import static org.rapidpm.vaadin.ee.starter.VaadinApp.LB_CLICK_COUNT;

public class VaadinAppPageObject extends AbstractVaadinPageObject {


  public VaadinAppPageObject(WebDriver webdriver) {
    super(webdriver);
  }

  public ButtonElement btnClickMe() {
    return btn().id(BTN_CLICK_ME);
  }

  public LabelElement lbClickCount() {
    return label().id(LB_CLICK_COUNT);
  }

  public void click() {
    btnClickMe().click();
  }

  public String clickCountAsString() {
    return lbClickCount().getText();
  }

  // no exception handling
  public int clickCount() {
    return valueOf(clickCountAsString());
  }

}
