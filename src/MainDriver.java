import javax.swing.*;
public class MainDriver {

	public static void main(String[] args) {
		GuiCalculator gc = new GuiCalculator();
		gc.setSize(300,200);
		gc.setVisible(true);
		gc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		gc.setResizable(false);
	}
}