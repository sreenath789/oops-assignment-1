package org.example;

import java.util.HashMap;

public class Sedan {

    HashMap<String,ServiceCharge> hm;

    public Sedan(){
        hm = new HashMap<>();
        hm.put("BS01",new ServiceCharge("Basic servicing",4000));
        hm.put("EF01",new ServiceCharge("Engine Fixing",8000));
        hm.put("CF01",new ServiceCharge("Clutch Fixing",4000));
        hm.put("BF01",new ServiceCharge("Brake Fixing",1500));
        hm.put("GF01",new ServiceCharge("Gear Fixing",6000));
    }
}

