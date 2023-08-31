<h1 align = "center"> Car service station </h1>

### Languages used :
#### Java

### Project Description : 
#### The car service station caters to different types of cars – Hatchback, Sedan, SUV.
#### It provides different types of services like Basic Service, Engine Fixing, Clutch Fixing, Gear Fixing and Brake Fixing.
#### Each service has a service code associated with it and different prices for different types of cars.

### Data Model 
The Job data model is defined in the Job class, which has the following attributes:
<br>

* HatchBack
```
HashMap<String,ServiceCharge> hm;
public HatchBack(){
   hm = new HashMap<>();
   hm.put("BS01",new ServiceCharge("Basic servicing",2000));
   hm.put("EF01",new ServiceCharge("Engine Fixing",5000));
   hm.put("CF01",new ServiceCharge("Clutch Fixing",2000));
   hm.put("BF01",new ServiceCharge("Brake Fixing",1000));
   hm.put("GF01",new ServiceCharge("Gear Fixing",3000));
}
   
```

* Sedan
```
HashMap<String,ServiceCharge> hm;
public Sedan(){
    hm = new HashMap<>();
    hm.put("BS01",new ServiceCharge("Basic servicing",4000));
    hm.put("EF01",new ServiceCharge("Engine Fixing",8000));
    hm.put("CF01",new ServiceCharge("Clutch Fixing",4000));
    hm.put("BF01",new ServiceCharge("Brake Fixing",1500));
    hm.put("GF01",new ServiceCharge("Gear Fixing",6000));
}
   
```

* SUV
```
HashMap<String,ServiceCharge> hm;
public SUV(){
    hm = new HashMap<>();
    hm.put("BS01",new ServiceCharge("Basic servicing",5000));
    hm.put("EF01",new ServiceCharge("Engine Fixing",10000));
    hm.put("CF01",new ServiceCharge("Clutch Fixing",6000));
    hm.put("BF01",new ServiceCharge("Brake Fixing",2500));
    hm.put("GF01",new ServiceCharge("Gear Fixing",8000));
}
   
```

* Main
```
switch(carType) { //matches one will call function
      case "HatchBack" -> carHatchBack();
      case "Sedan" -> carSedan();
      case "SUV" -> carSUV();
      default -> System.out.println("We don't have service for thar car!!!!");
}

carHatchBack() : it will print the cartype of hatchback and service amount for the bill.
carSedan() : it will print the cartype of sedan and service amount for the bill.
carSUV() : it will print the cartype of suv and service amount for the bill.

```





#### The software generate a detailed bill with the total amount for each service request based on the Type of Car specified and the requested Service Codes.

### Sample output of the code 

##### Type of Car – Hatchback
##### Service Codes – BS01, EF01
##### Charges for Basic Servicing – ₹ 2000
##### Charges for Engine Fixing – ₹ 5000
##### Total Bill – ₹ 7000
##### A Complimentary gift provided for billing more than 10000 , SAVE10 save upto 10% offer next time.

![Screenshot (41)](https://github.com/sreenath789/oops-assignment-1/assets/88339640/5c6ce910-0af5-415e-952f-f71adb5e26fe)



