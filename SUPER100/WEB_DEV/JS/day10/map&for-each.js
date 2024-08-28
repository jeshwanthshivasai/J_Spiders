//map and for-each
let arr3 = [1, 2, 3];
arr3 = arr.forEach(x => x)
console.log(arr);

//FILTTER
let arr = [1, 2, 3, 4, 5, 6, 7];
arr = arr.filter(x=> x > 2)
console.log(arr);

arr = arr.filter(x => x % 2 === 0);
console.log(arr);

const people = [
    {name: 'alice', age: 30},
    {name: 'bob', age: 25},   
];
people = people.filter(x=> x.age === 30);
console.log(people);

const mixedArray = [0, 'hello, false, 42, ', null, 'world', undefined];
// output = hello, 42, world


const words = ['apple', 'banana', 'pear', 'grape', 'kiwi'];
// output = apple, banana

const numbers = [10, 20, 40, 54, 2, 43, 92];
// output = 10, 20, 30, 40

const elements = ['a', 'b', 'c', 'd', 'e', 'f'];
// output = ['a', 'c', 'e']

const numbers1 = [-3, -1, 2, 4, -5, 6];
//output = [2, 4, 6]

let numbers2 = [1, 2, 3, 4, 4, 5];
numbers2 = numbers2.filter((num, index, value) => value.indexOf(num) === index);
console.log(numbers2);

let words1 = ['apple', 'banana', 'grape', 'kiwi', 'pineapple'];
words1 = words1.filter(x => x.includes('apple'));

console.log(words1);


let elements1 = ['a', 'b', 'c', 'd', 'e'];
elements1 = elements1.filter((x, y) => y % 2 === 0);

console.log(elements1);

