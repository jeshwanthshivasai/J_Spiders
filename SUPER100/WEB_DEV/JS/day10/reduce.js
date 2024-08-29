let x = [10, 20, 30, 40]
x =  x.reduce((a, b) => {return a+b});
console.log(x);

//initial value or accumulator = 10; currentvalue = 20; currentindex = 30; array = 40

let x1  = [10, 20, 30, 40, 50, 60, 70, 80]
x1 = x1.reduce((a) => {return a%2 === 0});
console.log(x1);


const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];


const people = [
    { name: 'alice', age : 22 },
    { name: 'fred', age : 17 },
    { name: 'thomas', age : 30 },
    { name: 'jennifer', age : 15},
]
//output: ['alice', 'thomas']
const names = people.filter(person => person.age >= 18).map(person => person.name);   
console.log(names);

const words = ['hello', 'world', 'javascript', 'is', 'awesome'];
//output: ['javascript', 'is', 'awesome']
//output: ['hello', 'world']

const result = words.filter(word => word.length > 5);
console.log(result);

const result2 = words.filter(word => word.length === 5);
console.log(result2);

const products = [
    { name : 'book', price : 15},
    { name : 'pen', price : 2},
    { name : 'notebook' , price : 25},
    { name : 'backpack' , price : 50},
    { name : 'pencil' , price : 1},
];
//output : [{ name : 'book' , price : 13.5 } , { name : 'pen' , price : 1.8 } , { name : 'pencil' , 0.9}]

const fruits = ['apple', 'banana', 'apple', 'orange', 'banana', 'apple'];





//--------------------------------------------------------------------------------------------------------------------//

// array of objects users, print user of particular age along with their frequency.
let users = 
[
    {name : 'alfred', age : 20},
    {name : 'beverley', age : 22},
    {name : 'charles', age: 25},
    {name : 'denver', age : 20},
    {name : 'edward', age : 21},
    {name : 'franklin', age : 26},
    {name : 'georgie', age : 25},
    {name : 'henry', age : 29},
    {name : 'isaac', age : 30},
    {name : 'jesse', age : 25},
    {name : 'kevin', age : 28}
]

let 


//Print object having marks greater than 60 and rollNumber greater than 10
let students = 
[
    {name : 'alfred', marks : 20, rollno : 11},
    {name : 'beverley', marks : 90, rollno : 12},
    {name : 'charles', marks : 95, rollno : 2},
    {name : 'denver', marks : 70, rollno : 7}
];

let student_details = students.filter((x) => x.marks >= 60 && x.rollno >= 10);
console.log(student_details);

//sum of every positive element
const input = [1, -4, 12, 0, -3, 29, -150];

let sum = input.filter(x => x > 0).reduce((a, b) => a + b);    
console.log(sum);

//get name initials
const input2 = "Jeshwanth Shiva Sai";

let name = input2.split('').map((word) => word[0].join(''));
console.log(name);

//numeronyms
const input3 = "Every developer likes to mix kubernetes and javascript";

let numeronyms = input3.split('').map((word) => (word.length <= 4 && word.)))