/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos;

/**
 *
 * @author hp
 */
public class Dishe {
    private int ID;
    private String name;
    private int quantity;
    private String notes;
    private double price;
        private double totalprice;

    public Dishe(int ID,String name,double price) {
	
	
	this.name=name;
	this.price=price;
}
    public Dishe(String name,double price,int quantity,String notes,double totalprice) {
	
	
	this.name=name;
	this.price=price;
        this.quantity= quantity;
        this.notes=notes;
        this.totalprice=totalprice;
}
 
   public void setprice(double x){
       this.price=x;
   }
   public double getprice( ){
       return this.price;
   }
   public double gettotalprice( ){
       return this.totalprice;
   }
    public void settotalprice(double x){
       this.totalprice=x;
   }
       public void setID( int x){
            this.ID=x;
        }
         public int getID( ){
           return this.ID;
        }
    public void setname( String x){
            this.name=x;
        }
         public String getname( ){
           return this.name;
        }
  
    public void setquantity( int x){
            this.quantity=x;
        }
         public int getquantity( ){
           return this.quantity;
        }
    public void setnotes( String x){
            this.notes=x;
        }
         public String getnotes( ){
           return this.notes;
        }
    
}
