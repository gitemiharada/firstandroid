package com.example.firstandroid;

import java.util.ArrayList;
import java.util.List;

public class EmiExpert {
    List<String> getBrands(String spinner) {
        List<String> brands = new ArrayList<>();
        if (spinner.equals("emi0")) {
            brands.add("Japan Emi");
            brands.add("Chapel Hill Emi");
        } else if (spinner.equals("emi1")){
            brands.add("Seattle Emi");
            brands.add("Portland Emi");
        } else {
            brands.add("Jersey City Emi");
            brands.add("New York City Emi");
        }
        return brands;
    }
}
