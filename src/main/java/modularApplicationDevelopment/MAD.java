package modularApplicationDevelopment;

public class MAD {
    //Recommended for developers
    /*Instead of code in one big code base,
    create smaller modules and compose the application
    from these modules
    provides a small big of functionality to the larger
    application


    Modules (in those modules you have smaller parts)
    An Application is built around those smaller parts and makes
    up a bigger application
    Now it all gets smushed into 1 mono
    Then you can deploys these mini applications on different
     servers/machines
    You can have them talk to each other over the network
    And then together, these smaller applications work as the
    bigger application



    EXAMPLES
    User wants to see the shopping catalog(create shopping catalog application with functionality)
    Deployed on separate server(auto processing on server)
    Web View Application makes a REST api call to the Catalog
    Application's API requesting to see the List of products
    to show.
    API redunes the List
    The View Application redunes the HTML for that List

    Mini Applications talk to each other over the network
     by calling each other's REST API's to get whatever they want
     from eachother

     Advantages:
     Risk of deployment is eased
     Making a change to just the Shopping catalog application
     can be tested and deploy just that because it's a whole
      separate application

      Scaling is not problem

      Mini applications = microservices
      Way of breaking your application or service down into
      stand alone independent applications that can be run on different
      hardware
      Talk to each other over REST API's together to provide the
      functionality of the bigger application

     */
}
