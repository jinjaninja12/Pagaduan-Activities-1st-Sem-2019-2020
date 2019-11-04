public class CC2_Lab3{
  
  
  public static void main (String [] args){
  
    
    char firstLetter = 'J'
     ,secondLetter = 'O'
     ,thirdLetter = 'H'
     ,fourthLetter = 'N'
     ,exclamation = '!';
    
    int firstNumber = (int)firstLetter;
    int secondNumber = (int)secondLetter;
    int thirdNumber = (int)thirdLetter;
    int fourthNumber = (int)fourthLetter;
    int exclamationNumber = (int)exclamation;
    
    int sum = firstNumber + secondNumber + thirdNumber + fourthNumber + exclamationNumber;
    int product = firstNumber * secondNumber * thirdNumber * fourthNumber * exclamationNumber;
    int average = (firstNumber + secondNumber + thirdNumber + fourthNumber) / 4;
    int remainder = product % average;
    
    
    
    System.out.println(firstLetter + " - " + firstNumber + "\n" + 
                       secondLetter + " - " + secondNumber + "\n" +  
                       thirdLetter + " - " + thirdNumber + "\n" +
                       fourthLetter + " - " + fourthNumber + "\n" + 
                       exclamation + " - " + exclamationNumber+"\n"+
                       firstLetter + secondLetter + thirdLetter + fourthLetter +exclamation );
    
    System.out.println("Sum: " + sum + "\n" + 
                       "Product: " + product + "\n" +
                       "Average: " + average + "\n" + 
                       "Remainder: " + remainder) ;
                   
                       
                      
    
    
    
    
    
    
  } 
}

