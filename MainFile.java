package baord;


public class MainFile {
	public static void main(String[] args) {

		TBoard gameBoard = new TBoard();
		gameBoard.setVisible(true);
		
		if(gameBoard.currentSym.equals(gameBoard.botSym)) {
			gameBoard.botArtificialIntelligence();
		}
	}
}
