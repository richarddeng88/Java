package org.richard.web.messenger.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.richard.web.messenger.database.DatabaseClass;
import org.richard.web.messenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService(){
		messages.put(1L, new Message(1, "where are you from?", "james"));
		messages.put(2L, new Message(2, "New York City!", "richard"));
	}
	
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());
			//messages.values() returns all the message we have in the map. 
	}
	
	
	public List<Message> getAllMessagesForYear(int year){
		ArrayList<Message> message_for_year = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
			//Calendar's getInstance method returns a Calendar object whose calendar fields have 
			//been initialized with the current date and time:
		for (Message f : messages.values()){
			cal.setTime(f.getDate_created());
			if (cal.get(Calendar.YEAR) == year){
				message_for_year.add(f);
			}
		}
		return message_for_year;
	}
	
	
	public List<Message> getAllMessagePaginated(int start, int size){
		ArrayList<Message> list = new ArrayList<>();
		if (start+size > list.size()){
			return new ArrayList<Message>();
		}
		return list.subList(start, start+size);
			// Returns a view of the portion of this list between the specified fromIndex, 
			// inclusive, and toIndex, exclusive.
	}
	
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(),message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if (message.getId() <= 0){
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id){
		return messages.remove(id);
	}
	
	
	/*
	public List<Message> getAllMessages(){
		Message m1 = new Message(001, "hello world, richard!", "james");
		Message m2 = new Message(002, "hello world, james!", "richard");
		Message m3 = new Message(003, "where are you going today?", "tommy");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;	
	}
	*/

}
