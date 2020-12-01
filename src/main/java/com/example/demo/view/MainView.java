package com.example.demo.view;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

	public MainView() {
        add(new Text("Welcome to MainView. This is Vaadin with Springboot"));
        add(new Button("OK!"));
	}

}