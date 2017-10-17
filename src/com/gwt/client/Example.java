package com.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;

/**
 * Created by alex on 14.03.17.
 */
public class Example implements EntryPoint {


    public void onModuleLoad() {

        Button button = new Button("Test Button");

        VerticalPanel panelPrincipal3 = new VerticalPanel();//Esto es el panel central
        panelPrincipal3.setWidth("100%");
        panelPrincipal3.setHeight("100%");
        panelPrincipal3.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        panelPrincipal3.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
        panelPrincipal3.add(button);

        RootPanel.get().add(panelPrincipal3);


        button.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {

                panelPrincipal3.setStyleName("green-background");
            }
        });



    }
}
