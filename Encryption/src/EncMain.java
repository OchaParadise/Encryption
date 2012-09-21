import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class EncMain extends JFrame{
	private static final long serialVersionUID = 1L;
	private static JTextArea text1;
	private static JTextArea text2;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EncMain encFrame = new EncMain("Encryption");
		encFrame.setVisible(true);
	}
	
	EncMain(String title){
		setTitle(title);
		setBounds(500, 500, 500, 200);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    JPanel p = new JPanel();

	    text1 = new JTextArea("“ü—Í", 5, 20);
	    text2 = new JTextArea("Œ‹‰Ê", 5, 20);
		JButton button = new JButton("Encrypt");
		button.addActionListener(new myListner());

		
	    p.add(text1, BorderLayout.NORTH);
	    p.add(button, BorderLayout.CENTER);
	    p.add(text2, BorderLayout.SOUTH);
	    
	    Container contentPane = getContentPane();
	    contentPane.add(p);
	}
	
	public static String getText1(){
		return text1.getText();
	}
	
	public static void setText2(String setStr){
		text2.setText(setStr);
	}
	
}
