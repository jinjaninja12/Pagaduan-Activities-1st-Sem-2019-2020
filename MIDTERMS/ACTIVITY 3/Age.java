import java.io.*;


public class Age{
	
	public static void main (String [] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		while(true){
			
			
			try{
				System.out.println("Enter your age: ");
				int age = Integer.parseInt(br.readLine());
				
			    if(age >=0 && age <=3 ){
			      System.out.println("You are a baby");
			      break;
			    
			    }
			    else if(age >=4 && age <=12){
			      System.out.println("You are a child");
			      break;
			    
			    }
			    else if(age >=13 && age <=19){
			      System.out.println("You are a teenager");
			      break;
			    
			    }
			     else if(age >=20 && age <=32){
			      System.out.println("You are a young adult");
			      break;
			    
			    }
			     else if(age >=33 && age <=45){
			      System.out.println("you are a middle aged adult");
			      break;
			    
			    }
			     else if(age >=46 && age <=59){
			      System.out.println("You are an adult");
			      break;
			    
			    }
			     else if(age >=60 && age <=122){
			      System.out.println("You are a senior");
			      break;
			    
			    }
			    else{
			    	System.out.println("Invalid Input");
			    }
			   
			    
				
				
			}
			catch(Exception e){
				System.out.println("Invalid Input");
				
			}
		}
		
	}
}
	
