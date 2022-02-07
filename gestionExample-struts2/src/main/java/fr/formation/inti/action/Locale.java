package fr.formation.inti.action;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;

import fr.formation.inti.model.Personne;

@SuppressWarnings("serial")
public class Locale extends ActionSupport{
	private static final Log log = LogFactory.getLog(Locale.class);
	private String uri;
	private Personne personne;
//	private Map<String, Object> userSession ;
//	private static final String HELLO_COUNT = "helloCount";

	@Override
	public String execute() throws Exception {
		if ("helloStruts".equals(uri)) {
			log.info(">>>>>>>>>>>>>>>> Dans Locale : success2");
			return "success2";
		}
		else {
			log.info(">>>>>>>>>>>>>>>> Dans Locale : success");
			return SUCCESS;
		}
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
//	@Override
//	public void setSession(Map<String, Object> session) {
//		userSession = session;
//	}
//	
//	private void useHelloCount() {
//	    Integer helloCount = (Integer) userSession.get(HELLO_COUNT);
//
//	    helloCount = 11;
//
//	    userSession.put(HELLO_COUNT, helloCount);
//	}
	
	
	
	
	
}
