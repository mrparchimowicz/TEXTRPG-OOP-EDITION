
public class Room {
	boolean exitNorth;
	boolean exitEast;
	boolean exitSouth;
	boolean exitWest;
	int destinationNorth;
	int destinationEast;
	int destinationSouth;
	int destinationWest;
	
	
	public Room(boolean exitNorth, boolean exitEast, boolean exitSouth, boolean exitWest) {
		this.exitNorth = exitNorth;
		this.exitEast = exitEast;
		this.exitSouth = exitSouth;
		this.exitWest = exitWest;
		
	}
	public void drawRoom(int i) {
		if(exitNorth) {
			if(exitEast) {
				if(exitSouth) {
					if(exitWest) { //NESW exits
						System.out.println("     │   │     ");
						System.out.println("     │   │     ");
						System.out.println("─────╯   ╰─────");
						System.out.println("      [" + Player.initial + "]      ");
						System.out.println("─────╮   ╭─────");
						System.out.println("     │   │     ");
						System.out.println("     │   │     ");					
					} else { // NES!W exits
						System.out.println("     │   │     ");
						System.out.println("     │   │     ");
						System.out.println("     │   ╰─────");
						System.out.println("     │[" + Player.initial + "]      ");
						System.out.println("     │   ╭─────");
						System.out.println("     │   │     ");
						System.out.println("     │   │     ");							
					}
				} else { //
					if(exitWest) { //NE!SW exits
						System.out.println("     │   │     ");
						System.out.println("     │   │     ");
						System.out.println("─────╯   ╰─────");
						System.out.println("      [" + Player.initial + "]      ");
						System.out.println("───────────────");
						System.out.println("               ");
						System.out.println("               ");					
					} else { // NE!S!W exits
						System.out.println("     │   │     ");
						System.out.println("     │   │     ");
						System.out.println("     │   ╰─────");
						System.out.println("     │[" + Player.initial + "]      ");
						System.out.println("     ╰─────────");
						System.out.println("               ");
						System.out.println("               ");							
					}
				}
			} else {
				if(exitSouth) {
					if(exitWest) { //N!ESW exits
						System.out.println("     │   │     ");
						System.out.println("     │   │     ");
						System.out.println("─────╯   │     ");
						System.out.println("      [" + Player.initial + "]│     ");
						System.out.println("─────╮   │     ");
						System.out.println("     │   │     ");
						System.out.println("     │   │     ");					
					} else { // N!ES!W exits
						System.out.println("     │   │     ");
						System.out.println("     │   │     ");
						System.out.println("     │   │     ");
						System.out.println("     │[" + Player.initial + "]│     ");
						System.out.println("     │   │     ");
						System.out.println("     │   │     ");
						System.out.println("     │   │     ");							
					}
				} else {
					if(exitWest) { //N!E!SW exits
						System.out.println("     │   │     ");
						System.out.println("     │   │     ");
						System.out.println("─────╯   │     ");
						System.out.println("      [" + Player.initial + "]│     ");
						System.out.println("─────────╯     ");
						System.out.println("               ");
						System.out.println("               ");					
					} else { // N!E!S!W exits
						System.out.println("     │   │     ");
						System.out.println("     │   │     ");
						System.out.println("     │   │     ");
						System.out.println("     │[" + Player.initial + "]│     ");
						System.out.println("     ╰───╯     ");
						System.out.println("               ");
						System.out.println("               ");							
					}
				}
			}
		} else {
			if(exitEast) {
				if(exitSouth) {
					if(exitWest) { //!NESW exits
						System.out.println("               ");
						System.out.println("               ");
						System.out.println("───────────────");
						System.out.println("      [" + Player.initial + "]      ");
						System.out.println("─────╮   ╭─────");
						System.out.println("     │   │     ");
						System.out.println("     │   │     ");					
					} else { // !NES!W exits
						System.out.println("               ");
						System.out.println("               ");
						System.out.println("     ╭─────────");
						System.out.println("     │[" + Player.initial + "]      ");
						System.out.println("     │   ╭─────");
						System.out.println("     │   │     ");
						System.out.println("     │   │     ");							
					}
				} else {
					if(exitWest) { //!NE!SW exits
						System.out.println("               ");
						System.out.println("               ");
						System.out.println("───────────────");
						System.out.println("      [" + Player.initial + "]      ");
						System.out.println("───────────────");
						System.out.println("               ");
						System.out.println("               ");					
					} else { // !NE!S!W exits
						System.out.println("               ");
						System.out.println("               ");
						System.out.println("     ╭─────────");
						System.out.println("     │[" + Player.initial + "]      ");
						System.out.println("     ╰─────────");
						System.out.println("               ");
						System.out.println("               ");							
					}
				}
			} else {
				if(exitSouth) {
					if(exitWest) { //!N!ESW exits
						System.out.println("               ");
						System.out.println("               ");
						System.out.println("─────────╮     ");
						System.out.println("      [" + Player.initial + "]│     ");
						System.out.println("─────╮   │     ");
						System.out.println("     │   │     ");
						System.out.println("     │   │     ");					
					} else { // !N!ES!W exits
						System.out.println("               ");
						System.out.println("               ");
						System.out.println("     ╭───╮     ");
						System.out.println("     │[" + Player.initial + "]│     ");
						System.out.println("     │   │     ");
						System.out.println("     │   │     ");
						System.out.println("     │   │     ");							
					}
				} else {
					if(exitWest) { //!N!E!SW exits
						System.out.println("               ");
						System.out.println("               ");
						System.out.println("─────────╮     ");
						System.out.println("      [" + Player.initial + "]│     ");
						System.out.println("─────────╯     ");
						System.out.println("               ");
						System.out.println("               ");					
					} else { // !N!E!S!W exits
						System.out.println("               ");
						System.out.println("               ");
						System.out.println("     ╭───╮     ");
						System.out.println("     │[" + Player.initial + "]│     ");
						System.out.println("     ╰───╯     ");
						System.out.println("               ");
						System.out.println("               ");							
					}
				}
			}
		}
				
	}
}
