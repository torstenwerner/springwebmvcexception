A simple demonstration project to reproduce a bug in spring webmvc 5.
Executing GET http://localhost:8080/ will throw an exception:

    java.lang.ClassCastException: java.lang.String cannot be cast to org.springframework.core.io.support.ResourceRegion
    	at org.springframework.http.converter.ResourceRegionHttpMessageConverter.writeResourceRegionCollection(ResourceRegionHttpMessageConverter.java:182) ~[spring-web-5.0.6.RELEASE.jar:5.0.6.RELEASE]
    	at org.springframework.http.converter.ResourceRegionHttpMessageConverter.writeInternal(ResourceRegionHttpMessageConverter.java:139) ~[spring-web-5.0.6.RELEASE.jar:5.0.6.RELEASE]
    	at org.springframework.http.converter.AbstractGenericHttpMessageConverter.write(AbstractGenericHttpMessageConverter.java:102) ~[spring-web-5.0.6.RELEASE.jar:5.0.6.RELEASE]
    	at org.springframework.web.servlet.mvc.method.annotation.AbstractMessageConverterMethodProcessor.writeWithMessageConverters(AbstractMessageConverterMethodProcessor.java:272) ~[spring-webmvc-5.0.6.RELEASE.jar:5.0.6.RELEASE]
    	at org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor.handleReturnValue(RequestResponseBodyMethodProcessor.java:180) ~[spring-webmvc-5.0.6.RELEASE.jar:5.0.6.RELEASE]
    	at org.springframework.web.method.support.HandlerMethodReturnValueHandlerComposite.handleReturnValue(HandlerMethodReturnValueHandlerComposite.java:82) ~[spring-web-5.0.6.RELEASE.jar:5.0.6.RELEASE]
    	at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:119) ~[spring-webmvc-5.0.6.RELEASE.jar:5.0.6.RELEASE]
    	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:877) ~[spring-webmvc-5.0.6.RELEASE.jar:5.0.6.RELEASE]
    	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:783) ~[spring-webmvc-5.0.6.RELEASE.jar:5.0.6.RELEASE]
    	at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87) ~[spring-webmvc-5.0.6.RELEASE.jar:5.0.6.RELEASE]
    	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:991) ~[spring-webmvc-5.0.6.RELEASE.jar:5.0.6.RELEASE]
    	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:925) ~[spring-webmvc-5.0.6.RELEASE.jar:5.0.6.RELEASE]
    	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:974) ~[spring-webmvc-5.0.6.RELEASE.jar:5.0.6.RELEASE]
    	at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:866) ~[spring-webmvc-5.0.6.RELEASE.jar:5.0.6.RELEASE]
    	at javax.servlet.http.HttpServlet.service(HttpServlet.java:635) ~[tomcat-embed-core-8.5.31.jar:8.5.31]
    	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:851) ~[spring-webmvc-5.0.6.RELEASE.jar:5.0.6.RELEASE]
