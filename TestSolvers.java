import java.util.ArrayList;


/*
 * Write your JUnit tests here
 * Use the formatMaze() method to get nicer JUnit output
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class TestSolvers {

	/* Helper method to compare two mazes */
	public void checkMaze(SearchWorklist wl, Maze startMaze, String[] expected) {
		Square s = MazeSolver.solve(startMaze, wl);
		if(expected == null) { assertNull(s); }
		else {
			ArrayList<Square> sp = startMaze.storePath();
			String actualStr = formatMaze(startMaze.showSolution(sp));
			String expectedStr = formatMaze(expected);
			assertEquals(expectedStr, actualStr);
		}
	}	

	/* Helper method to format String[] output as String */
	public String formatMaze(String[] arr) {
		String result = "";
		for (String s: arr)
			result += "\n"+s;
		return (result+"\n");
	}

	/* Add your own Worklist tests below */

	/* ************** HINT ******************** 
	 * Use the helper methods to create simple
	 * tests that are easier to debug. 
	 */
	
	@Test
	
	public void QueueTest1() {
		Maze m = new Maze(new String[] {
	            "#___",
	            "__F_",
	            "S##_",
	            "____"
	        });
		SearchWorklist wl = new QueueWorklist();
		String [] expected = { "#___",
				"**F_",
				"S##_",
				"____"};
		checkMaze(wl,m, expected);
	}
	@Test
	public void StackTest1() {
		Maze m = new Maze(new String[] {
	            "#___",
	            "__F_",
	            "S##_",
	            "____"
	        });
		SearchWorklist wl = new StackWorklist();
		String [] expected = { "#___",
				"__F*",
				"S##*",
				"****"};
		checkMaze(wl,m, expected);
	}
	@Test
	public void StackTest2() {
		Maze m = new Maze(new String[] {
	            "SF"
	        });
		SearchWorklist wl = new StackWorklist();
		String [] expected = {"SF"};
		checkMaze(wl,m, expected);
	}
	@Test
	public void StackTest3() {
		Maze m = new Maze(new String[] {
				"#_F*",
				"S##*",
				"#***"
	        });
		SearchWorklist wl = new StackWorklist();
		String [] expected = null;
		checkMaze(wl,m, expected);
	}
	public void Test3() {
		Maze m = new Maze(new String[] {
				"#_F*",
				"S##*",
				"#***"
	        });
		SearchWorklist wl = new QueueWorklist();
		String [] expected = null;
		checkMaze(wl,m, expected);
	}
	@Test
	public void QueueTest4() {
		Maze m = new Maze(new String[] {
	            "SF"
	        });
		SearchWorklist wl = new QueueWorklist();
		String [] expected = {"SF"};
		checkMaze(wl,m, expected);
	}
    @Test
	
	public void QueueTest5() {
		Maze m = new Maze(new String[] {
	            "#___",
	            "_#F#",
	            "S##_",
	            "____"
	        });
		SearchWorklist wl = new QueueWorklist();
		ArrayList<Square> sp = m.storePath();
		String [] expected = 
				m.showSolution(sp)
				;
		checkMaze(wl,m, expected);
	}
    @Test
    public void StackTest6() {
    	Maze m = new Maze(new String[] {
                "#___",
                "_#F#",
                "S##_",
                "____"
            });
    	SearchWorklist wl = new StackWorklist();
    	ArrayList<Square> sp = m.storePath();
    	String [] expected = 
    			m.showSolution(sp)
    			;
    	checkMaze(wl,m, expected);
    }
    @Test
    public void StackTest7() {
    	Maze m = new Maze(new String[] {
                "###_",
                "_#_#",
                "SF#_",
                "####"
            });
    	SearchWorklist wl = new StackWorklist();
    	ArrayList<Square> sp = m.storePath();
    	String [] expected = 
    			m.showSolution(sp)
    			;
    	checkMaze(wl,m, expected);
    }
    @Test
    public void QueueTest8() {
    	Maze m = new Maze(new String[] {
                "###_",
                "_#_#",
                "SF#_",
                "####"
            });
    	SearchWorklist wl = new QueueWorklist();
    	ArrayList<Square> sp = m.storePath();
    	String [] expected = 
    			m.showSolution(sp)
    			;
    	checkMaze(wl,m, expected);
    }
    @Test
    public void QueueTest9() {
    	Maze m = new Maze(new String[] {
				"#___",
				"__F_",
				"S##_",
				"____"
			});
    	SearchWorklist wl = new QueueWorklist();
    	ArrayList<Square> sp = m.storePath();
    	String [] expected = 
    		{
    				"#___",
    				"**F_",
    				"S##_",
    				"____"
    			};
    	checkMaze(wl,m, expected);
    }
    @Test
    public void StackTest10() {
    	Maze m = new Maze(new String[] {
				"#___",
				"__F_",
				"S##_",
				"____"
			});
    	SearchWorklist wl = new StackWorklist();
    	ArrayList<Square> sp = m.storePath();
    	String [] expected = 
    		{
    				"#___",
    				"__F*",
    				"S##*",
    				"****"
    			};
    	checkMaze(wl,m, expected);
    }
    @Test
    public void StackTest11() {
    	Maze m = new Maze(new String[] {
				"____",
				"__F_",
				"_S__",
				"____"
			});
    	SearchWorklist wl = new StackWorklist();
    	ArrayList<Square> sp = m.storePath();
    	String [] expected = 
    		{
    				"***_",
    				"*_F_",
    				"*S__",
    				"____"
    			};
    	checkMaze(wl,m, expected);
    }
    @Test
    public void QueueTest12() {
    	Maze m = new Maze(new String[] {
				"____",
				"__F_",
				"_S__",
				"____"
			});
    	SearchWorklist wl = new QueueWorklist();
    	ArrayList<Square> sp = m.storePath();
    	String [] expected = 
    		{
    				"____",
    				"_*F_",
    				"_S__",
    				"____"
    			};
    	checkMaze(wl,m, expected);
    }

  
  
 
    
    
        
    

}





