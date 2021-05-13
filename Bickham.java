// Dummy class for FinalProject
// Outputs a simple message when implementing begin()

public class Bickham implements FinalProject
{
    public FinalProj()
    {

    }

    public void begin()
    {

    int = 0;
    int theCount = 0;
    int an = 0;
    int a = 0;
    int Elizabeth = 0;
    int Jane = 0;
    int Mary = 0;
    int Catherine = 0;
    int Lydia = 0;
    
    
    File file = new File("C:\\Users\\User\\Desktop\\prideandprejudice.txt");   
    Scanner scan = new Scanner(file);
    

        while(scan.hasNext()){
        String word = scan.next();
        scan.useDelimiter("[^A-Za-z]+");
            
            if(scan.hasNextLine()) {
            scan.nextLine();
            count++;
            }
            if(word.equalsIgnoreCase("the")){
            theCount++;
            }
            if(word.equalsIgnoreCase("an")){
            an++;
            }
            if(word.equalsIgnoreCase("a")){
            a++;
            }
            if(word.equalsIgnoreCase("Elizabeth")){
            Elizabeth++;
            }
            if(word.equalsIgnoreCase("Jane")){
            Jane++;
            }
            if(word.equalsIgnoreCase("Mary")){
            Mary++;
            }
            if(word.equalsIgnoreCase("Catherine")){
            Catherine++;
            }
            if(word.equalsIgnoreCase("Lydia")){
            Lydia++;
            }
    }
    scan.close();

    
    
System.out.println("Number of lines: " + count);
System.out.println("the: " + theCount);
System.out.println("an: " + an);
System.out.println("a: " + a);
System.out.println("Elizabeth: " + Elizabeth);
System.out.println("Jane: " + Jane);
System.out.println("Mary: " + Mary);
System.out.println("Catherine: " + Catherine);
System.out.println("Lydia: " + Lydia);  
}
}
    }
}
