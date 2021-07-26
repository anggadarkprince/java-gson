package com.anggaari.mapping.arraylists.restaurant;

import java.util.List;

public class GeneralInfo {
    public String name;
    public String website;
    public List<Founder> founders;

    public GeneralInfo(String name, String website, List<Founder> founders) {
        this.name = name;
        this.website = website;
        this.founders = founders;
    }
}
