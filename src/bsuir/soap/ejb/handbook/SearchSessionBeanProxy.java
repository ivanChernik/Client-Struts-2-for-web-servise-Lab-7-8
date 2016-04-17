package bsuir.soap.ejb.handbook;

public class SearchSessionBeanProxy implements bsuir.soap.ejb.handbook.SearchSessionBean {
  private String _endpoint = null;
  private bsuir.soap.ejb.handbook.SearchSessionBean searchSessionBean = null;
  
  public SearchSessionBeanProxy() {
    _initSearchSessionBeanProxy();
  }
  
  public SearchSessionBeanProxy(String endpoint) {
    _endpoint = endpoint;
    _initSearchSessionBeanProxy();
  }
  
  private void _initSearchSessionBeanProxy() {
    try {
      searchSessionBean = (new bsuir.soap.ejb.handbook.HandbookJavaScriptServiceLocator()).getSearchSessionBeanPort();
      if (searchSessionBean != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)searchSessionBean)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)searchSessionBean)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (searchSessionBean != null)
      ((javax.xml.rpc.Stub)searchSessionBean)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public bsuir.soap.ejb.handbook.SearchSessionBean getSearchSessionBean() {
    if (searchSessionBean == null)
      _initSearchSessionBeanProxy();
    return searchSessionBean;
  }
  
  public void deleteDefenition(java.lang.String arg0) throws java.rmi.RemoteException{
    if (searchSessionBean == null)
      _initSearchSessionBeanProxy();
    searchSessionBean.deleteDefenition(arg0);
  }
  
  public void addDefenition(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (searchSessionBean == null)
      _initSearchSessionBeanProxy();
    searchSessionBean.addDefenition(arg0, arg1);
  }
  
  public java.lang.String searchDefenition(java.lang.String arg0) throws java.rmi.RemoteException{
    if (searchSessionBean == null)
      _initSearchSessionBeanProxy();
    return searchSessionBean.searchDefenition(arg0);
  }
  
  public void updateDefenition(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (searchSessionBean == null)
      _initSearchSessionBeanProxy();
    searchSessionBean.updateDefenition(arg0, arg1);
  }
  
  
}