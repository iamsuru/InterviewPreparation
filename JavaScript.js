/*
Ques. What is JavaScript?
Ans. JavaScript is a high-level, interpreted programming language that is one of the core technologies of the World Wide Web, alongside HTML and CSS. It is used to make web pages interactive and is one of the most popular programming languages in the world.

JavaScript is the Programming Language for the Web. JavaScript can update and change both HTML and CSS. JavaScript can calculate, manipulate and validate data.




Ques. Variables in JavaScript
Ans. Variables are the building blocks of every programming language. They are used for storing value into them. A variable can be a number, string, and many other types -:

In JavaScript we have 3 ways to declare variables: var, let, and const.
Here are the key differences:

VAR ->  1. Var is functionally or globally scoped. 
        2. Can be redeclared.
        3. Can be declared without initialization.
        4. Can be updated.
        5. Ex - */

var a = 3
var a = 4
console.log(a) // 4 as var variables can be redeclared + updated

/*
LET -> 1. let is block scoped.
2. Can not be redeclared within its scope.
        3. Can be declared without initialization.
        4. Can be updated.
        5. Ex - */

let b = 3
let b = 4
console.log(b) // Syntax Error as let variables cannot be redeclared

/*
CONST -> 1. const is block scoped.
2. Can not be redeclared within its scope.
          3. Must be initialized at the time of declaration.
          4. Can never be updated.
          5. Ex - */

const c = 3
const c = 4
console.log(c) // Syntax Error as const variables cannot be redeclared or updated




/*
Ques. == vs === in JavaScript
Ans. == only checks for the value
    === checks for value + type
Example -
*/
let x = 5 // number
let y = '5' // string

console.log(x == y) // true

console.log(x === y) // false




/*
Ques. Arrays in JavaScript
Ans. An array is a special variable, which can hold more than one value:
*/
var cars = ["Saab", "Volvo", "BMW"];
//or
var cars = [];
cars[0] = "Saab";
cars[1] = "Volvo";
cars[2] = "BMW";
//or
var cars = new Array("Saab", "Volvo", "BMW");

/*
Arrays are Objects
Arrays are a special type of objects. The typeof operator in JavaScript returns "object" for arrays.

But, JavaScript arrays are best described as arrays.

Arrays use numbers to access its "elements". In this example, person[0] returns John:
*/

// Array
var person = ["John", "Doe", 46];

// Objects use names to access its "members".In this example, person.firstName returns John:

// Object:
var person = { firstName: "John", lastName: "Doe", age: 46 };

// Adding Array Elements
// The easiest way to add a new element to an array is using the push() method:

var fruits = ["Banana", "Orange", "Apple"];
fruits.push("Lemon");  // Adds a new element (Lemon) to fruits


// New element can also be added to an array using the length property:

var fruits = ["Banana", "Orange", "Apple"];
fruits[fruits.length] = "Lemon";  // Adds "Lemon" to fruits

// Adding elements with high indexes can create undefined "holes" in an array:

const fruits = ["Banana", "Orange", "Apple"];
fruits[6] = "Lemon";  // Creates undefined "holes" in fruits

// If you use named indexes, JavaScript will redefine the array to an object.

// After that, some array methods and properties will produce incorrect results.

const person = [];
person["firstName"] = "John";
person["lastName"] = "Doe";
person["age"] = 46;
person.length;     // Will return 0
person[0];         // Will return undefined





//Ques. The Difference Between Arrays and Objects
//Ans. In JavaScript, arrays use numbered indexes.

// In JavaScript, objects use named indexes.

// Arrays are a special kind of objects, with numbered indexes.

// JavaScript new Array()
// JavaScript has a built -in array constructor new Array().

// But you can safely use[] instead.

// These two different statements both create a new empty array named points:

var points = new Array();
var points = [];




//Ques. Lexical Scope
//Ans. Lexical scope is the concept of determining the scope of a variable based on its declaration. It is the ability for a function scope to access variable from the parent scope. This means that the scope of a variable is determined by the block of code in which its declared, not by the block of code in which it is used.

// Example -:

function outer() {
    var a = 20;

    function inner() {
        var b = 30;
        console.log(a); // accessible (lexical scope)
        console.log(b); // accessible (local scope)
    }

    inner();
    console.log(a); // accessible
    console.log(b); // ReferenceError: b is not defined
}

outer();



