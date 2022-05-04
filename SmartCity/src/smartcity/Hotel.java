/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcity;

/**
 *
 * @author mike
 */
public class Hotel {
    public String hotel_name;
    public int evaluation;
    public String town;
    public double price;
     
    
      Hotel(String hotel_name, int evaluation,  String town, double price){
        this.hotel_name = hotel_name;
        this.evaluation = evaluation;
        this.town = town;
        this.price = price;
        
    } 

   
    
    public void add_evaluation(){
        evaluation ++;   
    }
    
    public void display_hotel(){
        System.out.println(hotel_name);
        System.out.println(town);
        System.out.println(evaluation);
        System.out.println(price);
    }
}
