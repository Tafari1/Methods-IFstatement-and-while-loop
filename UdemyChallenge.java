/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemychallenge;

/**
 *
 * @author TafAl
 */
public class UdemyChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // System.out.println(isEvenNumber(1));
        
        int number = 4;
        int FinishedNumber = 20;
        int count = 0;
        
        while(number <= FinishedNumber){
            number++;
        if(!isEvenNumber(number)){
            continue;
        }
         System.out.println("even number " + number);
            count++;
            if(count>=5){
                 break;
            }
               
       
        System.out.println("even numbers found " + count);
            
    }
        
    }
    public static boolean isEvenNumber(int number){
        if(number%2== 0){
            return true;
        }else{
            
        } return false;
    
    
}
}