//Ques. Closures in js
//Ans. A closure is a function that "remembers" variables from its lexical scope even when the function is executed outside that scope. In simpler words, it's a function that can access variables from its outer function even after the outer function has finished executing.

// How does a Closure work ?
// When a function is defined inside another function, and the inner function accesses variables from the outer function, it creates a closure. This means the inner function retains access to the variables and parameters of the outer function.

function outerFunction() {
    let outerVariable = 'I am outside!';

    function innerFunction() {
        console.log(outerVariable);
    }

    return innerFunction;
}

const myClosure = outerFunction();
myClosure(); // Output: 'I am outside!'

// Example 2
function createCounter() {
    let count = 0;

    return {
        increment: function () {
            count++;
            console.log(count);
        },
        getCount: function () {
            console.log(count);
            return count;
        }
    };
}

const counter = createCounter();
counter.increment(); // Output: 1
counter.increment(); // Output: 2
counter.getCount();  // Output: 2


// outerFunction: This is a function that defines a variable outerVariable and another function innerFunction.

// innerFunction: This function logs outerVariable to the console.

// return innerFunction: outerFunction returns innerFunction.

// myClosure: When you call outerFunction, it returns innerFunction, which is then stored in myClosure.

// myClosure(); When you call myClosure, it executes innerFunction, which accesses outerVariable from the scope of outerFunction.


// Uses of Closures:
// Closures are used in many situations, such as:

// Data Encapsulation: You can use closures to keep data private and access it only through certain functions.

// Memoization: Closures can be used to implement caching and memoization techniques, improving the performance of your code.

// Factory Functions: You can use closures to create factory functions that store some private data.

//Ques. Diff b/w closures and lexical scope.
// Ans. Lexical scope defines a function's accessible scope, while closure enables a function to access variables even after its scope closes.


//Ques. JavaScript Array Methods

//Ans. The most frequently used array methods in JS are: map, filter, find, reduce, and forEach.
// Let's cover map, filter, and forEach. 

// The map array method
// map creates a new copy of the original array.We use it when we want to do something with the elements of the original array but don't want to change it.

// map iterates over the original array and takes a callback function as an argument.

const a = [1, 2, 3, 4, 5]

// Create a new array which multiplies every element by 2

const d = a.map(function (item) { return item * 2 })

console.log(d) // [2,4,6,8,10]

// The filter array method
// filter creates a new array with elements that meet the given condition(s).
// Return the words with more than 6 letters
const words = ['react', 'script', 'interview', 'style', 'javascript']

const ans = words.filter((word) => word.length > 6)

console.log(ans) // ['interview', 'javascript']

// The forEach array method
// forEach is very similar to map but has two key differences:
// First of all, map returns a new Array, but forEach doesn't.
// Return a new array where even numbers are multiplied by 2 
let arr = [1, 2, 3, 4, 5, 6, 7]

function consoleEven(arr) {
    let data = arr.map((num) => (num % 2 === 0 ? num * 2 : num * 1))

    console.log(data)  // [1, 4, 3, 8, 5, 12, 7]
}

consoleEven(arr)

// forEach example

function consoleEven(arr) {
    let data = arr.forEach((num) => (num % 2 === 0 ? num * 2 : num * 1))
    console.log(data) // undefined
}

consoleEven(arr)

// And second, you can do method chaining in map but not in forEach.
// Convert the new array back to original

function consoleEven(arr) {
    let data = arr
        .map((num) => (num % 2 === 0 ? num * 2 : num * 1))
        .map((item) => (item % 2 === 0 ? item / 2 : item / 1))

    console.log(data)
}

consoleEven(arr)



//Ques. Storage in JavaScript
// Ans.
// localStorage: Data persists even after closing your session
// save
localStorage.setItem('key', 'value')
// get saved data
var data = localStorage.getItem('key')
// remove saved data
localStorage.removeItem('key')

// sessionStorage: You lose your data when your session is over, like when you close the browser on the tab.

// save
sessionStorage.setItem('key', 'value')
// get saved data
var data = sessionStorage.getItem('key')
// remove saved data
sessionStorage.removeItem('key')





//Ques. Hoisting in JavaScript
//Ans. Hoisting is JavaScript's default behavior of moving declarations to the top of the program.

// var declaration is hoisted up and initialized with undefined.
// let and const declarations are hoisted up but not initialized.
// function definitions are also hoisted up and stored as they are.

function consoleNum() {
    console.log(num)
    var num = 10
}

