// Ques. What is Express.Js?
// Ans. Express.js is a web application framework for Node.js. It is an open-source platform for building server-side applications in JavaScript. It provides excellent features and tools to developers to develop web applications efficiently. Express.js helps developers to create and manage their applications and offers a wide range of customization options.

// Ques. Why use Express.Js?
// Ans. Express.js is a lightweight Node.js framework that gives us ability to create server-side web applications faster and smarter. The main reason for choosing Express is its simplicity, minimalism, flexibility, and scalability characteristics. It provides easy setup for middlewares and routing.


// Ques.  Differentiate between Node.js and Express.js?
// Ans. Node.js is the runtime environment that allows you to execute JavaScript on the server side, on the other hand Express.js is a framework built on top of Node.js that provides a set of tools for building web applications and APIs.

// Express.js is not the only framework available for Node.js, but it is widely used because to its simplicity and flexibility.

// Ques. Is Express JS a front-end or a back-end framework?
// Ans. Express.js is a JavaScript backend framework. It is mainly designed to develop complete web applications and APIs. Express is the backend component of the MERN stack which stands for MongoDB, Express.js, React.js, Node.js.


// Ques. Mentions few features of Express.js.
// Ans. Few features of the Express.js includes

// Routing: Express provides a simple way to define routes for handling HTTP requests. Routes are used to map different URLs to specific pieces of code, making it easy to organize your application’s logic.
// Middleware: Express uses middleware functions to perform tasks during the request-response cycle. Middleware functions have access to the request, response, and the next middleware function.
// HTTP Utility Methods: Express mainly used for handling HTTP methods like GET, POST, PUT, and DELETE. This makes it easy to define how the application should respond to different types of HTTP requests.
// Static File Serving: It can also serve static files, such as images, CSS, and JavaScript, with the help of built-in express.static middleware.
// Security: It includes features and middleware to strengthen the security of your web applications, such as the helmet middleware to secure your app.

// Ques. What are some popular alternatives to Express JS?
// Ans. There are several popular alternatives to Express.js which includes: Koa.js, Hapi.js, Sails.js, Fastify etc.

// Ques. Which major tools can be integrated with Express JS?
// Ans. There are many tools and libraries that can be integrated with Express.js such as:

// Database tools: MongoDB, MySQL, PostgreSQL.
// Template Engines: EJS, Pug, Mustache.
// Authentication libraries: Passport.js.
// Logging libraries: Morgan, Winston.
// Validation libraries: Joi, express-validator.
// ORM libraries: Sequelize, Mongoose.

// Ques. What is .env file used for?
// Ans. The .env file is used for storing sensitive information in a web application which we don’t want to expose to others like password, database connection string etc. It is a simple text file where each line represents a key-value pair, and these pairs are used to configure various aspects of the application.


// Ques. What are JWT?
// Ans. Json Web Tokens are mainly a token which is used for authentication and information exchange. When a user signs in to an application, the application then assigns JWT to that user. Subsequent requests by the user will include the assigned JWT. This token tells the server what routes, services, and resources the user is allowed to access. Json Web Token includes 3 part namely- Header, Payload and Signature.

// Ques. What is Bcrypt used for?
// Ans. Bcrypt is a password hashing function which is used to securely hash and store user passwords. It is designed to be slow and computationally intensive, making it resistant to brute-force attacks and rainbow table attacks. Bcrypt is a key component in enhancing the security of user authentication systems.


// Ques. What do you understand about ESLint?
// Ans. EsLint is a JavaScript linting tool which is used for automatically detecting incorrect patterns found in ECMAScript/JavaScript code. It is used with the purpose of improving code quality, making code more consistent, and avoiding bugs. ESLint is written using Node.js to provide a fast runtime environment and easy installation via npm.


// Ques. Differentiate between res.send() and res.json().
// Ans. res.send() is used to send a response with any type of data (string, object, buffer, etc.). While res.json() is used to send a JSON response. res.json() also sets the Content-Type header to application or JSON.


// Ques. What is meant by Scaffolding in Express JS?
// Ans. Scaffolding in Express.js refers to the process of generating a basic project structure automatically. This can speed up the initial setup and help maintain consistency in the way projects are structured, especially in large teams.


// Ques.  How would you install an Express application generator for Ans. scaffolding?
// Express application generator are used for quickly setting up a new Express application with some basic structure. You can install it using Node Package Manager (npm), which comes with Node.js.

// To install it globally:

// npm install -g express-generator

// Ques. Explain what CORS is in Express JS?
// Ans. CORS (Cross-Origin Resource Sharing) is a security feature implemented by web browsers to control how web pages in one domain can request and interact with resources hosted on another domain.

// In the context of Express.js, CORS refers to a middleware that enables Cross-Origin Resource Sharing for your application. This allows the application to control which domains can access your resources by setting HTTP headers.


// Ques. What are Built-in Middlewares?
// Ans. Express.js, includes a set of built-in middlewares that provide common functionality. These built-in middlewares are included by default when you create an Express application and can be used to handle various tasks. Here are some of the built-in middlewares in Express:

