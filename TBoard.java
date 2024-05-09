
package baord;

	import java.awt.Color;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.ArrayList;
	import java.util.Arrays;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JOptionPane;
	import java.util.Objects;
	import java.util.Random;


	public class TBoard extends JFrame implements ActionListener  {
		
		final int WIDTH = 350;
		final int HEIGHT = 370;
		final Color FRAME_BACK_COLOR = new Color(230,230,230);
		public Random rand = new Random();
		public String currentSym = rand.nextInt(2) == 0 ? "X" : "O";
		final public String userSym = "X";
		final public String botSym = "O";
		public int botNumGen = 0;
		public int prevRep = 0;
		public ArrayList<Integer> openSquares = 
				new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		public ArrayList<String> boardMem = 
				new ArrayList<>(Arrays.asList
						("1","2","3","4","5","6","7","8","9"));
		public int plays = 0;

		
		JButton button1  = new JButton();
		JButton button2  = new JButton();
		JButton button3  = new JButton();
		JButton button4  = new JButton();
		JButton button5  = new JButton();
		JButton button6  = new JButton();
		JButton button7  = new JButton();
		JButton button8  = new JButton();
		JButton button9  = new JButton();
		
		
		TBoard(){
			this.setSize(WIDTH, HEIGHT);
			this.setResizable(false);
			this.setTitle("TicTacToe");
			this.setLayout(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.getContentPane().setBackground(FRAME_BACK_COLOR);

			SetBoardButtons();
		
		}
		
		
		public void SetBoardButtons() {
			button1.setBounds(20,20,100,100);
			button2.setBounds(120,20,100,100);
			button3.setBounds(220,20,100,100);
			button4.setBounds(20,120,100,100);
			button5.setBounds(120,120,100,100);
			button6.setBounds(220,120,100,100);
			button7.setBounds(20,220,100,100);
			button8.setBounds(120,220,100,100);
			button9.setBounds(220,220,100,100);
			
//			button1.setBorder(BorderFactory.createEmptyBorder());
//			button1.setBackground(Color.LIGHT_GRAY);
//			button1.setOpaque(true);
//			button1.setBorderPainted(false);
		
			button1.setFont(new Font("Arial", Font.BOLD, 80));
			button2.setFont(new Font("Arial", Font.BOLD, 80));
			button3.setFont(new Font("Arial", Font.BOLD, 80));
			button4.setFont(new Font("Arial", Font.BOLD, 80));
			button5.setFont(new Font("Arial", Font.BOLD, 80));
			button6.setFont(new Font("Arial", Font.BOLD, 80));
			button7.setFont(new Font("Arial", Font.BOLD, 80));
			button8.setFont(new Font("Arial", Font.BOLD, 80));
			button9.setFont(new Font("Arial", Font.BOLD, 80));
			
			this.add(button1);
			this.add(button2);
			this.add(button3);
			this.add(button4);
			this.add(button5);
			this.add(button6);
			this.add(button7);
			this.add(button8);
			this.add(button9);
			
			button1.setFocusable(false);
			button2.setFocusable(false);
			button3.setFocusable(false);
			button4.setFocusable(false);
			button5.setFocusable(false);
			button6.setFocusable(false);
			button7.setFocusable(false);
			button8.setFocusable(false);
			button9.setFocusable(false);
						
			button1.addActionListener(this);
			button2.addActionListener(this);
			button3.addActionListener(this);
			button4.addActionListener(this);
			button5.addActionListener(this);
			button6.addActionListener(this);
			button7.addActionListener(this);
			button8.addActionListener(this);
			button9.addActionListener(this);
			
		}
		
		
		public void switchSym() {
			
			currentSym = currentSym.equals(userSym) ? botSym : userSym;
			if (currentSym.equals("O")) {botArtificialIntelligence();}
		}
		
		
		public void botTurn() {

			while(true) {
				botNumGen = 1 + rand.nextInt(9);

				if(openSquares.contains(botNumGen)) {
					break;
					}
			}
			
			
			switch(botNumGen) {
			
			case 1:
				actionPerformed(new ActionEvent(button1,1,""));
				break;
			case 2:
				actionPerformed(new ActionEvent(button2,2,""));
				break;
			case 3:
				actionPerformed(new ActionEvent(button3,3,""));
				break;
			case 4:
				actionPerformed(new ActionEvent(button4,4,""));
				break;
			case 5:
				actionPerformed(new ActionEvent(button5,5,""));
				break;
			case 6:
				actionPerformed(new ActionEvent(button6,6,""));
				break;
			case 7:
				actionPerformed(new ActionEvent(button7,7,""));
				break;
			case 8:
				actionPerformed(new ActionEvent(button8,8,""));
				break;
			case 9:
				actionPerformed(new ActionEvent(button9,9,""));
				break;
			}
		}
		
		
		@Override
		public void actionPerformed (ActionEvent action) {
			
			if (action.getSource() == button1) {
				button1.setText(currentSym);
				button1.setEnabled(false);
				openSquares.remove(Integer.valueOf(1));
				boardMem.set(0, currentSym);
			}
			
			else if (action.getSource() == button2) {
				button2.setText(currentSym);
				button2.setEnabled(false);
				openSquares.remove(Integer.valueOf(2));
				boardMem.set(1, currentSym);
			}
			
			else if (action.getSource() == button3) {
				button3.setText(currentSym);
				button3.setEnabled(false);
				openSquares.remove(Integer.valueOf(3));
				boardMem.set(2, currentSym);
			}
			
			else if (action.getSource() == button4) {
				button4.setText(currentSym);
				button4.setEnabled(false);
				openSquares.remove(Integer.valueOf(4));	
				boardMem.set(3, currentSym);
			}
			
			else if (action.getSource() == button5) {
				button5.setText(currentSym);
				button5.setEnabled(false);
				openSquares.remove(Integer.valueOf(5));
				boardMem.set(4, currentSym);
			}
			
			else if (action.getSource() == button6) {
				button6.setText(currentSym);
				button6.setEnabled(false);
				openSquares.remove(Integer.valueOf(6));
				boardMem.set(5, currentSym);
			}
			
			else if (action.getSource() == button7) {
				button7.setText(currentSym);
				button7.setEnabled(false);
				openSquares.remove(Integer.valueOf(7));
				boardMem.set(6, currentSym);
			}
			
			else if (action.getSource() == button8) {
				button8.setText(currentSym);
				button8.setEnabled(false);
				openSquares.remove(Integer.valueOf(8));
				boardMem.set(7, currentSym);
			}
			
			else if (action.getSource() == button9) {
				button9.setText(currentSym);
				button9.setEnabled(false);
				openSquares.remove(Integer.valueOf(9));
				boardMem.set(8, currentSym);
			}
			

			// starts checking wins after 4 plays have taken place
			
			plays += 1;
			
			//if(plays > 4) {checkWin();}
			 //switchSym();
			checkWin();
			
		}
			
		
		public void checkWin() {
			
			// all possible solutions to win
			if ((Objects.equals(boardMem.get(0), boardMem.get(1))
					&& Objects.equals(boardMem.get(1), boardMem.get(2)))
					
				|| ((Objects.equals(boardMem.get(3), boardMem.get(4))
					&& Objects.equals(boardMem.get(4), boardMem.get(5)))
						
				||(Objects.equals(boardMem.get(6), boardMem.get(7))
					&& Objects.equals(boardMem.get(7), boardMem.get(8)))
				
				||(Objects.equals(boardMem.get(0), boardMem.get(3))
					&& Objects.equals(boardMem.get(3), boardMem.get(6)))
				
				||(Objects.equals(boardMem.get(1), boardMem.get(4))
					&& Objects.equals(boardMem.get(4), boardMem.get(7)))
				
				||(Objects.equals(boardMem.get(2), boardMem.get(5))
					&& Objects.equals(boardMem.get(5), boardMem.get(8)))
				
				||(Objects.equals(boardMem.get(0), boardMem.get(4))
					&& Objects.equals(boardMem.get(4), boardMem.get(8)))
				
				||(Objects.equals(boardMem.get(2), boardMem.get(4))
					&& Objects.equals(boardMem.get(4), boardMem.get(6))))) {
				
				
				JOptionPane.showMessageDialog(null, currentSym + " Won ! ! !");
				System.exit(0);
			}
			
			if (plays == 9) {
				JOptionPane.showMessageDialog(null, "It was a draw ! ! !");
				System.exit(0);
			}
			
			
			switchSym();

		}

		
		public void botArtificialIntelligence() {
			
			if(boardMem.get(0).equals("") && boardMem.get(1).equals("O") && boardMem.get(2).equals("3")) {
				actionPerformed(new ActionEvent(button3,0,""));
			}
			
			else if(boardMem.get(2).equals("O") && boardMem.get(1).equals("O") && boardMem.get(0).equals("1")) {
				actionPerformed(new ActionEvent(button1,0,""));
			}
			
			else if(boardMem.get(3).equals("O") && boardMem.get(4).equals("O") && boardMem.get(5).equals("6")) {
				actionPerformed(new ActionEvent(button6,0,""));
			}
			
			else if(boardMem.get(5).equals("O") && boardMem.get(4).equals("O") && boardMem.get(3).equals("4")) {
				actionPerformed(new ActionEvent(button4,0,""));
			}
			
			else if(boardMem.get(6).equals("O") && boardMem.get(7).equals("O") && boardMem.get(8).equals("9")) {
				actionPerformed(new ActionEvent(button9,0,""));
			}
			
			else if(boardMem.get(8).equals("O") && boardMem.get(7).equals("O") && boardMem.get(6).equals("7")) {
				actionPerformed(new ActionEvent(button7,0,""));
			}
			
			else if(boardMem.get(0).equals("O") && boardMem.get(3).equals("O") && boardMem.get(6).equals("7")) {
				actionPerformed(new ActionEvent(button7,0,""));
			}
			
			else if(boardMem.get(6).equals("O") && boardMem.get(3).equals("O") && boardMem.get(0).equals("1")) {
				actionPerformed(new ActionEvent(button1,0,""));
			}
			
			else if(boardMem.get(1).equals("O") && boardMem.get(4).equals("O") && boardMem.get(7).equals("8")) {
				actionPerformed(new ActionEvent(button8,0,""));
			}
			
			else if(boardMem.get(7).equals("O") && boardMem.get(4).equals("O") && boardMem.get(1).equals("2")) {
				actionPerformed(new ActionEvent(button2,0,""));
			}
		
			else if(boardMem.get(2).equals("O") && boardMem.get(5).equals("O") && boardMem.get(8).equals("9")) {
				actionPerformed(new ActionEvent(button9,0,""));
			}
			
			else if(boardMem.get(8).equals("O") && boardMem.get(5).equals("O") && boardMem.get(2).equals("3")) {
				actionPerformed(new ActionEvent(button3,0,""));
			}
			
			else if(boardMem.get(0).equals("O") && boardMem.get(4).equals("O") && boardMem.get(8).equals("9")) {
				actionPerformed(new ActionEvent(button9,0,""));
			}
			
			else if(boardMem.get(8).equals("O") && boardMem.get(4).equals("O") && boardMem.get(0).equals("1")) {
				actionPerformed(new ActionEvent(button1,0,""));
			}
			
			else if(boardMem.get(2).equals("O") && boardMem.get(4).equals("O") && boardMem.get(6).equals("7")) {
				actionPerformed(new ActionEvent(button7,0,""));
			}
			
			else if(boardMem.get(6).equals("O") && boardMem.get(4).equals("O") && boardMem.get(2).equals("3")) {
				actionPerformed(new ActionEvent(button3,0,""));
			}
			
			
			else {
				
				if(Objects.equals(boardMem.get(0), boardMem.get(1)) && boardMem.get(2).equals("3")) {
					actionPerformed(new ActionEvent(button3,0,""));
				}
				
				else if(Objects.equals(boardMem.get(2), boardMem.get(1)) && boardMem.get(0).equals("1")) {
					actionPerformed(new ActionEvent(button1,0,""));
				}
				
				else if(Objects.equals(boardMem.get(3), boardMem.get(4)) && boardMem.get(5).equals("6")) {
					actionPerformed(new ActionEvent(button6,0,""));
				}
				
				else if(Objects.equals(boardMem.get(5), boardMem.get(4)) && boardMem.get(3).equals("4")) {
					actionPerformed(new ActionEvent(button4,0,""));
				}
				
				else if(Objects.equals(boardMem.get(6), boardMem.get(7)) && boardMem.get(8).equals("9")) {
					actionPerformed(new ActionEvent(button9,0,""));
				}
				
				else if(Objects.equals(boardMem.get(8), boardMem.get(7)) && boardMem.get(6).equals("7")) {
					actionPerformed(new ActionEvent(button7,0,""));
				}
				
				else if(Objects.equals(boardMem.get(0), boardMem.get(3)) && boardMem.get(6).equals("7")) {
					actionPerformed(new ActionEvent(button7,0,""));
				}
				
				else if(Objects.equals(boardMem.get(6), boardMem.get(3)) && boardMem.get(0).equals("1")) {
					actionPerformed(new ActionEvent(button1,0,""));
				}
				
				else if(Objects.equals(boardMem.get(1), boardMem.get(4)) && boardMem.get(7).equals("8")) {
					actionPerformed(new ActionEvent(button8,0,""));
				}
				
				else if(Objects.equals(boardMem.get(7), boardMem.get(4)) && boardMem.get(1).equals("2")) {
					actionPerformed(new ActionEvent(button2,0,""));
				}
				
				else if(Objects.equals(boardMem.get(2), boardMem.get(5)) && boardMem.get(8).equals("9")) {
					actionPerformed(new ActionEvent(button9,0,""));
				}
				
				else if(Objects.equals(boardMem.get(8), boardMem.get(5)) && boardMem.get(2).equals("3")) {
					actionPerformed(new ActionEvent(button3,0,""));
				}
				
				else if(Objects.equals(boardMem.get(0), boardMem.get(4)) && boardMem.get(8).equals("9")) {
					actionPerformed(new ActionEvent(button9,0,""));
				}
				
				else if(Objects.equals(boardMem.get(8), boardMem.get(4)) && boardMem.get(0).equals("1")) {
					actionPerformed(new ActionEvent(button1,0,""));
				}
				
				else if(Objects.equals(boardMem.get(2), boardMem.get(4)) && boardMem.get(6).equals("7")) {
					actionPerformed(new ActionEvent(button7,0,""));
				}
				
				else if(Objects.equals(boardMem.get(6), boardMem.get(4)) && boardMem.get(2).equals("3")) {
					actionPerformed(new ActionEvent(button3,0,""));
				}
				
				else {
					botTurn();
				}
			}
		}
	}

	