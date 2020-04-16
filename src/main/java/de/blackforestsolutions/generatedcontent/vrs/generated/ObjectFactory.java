package de.blackforestsolutions.generatedcontent.vrs.generated;//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.04.16 um 01:21:02 PM CEST 
//

import de.blackforestsolutions.generatedcontent.vrs.*;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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

    private final static QName _BBox_QNAME = new QName("", "BBox");
    private final static QName _Coords_QNAME = new QName("", "Coords");
    private final static QName _Request_QNAME = new QName("", "Request");
    private final static QName _Response_QNAME = new QName("", "Response");
    private final static QName _RequestJourneyTypeModePublicTransportOrigin_QNAME = new QName("", "Origin");
    private final static QName _RequestJourneyTypeModePublicTransportVia_QNAME = new QName("", "Via");
    private final static QName _RequestJourneyTypeModePublicTransportDestination_QNAME = new QName("", "Destination");
    private final static QName _RequestJourneyTypeModePublicTransportSearchInterval_QNAME = new QName("", "SearchInterval");
    private final static QName _RequestJourneyTypeModePublicTransportProduct_QNAME = new QName("", "Product");
    private final static QName _RequestJourneyTypeModePublicTransportSupplementalPayment_QNAME = new QName("", "SupplementalPayment");
    private final static QName _RequestJourneyTypeModePublicTransportDisabledAccessRequired_QNAME = new QName("", "DisabledAccessRequired");
    private final static QName _RequestJourneyTypeModePublicTransportRadiusExtensionOrigin_QNAME = new QName("", "RadiusExtensionOrigin");
    private final static QName _RequestJourneyTypeModePublicTransportRadiusExtensionDestination_QNAME = new QName("", "RadiusExtensionDestination");
    private final static QName _RequestJourneyTypeModePublicTransportShortRadiusExtension_QNAME = new QName("", "ShortRadiusExtension");
    private final static QName _RequestJourneyTypeModePublicTransportLittleTransfer_QNAME = new QName("", "LittleTransfer");
    private final static QName _RequestJourneyTypeModePublicTransportFastRoute_QNAME = new QName("", "FastRoute");
    private final static QName _RequestJourneyTypeModePublicTransportTransferSpeed_QNAME = new QName("", "TransferSpeed");
    private final static QName _RequestJourneyTypeModePublicTransportWalkSpeed_QNAME = new QName("", "WalkSpeed");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VehicleJourneyType }
     * 
     */
    public VehicleJourneyType createVehicleJourneyType() {
        return new VehicleJourneyType();
    }

    /**
     * Create an instance of {@link TariffType }
     * 
     */
    public TariffType createTariffType() {
        return new TariffType();
    }

    /**
     * Create an instance of {@link StreetType }
     * 
     */
    public StreetType createStreetType() {
        return new StreetType();
    }

    /**
     * Create an instance of {@link StopType }
     * 
     */
    public StopType createStopType() {
        return new StopType();
    }

    /**
     * Create an instance of {@link StopPublicTransportType }
     * 
     */
    public StopPublicTransportType createStopPublicTransportType() {
        return new StopPublicTransportType();
    }

    /**
     * Create an instance of {@link SegmentWalkType }
     * 
     */
    public SegmentWalkType createSegmentWalkType() {
        return new SegmentWalkType();
    }

    /**
     * Create an instance of {@link SegmentPublicTransportType }
     * 
     */
    public SegmentPublicTransportType createSegmentPublicTransportType() {
        return new SegmentPublicTransportType();
    }

    /**
     * Create an instance of {@link SearchSetType }
     * 
     */
    public SearchSetType createSearchSetType() {
        return new SearchSetType();
    }

    /**
     * Create an instance of {@link RouteType }
     * 
     */
    public RouteType createRouteType() {
        return new RouteType();
    }

    /**
     * Create an instance of {@link ResponseStopTimetableType }
     * 
     */
    public ResponseStopTimetableType createResponseStopTimetableType() {
        return new ResponseStopTimetableType();
    }

    /**
     * Create an instance of {@link ResponseStopTimetableType.StopEvents }
     * 
     */
    public ResponseStopTimetableType.StopEvents createResponseStopTimetableTypeStopEvents() {
        return new ResponseStopTimetableType.StopEvents();
    }

    /**
     * Create an instance of {@link ResponseJourneyType }
     * 
     */
    public ResponseJourneyType createResponseJourneyType() {
        return new ResponseJourneyType();
    }

    /**
     * Create an instance of {@link RequestShortHaulType }
     * 
     */
    public RequestShortHaulType createRequestShortHaulType() {
        return new RequestShortHaulType();
    }

    /**
     * Create an instance of {@link RequestShortHaulType.Options }
     * 
     */
    public RequestShortHaulType.Options createRequestShortHaulTypeOptions() {
        return new RequestShortHaulType.Options();
    }

    /**
     * Create an instance of {@link RequestStopTimetableType }
     * 
     */
    public RequestStopTimetableType createRequestStopTimetableType() {
        return new RequestStopTimetableType();
    }

    /**
     * Create an instance of {@link RequestStopTimetableType.Options }
     * 
     */
    public RequestStopTimetableType.Options createRequestStopTimetableTypeOptions() {
        return new RequestStopTimetableType.Options();
    }

    /**
     * Create an instance of {@link ResponseMonitorType }
     * 
     */
    public ResponseMonitorType createResponseMonitorType() {
        return new ResponseMonitorType();
    }

    /**
     * Create an instance of {@link ResponseMonitorType.MonitorSegment }
     * 
     */
    public ResponseMonitorType.MonitorSegment createResponseMonitorTypeMonitorSegment() {
        return new ResponseMonitorType.MonitorSegment();
    }

    /**
     * Create an instance of {@link RequestObjectInfoType }
     * 
     */
    public RequestObjectInfoType createRequestObjectInfoType() {
        return new RequestObjectInfoType();
    }

    /**
     * Create an instance of {@link RequestObjectInfoType.Options }
     * 
     */
    public RequestObjectInfoType.Options createRequestObjectInfoTypeOptions() {
        return new RequestObjectInfoType.Options();
    }

    /**
     * Create an instance of {@link RequestJourneyType }
     * 
     */
    public RequestJourneyType createRequestJourneyType() {
        return new RequestJourneyType();
    }

    /**
     * Create an instance of {@link RequestJourneyType.Options }
     * 
     */
    public RequestJourneyType.Options createRequestJourneyTypeOptions() {
        return new RequestJourneyType.Options();
    }

    /**
     * Create an instance of {@link RequestJourneyType.Mode }
     * 
     */
    public RequestJourneyType.Mode createRequestJourneyTypeMode() {
        return new RequestJourneyType.Mode();
    }

    /**
     * Create an instance of {@link RequestJourneyType.Mode.Walk }
     * 
     */
    public RequestJourneyType.Mode.Walk createRequestJourneyTypeModeWalk() {
        return new RequestJourneyType.Mode.Walk();
    }

    /**
     * Create an instance of {@link ObjectSearchType }
     * 
     */
    public ObjectSearchType createObjectSearchType() {
        return new ObjectSearchType();
    }

    /**
     * Create an instance of {@link RequestJourneyType.Mode.Bicycle }
     * 
     */
    public RequestJourneyType.Mode.Bicycle createRequestJourneyTypeModeBicycle() {
        return new RequestJourneyType.Mode.Bicycle();
    }

    /**
     * Create an instance of {@link RequestJourneyType.Mode.Car }
     * 
     */
    public RequestJourneyType.Mode.Car createRequestJourneyTypeModeCar() {
        return new RequestJourneyType.Mode.Car();
    }

    /**
     * Create an instance of {@link RequestJourneyType.Mode.PublicTransport }
     * 
     */
    public RequestJourneyType.Mode.PublicTransport createRequestJourneyTypeModePublicTransport() {
        return new RequestJourneyType.Mode.PublicTransport();
    }

    /**
     * Create an instance of {@link POIType }
     * 
     */
    public POIType createPOIType() {
        return new POIType();
    }

    /**
     * Create an instance of {@link LineType }
     * 
     */
    public LineType createLineType() {
        return new LineType();
    }

    /**
     * Create an instance of {@link LegWalkType }
     * 
     */
    public LegWalkType createLegWalkType() {
        return new LegWalkType();
    }

    /**
     * Create an instance of {@link LegPublicTransportType }
     * 
     */
    public LegPublicTransportType createLegPublicTransportType() {
        return new LegPublicTransportType();
    }

    /**
     * Create an instance of {@link LegCarType }
     * 
     */
    public LegCarType createLegCarType() {
        return new LegCarType();
    }

    /**
     * Create an instance of {@link LegBicycleType }
     * 
     */
    public LegBicycleType createLegBicycleType() {
        return new LegBicycleType();
    }

    /**
     * Create an instance of {@link DistrictType }
     * 
     */
    public DistrictType createDistrictType() {
        return new DistrictType();
    }

    /**
     * Create an instance of {@link CityType }
     * 
     */
    public CityType createCityType() {
        return new CityType();
    }

    /**
     * Create an instance of {@link CategoryPOIType }
     * 
     */
    public CategoryPOIType createCategoryPOIType() {
        return new CategoryPOIType();
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link RequestType.Monitor }
     * 
     */
    public RequestType.Monitor createRequestTypeMonitor() {
        return new RequestType.Monitor();
    }

    /**
     * Create an instance of {@link RequestType.Monitor.MonitorSegment }
     * 
     */
    public RequestType.Monitor.MonitorSegment createRequestTypeMonitorMonitorSegment() {
        return new RequestType.Monitor.MonitorSegment();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link DestinationType }
     * 
     */
    public DestinationType createDestinationType() {
        return new DestinationType();
    }

    /**
     * Create an instance of {@link DirectionsType }
     * 
     */
    public DirectionsType createDirectionsType() {
        return new DirectionsType();
    }

    /**
     * Create an instance of {@link DirectionType }
     * 
     */
    public DirectionType createDirectionType() {
        return new DirectionType();
    }

    /**
     * Create an instance of {@link GeoLineType }
     * 
     */
    public GeoLineType createGeoLineType() {
        return new GeoLineType();
    }

    /**
     * Create an instance of {@link GeoPointType }
     * 
     */
    public GeoPointType createGeoPointType() {
        return new GeoPointType();
    }

    /**
     * Create an instance of {@link GeoRectangleType }
     * 
     */
    public GeoRectangleType createGeoRectangleType() {
        return new GeoRectangleType();
    }

    /**
     * Create an instance of {@link GroupReferenceType }
     * 
     */
    public GroupReferenceType createGroupReferenceType() {
        return new GroupReferenceType();
    }

    /**
     * Create an instance of {@link InfoMessagesType }
     * 
     */
    public InfoMessagesType createInfoMessagesType() {
        return new InfoMessagesType();
    }

    /**
     * Create an instance of {@link InfoMessageType }
     * 
     */
    public InfoMessageType createInfoMessageType() {
        return new InfoMessageType();
    }

    /**
     * Create an instance of {@link MonitorSegmentType }
     * 
     */
    public MonitorSegmentType createMonitorSegmentType() {
        return new MonitorSegmentType();
    }

    /**
     * Create an instance of {@link MonitorSegmentResponseType }
     * 
     */
    public MonitorSegmentResponseType createMonitorSegmentResponseType() {
        return new MonitorSegmentResponseType();
    }

    /**
     * Create an instance of {@link MonitorLineType }
     * 
     */
    public MonitorLineType createMonitorLineType() {
        return new MonitorLineType();
    }

    /**
     * Create an instance of {@link MonitorLineOriginType }
     * 
     */
    public MonitorLineOriginType createMonitorLineOriginType() {
        return new MonitorLineOriginType();
    }

    /**
     * Create an instance of {@link MonitorLineDestinationType }
     * 
     */
    public MonitorLineDestinationType createMonitorLineDestinationType() {
        return new MonitorLineDestinationType();
    }

    /**
     * Create an instance of {@link MonitorOriginType }
     * 
     */
    public MonitorOriginType createMonitorOriginType() {
        return new MonitorOriginType();
    }

    /**
     * Create an instance of {@link MonitorDestinationType }
     * 
     */
    public MonitorDestinationType createMonitorDestinationType() {
        return new MonitorDestinationType();
    }

    /**
     * Create an instance of {@link ObjectsType }
     * 
     */
    public ObjectsType createObjectsType() {
        return new ObjectsType();
    }

    /**
     * Create an instance of {@link OriginType }
     * 
     */
    public OriginType createOriginType() {
        return new OriginType();
    }

    /**
     * Create an instance of {@link RequestMonitorType }
     * 
     */
    public RequestMonitorType createRequestMonitorType() {
        return new RequestMonitorType();
    }

    /**
     * Create an instance of {@link RequestPingType }
     * 
     */
    public RequestPingType createRequestPingType() {
        return new RequestPingType();
    }

    /**
     * Create an instance of {@link ResponseJourneyObjectType }
     * 
     */
    public ResponseJourneyObjectType createResponseJourneyObjectType() {
        return new ResponseJourneyObjectType();
    }

    /**
     * Create an instance of {@link ResponseObjectInfoType }
     * 
     */
    public ResponseObjectInfoType createResponseObjectInfoType() {
        return new ResponseObjectInfoType();
    }

    /**
     * Create an instance of {@link ResponsePingType }
     * 
     */
    public ResponsePingType createResponsePingType() {
        return new ResponsePingType();
    }

    /**
     * Create an instance of {@link ResponseStopTimeTableObjectType }
     * 
     */
    public ResponseStopTimeTableObjectType createResponseStopTimeTableObjectType() {
        return new ResponseStopTimeTableObjectType();
    }

    /**
     * Create an instance of {@link ResponseShortHaulType }
     * 
     */
    public ResponseShortHaulType createResponseShortHaulType() {
        return new ResponseShortHaulType();
    }

    /**
     * Create an instance of {@link SearchClassAddressType }
     * 
     */
    public SearchClassAddressType createSearchClassAddressType() {
        return new SearchClassAddressType();
    }

    /**
     * Create an instance of {@link SearchClassCategoryPOIType }
     * 
     */
    public SearchClassCategoryPOIType createSearchClassCategoryPOIType() {
        return new SearchClassCategoryPOIType();
    }

    /**
     * Create an instance of {@link SearchClassCityType }
     * 
     */
    public SearchClassCityType createSearchClassCityType() {
        return new SearchClassCityType();
    }

    /**
     * Create an instance of {@link SearchClassPOIType }
     * 
     */
    public SearchClassPOIType createSearchClassPOIType() {
        return new SearchClassPOIType();
    }

    /**
     * Create an instance of {@link SearchClassStopType }
     * 
     */
    public SearchClassStopType createSearchClassStopType() {
        return new SearchClassStopType();
    }

    /**
     * Create an instance of {@link SearchClassStreetType }
     * 
     */
    public SearchClassStreetType createSearchClassStreetType() {
        return new SearchClassStreetType();
    }

    /**
     * Create an instance of {@link SearchClassTariffRegionType }
     * 
     */
    public SearchClassTariffRegionType createSearchClassTariffRegionType() {
        return new SearchClassTariffRegionType();
    }

    /**
     * Create an instance of {@link SegmentBicycleType }
     * 
     */
    public SegmentBicycleType createSegmentBicycleType() {
        return new SegmentBicycleType();
    }

    /**
     * Create an instance of {@link SegmentCarType }
     * 
     */
    public SegmentCarType createSegmentCarType() {
        return new SegmentCarType();
    }

    /**
     * Create an instance of {@link SegmentsType }
     * 
     */
    public SegmentsType createSegmentsType() {
        return new SegmentsType();
    }

    /**
     * Create an instance of {@link SystemMessageErrorType }
     * 
     */
    public SystemMessageErrorType createSystemMessageErrorType() {
        return new SystemMessageErrorType();
    }

    /**
     * Create an instance of {@link SystemMessageResponseJourneyType }
     * 
     */
    public SystemMessageResponseJourneyType createSystemMessageResponseJourneyType() {
        return new SystemMessageResponseJourneyType();
    }

    /**
     * Create an instance of {@link SystemMessageResponseObjectInfoType }
     * 
     */
    public SystemMessageResponseObjectInfoType createSystemMessageResponseObjectInfoType() {
        return new SystemMessageResponseObjectInfoType();
    }

    /**
     * Create an instance of {@link SystemMessageResponseStopTimetableType }
     * 
     */
    public SystemMessageResponseStopTimetableType createSystemMessageResponseStopTimetableType() {
        return new SystemMessageResponseStopTimetableType();
    }

    /**
     * Create an instance of {@link SystemMessageResponseShortHaulType }
     * 
     */
    public SystemMessageResponseShortHaulType createSystemMessageResponseShortHaulType() {
        return new SystemMessageResponseShortHaulType();
    }

    /**
     * Create an instance of {@link SystemMessageStatusType }
     * 
     */
    public SystemMessageStatusType createSystemMessageStatusType() {
        return new SystemMessageStatusType();
    }

    /**
     * Create an instance of {@link SystemMessageType }
     * 
     */
    public SystemMessageType createSystemMessageType() {
        return new SystemMessageType();
    }

    /**
     * Create an instance of {@link SystemStatusType }
     * 
     */
    public SystemStatusType createSystemStatusType() {
        return new SystemStatusType();
    }

    /**
     * Create an instance of {@link VehicleJourneyType.Line }
     * 
     */
    public VehicleJourneyType.Line createVehicleJourneyTypeLine() {
        return new VehicleJourneyType.Line();
    }

    /**
     * Create an instance of {@link VehicleJourneyType.Vehicle }
     * 
     */
    public VehicleJourneyType.Vehicle createVehicleJourneyTypeVehicle() {
        return new VehicleJourneyType.Vehicle();
    }

    /**
     * Create an instance of {@link VehicleJourneyType.Stops }
     * 
     */
    public VehicleJourneyType.Stops createVehicleJourneyTypeStops() {
        return new VehicleJourneyType.Stops();
    }

    /**
     * Create an instance of {@link TariffType.TariffZones }
     * 
     */
    public TariffType.TariffZones createTariffTypeTariffZones() {
        return new TariffType.TariffZones();
    }

    /**
     * Create an instance of {@link StreetType.Name }
     * 
     */
    public StreetType.Name createStreetTypeName() {
        return new StreetType.Name();
    }

    /**
     * Create an instance of {@link StopType.NumberID }
     * 
     */
    public StopType.NumberID createStopTypeNumberID() {
        return new StopType.NumberID();
    }

    /**
     * Create an instance of {@link StopType.Name }
     * 
     */
    public StopType.Name createStopTypeName() {
        return new StopType.Name();
    }

    /**
     * Create an instance of {@link StopPublicTransportType.ArrivalTime }
     * 
     */
    public StopPublicTransportType.ArrivalTime createStopPublicTransportTypeArrivalTime() {
        return new StopPublicTransportType.ArrivalTime();
    }

    /**
     * Create an instance of {@link StopPublicTransportType.DepartureTime }
     * 
     */
    public StopPublicTransportType.DepartureTime createStopPublicTransportTypeDepartureTime() {
        return new StopPublicTransportType.DepartureTime();
    }

    /**
     * Create an instance of {@link SegmentWalkType.InfoMessages }
     * 
     */
    public SegmentWalkType.InfoMessages createSegmentWalkTypeInfoMessages() {
        return new SegmentWalkType.InfoMessages();
    }

    /**
     * Create an instance of {@link SegmentPublicTransportType.Origin }
     * 
     */
    public SegmentPublicTransportType.Origin createSegmentPublicTransportTypeOrigin() {
        return new SegmentPublicTransportType.Origin();
    }

    /**
     * Create an instance of {@link SegmentPublicTransportType.Destination }
     * 
     */
    public SegmentPublicTransportType.Destination createSegmentPublicTransportTypeDestination() {
        return new SegmentPublicTransportType.Destination();
    }

    /**
     * Create an instance of {@link SegmentPublicTransportType.Vias }
     * 
     */
    public SegmentPublicTransportType.Vias createSegmentPublicTransportTypeVias() {
        return new SegmentPublicTransportType.Vias();
    }

    /**
     * Create an instance of {@link SegmentPublicTransportType.DisabledAccessOrigin }
     * 
     */
    public SegmentPublicTransportType.DisabledAccessOrigin createSegmentPublicTransportTypeDisabledAccessOrigin() {
        return new SegmentPublicTransportType.DisabledAccessOrigin();
    }

    /**
     * Create an instance of {@link SegmentPublicTransportType.DisabledAccessDestination }
     * 
     */
    public SegmentPublicTransportType.DisabledAccessDestination createSegmentPublicTransportTypeDisabledAccessDestination() {
        return new SegmentPublicTransportType.DisabledAccessDestination();
    }

    /**
     * Create an instance of {@link SearchSetType.Union }
     * 
     */
    public SearchSetType.Union createSearchSetTypeUnion() {
        return new SearchSetType.Union();
    }

    /**
     * Create an instance of {@link RouteType.Legs }
     * 
     */
    public RouteType.Legs createRouteTypeLegs() {
        return new RouteType.Legs();
    }

    /**
     * Create an instance of {@link ResponseStopTimetableType.Lines }
     * 
     */
    public ResponseStopTimetableType.Lines createResponseStopTimetableTypeLines() {
        return new ResponseStopTimetableType.Lines();
    }

    /**
     * Create an instance of {@link ResponseStopTimetableType.StopEvents.StopEvent }
     * 
     */
    public ResponseStopTimetableType.StopEvents.StopEvent createResponseStopTimetableTypeStopEventsStopEvent() {
        return new ResponseStopTimetableType.StopEvents.StopEvent();
    }

    /**
     * Create an instance of {@link ResponseJourneyType.Routes }
     * 
     */
    public ResponseJourneyType.Routes createResponseJourneyTypeRoutes() {
        return new ResponseJourneyType.Routes();
    }

    /**
     * Create an instance of {@link RequestShortHaulType.Options.Output }
     * 
     */
    public RequestShortHaulType.Options.Output createRequestShortHaulTypeOptionsOutput() {
        return new RequestShortHaulType.Options.Output();
    }

    /**
     * Create an instance of {@link RequestStopTimetableType.SearchTime }
     * 
     */
    public RequestStopTimetableType.SearchTime createRequestStopTimetableTypeSearchTime() {
        return new RequestStopTimetableType.SearchTime();
    }

    /**
     * Create an instance of {@link RequestStopTimetableType.SearchInterval }
     * 
     */
    public RequestStopTimetableType.SearchInterval createRequestStopTimetableTypeSearchInterval() {
        return new RequestStopTimetableType.SearchInterval();
    }

    /**
     * Create an instance of {@link RequestStopTimetableType.Options.Output }
     * 
     */
    public RequestStopTimetableType.Options.Output createRequestStopTimetableTypeOptionsOutput() {
        return new RequestStopTimetableType.Options.Output();
    }

    /**
     * Create an instance of {@link ResponseMonitorType.MonitorSegment.Origin }
     * 
     */
    public ResponseMonitorType.MonitorSegment.Origin createResponseMonitorTypeMonitorSegmentOrigin() {
        return new ResponseMonitorType.MonitorSegment.Origin();
    }

    /**
     * Create an instance of {@link ResponseMonitorType.MonitorSegment.Destination }
     * 
     */
    public ResponseMonitorType.MonitorSegment.Destination createResponseMonitorTypeMonitorSegmentDestination() {
        return new ResponseMonitorType.MonitorSegment.Destination();
    }

    /**
     * Create an instance of {@link ResponseMonitorType.MonitorSegment.Next }
     * 
     */
    public ResponseMonitorType.MonitorSegment.Next createResponseMonitorTypeMonitorSegmentNext() {
        return new ResponseMonitorType.MonitorSegment.Next();
    }

    /**
     * Create an instance of {@link RequestObjectInfoType.Options.Output }
     * 
     */
    public RequestObjectInfoType.Options.Output createRequestObjectInfoTypeOptionsOutput() {
        return new RequestObjectInfoType.Options.Output();
    }

    /**
     * Create an instance of {@link RequestJourneyType.Via }
     * 
     */
    public RequestJourneyType.Via createRequestJourneyTypeVia() {
        return new RequestJourneyType.Via();
    }

    /**
     * Create an instance of {@link RequestJourneyType.SearchTime }
     * 
     */
    public RequestJourneyType.SearchTime createRequestJourneyTypeSearchTime() {
        return new RequestJourneyType.SearchTime();
    }

    /**
     * Create an instance of {@link RequestJourneyType.Options.Output }
     * 
     */
    public RequestJourneyType.Options.Output createRequestJourneyTypeOptionsOutput() {
        return new RequestJourneyType.Options.Output();
    }

    /**
     * Create an instance of {@link RequestJourneyType.Mode.Walk.Via }
     * 
     */
    public RequestJourneyType.Mode.Walk.Via createRequestJourneyTypeModeWalkVia() {
        return new RequestJourneyType.Mode.Walk.Via();
    }

    /**
     * Create an instance of {@link ObjectSearchType.Classes }
     * 
     */
    public ObjectSearchType.Classes createObjectSearchTypeClasses() {
        return new ObjectSearchType.Classes();
    }

    /**
     * Create an instance of {@link RequestJourneyType.Mode.Bicycle.Via }
     * 
     */
    public RequestJourneyType.Mode.Bicycle.Via createRequestJourneyTypeModeBicycleVia() {
        return new RequestJourneyType.Mode.Bicycle.Via();
    }

    /**
     * Create an instance of {@link RequestJourneyType.Mode.Car.Via }
     * 
     */
    public RequestJourneyType.Mode.Car.Via createRequestJourneyTypeModeCarVia() {
        return new RequestJourneyType.Mode.Car.Via();
    }

    /**
     * Create an instance of {@link RequestJourneyType.Mode.PublicTransport.SearchInterval }
     * 
     */
    public RequestJourneyType.Mode.PublicTransport.SearchInterval createRequestJourneyTypeModePublicTransportSearchInterval() {
        return new RequestJourneyType.Mode.PublicTransport.SearchInterval();
    }

    /**
     * Create an instance of {@link POIType.Name }
     * 
     */
    public POIType.Name createPOITypeName() {
        return new POIType.Name();
    }

    /**
     * Create an instance of {@link LineType.Name }
     * 
     */
    public LineType.Name createLineTypeName() {
        return new LineType.Name();
    }

    /**
     * Create an instance of {@link LegWalkType.Segments }
     * 
     */
    public LegWalkType.Segments createLegWalkTypeSegments() {
        return new LegWalkType.Segments();
    }

    /**
     * Create an instance of {@link LegPublicTransportType.Segments }
     * 
     */
    public LegPublicTransportType.Segments createLegPublicTransportTypeSegments() {
        return new LegPublicTransportType.Segments();
    }

    /**
     * Create an instance of {@link LegPublicTransportType.Costs }
     * 
     */
    public LegPublicTransportType.Costs createLegPublicTransportTypeCosts() {
        return new LegPublicTransportType.Costs();
    }

    /**
     * Create an instance of {@link LegPublicTransportType.TimetablePeriod }
     * 
     */
    public LegPublicTransportType.TimetablePeriod createLegPublicTransportTypeTimetablePeriod() {
        return new LegPublicTransportType.TimetablePeriod();
    }

    /**
     * Create an instance of {@link LegCarType.Segments }
     * 
     */
    public LegCarType.Segments createLegCarTypeSegments() {
        return new LegCarType.Segments();
    }

    /**
     * Create an instance of {@link LegCarType.Costs }
     * 
     */
    public LegCarType.Costs createLegCarTypeCosts() {
        return new LegCarType.Costs();
    }

    /**
     * Create an instance of {@link LegBicycleType.Segments }
     * 
     */
    public LegBicycleType.Segments createLegBicycleTypeSegments() {
        return new LegBicycleType.Segments();
    }

    /**
     * Create an instance of {@link DistrictType.Name }
     * 
     */
    public DistrictType.Name createDistrictTypeName() {
        return new DistrictType.Name();
    }

    /**
     * Create an instance of {@link CityType.Name }
     * 
     */
    public CityType.Name createCityTypeName() {
        return new CityType.Name();
    }

    /**
     * Create an instance of {@link CategoryPOIType.Name }
     * 
     */
    public CategoryPOIType.Name createCategoryPOITypeName() {
        return new CategoryPOIType.Name();
    }

    /**
     * Create an instance of {@link RequestType.Monitor.MonitorSegment.Next }
     * 
     */
    public RequestType.Monitor.MonitorSegment.Next createRequestTypeMonitorMonitorSegmentNext() {
        return new RequestType.Monitor.MonitorSegment.Next();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "BBox")
    public JAXBElement<String> createBBox(String value) {
        return new JAXBElement<String>(_BBox_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Coords")
    public JAXBElement<String> createCoords(String value) {
        return new JAXBElement<String>(_Coords_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Request")
    public JAXBElement<RequestType> createRequest(RequestType value) {
        return new JAXBElement<RequestType>(_Request_QNAME, RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Response")
    public JAXBElement<ResponseType> createResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_Response_QNAME, ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectSearchType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectSearchType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Origin", scope = RequestJourneyType.Mode.PublicTransport.class)
    public JAXBElement<ObjectSearchType> createRequestJourneyTypeModePublicTransportOrigin(ObjectSearchType value) {
        return new JAXBElement<ObjectSearchType>(_RequestJourneyTypeModePublicTransportOrigin_QNAME, ObjectSearchType.class, RequestJourneyType.Mode.PublicTransport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectSearchType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectSearchType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Via", scope = RequestJourneyType.Mode.PublicTransport.class)
    public JAXBElement<ObjectSearchType> createRequestJourneyTypeModePublicTransportVia(ObjectSearchType value) {
        return new JAXBElement<ObjectSearchType>(_RequestJourneyTypeModePublicTransportVia_QNAME, ObjectSearchType.class, RequestJourneyType.Mode.PublicTransport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectSearchType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectSearchType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Destination", scope = RequestJourneyType.Mode.PublicTransport.class)
    public JAXBElement<ObjectSearchType> createRequestJourneyTypeModePublicTransportDestination(ObjectSearchType value) {
        return new JAXBElement<ObjectSearchType>(_RequestJourneyTypeModePublicTransportDestination_QNAME, ObjectSearchType.class, RequestJourneyType.Mode.PublicTransport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestJourneyType.Mode.PublicTransport.SearchInterval }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestJourneyType.Mode.PublicTransport.SearchInterval }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "SearchInterval", scope = RequestJourneyType.Mode.PublicTransport.class)
    public JAXBElement<RequestJourneyType.Mode.PublicTransport.SearchInterval> createRequestJourneyTypeModePublicTransportSearchInterval(RequestJourneyType.Mode.PublicTransport.SearchInterval value) {
        return new JAXBElement<RequestJourneyType.Mode.PublicTransport.SearchInterval>(_RequestJourneyTypeModePublicTransportSearchInterval_QNAME, RequestJourneyType.Mode.PublicTransport.SearchInterval.class, RequestJourneyType.Mode.PublicTransport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublicTransportProductType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PublicTransportProductType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Product", scope = RequestJourneyType.Mode.PublicTransport.class)
    public JAXBElement<PublicTransportProductType> createRequestJourneyTypeModePublicTransportProduct(PublicTransportProductType value) {
        return new JAXBElement<PublicTransportProductType>(_RequestJourneyTypeModePublicTransportProduct_QNAME, PublicTransportProductType.class, RequestJourneyType.Mode.PublicTransport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "SupplementalPayment", scope = RequestJourneyType.Mode.PublicTransport.class, defaultValue = "0")
    public JAXBElement<Boolean> createRequestJourneyTypeModePublicTransportSupplementalPayment(Boolean value) {
        return new JAXBElement<Boolean>(_RequestJourneyTypeModePublicTransportSupplementalPayment_QNAME, Boolean.class, RequestJourneyType.Mode.PublicTransport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "DisabledAccessRequired", scope = RequestJourneyType.Mode.PublicTransport.class)
    public JAXBElement<String> createRequestJourneyTypeModePublicTransportDisabledAccessRequired(String value) {
        return new JAXBElement<String>(_RequestJourneyTypeModePublicTransportDisabledAccessRequired_QNAME, String.class, RequestJourneyType.Mode.PublicTransport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "RadiusExtensionOrigin", scope = RequestJourneyType.Mode.PublicTransport.class)
    public JAXBElement<BigInteger> createRequestJourneyTypeModePublicTransportRadiusExtensionOrigin(BigInteger value) {
        return new JAXBElement<BigInteger>(_RequestJourneyTypeModePublicTransportRadiusExtensionOrigin_QNAME, BigInteger.class, RequestJourneyType.Mode.PublicTransport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "RadiusExtensionDestination", scope = RequestJourneyType.Mode.PublicTransport.class)
    public JAXBElement<BigInteger> createRequestJourneyTypeModePublicTransportRadiusExtensionDestination(BigInteger value) {
        return new JAXBElement<BigInteger>(_RequestJourneyTypeModePublicTransportRadiusExtensionDestination_QNAME, BigInteger.class, RequestJourneyType.Mode.PublicTransport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ShortRadiusExtension", scope = RequestJourneyType.Mode.PublicTransport.class)
    public JAXBElement<BigInteger> createRequestJourneyTypeModePublicTransportShortRadiusExtension(BigInteger value) {
        return new JAXBElement<BigInteger>(_RequestJourneyTypeModePublicTransportShortRadiusExtension_QNAME, BigInteger.class, RequestJourneyType.Mode.PublicTransport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "LittleTransfer", scope = RequestJourneyType.Mode.PublicTransport.class)
    public JAXBElement<BigInteger> createRequestJourneyTypeModePublicTransportLittleTransfer(BigInteger value) {
        return new JAXBElement<BigInteger>(_RequestJourneyTypeModePublicTransportLittleTransfer_QNAME, BigInteger.class, RequestJourneyType.Mode.PublicTransport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "FastRoute", scope = RequestJourneyType.Mode.PublicTransport.class)
    public JAXBElement<BigInteger> createRequestJourneyTypeModePublicTransportFastRoute(BigInteger value) {
        return new JAXBElement<BigInteger>(_RequestJourneyTypeModePublicTransportFastRoute_QNAME, BigInteger.class, RequestJourneyType.Mode.PublicTransport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "TransferSpeed", scope = RequestJourneyType.Mode.PublicTransport.class, defaultValue = "1000")
    public JAXBElement<BigInteger> createRequestJourneyTypeModePublicTransportTransferSpeed(BigInteger value) {
        return new JAXBElement<BigInteger>(_RequestJourneyTypeModePublicTransportTransferSpeed_QNAME, BigInteger.class, RequestJourneyType.Mode.PublicTransport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "WalkSpeed", scope = RequestJourneyType.Mode.PublicTransport.class, defaultValue = "3")
    public JAXBElement<BigInteger> createRequestJourneyTypeModePublicTransportWalkSpeed(BigInteger value) {
        return new JAXBElement<BigInteger>(_RequestJourneyTypeModePublicTransportWalkSpeed_QNAME, BigInteger.class, RequestJourneyType.Mode.PublicTransport.class, value);
    }

}
