/**
 * Class: Encryption
 */
package proj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;

/**
 * Class is used to encrypt a file using AES
 * 
 * 
 * @author Soroush Abdollahi
 */
public class AES{
	
	/**
	 * Method generates a secret key that is based off a random number
	 * 
	 * @param n - number of bits in the key
	 * @return - a secret key
	 * 
	 * source: https://www.baeldung.com/java-aes-encryption-decryption
	 */
	public static SecretKey generateKey(int n) throws NoSuchAlgorithmException {
	    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
	    keyGenerator.init(n);
	    SecretKey key = keyGenerator.generateKey();
	    return key;
	}
	
	/**
	 * Creates an initialization vector for AES
	 * 
	 * @return - an initialization vector for AES
	 * 
	 * source: https://www.baeldung.com/java-aes-encryption-decryption
	 */
	public static GCMParameterSpec generateIv() {
	    byte[] iv = new byte[12];
	    new SecureRandom().nextBytes(iv);
	    return new GCMParameterSpec(128, iv);
	}
	
	/**
	 * Method is used to encrypt a file
	 * 
	 * @param algorithm - algorithm used to 
	 * @param key - secret key used to encrypt file
	 * @param iv - initialization vector
	 * @param inputFile - input file that is read
	 * @param outputFile - output that is written to
	 * 
	 * source: https://www.baeldung.com/java-aes-encryption-decryption
	 */
	public static void encryptFile(String algorithm, SecretKey key, GCMParameterSpec iv,
		    File inputFile, File outputFile) throws IOException, NoSuchPaddingException,
		    NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException,
		    BadPaddingException, IllegalBlockSizeException {
		    
			// Create cipher
		    Cipher cipher = Cipher.getInstance(algorithm);
		    cipher.init(Cipher.ENCRYPT_MODE, key, iv);
		    FileInputStream inputStream = new FileInputStream(inputFile);
		    FileOutputStream outputStream = new FileOutputStream(outputFile);
		    
		    // Set buffer
		    byte[] buffer = new byte[64];
		    int bytesRead;
		    while ((bytesRead = inputStream.read(buffer)) != -1) {
		        byte[] output = cipher.update(buffer, 0, bytesRead);
		        if (output != null) {
		            outputStream.write(output);
		        }
		    }
		    byte[] outputBytes = cipher.doFinal();
		    if (outputBytes != null) {
		        outputStream.write(outputBytes);
		    }
		    // Close the streams
		    inputStream.close();
		    outputStream.close();
		}
	

	/**
	 * converts the values to files, generates a key, sets initialization vector and SCMParameterSpec
	 * calls the methods to the encrypt the file
	 * 
	 * @param input - string for the input file location
	 * @param output - string for the output file location
	 * 
	 * Source: source: https://www.baeldung.com/java-aes-encryption-decryption
	 */
	public static void doEncrypt(String input, String output) {
        try {
        	
        	//Set strings to files
        	File inputFile = new File (input);
        	File outputFile = new File (output);
            
        	//Generate 128 secret key
            SecretKey key = AES.generateKey(128);

            // Generate initialization vector and GCMParameterSpec (for AES/GCM/NoPadding)
            GCMParameterSpec spec = generateIv();

            // Encrypt the file
            encryptFile("AES/GCM/NoPadding", key, spec, inputFile, outputFile);
            
            
            //System.out.println("Encryption successful. Output written to: " + outputFile.getAbsolutePath());

        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
		//doEncrypt("C:\\Users\\Soroush Abdollahi\\ait-512-2025-fall\\AIT512\\src\\proj\\AES_files\\test.txt","C:\\Users\\Soroush Abdollahi\\ait-512-2025-fall\\AIT512\\src\\proj\\AES_files\\Encrypted.txt");
	}
}
