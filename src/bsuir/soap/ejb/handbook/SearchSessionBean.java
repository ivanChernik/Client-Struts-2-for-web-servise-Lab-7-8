/**
 * SearchSessionBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bsuir.soap.ejb.handbook;

public interface SearchSessionBean extends java.rmi.Remote {
    public void deleteDefenition(java.lang.String arg0) throws java.rmi.RemoteException;
    public void addDefenition(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public java.lang.String searchDefenition(java.lang.String arg0) throws java.rmi.RemoteException;
    public void updateDefenition(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
}
