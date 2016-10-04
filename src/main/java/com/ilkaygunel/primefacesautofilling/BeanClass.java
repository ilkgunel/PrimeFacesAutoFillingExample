package com.ilkaygunel.primefacesautofilling;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanClass {
    private List<String> cities;
    private List<String> borough;
    
    private BeanClass(){
        cities = new ArrayList<>();
        cities.add("istanbul");
        cities.add("ankara");
        cities.add("samsun");
        borough = new ArrayList<>();
    }

    public List<String> getBorough() {
        return borough;
    }

    public void setBorough(List<String> borough) {
        this.borough = borough;
    }
    
    
}
