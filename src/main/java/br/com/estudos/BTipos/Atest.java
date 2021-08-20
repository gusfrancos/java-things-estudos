package br.com.estudos.BTipos;

public class Atest {
    
    String global = "111";
    
    public int parse(String arg){
        var value = 0;
        try{
            String global = arg;            
            value = Integer.parseInt(global);
        }
        catch(Exception e){
            System.out.println(e.getClass());
        }
        System.out.print(global+" "+value+" ");
        return value;
    }
       public static void main(String[] args) {
    	   Atest ct = new Atest();
          System.out.print(ct.parse("333"));
       }
}

//Resultado: 111 333 333
// Observe that a new local variable named global is defined within a try block. It is accessible only within the try block. It also shadows the instance field of the same name global within the try block. It is this variable that is used in parseInt. Therefore, value is set to 333.
//However, when you print global in parse method, the global defined in the try block is out of scope and the instance field named global is used. Therefore, it prints 111.
//There is no exception because 333 can be parsed into an int. If you pass a string that cannot be parsed into an int to the parseInt method, it will throw a java.lang.NumberFormatException.

