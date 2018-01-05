package com.fapin.main;

import com.fapin.encryptionalgorithm.AESAlgorithm;
import com.fapin.encryptionalgorithm.MD5Algorithm;
import com.fapin.encryptionalgorithm.ShiftAlgorithm;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//移位加密解密
		System.out.println("移位加密解密");
		String str = "|| Who are you?";
		System.out.println("原内容：" + str);
		String result = ShiftAlgorithm.encrypt(str);
		System.out.println("加密后：" + result);
		System.out.println("解密后：" + ShiftAlgorithm.decrypt(result));
		
		//AES加密解密
		System.out.println("AES加密解密");
		String content = "AES! What a f**k!";
		System.out.println("加密前: " + content);
		String password = "12345678";
		byte[] encryptResult = AESAlgorithm.encrypt(content, password);
		String encryptResultStr = AESAlgorithm.parseByte2HexStr(encryptResult);
		System.out.println("加密后：" + encryptResultStr);
		// 解密
		byte[] decryptFrom = AESAlgorithm.parseHexStr2Byte(encryptResultStr);
		byte[] decryptResult = AESAlgorithm.decrypt(decryptFrom, password);
		System.out.println("解密后：" + new String(decryptResult));

		//MD5加密解密
		System.out.println("MD5加密解密");
		String s = new String("123asdfghjkl");
		System.out.println("原始：" + s);
		System.out.println("MD5后：" + MD5Algorithm.MD5(s));
		System.out.println("MD5后再加密：" + MD5Algorithm.KL(MD5Algorithm.MD5(s)));
		System.out.println("解密为MD5后的：" + MD5Algorithm.JM(MD5Algorithm.KL(MD5Algorithm.MD5(s))));
	}

}
