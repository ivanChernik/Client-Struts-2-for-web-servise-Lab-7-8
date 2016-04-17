package bsuir.client.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

import bsuir.soap.ejb.handbook.HandbookJavaScriptServiceLocator;
import bsuir.soap.ejb.handbook.SearchSessionBean;

public class HandlerEditDefenition extends ActionSupport {
	private String nameDefenition;
	private String bodyDefenition;
	private boolean updateButton;
	private boolean deleteButton;
	private boolean addButton;

	public String execute() throws Exception {
		HandbookJavaScriptServiceLocator service = new HandbookJavaScriptServiceLocator();
		SearchSessionBean editBean = service.getSearchSessionBeanPort();
		if (addButton) {
			editBean.addDefenition(getNameDefenition(), getBodyDefenition());
			addButton = false;
		}
		if (updateButton) {
			editBean.updateDefenition(getNameDefenition(), getBodyDefenition());
			updateButton = false;
		}
		if (deleteButton) {
			editBean.deleteDefenition(getNameDefenition());
			deleteButton = false;
		}
		return SUCCESS;
	}

	public void setUpdateButton(boolean updateButton) {
		this.updateButton = true;
	}

	public void setDeleteButton(boolean deleteButton) {
		this.deleteButton = true;
	}

	public void setAddButton(boolean addButton) {
		this.addButton = true;
	}

	public String getNameDefenition() {
		return nameDefenition;
	}

	public void setNameDefenition(String nameDefenition) {
		this.nameDefenition = nameDefenition;
	}

	public String getBodyDefenition() {
		return bodyDefenition;
	}

	public void setBodyDefenition(String bodyDefenition) {
		this.bodyDefenition = bodyDefenition;
	}
	
	private boolean isEmptyString(String value) {
		return value == null || "".equals(value.trim());
	}

	public void validate() {
		if (isEmptyString(nameDefenition)) 
			addFieldError("nameDefenition", "Fill nameDefenition");

	}

}
