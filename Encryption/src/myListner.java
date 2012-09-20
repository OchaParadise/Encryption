import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class myListner implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String str1 = EncMain.text1.getText();
		System.out.println("str1: " + str1);
		
		byte[] byteStr1 = str1.getBytes();
		System.out.println("byteStr1: " + byteStr1);
		
		try {
			MessageDigest mesdig = MessageDigest.getInstance("SHA-256");
			mesdig.update(byteStr1);
			byte[] byteStr2 = mesdig.digest();
			System.out.println("byteStr2: " + byteStr2);
			
			String str2 = toHexString(byteStr2);
			System.out.println("str2: " + str2);
			
			EncMain.text2.setText(str2);
		}
		catch (NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		}

	}
	
	public String toHexString(byte[] bytes) {
		StringBuilder sbuildr = new StringBuilder();
		for (byte b : bytes) {
			String hex = String.format("%02x", b);
			sbuildr.append(hex);
		}
		return sbuildr.toString();
	}
	
}
