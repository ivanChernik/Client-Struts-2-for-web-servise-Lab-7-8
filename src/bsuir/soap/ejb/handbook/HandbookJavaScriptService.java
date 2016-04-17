/**
 * HandbookJavaScriptService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bsuir.soap.ejb.handbook;

public interface HandbookJavaScriptService extends javax.xml.rpc.Service {
    public java.lang.String getSearchSessionBeanPortAddress();

    public bsuir.soap.ejb.handbook.SearchSessionBean getSearchSessionBeanPort() throws javax.xml.rpc.ServiceException;

    public bsuir.soap.ejb.handbook.SearchSessionBean getSearchSessionBeanPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