consoleNum() // undefined

// Why no error?

// This is how runtime sees this
{
    var num
    console.log(num)
    num = 9
}

// If instead of var -> let, it will give an error as let values are not initialized





//Ques. Objects in JavaScript
//Ans. Just like arrays, objects are a way of storing data.We do so with the help of key - value pairs.
// Example -:
const developer = {
    name: "Raj",
    age: 22
}

// name is the key and Raj is the value.Keys are generally the name of the properties of the object.

// We can store all sorts of data like functions inside an object

// What is this in JavaScript ?
// In a program, at times, we need a way to point at stuff. Like saying this function right here belongs to this object. this helps us get this context.

// Start a new program and just log this.
console.log(this)

// It will point to the window object.

// Now, let's take an example with an object:

function myFunc() {
    console.log(this)
}

const obj = {
    bool: true,
    myFunc: myFunc,
}

obj.myFunc()

// Now, this will point to the object.

// In the first example, we had nothing left of the . so it defaulted to the window object. But in this example, we have the object obj.

// If you do:

// myFunc() // window

// We again get the window object.So, we can see that the value of this depends on how and where are we doing the calling.

// What we just did above is called Implicit Binding.The value of this got bound to the object.

// There is another way to use this.Explicit binding is when you force a function to use a certain object as its this.

// Let's understand why we need explicit binding through an example.

const student_1 = {
    name: 'Randall',
    displayName_1: function displayName() {
        console.log(this.name)
    }
}
const student_2 = {
    name: 'Raj',
    displayName_2: function displayName() {
        console.log(this.name)
    }
}

student_1.displayName_1()
student_2.displayName_2()





//Ques. Prototypes in JavaScript
//Ans. Whenever we create anything(like an object or function) in JavaScript, the JS Engine automatically attaches that thing with some properties and methods.

// All this comes via prototypes.
// __proto__ is the object where JS is putting it all.

var names = ['Rajat', 'Raj']
console.log(names.__proto__.forEach)
console.log(names.__proto__) // same as Array.prototype
console.log(names.__proto__.__proto__) // same as Object.prototype
console.log(names.__proto__.__proto__.__proto__) // null

// All this is called a prototype chain.
// We can do the same with objects and functions as well.
// We will always find Object.prototype behind the scenes.That's why you may have heard that everything in JS is an object.





//Event Loop

//Nature of JavaScript
// JavaScript is a single - threaded language, which means it can do only one thing at a time.It processes one line of code at a time.




//Ques. What is an Event Loop ?
//Ans. An event loop is a mechanism in JavaScript that decides which code should be executed when.It makes your code non - blocking.

// How does the Event Loop work ?
// Call Stack: This is a data structure where your current code is being executed. When you call a function, it gets added to the call stack, and when the function finishes, it is removed from the call stack.

// Event Queue: This is a queue where events(like user interactions, HTTP requests, timers, etc.) wait until the call stack is empty.

// Event Loop: The event loop continuously checks if the call stack is empty and if there are any events in the event queue.If the call stack is empty, it takes the first event from the event queue and adds it to the call stack.

// Example:
// Suppose you have a code with a setTimeout function:

console.log('First'); // 1

setTimeout(function () {
    console.log('Second'); // 3
}, 1000);

console.log('Third'); // 2

// Execution order of this code:
// console.log('First'); goes to the call stack and executes immediately.

// The setTimeout function is called, and it hands over to the browser API(Web API).It is then removed from the call stack.

// console.log('Third'); goes to the call stack and executes immediately.
// After 1 second, the callback of setTimeout is added to the event queue.

// The event loop checks if the call stack is empty and then puts the callback in the call stack.

// console.log('Second'); goes to the call stack and executes.
// Conclusion:
// The event loop ensures that JavaScript code runs without blocking, keeping the user interface smooth and allowing background processes to continue. It is an essential concept that makes JavaScript non - blocking, especially when you are using asynchronous code (like setTimeout, HTTP requests).





//Ques. Asynchronous JavaScript

//Ans. JS is a single - threaded language. Things happen one at a time. Only after one thing is done can we move to the next thing.

// But this creates problems in the real world, especially, when we are working with browsers.

// For example, when we need to fetch data from the web - often times we don't know how long will it take to get it. And whether we will be able to get the data successfully.

// To help with this, asynchronous JS comes into play.





//Ques. Timers in JavaScript – setTimeout, setInterval, clearInterval

