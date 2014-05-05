
public class Board {
	char [][] board;
	String onMove;
	int  MoveNum;
	
	public Board(){
		board = new char[5] [6];
		onMove = "W";
		MoveNum = 0;
	}
	
	public Board (String string){
		
		String [] [] square = {{"k", "q", "b", "n", "r"},
				  {"p", "p", "p", "p", "p"},
				  {".", ".", ".", ".", "."},
				  {".", ".", ".", ".", "."},
				  {"P", "P", "P", "P", "P"},
				  {"R", "N","B", "Q", "K"}
				  		
		};
	}
	
	public void makeBoard(String state){
		
	}
	

	
	
	

}
