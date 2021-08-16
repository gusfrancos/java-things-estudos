package br.com.estudos.HExcecoes;

/**You need to know the following points regarding try-with-resources statement for the exam:
The resource class must implement java.lang.AutoCloseable interface. Many standard JDK classes such as implement java.io.Closeable interface, which extends java.lang.AutoCloseable. 
AutoCloseable has only one method - public void close() throws Exception.
Resources are closed at the end of the try block and before any catch or finally block.
Resources are not even accessible in the catch or finally block. For example:
try(Device d = new Device())
{
   d.read();
}finally{
   d.close(); //This will not compile because d is not accessible here.
}

Note that the try-with-resource was enhanced in Java 9 and it now allows you to use a variable declared before the try statement in the try-with-resource block. In this case, of course, the variable is accessible after the try block but the object referred to by it has been closed. For example, the following is valid since Java 9:
Device d = new Device();
try(d){ //valid since Java 9
  ...
}finally{
   d.close(); //this will compile but may not work correctly because the object referred to by d has already been closed.
}
Resources are closed in the reverse order of their creation.
Resources are closed even if the code in the try block throws an exception.
java.lang.AutoCloseable's close() throws Exception but java.io.Closeable's close() throws IOException.
If code in try block throws exception and an exception also thrown while closing is resource, the exception thrown while closing the resource is suppressed. The caller gets the exception thrown in the try block.
*/
public class Things {

}
