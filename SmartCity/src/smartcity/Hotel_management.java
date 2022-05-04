/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcity;

import java.util.Scanner;

/**
 *
 * @author mike
 */
public class Hotel_management extends Object {
 

    int recommendation[];
    
    Hotel hotels[] = new Hotel[100];
    /**
     * 
     */ 
    int i=0;
    public  void main()   {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
         
              
              
              
         
          for(i=0; i<2; i++){
          System.out.print("PLease enter the name of the hotel\n");
         String name=sn.nextLine();
         System.out.print("PLease enter the Town of the hotel\n");
         String town=sn.nextLine();
         System.out.print("PLease enter the price of the hotel\n");
          int price= sn.nextInt();
          System.out.print("PLease enter the evaluation of the hotel\n");
          int eva=sn.nextInt();
          
          Hotel hotel = new Hotel(name,eva,town,price);
           //System.out.print(i);
          hotels[i] = hotel;
          }
          
          for(i=0; i<2; i++){
          hotels[i].display_hotel();
          }
          
    }
          
}
