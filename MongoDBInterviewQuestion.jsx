// Mongodb is an open-source document-oriented NoSQL database written in C++. It includes the insertion of data, updating, deletion, and creation. The public license of MongoDB is available for free to the public, and the commercial license is available to manufacturers. It stores the data as documents and is known as a document-oriented database.

// Ques. Is MongoDB a NoSQL database?
// Ans. Yes, MongoDB is a NoSQL database because it offers all the facilities that a cloud offers without using many commands.  It handles complex data easily in varieties of data models like graphs, documents, etc.

// Ques. What are the languages supported by MongoDB?
// Ans. MongoDB supports the languages C, C++, Java, C#, Python, Node.js, Perl, PHP, Ruby, Go, Erlang, and Scala. It provides the official driver support for these languages.

// Ques. What are the advantages of MongoDB?
// Ans. MongoDB provides us with many advantages like

// It provides a dynamic database schema.
// It provides inbuilt support for the data partition.
// It uses JavaScript objects.
// It supports field, range-based, string pattern matching type queries.

// Ques. What are the features of MongoDB?
// Ans. The features provided by MongoDB are

// Indexing
// Aggregation
// File storage
// Sharding
// Special collection

// Ques. What is a Document in MongoDB?
// Ans. A document in MongoDB is an ordered set of keys with values. It can be represented by a hash, map, or dictionary. It can also be represented as
// {“name”: ”coding ninjas”}

// Ques. What is a collection in MongoDB?
// Ans. In MongoDB, a collection is similar to a table in traditional relational databases. However, unlike tables, collections do not enforce a fixed schema. A collection is a container for storing documents, which are essentially JSON-like objects with key-value pairs. Each document in a collection can have different fields, and data types can vary among different documents within the same collection.


// Ques. How to add data in MongoDB?
// Ans. We can add the data to MongoDB using the method insert(). We can use insertOne() to insert a single document and insertMany() to insert multiple documents into a collection.
// Example: db.names.insertOne({"name" : "coding ninjas"})

// Ques. How do you Update a Document?
// Ans. To update a document in MongoDB, you can use methods like `updateOne()`, `updateMany()`, or `findOneAndUpdate()`. These methods take a query to identify the document(s) to update and an update parameter to specify the changes. For example, to update a user's age, you'd execute `db.collection.updateOne({name: "John"}, {$set: {age: 30}})`. This will find the first document where the name is "John" and update the age to 30. Multiple fields can be updated simultaneously.


// Ques. What are the data types supported by MongoDB?
// Ans. The data types in MongoDB tell us about the type of a variable or any object. The different types are null, boolean, string, number, date, regular expression, array, object, etc.


// Ques. Why is MongoDB known as the best NoSQL database?
// Ans. MongoDB is known as the best NoSQL database because of its features like

// Document-oriented database
// Rich Query language
// High Performance
// Availability
// Scalability

// Ques. Explain the structure of ObjectID in MongoDB?
// Ans. In MongoDB, an ObjectID is a 12-byte identifier typically used to uniquely identify documents within a collection. The structure comprises a 4-byte timestamp reflecting the ObjectID's creation time, a 5-byte random value unique to the machine and process, a 2-byte incrementing counter, and a 1-byte machine identifier. This composition ensures global uniqueness and allows some degree of sorting by creation time.


// Ques. What are Indexes in MongoDB?
// Ans. Indexes in MongoDB enhance query performance by allowing the database engine to search through a smaller subset of data. They work like a table of contents, pointing to the location of specific data in the collection. The most basic type is the single-field index, but MongoDB also supports compound, text, and other specialized index types for more complex queries.


// Ques. Why is the 32-bit version of MongoDB not preferred?
// Ans. The 32-bit version uses memory-mapped files, so when you run the build, the server can be up to 2GB. But the 64-bit version provides us with unlimited virtual storage, which can be easy to store vast amounts of data.


// Ques. What is sharding in MongoDB?
// Ans. Sharding in MongoDB is a method for distributing data across multiple servers to manage large datasets and high-throughput operations. By splitting a dataset into smaller "shards," each managed by a separate server, sharding ensures horizontal scalability. This approach allows MongoDB to handle increased data volume and read-write operations, thereby improving performance and availability.


