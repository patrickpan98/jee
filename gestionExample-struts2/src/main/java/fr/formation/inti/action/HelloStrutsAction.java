package fr.formation.inti.action;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;

import fr.formation.inti.model.MessageStore;
import fr.formation.inti.model.Personne;

@SuppressWarnings("serial")
public class HelloStrutsAction extends ActionSupport {
	private static final Log log = LogFactory.getLog(HelloStrutsAction.class);
	
	
	private MessageStore messageStore;
	private Personne personne;
	
	
	@Override
	public String execute() throws Exception {
		if (messageStore==null || messageStore.getMessage()=="")
			messageStore = new MessageStore();
		
		log.info(">>>>>>>>>>>>>>>> Dans Hello : success");
		return "success";
	}
	
	
//	public void validate(){
//	    if (personne.getFirstName().length() == 0) {
//	        addFieldError("personne.firstName", "First name is required.");
//	    }
//
//	    if (personne.getEmail().length() == 0) {
//	        addFieldError("personne.email", "Email is required.");
//	    }
//
//	    if (personne.getAge() < 18) {
//	        addFieldError("personne.age", "Age is required and must be 18 or older");
//	    }
//	}
	
	
	public MessageStore getMessageStore() {
		return messageStore;
	}
	
	public void setMessageStore(MessageStore messageStore) {
		this.messageStore = messageStore;
	}


	public Personne getPersonne() {
		return personne;
	}


	public void setPersonne(Personne personne) {
		this.personne = personne;
	}


	

	
	
	
	
}
