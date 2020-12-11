package chapter02;

import java.util.HashMap;
import java.util.Map;

public class Profile {
	private Map<String, Answer> answers = new HashMap<>();
	private int score;
	private String name;
	
	public Profile(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void add(Answer answer) {
		answer.put(answer.getQuestionText(), answer);
	}
	
	public boolean matches(Criteria criteria) {
		
	}
}

