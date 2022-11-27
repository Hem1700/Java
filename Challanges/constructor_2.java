import java.lang.*;
import java.util.*;


class Product{

    private String itemno;
    private String name;
    private double price;
    private int qty;


    public Product(String itemno){

        itemno = itemno;    
    }

    public Product(String itemno , String name){
        itemno = itemno;
        this.name = name;
    }
    public Product(String itemno,String name,double price,short qty)
    {
        itemno=itemno;
        this.name=name;
        setPrice(price);
        setQty(qty);
    }

    public String getItemNo(){
        return itemno;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }

    public void setPrice(double p){
        if(p>=0){
            price = p;
        }
        else{
            price = 0;
        }
    }

    public void setQty(int q){
        if(q>=0){
            qty = q;
    }
    else{
        qty  = 0;

    }
}




}


class Customer{
    private String custId;
    private String name;
    private String address;
    private String phno;
    
    public Customer(String custId,String name)
    {
        this.custId=custId;
        this.address=name;
    }
    public Customer(String custId,String name,String address,String phno)
    {
        this.custId=custId;
        this.address=name;
        setAddress(address);
        setPhno(phno);
    }
    
    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}
    
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }

}




   
    




public class constructor_2 {

    public static void main(String args[]){

        
    }
    
}
