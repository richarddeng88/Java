package org.richard.web.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
// here we annotate model class with @XmlRootElement, giving the JAXB some clue to do the work. 

public class Message {

		private long id;
		private String message;
		private Date date_created;
		private String author; 
		
		public Message(){
			// alway always to make sure that the model classes have a null (no-argument)
			// constructor. 
		}
		
		public Message(long id, String message, String author){
			this.id = id;
			this.message = message;
			this.author = author;
			this.date_created = new Date();
		}
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public Date getDate_created() {
			return date_created;
		}
		public void setDate_created(Date date_created) {
			this.date_created = date_created;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		
}
