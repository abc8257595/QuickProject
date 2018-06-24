package me.moree;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

import javax.crypto.Cipher;
import java.security.*;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * @author MORE-E
 * created on 2018-06-09
 */
public class RsaTest {

	@Test
	public void fromString() throws Exception {
		String privateKeyContent = "MIIBOgIBAAJBALcBZzZweLPVT0jsWvTUqos4VJvvDL0S+/dWt2EalgCAmh3XQtC9+KTCa6sg9LGrD314DFOn6AspV3X3OspsQTcCAwEAAQJAL0/GjjVvjxZzg+fO8ALXAF0Uyqd3hJ4W0+/wQsNryj8ExFljZ1FxZnHm+RuM1BT6yMEjZbzOtPCpi3kJbYsE4QIhAOvlA/PINYayf5rftyvIjd6B+60MhcGQMqPOLrJe6qExAiEAxppmbvquDo7OSPHvO5UAnw8ZX17SbQuhpKZPFZgeLucCIAKJnyZDNBgz2V2QJIdLDAOlwFBXPyUa6QCMGkJ+9OUxAiEAvzS3mfFO0kU65Y/Hu51g08I9s0wfW0zvew2C5k9l/9ECIFR5IEhfFg1WUCn0TQC7MfbZUt9CvY7gmZH0iX8D8Oei";

		String publicKeyContent = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBALcBZzZweLPVT0jsWvTUqos4VJvvDL0S+/dWt2EalgCAmh3XQtC9+KTCa6sg9LGrD314DFOn6AspV3X3OspsQTcCAwEAAQ==";

		KeyFactory kf = KeyFactory.getInstance("RSA");

		X509EncodedKeySpec keySpecX509 = new X509EncodedKeySpec(Base64.decodeBase64(publicKeyContent));
		RSAPublicKey pubKey = (RSAPublicKey) kf.generatePublic(keySpecX509);

		byte[] priKey = Base64.decodeBase64(privateKeyContent);
		PKCS8EncodedKeySpec keySpecPKCS8 = new PKCS8EncodedKeySpec(priKey);
		PrivateKey privateKey = kf.generatePrivate(keySpecPKCS8);

		// encrypt the message
		byte [] encrypted = encrypt(privateKey, "This is a secret message");
		String encode = Base64.encodeBase64String(encrypted);  // <<encrypted message>>
		System.out.println(encode);

		// decrypt the message
		byte[] secret = decrypt(pubKey, Base64.decodeBase64(encode));
		System.out.println(new String(secret));     // This is a secret message
	}

//	public static PublicKey getKey(String key){
//		try{
//			byte[] byteKey = Base64.decode(key.getBytes(), Base64.DEFAULT);
//			X509EncodedKeySpec X509publicKey = new X509EncodedKeySpec(byteKey);
//			KeyFactory kf = KeyFactory.getInstance("RSA");
//
//			return kf.generatePublic(X509publicKey);
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//
//		return null;
//	}
//
//
//	private static String signature(String str, String key) throws Exception {
//		byte[] keyBytes;
//		String strKey = key.replaceAll("(-+BEGIN RSA PRIVATE KEY-+\\r?\\n|-+END RSA PRIVATE KEY-+\\r?\\n?)", "");
//		keyBytes = Base64.getDecoder().decode(strKey.getBytes());
//		RSAPrivateCrtKeySpec keySpec = getRSAKeySpec(keyBytes);
//		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
//		PrivateKey privatekey = keyFactory.generatePrivate(keySpec);
//		Signature signature = Signature.getInstance("SHA1withRSA");
//		signature.initSign(privatekey);
//		signature.update(str.getBytes());
//		return Base64.getEncoder().encodeToString(signature.sign());
//	}

	public static void main(String [] args) throws Exception {
		// generate public and private keys
		KeyPair keyPair = buildKeyPair();
		PublicKey pubKey = keyPair.getPublic();
		PrivateKey privateKey = keyPair.getPrivate();

		// encrypt the message
		byte [] encrypted = encrypt(privateKey, "This is a secret message");
		String encode = Base64.encodeBase64String(encrypted);  // <<encrypted message>>
		System.out.println(encode);

		// decrypt the message
		byte[] secret = decrypt(pubKey, Base64.decodeBase64(encode));
		System.out.println(new String(secret));     // This is a secret message

		encrypted = encrypt(pubKey, "This is a secret message");
		encode = Base64.encodeBase64String(encrypted);  // <<encrypted message>>
		System.out.println(encode);

		// decrypt the message
		secret = decrypt(privateKey, Base64.decodeBase64(encode));
		System.out.println(new String(secret));     // This is a secret message
	}

	public static KeyPair buildKeyPair() throws NoSuchAlgorithmException {
		final int keySize = 512;
		KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
		keyPairGenerator.initialize(keySize);
		return keyPairGenerator.genKeyPair();
	}

	public static byte[] encrypt(Key privateKey, String message) throws Exception {
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, privateKey);

		return cipher.doFinal(message.getBytes());
	}

	public static byte[] decrypt(Key publicKey, byte [] encrypted) throws Exception {
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.DECRYPT_MODE, publicKey);

		return cipher.doFinal(encrypted);
	}
}
