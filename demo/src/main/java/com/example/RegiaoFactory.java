package com.example;

import java.util.HashMap;
import java.util.Map;

public class RegiaoFactory {
    private static Map<String, Regiao> regions = new HashMap<>();

    public static Regiao getRegion(String name, String color) {
        Regiao region = regions.get(name);
        if(region == null){
            region = new Regiao(name, color);
            regions.put(name, region);
        }
        return region;
    }

    public static int getTotalRegions(){
        return regions.size();
    }
}