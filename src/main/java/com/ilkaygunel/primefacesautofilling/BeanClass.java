package com.ilkaygunel.primefacesautofilling;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanClass {

    private List<String> cities;
    private List<String> boroughs;
    private List<String> istanbulBorough;
    private List<String> ankaraBorough;
    private List<String> samsunBorough;
    
    private String selectedCity = "";
    private String selectedBorough = "";

    @PostConstruct
    public void init() {
        cities = new ArrayList<>();
        boroughs = new ArrayList<>();
        istanbulBorough = new ArrayList<>();
        ankaraBorough = new ArrayList<>();
        samsunBorough = new ArrayList<>();
        
        cities.add("istanbul");
        cities.add("ankara");
        cities.add("samsun");

        istanbulBorough.add("şişli");
        istanbulBorough.add("eyüp");
        istanbulBorough.add("beyoğlu");
        istanbulBorough.add("beşiktaş");
        
        ankaraBorough.add("keçiören");
        ankaraBorough.add("mamak");
        ankaraBorough.add("sincan");
        ankaraBorough.add("çinçin");
        
        samsunBorough.add("bafra");
        samsunBorough.add("atakum");
        samsunBorough.add("vezirköprü");
        //samsunBorough.add("havza");
    }

    public List<String> getCities() {
        return cities;
    }
    
    public void fillBoroughList(){
        if(selectedCity.equals("istanbul")){
            boroughs = istanbulBorough;
        }
        else if(selectedCity.equals("ankara")){
            boroughs = ankaraBorough;
        }
        else{
            boroughs = samsunBorough;
        }
    }

    public String getSelectedCity() {
        return selectedCity;
    }

    public void setSelectedCity(String selectedCity) {
        this.selectedCity = selectedCity;
    }

    public List<String> getBoroughs() {
        return boroughs;
    }

    public void setBoroughs(List<String> boroughs) {
        this.boroughs = boroughs;
    }

    public String getSelectedBorough() {
        return selectedBorough;
    }

    public void setSelectedBorough(String selectedBorough) {
        this.selectedBorough = selectedBorough;
    }
}
