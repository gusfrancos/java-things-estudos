package br.com.estudos._009_.strings;

public class CharAtTest {

	public static void main(String[] args) {
		System.out.println("12345".charAt(6));

	}

}

//Resultado: It will throw an IndexOutOfBoundsException
//Since indexing starts with 0, the maximum value that you can pass to charAt is length-1.
//As per the API documentation for charAt, it throws IndexOutOfBoundsException if you pass an invalid value (that is, if the index argument is negative or not less than the length of this string).
//Both - ArrayIndexOutOfBoundsException and StringIndexOutOfBoundsException, extend IndexOutOfBoundsException and although in practice, the charAt method throws StringIndexOutOfBoundsException, it is not a valid option because the implementation is free to throw some other exception as long as it is an IndexOutOfBoundsException.