//Ans. The setTimeout() method calls a function or evaluates an expression after a specified number of milliseconds.

// setInterval() does the same for specified intervals.

setTimeout(() => {
    console.log('Here - I am after 2 seconds')
}, 2000);

const timer = setInterval(() => {
    console.log('I will keep on coming back until you clear me')
}, 2000);

// for stopping the interval we use clearInterval function
clearInterval(timer)

// Let's go over some questions that use these concepts.

console.log('Hello')
setTimeout(() => {
    console.log('lovely')
}, 0)
console.log('reader')

// output
Hello
reader
lovely

for (var i = 1; i <= 5; i++) {
    setTimeout(function () {
        console.log(i)
    }, i * 1000)
}

// output
6
6
6
6
6

// And here's a short explanation of what's going on there: when setTimeout comes again into the picture, the entire loop has run and the value of i has become 6,

// Now, let's say we want the outcome to be 1 2 3 4 5 – what do we do?
// Instead of var ➡️ use let.
// Why this will work ?
// var is globally scoped but let is locally scoped. So for let a new i is created for every iteration.






//Ques. Promises in JavaScript

//Ans. Promises are at the heart of Asynchronous JS.

// The Promise object represents the eventual completion(or failure) of an asynchronous operation and its resulting value.

// A promise can be in one of these three states:

// Pending: initial state, neither fulfilled nor rejected
// Fulfilled: operation was completed successfully
// Rejected: operation failed


const promise = new Promise((resolve, reject) => {
    let value = true
    if (value) {
        resolve('hey value is true')
    } else {
        reject('there was an error, value is false')
    }
})

promise
    .then((x) => {
        console.log(x)
    })
    .catch((err) => console.log(err))

// Note: resolve and reject are just conventional names.

// Instead of then /catch, we can also use async / await:

async function asyncCall() {
    try {
        const result = await promise
        console.log(result);
    } catch (error) {
        console.log(error);
    }
}

asyncCall()

// One of the advantages of promises is that they are a much cleaner syntax. Before we had promises, we could easily get stuck in callback hell





//Ques. Async and defer in JavaScript
//Ans. To understand async and defer, we need to have an idea of how browsers render a webpage.First, they parse the HTML and CSS.Then DOM trees are created.From these, a render tree is created.Finally, from the render tree - a layout is created and the painting happens.

// Async and defer are boolean attributes which can be loaded along with the script tags. They are useful for loading external scripts into your web page.

// When script tag inside the head tag is present no async or defer used.

// When script tag inside the body tag is present no async or defer used.

// When we use async and defer with script tag than they will come into the flow.

// If there are multiple scripts which are dependant on each other, use defer.Defer script are executed in the order which they are defined.

// If you want to load external script which is not dependant on the execution of any other scripts, use async.

// Note: The async attribute does not guarantee the order of execution of scripts.





//Ques. Debouncing in JavaScript

//Ans. Create a simple input field in index.html like this:

// <input type = 'text' id = 'text' />
// Now, in index.js. Don't forget to add it to index.html first:

const getData = (e) => {
    console.log(e.target.value)
}
const inputField = document.getElementById('text')

const debounce = function (fn, delay) {
    let timer
    return function () {
        let context = this
        clearTimeout(timer)
        timer = setTimeout(() => {
            fn.apply(context, arguments)
        }, delay)
    }
}

inputField.addEventListener('keyup', debounce(getData, 300))

// First, we have selected the input and added an event listener to it.Then we created a debounce function which takes a callback function and delay.

// Now, inside the debounce function we create a timer using setTimeout.Now, this timer's job is to make sure that the next call for getData only happens after 300 ms. This is what debouncing is.






//Ques. Throttling in JavaScript

//Ans. Let's look at an example again. Suppose that on every window resize event we call an expensive function. Now, we want it such that the expensive function will only be executed once in the given time interval. This is what throttling is.

// Create an index.html and an index.js with the following code:

const expensive = () => {
    console.log('expensive')
}

const throttle = (fn, limit) => {
    let context = this
    let flag = true
    return function () {
        if (flag) {
            fn.apply(context, arguments)
            flag = false
        }
        setTimeout(() => {
            flag = true
        }, limit)
    }
}
const func = throttle(expensive, 2000)
window.addEventListener('resize', func)

// Almost the same as debouncing.The key difference is the flag variable.Only, when it's true we are invoking the callback function. And it is set to true inside the setTimeout. So the value is true only after the desired time limit.






