package com.fapin.main;

import com.fapin.encryptionalgorithm.AESAlgorithm;
import com.fapin.encryptionalgorithm.MD5Algorithm;
import com.fapin.encryptionalgorithm.ShiftAlgorithm;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��λ���ܽ���
		System.out.println("��λ���ܽ���");
		String str = "|| Who are you?";
		System.out.println("ԭ���ݣ�" + str);
		String result = ShiftAlgorithm.encrypt(str);
		System.out.println("���ܺ�" + result);
		System.out.println("���ܺ�" + ShiftAlgorithm.decrypt(result));
		
		//AES���ܽ���
		System.out.println("AES���ܽ���");
		String content = "AES! What a f**k!";
		System.out.println("����ǰ: " + content);
		String password = "12345678";
		byte[] encryptResult = AESAlgorithm.encrypt(content, password);
		String encryptResultStr = AESAlgorithm.parseByte2HexStr(encryptResult);
		System.out.println("���ܺ�" + encryptResultStr);
		// ����
		byte[] decryptFrom = AESAlgorithm.parseHexStr2Byte(encryptResultStr);
		byte[] decryptResult = AESAlgorithm.decrypt(decryptFrom, password);
		System.out.println("���ܺ�" + new String(decryptResult));

		//MD5���ܽ���
		System.out.println("MD5���ܽ���");
		String s = new String("123asdfghjkl");
		System.out.println("ԭʼ��" + s);
		System.out.println("MD5��" + MD5Algorithm.MD5(s));
		System.out.println("MD5���ټ��ܣ�" + MD5Algorithm.KL(MD5Algorithm.MD5(s)));
		System.out.println("����ΪMD5��ģ�" + MD5Algorithm.JM(MD5Algorithm.KL(MD5Algorithm.MD5(s))));
	}

}
