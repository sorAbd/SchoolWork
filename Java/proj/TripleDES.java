/**
 * Class: TripleDes
 */
package proj;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.GCMParameterSpec;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.util.Base64;

/**
 * Class is used to encrypt a file using 3DES
 * 
 * @author Soroush Abdollahi
 */
public class TripleDES {
	
	/**
	 * encrypt a file using 3DES
	 *  
	 * @param inputFile - string for the input file
	 * @param outputFile - string for the output file
	 * @param key - key used to encrypted
	 * 
	 * source: https://codepal.ai/code-generator/query/FMxtAKC9/java-code-encrypt-decrypt-file-3des
	 */
	public static void encryptFile(String inputFile, String outputFile, String key) throws IOException {
	        try {
	            // Read the input file
	            byte[] inputBytes = Files.readAllBytes(Paths.get(inputFile));
	 
	            // Generate the encryption key
	            KeySpec keySpec = new DESedeKeySpec(key.getBytes());
	            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DESede");
	            SecretKey secretKey = keyFactory.generateSecret(keySpec);
	 
	            // Initialize the cipher with the encryption mode and the key
	            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
	            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
	 
	            // Encrypt the input file
	            byte[] encryptedBytes = cipher.doFinal(inputBytes);
	 
	            // Write the encrypted bytes to the output file
	            try (OutputStream outputStream = new FileOutputStream(outputFile)) {
	                outputStream.write(encryptedBytes);
	            }
	        } catch (Exception e) {
	            throw new IOException("Error encrypting the file: " + e.getMessage());
	        }
	    }
	
	/**
	 * perform the encryption
	 * @param input - file that is to be encrypted 
	 * @param output - output file where cipher text is placed
	 * @param key - key for the encryption
	 */
	 public static void doEncrypt(String input, String output, String key) {
	        try {
	            // Encrypt the input file
	            encryptFile(input, output, key);
	           // System.out.println("File encrypted successfully.");
	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
}
