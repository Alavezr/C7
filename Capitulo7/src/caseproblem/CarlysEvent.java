
package caseproblem;


import java.util.Scanner;


public class CarlysEvent {
    
    private static Scanner scanner = new Scanner(System.in);
    
    
    
    public static String getEventNumber(){
        
        System.out.println("Enter event number: ");
        String eventNumber = scanner.nextLine();
        return eventNumber;
         
    }
    
    public static void EventPrice(int nGuests){
        
               final int Cargo= 35;
        
       
        int total=0;
        boolean largeParty = false;
        total = nGuests*Cargo;
       
        if(nGuests >= 50){
            
            largeParty = true;}
            
            System.out.println("Number of Guests: "+ nGuests);
            System.out.println("Total Price $"+total);
            
            if(largeParty){
                
                System.out.println("Its a large party!");
            }
            else{
                System.out.println("Its not large party");
            }
    }
        
    public static void displayMotto(Event e){
        
        
        
        String carlyMotto = "Carly´s makes the food that makes it a party";
        
        System.out.println("Carly´s Motto");
        System.out.println("****************************" + "******************************");
        System.out.println("*\t"+carlyMotto+"\t *");
        System.out.println("*****************************" + "*****************************");
        System.out.println("Event details");
        System.out.println("Event name: "+e.getEventNumber());
        System.out.println("Number of Guests:"+e.getGuests());
        System.out.println("Price $"+e.getPrice());
    
    
    
    }

    
        public static int getNumberOfGuests(){
            
            Scanner scanner = new Scanner(System.in);
            int nGuests;
            System.out.println("Enter number of guests:");
            nGuests=scanner.nextInt();
            return nGuests;
        }









}