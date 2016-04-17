/**
 * HandbookJavaScriptServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bsuir.soap.ejb.handbook;

public class HandbookJavaScriptServiceLocator extends org.apache.axis.client.Service implements bsuir.soap.ejb.handbook.HandbookJavaScriptService {

    public HandbookJavaScriptServiceLocator() {
    }


    public HandbookJavaScriptServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HandbookJavaScriptServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SearchSessionBeanPort
    private java.lang.String SearchSessionBeanPort_address = "http://localhost:8080/HandbookJSEJBModule7/HandbookJavaScriptService/SearchSessionBean";

    public java.lang.String getSearchSessionBeanPortAddress() {
        return SearchSessionBeanPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SearchSessionBeanPortWSDDServiceName = "SearchSessionBeanPort";

    public java.lang.String getSearchSessionBeanPortWSDDServiceName() {
        return SearchSessionBeanPortWSDDServiceName;
    }

    public void setSearchSessionBeanPortWSDDServiceName(java.lang.String name) {
        SearchSessionBeanPortWSDDServiceName = name;
    }

    public bsuir.soap.ejb.handbook.SearchSessionBean getSearchSessionBeanPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SearchSessionBeanPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSearchSessionBeanPort(endpoint);
    }

    public bsuir.soap.ejb.handbook.SearchSessionBean getSearchSessionBeanPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            bsuir.soap.ejb.handbook.HandbookJavaScriptServiceSoapBindingStub _stub = new bsuir.soap.ejb.handbook.HandbookJavaScriptServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSearchSessionBeanPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSearchSessionBeanPortEndpointAddress(java.lang.String address) {
        SearchSessionBeanPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (bsuir.soap.ejb.handbook.SearchSessionBean.class.isAssignableFrom(serviceEndpointInterface)) {
                bsuir.soap.ejb.handbook.HandbookJavaScriptServiceSoapBindingStub _stub = new bsuir.soap.ejb.handbook.HandbookJavaScriptServiceSoapBindingStub(new java.net.URL(SearchSessionBeanPort_address), this);
                _stub.setPortName(getSearchSessionBeanPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SearchSessionBeanPort".equals(inputPortName)) {
            return getSearchSessionBeanPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://handbook.ejb.soap.bsuir/", "HandbookJavaScriptService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://handbook.ejb.soap.bsuir/", "SearchSessionBeanPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SearchSessionBeanPort".equals(portName)) {
            setSearchSessionBeanPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
