/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PrelimPackage;

/**
 *
 * @author nit221b22
 */
public class Counter {

    private int count;

    
    public void setCount(int count) {
        this.count = count;
    }

    public int getCount(){
        return count;
    }
 


    public int addCount(){
        count++;        
        return this.count;
    }

    public int subtractCount(){
        --count;
        if(count<0){
            count = 0;
            return this.count;
        }
        else{       
        return this.count;
        }
    }

    public int reset(){
        this.count = 0;
        return this.count;
    }

    public void program(){
      
        System.out.println("Add stocks: "+addCount());
         System.out.println("Add stocks: "+addCount());
          System.out.println("Add stocks: "+addCount());
  
        System.out.println("Subtract stocks: "+subtractCount());
        System.out.println("Reset Stocks to zero: "+reset());
        System.out.println("Check Remaining Stocks: "+getCount());
     
    }


}
