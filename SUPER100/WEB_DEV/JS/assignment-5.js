//1
var numbers = [1, 2, 3, 4, 5];
var [first, second, third] = numbers;

console.log(first); 
console.log(second); 
console.log(third); 

//2
var numbers = [1, 2, 3, 4, 5];
var [first, , third] = numbers;

console.log(first);
console.log(third);

//3
var numbers = [1, 2];
var [first, second, third = 5] = numbers;

console.log(third);

//4
var a = 1;
var b = 2;
[a, b] = [b, a];

console.log(a);
console.log(b);

//5
var person = {
    name: 'Jesse',
    age: 25,
    country: 'India'
};
var { name, age } = person;

console.log(name);
console.log(age);

//6
var person = {
    name: 'Jesse',
    age: 25,
    country: 'India'
};
var { name: fullName, age: yearsOld } = person;

console.log(fullName);
console.log(yearsOld);

//7
var person = {
    name: 'jesse',
    age: 25,
};
var { name, country = 'Unknown' } = person;

console.log(country);

//8
var person = {
    name: 'Alice',
    address: {
        city: 'Wonderland',
        zip: '12345'
    }
};
var { address: { city, zip } } = person;

console.log(city);
console.log(zip);


