# RESTFull_API
REST APIs demo.
REST API implementation using

<p><B>0. Java</b>
<p><B>1. Jersey
<p><B>2. Servlet Container: Tomcat 8.5
<p><B>3. JSON: XMLRootElement


 Rules regarding "return" returning Object from the REST API method().
* 1. MediaType.TEXT_PLAIN,MediaType.TEXT_HTML MUST return String.
* 2. MediaType.APPLICATION_XML, APPLICATION_JSON MUST return Object, with class annoted with XMLRootElement.
* 3. MediaType.TEXT_XML can either return String or an Object. 
	 
