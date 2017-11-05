package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.ChatDAO;
import com.jwt.dao.TickerDAO;
import com.jwt.model.Chat;
import com.jwt.model.Ticker;

@Service
@Transactional
public class TickerServiceImpl implements TickerService {

	@Autowired
	private TickerDAO tickerDAO;

	@Override
	@Transactional
	public void addNotification(Ticker ticker) {
		tickerDAO.addNotification(ticker);
	}

	@Override
	@Transactional
	public List<Ticker> getAllNotifications() {
		return tickerDAO.getAllNotifications();
	}

	@Override
	public List<Ticker> getCoursesCompleted(int empId, String courseName) {
		return tickerDAO.getCoursesCompleted(empId,courseName);
	}



	
}