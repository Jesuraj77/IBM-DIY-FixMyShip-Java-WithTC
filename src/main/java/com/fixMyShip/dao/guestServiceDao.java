package com.fixMyShip.dao;

import com.fixMyShip.model.Answer;
import com.fixMyShip.model.Question;
import com.fixMyShip.model.User;

public interface guestServiceDao {
	
	public boolean postQuestion(Question question);
	public boolean postAnswer(Answer answer);
	User viewUser(int userId);
	Question viewQuestion(Question question);
	Answer viewAnswer(Question question);
	

}
