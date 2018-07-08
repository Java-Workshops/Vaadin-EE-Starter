package org.rapidpm.vaadin.ee.starter;


import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.rapidpm.dependencies.core.logger.HasLogger;

import static java.lang.String.valueOf;
import static org.rapidpm.vaadin.addons.framework.ComponentIDGenerator.buttonID;
import static org.rapidpm.vaadin.addons.framework.ComponentIDGenerator.spanID;

@Route("")
public class VaadinApp extends Composite<Div> implements HasLogger {

  // read http://vaadin.com/testing for more infos
  public static final String BTN_CLICK_ME     = buttonID().apply(VaadinApp.class, "btn-click-me");
  public static final String SPAN_CLICK_COUNT = spanID().apply(VaadinApp.class, "span-click-count");

  private final Button         btnClickMe     = new Button("click me");
  private final Span           spanClickCount = new Span("0");
  private final VerticalLayout layout         = new VerticalLayout(btnClickMe, spanClickCount);

  private int clickcount = 0;

  public VaadinApp() {
    btnClickMe.setId(BTN_CLICK_ME);
    btnClickMe.addClickListener(event -> spanClickCount.setText(valueOf(++clickcount)));

    spanClickCount.setId(SPAN_CLICK_COUNT);

    //set the main Component
    logger().info("setting now the main ui content..");
    getContent().add(layout);

  }
}
