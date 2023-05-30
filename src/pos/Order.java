/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos;

/**
 *
 * @author hp
 */
public class Order {
    private String name;
    private double price;

    public Order(String name,double price) {
	
	
	this.name=name;
	this.price=price;
}
    
 
   public void setprice(double x){
       this.price=x;
   }
   public double getprice( ){
       return this.price;
   }
   
    public void setname( String x){
            this.name=x;
        }
         public String getname( ){
           return this.name;
        }
  
    
    
}
