

/* Class to implement a Maze solver */
public abstract class MazeSolver {
	
	public static Square solve(Maze maze, SearchWorklist wl) {
		//wl = new StackWorklist();
		wl.add(maze.start);
		//maze.start.visit();
		//System.out.print(wl.get(0).getRow());
		//System.out.println(wl.get(0).getCol());
		while(!(wl.isEmpty())){
		Square current = wl.remove();
		//System.out.print(current.getRow());
		//System.out.println(current.getCol());
			if(current.equals(maze.finish)) {
				System.out.print(current.getRow());
				System.out.println(current.getCol());
				return current;
			}
			else {
				for(int i = 0; i < 4; i++) {
					maze.start.visit();
					if(i == 0) {
						int rowOffset = current.getRow() - 1;
					    int colOffset = current.getCol();
					    System.out.println(rowOffset + " "+ colOffset);
						boolean check = 
					    availableNeighbor(maze.contents, 
					    current,rowOffset, colOffset);
						System.out.println(check);
						if(check == false) {
							System.out.println("nogo");
							continue;
						}
						Square neighbor 
						= maze.contents[rowOffset][colOffset];
						neighbor.visit();
					    neighbor.setPrevious(current);
						wl.add(neighbor);
					}
					if(i == 1) {
						int rowOffset = current.getRow() + 1;
					    int colOffset = current.getCol();
					    System.out.println(rowOffset + " "+ colOffset);
						boolean check = 
					    availableNeighbor(maze.contents, 
					    current,rowOffset, colOffset);
						System.out.println(check);
						if(check == false) {
							System.out.println("nogo2");
							continue;
						}
						Square neighbor = maze.contents[rowOffset][colOffset];
						neighbor.visit();
					    neighbor.setPrevious(current);
						wl.add(neighbor);

					}
					if(i == 2) {
						int rowOffset = current.getRow();
					    int colOffset = current.getCol() + 1;
					    System.out.println(rowOffset + " "+ colOffset);
						boolean check = 
					    availableNeighbor(maze.contents, 
					    current,rowOffset, colOffset);
						System.out.println(check);
						if(check == false) {
							System.out.println("nogo3");
							continue;
						}
						Square neighbor = maze.contents[rowOffset][colOffset];
						neighbor.visit();
					    neighbor.setPrevious(current);
						wl.add(neighbor);
					}
					if(i == 3) {
						int rowOffset = current.getRow();
					    int colOffset = current.getCol() -1;
					    System.out.println(rowOffset + " "+ colOffset);
						boolean check = 
					    availableNeighbor(maze.contents,
					    current,rowOffset, colOffset);
						System.out.println(check);
						if(check == false) {
							System.out.println("nogo4");
							continue;
						}
						Square neighbor = maze.contents[rowOffset][colOffset];
						neighbor.visit();
					    neighbor.setPrevious(current);
						wl.add(neighbor);
						
					}
				}
			}
		}
		
		return null;
	}

	static boolean availableNeighbor(Square[][] contents, 
		Square s, int rowOffset, int colOffset) {
		if(rowOffset >= contents.length 
		    || colOffset >= contents[0].length ||
			rowOffset < 0 || colOffset < 0) {
			return false;
		}
		Square check = contents[rowOffset][colOffset];
		if(check.getIsWall() || check.isVisited()) {
			return false;
		
		}
		return true;
	}
	public static void main(String args[]) {
		//System.out.println("hello");
		Square[][] content = new Square[4][4];
		for(int i = 0; i < content.length; ++i) {
			for(int j = 0; j < content[i].length; j++) {
				content[i][j] = new Square(i, j, false);
			}
		}
		Square temp = content[0][3];
		boolean check = availableNeighbor(content, temp, 0,4);
		//System.out.println(check);
		Square start = content[0][3];
		Square finish = content[2][0];
		content[2][1] =  new Square(2, 1, true);
		content[0][2] =  new Square(2, 2, true);
		content[0][0] =  new Square(0, 0, true);
		content[2][2] =  new Square(0, 0, true);
		content[1][0] =  new Square(0, 0, true);
		content[1][1] =  new Square(0, 0, true);
		content[1][2] =  new Square(0, 0, true);
		content[0][1] =  new Square(0, 0, true);
		Square temp2 = content[2][2];
		boolean check2 = availableNeighbor(content, temp, 2,2);
		//System.out.println(check2);
		Maze yum = new Maze(start,finish,content);
		SearchWorklist wl = null;
		Square bum = solve(yum, wl);
		System.out.println(bum.getRow());
		System.out.println(bum.getCol());
		System.out.print("run");
	  
	}
}
