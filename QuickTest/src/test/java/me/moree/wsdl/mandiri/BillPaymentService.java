
package me.moree.wsdl.mandiri;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BillPaymentService", targetNamespace = "bankmandiri.h2h.billpayment.ws", wsdlLocation = "file:/D:/IdeaProjects/2018/BillPaymentService.wsdl")
public class BillPaymentService
    extends Service
{

    private final static URL BILLPAYMENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException BILLPAYMENTSERVICE_EXCEPTION;
    private final static QName BILLPAYMENTSERVICE_QNAME = new QName("bankmandiri.h2h.billpayment.ws", "BillPaymentService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/IdeaProjects/2018/BillPaymentService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BILLPAYMENTSERVICE_WSDL_LOCATION = url;
        BILLPAYMENTSERVICE_EXCEPTION = e;
    }

    public BillPaymentService() {
        super(__getWsdlLocation(), BILLPAYMENTSERVICE_QNAME);
    }

    public BillPaymentService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BILLPAYMENTSERVICE_QNAME, features);
    }

    public BillPaymentService(URL wsdlLocation) {
        super(wsdlLocation, BILLPAYMENTSERVICE_QNAME);
    }

    public BillPaymentService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BILLPAYMENTSERVICE_QNAME, features);
    }

    public BillPaymentService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BillPaymentService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BillPaymentServiceSoap
     */
    @WebEndpoint(name = "BillPaymentServiceSoap")
    public BillPaymentServiceSoap getBillPaymentServiceSoap() {
        return super.getPort(new QName("bankmandiri.h2h.billpayment.ws", "BillPaymentServiceSoap"), BillPaymentServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BillPaymentServiceSoap
     */
    @WebEndpoint(name = "BillPaymentServiceSoap")
    public BillPaymentServiceSoap getBillPaymentServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("bankmandiri.h2h.billpayment.ws", "BillPaymentServiceSoap"), BillPaymentServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BILLPAYMENTSERVICE_EXCEPTION!= null) {
            throw BILLPAYMENTSERVICE_EXCEPTION;
        }
        return BILLPAYMENTSERVICE_WSDL_LOCATION;
    }

}