//Ques. So, what's the difference between debounce and throttling
//Ans. debouncing is when the difference between two keyup events is 300 ms.And throttling is when the difference between two function calls is 300 ms.Basically, the function is called after a certain interval of time.

//Arrays Methods

at()
const fruits = ["Banana", "Orange", "Apple", "Mango"];
let fruit = fruits.at(2);

concat()
//join 2 arrays
var arr1 = ["Cecilie", "Lone"];
var arr2 = ["Emil", "Tobias", "Linus"];
var children = arr1.concat(arr2);

//join 2 or more arrays
var arr1 = ["Cecilie", "Lone"];
var arr2 = ["Emil", "Tobias", "Linus"];
var arr3 = ["Robin"];
var children = arr1.concat(arr2, arr3);

copyWithin()

// Copy to index 2, all elements from index 0:
const fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.copyWithin(2, 0);
// Banana, Orange, Banana, Orange


// Copy to index 2, the elements from index 0 to 2:
const fruits = ["Banana", "Orange", "Apple", "Mango", "Kiwi"];
fruits.copyWithin(2, 0, 2);
// Banana, Orange, Banana, Orange, Kiwi


entries()

// Create an Array
const fruits = ["Banana", "Orange", "Apple", "Mango"];
// Create an Iterator
const list = fruits.entries();
// List the Entries
let text = "";
for (let x of list) {
    text += x;
}

// The entries() method returns an Iterator object with the key / value pairs from an array:
[0, "Banana"]
[1, "Orange"]
[2, "Apple"]
[3, "Mango"]


every()

// Create an Array
const ages = [32, 33, 16, 40];
// Create a Test Function
function checkAge(age) {
    return age > 18;
}
// Are all ages over 18?
ages.every(checkAge);

// The every() method returns true if the function returns true for all elements. else false


fill()

// Fill all the elements with a value:
const fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.fill("Kiwi");

// Fill the last two elements:
const fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.fill("Kiwi", 2, 4);

filter()

// Return an array of all values in ages[] that are 18 or over:
var age = [32, 33, 16, 40];
var result = age.filter(checkAdult);

function checkAdult(age) {
    return age >= 18;
}
// 32,33,40

find()

// Find the value of the first element with a value over 18:
var age = [3, 10, 18, 20];

function checkAge(age) {
    return age > 18;
}

age.find(checkAge)
// returns undefined if no elements are found.


findIndex()
// Find the first element with a value over 18:
var age = [3, 10, 18, 20];

console.log(age.findIndex(checkAge));

function checkAge(age) {
    return age > 18;
}


findLast()
// returns the value of the last element that passes a test. returns undefined if no elements are found.

var age = [3, 10, 18, 20];

function checkAge(age) {
    return age > 18;
}

function myFunction() {
    console.log(age.findLast(checkAge))
}


findLastIndex()
// method returns the index(position) of the last element that passes a test. method returns -1 if no match is found.

const age = [3, 10, 18, 20];

age.findLastIndex(checkAge);

function checkAge(age) {
    return age > 18;
}


flat()
// Create a new array with the sub - array elements concatenated

var myArr = [[1, 2], [3, 4], [8, 6]];
var newArr = myArr.flat();
console.log(newArr);

// array.flat(depth)
// depth How deep a nested array should be flattened. Default is 1.


flatMap()
// method maps all array elements and creates a new flat array. creates a new array from calling a function for every array element.

var myArr = [1, 2, 3, 4, 5, 6];
var newArr = myArr.flatMap((x) => x * 2);


forEach()
// method calls a function for each element in an array.

let sum = 0;
const numbers = [65, 44, 12, 4];
numbers.forEach((a) => { sum += a });


Array.from()
// returns an array from any object with a length property. returns an array from any iterable object.

let s = "ABCDEFG"
const myArr = Array.from(s);
console.log(myArr);
// [
//     'A', 'B', 'C',
//     'D', 'E', 'F',
//     'G'
// ]


includes()
// returns true if an array contains a specified value. else false
// array.includes(element, startPosition)

var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.includes("Mango");

var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.includes("Banana", 3);


indexOf()
// returns the first index(position) of a specified value. else -1
array.indexOf(item, startPosition)

const fruits = ["Banana", "Orange", "Apple", "Mango"];
let index = fruits.indexOf("Apple");


Array.isArray()
// returns true if an object is an array, otherwise false.

