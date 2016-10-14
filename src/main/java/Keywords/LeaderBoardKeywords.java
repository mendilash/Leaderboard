package keywords;

import edu.jsu.mcis.*;
import java.util.*;
import java.io.*;

public class LeaderBoardKeywords{
	private LeaderBoard leaderBoard;
	public String output;
	private String[] studentOutput;
	private String[] courseOutput;
	private StringBuilder builder;
	
	public void startLeaderBoardCLIWithArguments(){
		output = "";
	}
	
	public void startLeaderBoardCLIWithArguments(String idType)throws IOException{
		builder = new StringBuilder();
		leaderBoard = new LeaderBoard(idType);
		if(idType.equals("studentids")){
			studentOutput = new String[300];
			studentOutput = leaderBoard.getStudentIdOutput();
			for(String output : studentOutput){				
				if(builder.length() > 0){
					builder.append("\n");
				}
				builder.append(output);
			}
			output = builder.toString();
		}
		if(idType.equals("courseids")){
			courseOutput = new String[25];
			courseOutput = leaderBoard.getCourseIdOutput();
			for(String output : courseOutput){				
				if(builder.length() > 0){
					builder.append("\n");
				}
				builder.append(output);
			}
			output = builder.toString();
		}
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