package keywords;

import edu.jsu.mcis.*;
import java.util.*;
import java.io.*;

public class LeaderBoardKeywords{
	private LeaderBoard leaderBoard;
	public String output;
	
	public void startLeaderBoardCLIWithArguments(){
		output = "";
	}
	
	public void startLeaderBoardCLIWithArguments(String type, String id)throws IOException{
		leaderBoard = new LeaderBoard(type, id);
		if(type.equals("student")){
			output = leaderBoard.findStudentById(id);
		}
		if(type.equals("course")){
			output = leaderBoard.findCourseById(id);
		}
	}
	
	public String getCommandLineOutput(){
		return output;
	}
}