package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //welcome page
        System.out.println("Welcome to car station");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car type : ");

        //enter the car type
        String carType = sc.next();

        switch(carType) { //matches one will call function
            case "HatchBack" -> carHatchBack();
            case "Sedan" -> carSedan();
            case "SUV" -> carSUV();
            default -> System.out.println("We don't have service for thar car!!!!");
        }
    }

    //hatchback car service
    public static void carHatchBack(){

        //creating object for initialising the default values
        HatchBack hatchBack = new HatchBack();

        //getting values and storing in new HashMap
        HashMap<String, ServiceCharge> hm = hatchBack.hm;

        //displaying the services
        System.out.println("We have services like : ");
        for(String key : hm.keySet()){
            System.out.print(key+" ");
        }
        System.out.println();

        //list which will store given input service codes
        ArrayList<String> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean isValid = true;
        while(isValid){
            System.out.println("Enter the code : ");
            String code = sc.next();

            //is service already exists
            if(list.contains(code)){
                System.out.println("Service added already try another one!!!");
            }
            //service doesn't exist in list add it to the list
            else if(hm.containsKey(code)){
                list.add(code);
                while(true){
                    System.out.println("if u want more services please enter 'Y' or 'N' to skip");
                    char ch = sc.next().charAt(0);
                    if(ch=='N'){
                        isValid=false;
                        break;
                    }
                    else if(ch=='Y'){
                        break;
                    }
                    else{
                        System.out.println("Invalid option try 'Y' or 'N'");
                    }
                }

            }
            //invalid code
            else{
                System.out.println("Invalid code !! try again");
            }
        }
        //displaying the bill
        System.out.println("Type of car  :  HatchBack");
        System.out.println("Service codes : "+list);
        int totalBill = 0;
        for(String key : list){
            System.out.println("Charges for "+hm.get(key).serviceName+" - "+hm.get(key).servicePrice);
            totalBill+=hm.get(key).servicePrice;
        }

        if(totalBill >= 10000){
            System.out.println("Total Bill : "+ totalBill);
            System.out.println("A Complimentary gift provided for billing more than 10000 "+"Coupon code : "+"SAVE10 save upto 10% offer next time.");
            System.out.println("Please visit again Thank You!!");
        }
        else{
            System.out.println("Total Bill : "+ totalBill);
            System.out.println("Please visit again Thank You!!");
        }

    }


    //sedan car service
    public static void carSedan(){
        Sedan sedan = new Sedan();
        HashMap<String, ServiceCharge> hm = sedan.hm;
        System.out.println("We have services like : ");
        for(String key : hm.keySet()){
            System.out.print(key+" ");
        }
        System.out.println();
        ArrayList<String> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean isValid = true;
        while(isValid){
            System.out.println("Enter the code : ");
            String code = sc.next();
            if(list.contains(code)){
                System.out.println("Service added already try another one!!!");
            }
            else if(hm.containsKey(code)){
                list.add(code);
                while(true){
                    System.out.println("if u want more services please enter 'Y' or 'N' to skip");
                    char ch = sc.next().charAt(0);
                    if(ch=='N'){
                        isValid=false;
                        break;
                    }
                    else if(ch=='Y'){
                        break;
                    }
                    else{
                        System.out.println("Invalid option try 'Y' or 'N'");
                    }
                }

            }
            else{
                System.out.println("Invalid code !! try again");
            }
        }
        System.out.println("Type of car  :  Sedan");
        System.out.println("Service codes : "+list);
        int totalBill = 0;
        for(String key : list){
            System.out.println("Charges for "+hm.get(key).serviceName+" - "+hm.get(key).servicePrice);
            totalBill+=hm.get(key).servicePrice;
        }

        if(totalBill >= 10000){
            System.out.println("Total Bill : "+ totalBill);
            System.out.println("A Complimentary gift provided for billing more than 10000 "+"Coupon code : "+"SAVE10 save upto 10% offer next time.");
            System.out.println("Please visit again Thank You!!");
        }
        else{
            System.out.println("Total Bill : "+ totalBill);
            System.out.println("Please visit again Thank You!!");
        }

    }

    //SUV car service
    public static void carSUV(){

        SUV suv = new SUV();
        HashMap<String, ServiceCharge> hm = suv.hm;
        System.out.println("We have services like : ");
        for(String key : hm.keySet()){
            System.out.print(key+" ");
        }
        System.out.println();
        ArrayList<String> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean isValid = true;
        while(isValid){
            System.out.println("Enter the code : ");
            String code = sc.next();
            if(list.contains(code)){
                System.out.println("Service added already try another one!!!");
            }
            else if(hm.containsKey(code)){
                list.add(code);
                while(true){
                    System.out.println("if u want more services please enter 'Y' or 'N' to skip");
                    char ch = sc.next().charAt(0);
                    if(ch=='N'){
                        isValid=false;
                        break;
                    }
                    else if(ch=='Y'){
                        break;
                    }
                    else{
                        System.out.println("Invalid option try 'Y' or 'N'");
                    }
                }

            }
            else{
                System.out.println("Invalid code !! try again");
            }
        }
        System.out.println("Type of car  :  SUV");
        System.out.println("Service codes : "+list);
        int totalBill = 0;
        for(String key : list){
            System.out.println("Charges for "+hm.get(key).serviceName+" - "+hm.get(key).servicePrice);
            totalBill+=hm.get(key).servicePrice;
        }

        if(totalBill >= 10000){
            System.out.println("Total Bill : "+ totalBill);
            System.out.println("A Complimentary gift provided for billing more than 10000 "+"Coupon code : "+"SAVE10 save upto 10% offer next time.");
            System.out.println("Please visit again Thank You!!");
        }
        else{
            System.out.println("Total Bill : "+ totalBill);
            System.out.println("Please visit again Thank You!!");
        }

    }
}