// express.json(): This middleware is used to parse incoming JSON requests. It automatically parses the request body if the Content-Type header is set to application/json.
// express.Router(): The express.Router() function is often used to create modular route handlers. It allows you to group route handlers together and then use them as a middleware.
// express.static(): This middleware is used to serve static files, such as images, CSS, and JavaScript files, from a specified directory.

// Ques. Which template engines do Express support?
// Ans. Express.js supports any template engine that follows the (path, locals, callback) signature.


// Ques. What is Pug template engine in Express JS?
// Ans. Pug is a popular template engine for Express.js and other Node.js frameworks. You can use Pug to render dynamic HTML pages on the server side. It allows you to write templates using a syntax that relies on indentation and concise tags.


// Ques. What are middlewares in Express.Js?
// Ans. Middleware functions are those functions that have the access to request and response object and the next middleware or function. They can add functionality to an application, such as logging, authentication, and error handling.

// Ques. What are the types of middlewares?
// Ans. There are mainly five types of Middleware in Express.js:

// Application-level middleware
// Router-level middleware
// Error-handling middleware
// Built-in middleware
// Third-party middleware


// Ques. What is Express router() function?
// Ans. The express.Router() function is used to create a new router object. This function is used when you want to create a new router object in your program to handle requests.

// Ques. What is the use of app.use() in Express.js?
// Ans. app.use() is used to add middleware functions in an Express application. It can be used to add global middleware functions or to add middleware functions to specific routes.

// Ques. How does Express.js handle routing?
// Ans. Express.js has a simple routing system that allows developers to define and manage application routes. Routes can be determined using the app.get() and app.post() methods. It can be associated with callback functions executed when a request is made to the route.

// Ques. How does Express.js handle middleware?
// Ans. Express.js has a middleware system that allows developers to define and manage middleware functions. These functions can perform tasks such as authentication, validation, or modification of request and response objects. Middleware functions are executed in the order they are defined. They can be added to the application using the app.use() method.


// Ques. How does Express.js handle request and response objects?
// Ans. Express.js has a request and response object system that provides access to information about incoming requests and outgoing responses. The request object contains information about the incoming request, such as the URL, method, and headers. The response object is used to send a response back to the client. Developers can use methods such as res.send(), res.json(), and res.render() to send responses to the client.


// Ques. What is the difference between a traditional server and an Express.Ans. js server?
// A traditional server is a standalone server that is built and managed independently. While an Express.js server is built using the Express.js framework. It runs on top of Node.js. Express.js provides a simple and efficient way to create and manage web applications. It offers a wide range of features and tools for handling routing, middleware, and request or response objects.

// Ques. How does Express.js handle error handling?
// Ans. Express.js provides an error-handling system that allows developers to define and manage error-handling middleware functions. These functions can be used to catch and handle errors that make in the application. It can be added to the application using the app.use() method.

// Ques. What is a template engine, and how does Express.js use it?
// Ans. A template engine is a tool used to generate HTML or other output based on dynamic data. Express.js supports several template engines, such as EJS and Handlebars. These engines can dynamically render HTML pages based on data stored in the application.

// Ques. How does Express.js handle file uploads?
// Ans. Express.js provides support for file uploads through middleware functions and the request object. Developers can use middleware functions like multer or busboy to handle file uploads. It can access the uploaded files through the request object.

// Ques. How does Express.js differ from other Node.js frameworks?
// Ans. Express.js is a flexible framework that provides only the essential features required for web application development. On the other hand, other Node.js frameworks, such as Meteor, Sails.js, and Koa.js, offer more features but may not be required for smaller projects. Express.js is a good choice for simple, fast, and scalable web applications.


// Ques. How do you handle errors in Express.js?
// Ans. Express.js provides a built-in error-handling mechanism using the next() function. When an error occurs, you can pass it to the next middleware or route handler using the next() function. You can also add an error-handling middleware to your application that will be executed whenever an error occurs.

// Ques. What are middleware functions in Express.js?
// Ans. Middleware functions are those functions that can access and modify the request and response objects in an Express application. They can add functionality to an application, such as logging, authentication, and error handling.

// Ques. What is a callback function in Express.js?
// Ans. A callback function in Express.js is a type of function that is called after a specific action has occurred. For example, a callback function handles a successful or failed database query.

// Ques. What is the purpose of the next() function in Express.js?
// Ans. The next() function is used to pass control from one middleware function to the next function. It is used to execute the next middleware function in the chain.

// Ques. What is the difference between app.route() and app.use() in Ans. Express.js?
// app.route() defines multiple route handlers for a single route. While the app.use() function is used to add middleware functions to an application.

// Ques. What is the purpose of the req.params object in Express.js?
// Ans. The req.params object is used to access route parameters in Express.js. Route parameters capture values from the URL and pass them to the request handler.


// Ques. What is the difference between req.query and req.params in Express.Ans. js?
// req.query is used to access the query parameters in a URL. While req.params is used to access route parameters in a URL.

// Ques. What is the purpose of the app.locals object in Express.js?
// Ans. The app.locals object stores application-level data in an Express.js application. This data is available to all templates and routes.
