package org.example;

import java.util.HashMap;

public class HatchBack {

    HashMap<String,ServiceCharge> hm;

    public HatchBack(){
        hm = new HashMap<>();
        hm.put("BS01",new ServiceCharge("Basic servicing",2000));
        hm.put("EF01",new ServiceCharge("Engine Fixing",5000));
        hm.put("CF01",new ServiceCharge("Clutch Fixing",2000));
        hm.put("BF01",new ServiceCharge("Brake Fixing",1000));
        hm.put("GF01",new ServiceCharge("Gear Fixing",3000));
    }

}