// Ques. What is CRUD?
// Ans. The CRUD operations supported by MongoDB are used to manipulate the data in the collections. They are

// Create
// Read
// Update
// Delete


// Ques. How to query for data in MongoDB?
// Ans. The querying in MongoDB can be done using the find() method on collections. It returns the subset or single document in a collection. The fetching of documents is done based on the first argument passed to the method.
// Example: db.names.find({"username" : "ninja"})


// Ques. What is a Namespace in MongoDB?
// Ans. A Namespace in MongoDB is the concatenation of the database name and collection name. Example: db.names, where db is the database and names is the collection in database db.

// Ques. Why is MongoDB better than SQL databases?
// Ans. MongoDB provides a document-oriented structure with high scalability and flexibility. It can have multiple columns and rooms in the same collection. They are faster than other SQL databases because of indexing.


// Ques. What is a covered query in MongoDB?
// Ans. A covered query in MongoDB is

// the fields used in the query are part of an index used in the query
// the fields returned in the results are in the same index

// Ques. )What is Replication in MongoDB?
// Ans. Replication in MongoDB involves creating copies of data across multiple servers to ensure high availability and data durability. A replica set consists of one primary node and multiple secondary nodes. The primary node handles all write operations, while secondaries replicate this data asynchronously. In case the primary fails, one of the secondaries can automatically take over, enhancing data resilience.


// Ques. Can you run multiple Javascript operations in a single MongoDB instance?
// Ans. Yes, you can run multiple JavaScript operations in a single MongoDB instance using the mongo shell or server-side JavaScript execution. However, it's important to note that these operations are single-threaded within each separate connection to the MongoDB server.

// Ques. What are some utilities to backup and restore in MongoDB?
// Ans. The utilities provided by MongoDB to backup and restore

// mongoimport
// mongoexport
// mongodump
// mongorestore

// Ques. What are the cons of MongoDB?
// Ans. MongoDB has some drawbacks like limited support for ACID transactions compared to traditional relational databases. This can make complex transactions challenging to handle. Additionally, its schema-less nature can lead to data inconsistency if not carefully managed. Furthermore, MongoDB may require higher storage space due to de-normalization and redundancy, increasing infrastructure costs.


// Ques. What is Mongo shell?
// Ans. The Mongo shell is an interactive JavaScript interface to MongoDB, which allows you to interact directly with the database. It serves as a powerful tool for administrative tasks, querying, and updates. You can start the Mongo shell by running the `mongo` command in your terminal, and connecting it to a running MongoDB instance. Within the shell, you can execute MongoDB commands, JavaScript functions, and even scripts to manipulate data, create or drop collections, and perform various operations. The shell is essential for debugging, data manipulation, and administrative tasks.


// Ques. How is data stored in MongoDB?
// Ans. In MongoDB, data is stored in BSON (Binary JSON) format, which is a binary-encoded serialization of JSON-like documents. Each BSON document contains one or more fields with values that can include various data types, like arrays and other documents. These documents are organized into collections, which function similarly to tables in relational databases. Unlike relational databases, MongoDB allows for a flexible schema, meaning documents within the same collection can have different fields and structures.

// Ques. What factors need to be taken into account when creating a schema in MongoDB?
// Ans. Points that need to be taken into regard are:

// ->Design your schema as per the user's needs.
// ->Merge objects into one document if you use them together; else, separate them.
// ->Always do joins while write, and not when it is on the read.
// ->For most frequent use cases, always optimize your schema.
// ->Do all the complex aggregation in the schema.
// Advance

// Ques. Explain the "Hot Backup" concept in MongoDB.
// Ans. Hot backups are taken without stopping the database service, generally by snapshotting the underlying volume. This ensures high availability but may need additional considerations for point-in-time consistency.

// Ques. What are NoSQL databases? What are the different types of NoSQL databases?
// Ans. A NoSQL database provides a mechanism for storage and retrieval of data that is modeled in means other than the tabular relations used in relational databases (like SQL, Oracle, etc.).

// Types of NoSQL databases:

// Document Oriented
// Key Value
// Graph
// Column Oriented

// Ques. Explain the structure of ObjectID in MongoDB.
// Ans. ObjectID is a 12-byte BSON type with:

// -> 4 bytes value representing seconds
// -> 3 byte machine identifier
// -> 2 byte process id
// -> 3 byte counter
