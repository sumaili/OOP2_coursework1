/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_2_coursework1;

/**
 *
 * @author Guellord de Jesus
 */
import java.util.Scanner;
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        String name;
        System.out.println("name:");
        name=scan.nextLine();
        Double CSE1,CSE2,CSE3,CSE4,CSE5,SUM,AVG;
        System.out.println("Calculas:");
        CSE1=scan.nextDouble();
        System.out.println("OOP2:");
        CSE2=scan.nextDouble();
        System.out.println("Web Design:");
        CSE3=scan.nextDouble();
        System.out.println("Research Method:");
        CSE4=scan.nextDouble();
        System.out.println("Operating System:");
        CSE5=scan.nextDouble();
        SUM=CSE1+CSE2+CSE3+CSE3+CSE4+CSE5;
        System.out.println("SUM=:+SUM");
        AVG=SUM/5;
        System.out.println("AVERAGE="+AVG);
        if(AVG>=85){
           System.out.println("GRADE=A"); 
        }else{
            if(AVG>=75){
           System.out.println("GRADE=B");
        }else{
                if(AVG>=65){
           System.out.println("GRADE=C");        
        }else{
                 if(AVG>=50){
           System.out.println("GRADE=D");    
        }else{
                if(AVG>=49){
           System.out.println("GRADE=F"); 
                }     
                 }
                 
                }
            }
        }
    }
    
}
