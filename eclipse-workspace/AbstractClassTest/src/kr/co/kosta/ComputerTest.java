package kr.co.kosta;

public class ComputerTest {
	public static void main(String[] args) {
		Computer computer = new DeskTopPC();
		computer.display();
		computer.turnOff();
		
		NoteBook myNote = new MyNoteBook();
		myNote.typing();
		
	
	}
}
