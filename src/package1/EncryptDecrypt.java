package package1;


import java.security.KeyPair;
import java.security.KeyPairGenerator;


import java.security.PublicKey;
import java.util.Scanner;

import javax.crypto.Cipher;


public class EncryptDecrypt {
public static void main(String[] args) throws Exception{	

     
     //Creating KeyPair generator object
     KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
     System.out.println(keyPairGen.getAlgorithm());
     //Initializing the key pair generator
     keyPairGen.initialize(1024);
     
     //Generate the pair of keys
     KeyPair pair = keyPairGen.generateKeyPair();   
     
     //Getting the public key from the key pair
     PublicKey publicKey = pair.getPublic();


     //Creating a Cipher object
     Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding");


     //Initializing a Cipher object
     cipher.init(Cipher.ENCRYPT_MODE, publicKey);

	  
     //Add data to the cipher
     Scanner scanner=new Scanner(System.in);
     System.out.println("please enter data to be encrypted");
     String lineString=scanner.nextLine();
     byte[] input = lineString.getBytes();	 
     System.out.println("input data in bytes : "+input);
     cipher.update(input);
//    
	  
     //encrypting the data
     byte[] cipherText = cipher.doFinal();	 
     System.out.println( new String(cipherText, "UTF8"));

     

     //Initializing the same cipher for decryption
     cipher.init(Cipher.DECRYPT_MODE, pair.getPrivate());

     
     //Decrypting the text
     byte[] decipheredText = cipher.doFinal(cipherText);
     System.out.println("decrypted data: "+new String(decipheredText));

}
}
