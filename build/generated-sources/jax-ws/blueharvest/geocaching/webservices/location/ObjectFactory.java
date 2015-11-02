
package blueharvest.geocaching.webservices.location;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the blueharvest.geocaching.webservices.location package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ServiceCredentials_QNAME = new QName("http://blueharvestgeo.com/webservices/", "ServiceCredentials");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: blueharvest.geocaching.webservices.location
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertLocationResponse }
     * 
     */
    public InsertLocationResponse createInsertLocationResponse() {
        return new InsertLocationResponse();
    }

    /**
     * Create an instance of {@link ServiceCredentials }
     * 
     */
    public ServiceCredentials createServiceCredentials() {
        return new ServiceCredentials();
    }

    /**
     * Create an instance of {@link GetLocationByCoordinates }
     * 
     */
    public GetLocationByCoordinates createGetLocationByCoordinates() {
        return new GetLocationByCoordinates();
    }

    /**
     * Create an instance of {@link GetLocation }
     * 
     */
    public GetLocation createGetLocation() {
        return new GetLocation();
    }

    /**
     * Create an instance of {@link UpdateLocation }
     * 
     */
    public UpdateLocation createUpdateLocation() {
        return new UpdateLocation();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link GetLocationResponse }
     * 
     */
    public GetLocationResponse createGetLocationResponse() {
        return new GetLocationResponse();
    }

    /**
     * Create an instance of {@link GetLocationByCoordinatesResponse }
     * 
     */
    public GetLocationByCoordinatesResponse createGetLocationByCoordinatesResponse() {
        return new GetLocationByCoordinatesResponse();
    }

    /**
     * Create an instance of {@link InsertLocation }
     * 
     */
    public InsertLocation createInsertLocation() {
        return new InsertLocation();
    }

    /**
     * Create an instance of {@link UpdateLocationResponse }
     * 
     */
    public UpdateLocationResponse createUpdateLocationResponse() {
        return new UpdateLocationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCredentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueharvestgeo.com/webservices/", name = "ServiceCredentials")
    public JAXBElement<ServiceCredentials> createServiceCredentials(ServiceCredentials value) {
        return new JAXBElement<ServiceCredentials>(_ServiceCredentials_QNAME, ServiceCredentials.class, null, value);
    }

}
