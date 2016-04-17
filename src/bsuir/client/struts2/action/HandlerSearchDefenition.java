package bsuir.client.struts2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import bsuir.soap.ejb.handbook.HandbookJavaScriptServiceLocator;
import bsuir.soap.ejb.handbook.SearchSessionBean;

public class HandlerSearchDefenition extends ActionSupport implements SessionAware {
	private String searchDefenition;
	private Map<String, Object> session;

	public HandlerSearchDefenition() {

	}

	public String getSearchDefenition() {
		return searchDefenition;
	}

	public void setSearchDefenition(String searchDefenition) {
		this.searchDefenition = searchDefenition;
	}
	
	public String execute() throws Exception {
		HandbookJavaScriptServiceLocator service = new HandbookJavaScriptServiceLocator();
		SearchSessionBean searchBean = service.getSearchSessionBeanPort();
		String result = searchBean.searchDefenition(getSearchDefenition());
		if (result.equals("")) {
			result = "не найдено";
		}
		System.out.println(result);
		session.put("resultString", result);
		return SUCCESS;
	}

	private boolean isEmptyString(String value) {
		return value == null || "".equals(value.trim());
	}

	public void validate() {
		if (isEmptyString(searchDefenition))
			addFieldError("searchDefenition", "Try again to");

	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}
}
