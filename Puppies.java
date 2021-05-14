// 
public class Puppies
{
    String name;
    int age;
    private static String[] args;
    public Puppies(String name){
        System.out.println("Passed name of the puppy is " + name );

}

public static void main(String[] args)
{
    Puppies.args = args;
    Puppies Sample_Puppy = new Puppies("jimmy");
    Puppies sample2puppy = new Puppies("Brownny");
}
}