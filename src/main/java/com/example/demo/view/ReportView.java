package com.example.demo.view;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("report")
public class ReportView extends VerticalLayout{
    public ReportView(){
        add(new Text("this is text from report"));
    }     
}
