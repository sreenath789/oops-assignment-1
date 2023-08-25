package org.example;

import java.util.HashMap;

public class SUV {

    HashMap<String,ServiceCharge> hm;

    public SUV(){
        hm = new HashMap<>();
        hm.put("BS01",new ServiceCharge("Basic servicing",5000));
        hm.put("EF01",new ServiceCharge("Engine Fixing",10000));
        hm.put("CF01",new ServiceCharge("Clutch Fixing",6000));
        hm.put("BF01",new ServiceCharge("Brake Fixing",2500));
        hm.put("GF01",new ServiceCharge("Gear Fixing",8000));
    }
}

//    Service Code Service Hatchback Sedan SUV
//    BS01 Basic Servicing ₹ 2000 ₹ 4000 ₹ 5000
//        EF01 Engine Fixing ₹ 5000 ₹ 8000 ₹ 10000
//        CF01 Clutch Fixing ₹ 2000 ₹ 4000 ₹ 6000
//        BF01 Brake Fixing ₹ 1000 ₹ 1500 ₹ 2500
//        GF01 Gear Fixing ₹ 3000 ₹ 6000 ₹ 8000
