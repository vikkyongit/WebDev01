//import org.graalvm.compiler.asm.aarch64.AArch64Assembler.SystemHint;

public class Dog {
    int dogAge;
    String dogname;
    public  void dog(String dogname){
        System.out.println("dog name passed is :" + dogname);

    }
    
    public void initAge( int dogage){
        dogAge=dogage;

    }
    public int getDogAge(){
        System.out.println(" Dogs present age is " +dogAge);
        return dogAge;
    }

    public static void main (String[] args){
        Dog coco = new dog("jimmi");
        coco.initAge(5);
        coco.getDogAge();
        System.out.println(" variable dogAge value is " + coco.dogAge);
    }
}
