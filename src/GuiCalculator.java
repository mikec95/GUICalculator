import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiCalculator extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField jt;
	private JButton zero, one, two, three, four, five, six, seven, eight, nine,
			add, sub, mult, div, clear, equals;
	private String temp1, temp2, temp3;
	private double result = 0.0;
	private JPanel content;
	private boolean equalsClicked = false;
	private boolean opClicked = false;
	private String operation;

	public GuiCalculator() {
		super("Michael's Calculator");

		jt = new JTextField(null, 25);
		jt.setEditable(false);

		zero = new JButton("0");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		add = new JButton("+");
		sub = new JButton("-");
		mult = new JButton("*");
		div = new JButton("/");
		clear = new JButton("C");
		equals = new JButton("=");
		Dimension btnDim = new Dimension(80, 25);
		equals.setPreferredSize(btnDim);

		Numbers n = new Numbers();
		Operations o = new Operations();

		content = new JPanel();
		content.setBackground(Color.cyan);
		content.setLayout(new FlowLayout());
		content.add(jt, BorderLayout.NORTH);
		content.add(zero);
		zero.addActionListener(n);
		content.add(one);
		one.addActionListener(n);
		content.add(two);
		two.addActionListener(n);
		content.add(three);
		three.addActionListener(n);
		content.add(mult);
		mult.addActionListener(o);
		content.add(div);
		div.addActionListener(o);
		content.add(four);
		four.addActionListener(n);
		content.add(five);
		five.addActionListener(n);
		content.add(six);
		six.addActionListener(n);
		content.add(seven);
		seven.addActionListener(n);
		content.add(add);
		add.addActionListener(o);
		content.add(sub);
		sub.addActionListener(o);
		content.add(eight);
		eight.addActionListener(n);
		content.add(nine);
		nine.addActionListener(n);
		content.add(clear);
		clear.addActionListener(o);
		content.add(equals);
		equals.addActionListener(o);

		this.setContentPane(content);
	}

	class Numbers implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			JButton jb = (JButton) ae.getSource();

			if (jb.equals(zero)) {
				if (opClicked == false) {
					if (temp1 == null) {
						temp1 = "0";
					} else {
						temp1 += "0";
					}
				} else {
					if (temp2 == null) {
						temp2 = "0";
					} else {
						temp2 += "0";
					}
				}
			}

			if (jb.equals(one)) {
				if (opClicked == false) {
					if (temp1 == null) {
						temp1 = "1";
					} else {
						temp1 += "1";
					}
				} else {
					if (temp2 == null) {
						temp2 = "1";
					} else {
						temp2 += "1";
					}
				}
			}

			if (jb.equals(two)) {
				if (opClicked == false) {
					if (temp1 == null) {
						temp1 = "2";
					} else {
						temp1 += "2";
					}
				} else {
					if (temp2 == null) {
						temp2 = "2";
					} else {
						temp2 += "2";
					}
				}
			}

			if (jb.equals(three)) {
				if (opClicked == false) {
					if (temp1 == null) {
						temp1 = "3";
					} else {
						temp1 += "3";
					}
				} else {
					if (temp2 == null) {
						temp2 = "3";
					} else {
						temp2 += "3";
					}
				}
			}

			if (jb.equals(four)) {
				if (opClicked == false) {
					if (temp1 == null) {
						temp1 = "4";
					} else {
						temp1 += "4";
					}
				} else {
					if (temp2 == null) {
						temp2 = "4";
					} else {
						temp2 += "4";
					}
				}
			}

			if (jb.equals(five)) {
				if (opClicked == false) {
					if (temp1 == null) {
						temp1 = "5";
					} else {
						temp1 += "5";
					}
				} else {
					if (temp2 == null) {
						temp2 = "5";
					} else {
						temp2 += "5";
					}
				}
			}

			if (jb.equals(six)) {
				if (opClicked == false) {
					if (temp1 == null) {
						temp1 = "6";
					} else {
						temp1 += "6";
					}
				} else {
					if (temp2 == null) {
						temp2 = "6";
					} else {
						temp2 += "6";
					}
				}
			}

			if (jb.equals(seven)) {
				if (opClicked == false) {
					if (temp1 == null) {
						temp1 = "7";
					} else {
						temp1 += "7";
					}
				} else {
					if (temp2 == null) {
						temp2 = "7";
					} else {
						temp2 += "7";
					}
				}
			}

			if (jb.equals(eight)) {
				if (opClicked == false) {
					if (temp1 == null) {
						temp1 = "8";
					} else {
						temp1 += "8";
					}
				} else {
					if (temp2 == null) {
						temp2 = "8";
					} else {
						temp2 += "8";
					}
				}
			}

			if (jb.equals(nine)) {
				if (opClicked == false) {
					if (temp1 == null) {
						temp1 = "9";
					} else {
						temp1 += "9";
					}
				} else {
					if (temp2 == null) {
						temp2 = "9";
					} else {
						temp2 += "9";
					}
				}
			}

			if (equalsClicked == false) {
				if (opClicked == false) {
					jt.setText(temp1);
				} else {
					jt.setText(temp2);
				}
			}

		}
	}

	class Operations implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			JButton btn = (JButton) ae.getSource();

			if (btn.equals(add)) {
				if (temp1 == null) {
					JOptionPane
							.showMessageDialog(content, "Need first Number!");
				} else {
					if (temp1 != null && temp2 == null) {
						opClicked = true;
						operation = "+";
						jt.setText("+");
					} else {
						if (temp1 != null && temp2 != null) {
							JOptionPane.showMessageDialog(content,
									"Two numbers, one operation only please");
						}
					}
				}
			}

			if (btn.equals(sub)) {
				if (temp1 == null) {
					JOptionPane
							.showMessageDialog(content, "Need first Number!");
				} else {
					if (temp1 != null && temp2 == null) {
						opClicked = true;
						operation = "-";
						jt.setText("-");
					} else {
						if (temp1 != null && temp2 != null) {
							JOptionPane.showMessageDialog(content,
									"Two numbers, one operation only please");
						}
					}
				}
			}

			if (btn.equals(mult)) {
				if (temp1 == null) {
					JOptionPane
							.showMessageDialog(content, "Need first Number!");
				} else {
					if (temp1 != null && temp2 == null) {
						opClicked = true;
						operation = "*";
						jt.setText("*");
					} else {
						if (temp1 != null && temp2 != null) {
							JOptionPane.showMessageDialog(content,
									"Two numbers, one operation only please");
						}
					}
				}
			}

			if (btn.equals(div)) {
				if (temp1 == null) {
					JOptionPane
							.showMessageDialog(content, "Need first Number!");
				} else {
					if (temp1 != null && temp2 == null) {
						opClicked = true;
						operation = "/";
						jt.setText("/");
					} else {
						if (temp1 != null && temp2 != null) {
							JOptionPane.showMessageDialog(content,
									"Two numbers, one operation only please");
						}
					}
				}
			}

			if (btn.equals(equals)) {
				if (temp1 == null) {
					JOptionPane.showMessageDialog(content,
							"Choose numberst first");
				} else {
					if (temp1 != null && temp2 == null) {
						JOptionPane.showMessageDialog(content,
								"Choose both numbers first");
					}
					if (temp1 != null && temp2 != null) {
						double double1 = 0.0;
						double double2 = 0.0;

						double1 = Double.parseDouble(temp1);
						double2 = Double.parseDouble(temp2);

						switch (operation) {
						case "+":
							result = double1 + double2;
							break;
						case "-":
							result = double1 - double2;
							break;
						case "*":
							result = double1 * double2;
							break;
						case "/":
							result = double1 / double2;
							break;
						}

						temp3 = Double.toString(result);
						jt.setText(temp3);
					}
				}
			}

			if (btn.equals(clear)) {
				temp1 = null;
				temp2 = null;
				equalsClicked = false;
				opClicked = false;
				operation = "";
				jt.setText(null);
			}

		}
	}
}