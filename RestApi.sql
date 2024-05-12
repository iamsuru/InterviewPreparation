Ques.What is an API ?
Ans. Api is an interface that allows two applications to communicate with each other over the internet through various devices.


Ques. What is REST API?
Ans. REST is an abbreviation for Representational State Transform. It is an architectural style for an API that uses HTTP methods to access & use data.

For creating REST API we must have to use http verbs -:GET, POST, PUT/PATCH, DELETE

And end point must be same for CRUD Operations-:

		WRONG		|		RIGHT
--------------------|------------------
C /api/createUser	|	/api/user
R /api/readUser		|	/api/user
U /api/updateUser	|	/api/user
D /api/deleteUser	|	/api/user


Ques. What do you mean by RESTful web services?
Ans. REST API is also known as RESTful web services that follow the REST architecture.

Ques. Explain the architectural style for creating web API?
Ans. The architectural style for creating web api are -
-> HTTP for client server communication
-> XML/JSON as formatting language
-> Simple URI as the address for the services
-> Stateless communication

Ques. Mention whether you can use GET request instead of PUT to create a resource?
Ans. No, you are not supposed to use PUT for GET. GET operations should only have view rights, while PUT resource is used for updating a data.

Ques. Mention what are resources in a REST architecture?
Ans. In REST, every accessible piece of content on the server is labeled as a resource. A resource is an object with a type, associated data, a relationship with other resources on the server, and a list of methods that can be used with it. For example, a resource could be an HTML or text file, a data file, an image or video, or an executable code file.

A resource is identified with a URI. Clients access resources by including their URIs in HTTP requests.

Ques. Mention some key characteristics of REST?
Ans. Some key characteristics of REST includes -

-> REST is stateless, therefore the SERVER has no state (or session data)
-> With a well-applied REST API, the server could be restarted between two calls as every data is passed to the server
-> Web service mostly uses POST method to make operations, whereas REST uses GET to access resources

Ques. Mention what is the difference between PUT and POST?
Ans. “PUT” puts a file or resource at a particular URI and exactly at that URI. If there is already a file or resource at that URI, PUT changes that file or resource. If there is no resource or file there, PUT makes one

POST sends data to a particular URI and expects the resource at that URI to deal with the request. The web server at this point can decide what to do with the data in the context of specified resource

PUT is idempotent meaning, invoking it any number of times will not have an impact on resources.

However, POST is not idempotent, meaning if you invoke POST multiple times it keeps creating more resources

Ques.  Mention which markup language can be used in restful web api?
Ans. JSON and XML are the two markup language that can be used in restful web api.

Ques. Which protocol do REST APIs use?
Ans. REST APIs use the HTTP protocol to communicate with clients. This allows REST APIs to be easily deployed over the internet, since HTTP is the same protocol that is used to deliver web pages to client browsers.

Ques. What is a URI?
Ans. URI stands for uniform resource identifier. In REST, a URI is a string that identifies a resource on a web server. Each resource has its own unique URI, which, when included in an HTTP request, allows clients to target that resource and perform actions on it. The process of targeting a resource with its URI is called “addressing.”


Ques. What is messaging in the context of REST?
Answer: In REST, messaging refers to the back-and-forth communication between the client and API. An interaction always starts with the client messaging the API with an HTTP request. The API processes this request. It then sends back an HTTP response that gives the status of the request and any resources the client asked for.

Ques. What are the main parts of an HTTP request?
Answer: HTTP requests are sent by the client to the API. They request data or perform some action on the server. There are five main components of an HTTP request in REST:

Start line-> Indicates the intended action of the request and includes:
	->A request method that indicates the HTTP request method to be performed on the resource (i.e., GET, POST, PUT, DELETE).

	->A URI that identifies the requested resource on the server.

	->The HTTP version being used, which signals which version the API should respond with.

HTTP request header-> Lists metadata about the request, such as the user agent, file formats the client will accept, the format of the request body, language, caching preferences, etc.

HTTP request body-> Contains any data associated with the request. This is only necessary if the request is to modify data on the server with the POST or PUT methods.

Ques. Which markup languages are primarily used to represent resources in REST APIs?
Answer: In REST APIs, XML (extensible markup language) and JSON (JavaScript Object Notation) are the two most common languages for representing resources.


Ques. What does it mean for an API to be stateless?
Answer: Statelessness is one of the key principles of REST architecture. In stateless communication, the server does not store any information about previous communications. In other words, the client and server do not know each other’s state.

Every request and response is a new interaction, and each request includes everything the server needs to give a successful response.


Ques. What is caching?
Answer: Caching is the method of temporarily storing a copy of a server response in a location (like computer memory) in order to retrieve it more quickly in the future.

When working with REST APIs, Caching improves server performance by reducing the work the server has to do to fulfill the request. Caching also makes applications that use the API run faster since they don’t need to send a new request every time they need a resource.

The cache duration of a resource (i.e., how long the resource can be cached by the client before the resource is retrieved again) is specified in the HTTP response header with the Cache-Control field.


Ques. What is payload?
Answer: “Payload” refers to the data in the body of the HTTP request and/or response messages in GET or POST requests.

For example, if you request a specific tweet from the X API, the payload comprises the document containing the tweet text and any associated files for rendering the tweet on a page.

Payload can also be included in the HTTP request with the POST method. If you want to post a tweet through X’s API, the tweet text that you send in your POST request is the payload.

Statelessness simplifies client-server interactions because the server does not rely on past requests to process future requests and, thus, does not need to consume space and resources storing data from these requests.

Ques. What is the difference between REST and AJAX?
Answer: Asynchronous JavaScript, or AJAX, is a set of web development techniques used in web applications. At its core, AJAX allows a web page to make requests to a server and update the page interface without needing to refresh.

An AJAX client might use REST APIs with its requests, but AJAX doesn’t have to work with REST APIs exclusively. REST APIs can communicate with any client, whether the client uses AJAX or not.

Unlike REST, which uses HTTP requests and responses for messaging, AJAX sends its requests to the server with the XMLHttpRequest object that is built into JavaScript. Server responses are executed by the page’s JavaScript code to alter the page content.