const fruits = ["Banana", "Orange", "Apple", "Mango"];
let result = Array.isArray(fruits);


join()
// returns an array as a string.
// Any separator can be specified.The default is comma(,).
array.join(separator)

const fruits = ["Banana", "Orange", "Apple", "Mango"];
var str = fruits.join();
console.log(str);

const fruits = ["Banana", "Orange", "Apple", "Mango"];
var str = fruits.join(" and ");


keys()
// Create an Array Iterator object, containing the keys of the array:

const fruits = ["Banana", "Orange", "Apple", "Mango"];

list = fruits.keys();

// List the Keys
text = "";
for (let x of list) {
    text += x + "<br>";
}

// 0
// 1
// 2
// 3


lastIndexOf()

const fruits = ["Apple", "Orange", "Apple", "Mango"];
index = fruits.lastIndexOf("Apple");


map()
// creates a new array from calling a function for every array element.
// array.map(function (currentValue, index, arr), thisValue)

var number = [4, 9, 16, 25];
var newArr = number.map(Math.sqrt)


Array.of()
// creates a new array from any number of arguments. can take any type of arguments.

let fruits = Array.of("Banana", "Orange", "Apple", "Mango");


push()
// adds new items to the end of an array.
const fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.push("Kiwi");


pop()
// method removes(pops) the last element of an array.returns the removed element.

const fruits = ["Banana", "Orange", "Apple", "Mango"];
let popped = fruits.pop();


reduce()
// executes a reducer function for array element. returns a single value.
// Subtract all numbers in an array:

numbers = [175, 50, 25];

console.log(numbers.reduce(myFunc))

function myFunc(total, num) {
    return total - num;
}


reduceRight()
// works from right to left.
// as same



reverse()

const fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.reverse();


shift()
// removes the first item of an array.

const fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.shift();



slice()
// returns selected elements in an array, as a new array. selects from a given start, up to a (not inclusive) given end.

const fruits = ["Banana", "Orange", "Lemon", "Apple", "Mango"];
const citrus = fruits.slice(1, 3);
// [ 'Orange', 'Lemon' ]



const fruits = ["Banana", "Orange", "Lemon", "Apple", "Mango"];
const myBest = fruits.slice(-3, -1);
// ['Lemon', 'Apple']


some()
// checks if any array elements pass a test (provided as a callback function). returns true (and stops) if the function returns true for one of the array elements, otherwise false

ages = [3, 10, 18, 20];

console.log(ages.some(checkAdult))
function checkAdult(age) {
    return age > 18;
}

sort()
// sorts the elements of an array.
const fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.sort();


// Sort numbers in ascending order:

const points = [40, 100, 1, 5, 25, 10];
points.sort(function (a, b) { return a - b });


// Sort numbers in descending order:

const points = [40, 100, 1, 5, 25, 10];
points.sort(function (a, b) { return b - a });


splice()
//  adds and/or removes array elements. overwrites the original array.

const fruits = ["Banana", "Orange", "Apple", "Mango"];
// At position 2, add "Lemon" and "Kiwi":
fruits.splice(2, 0, "Lemon", "Kiwi");

// At position 2, remove 2 items
fruits.splice(2, 2);

// At position 2, remove 1 item, add "Lemon" and "Kiwi"
fruits.splice(2, 1, "Lemon", "Kiwi");


toReversed()
// reverses the order of the elements in an array. returns a new array.

const fruits = ["Banana", "Orange", "Apple", "Mango"];
// Reverse the Array
var fruits2 = fruits.toReversed();


toSorted()
// sorts the elements of an array in alphabetical order. returns a new array

var fruits = ["Banana", "Orange", "Apple", "Mango"];

var fruits2 = fruits.sort();


toSpliced()
// adds and/or removes array elements. returns a new array


toString()
// returns a string with array values separated by commas.
const fruits = ["Banana", "Orange", "Apple", "Mango"];
text = fruits.toString();


unshift()
// adds new elements to the beginning of an array.
const fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.unshift("Lemon", "Pineapple");


values()
// returns an Iterator object with the values of an array.

const fruits = ["Banana", "Orange", "Apple", "Mango"];

// Create an Iterator
list = fruits.values();

for (let x of list) {
    console.log(x);
}


with ()
// updates a specified array element. returns a new array

const months = ["Januar", "Februar", "Mar", "April"];
const myMonths = months.with(2, "March");
