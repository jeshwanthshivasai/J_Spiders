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
const filteredMixArray = mixedArray.filter(value => typeof value === 'string' || typeof value === 'number');
console.log(filteredMixArray);

const words = ['apple', 'banana', 'pear', 'grape', 'kiwi'];
// output = apple, banana
const firstTwoWords = words.filter((_, index) => index < 2);
console.log(firstTwoWords); 


const numbers = [10, 20, 40, 54, 2, 43, 92];
// output = 10, 20, 30, 40
const filteredNumbers = numbers.filter(number => number <= 40);
const finalNumbers = [...filteredNumbers, 30].sort((a, b) => a - b);
console.log(finalNumbers);

const elements = ['a', 'b', 'c', 'd', 'e', 'f'];
// output = ['a', 'c', 'e']
const oddalphabetic = elements.filter((_, index) => index % 2 === 0);
console.log(oddalphabetic); 

const numbers1 = [-3, -1, 2, 4, -5, 6];
//output = [2, 4, 6]
const positiveNumbers = numbers1.filter(number => number > 0);
console.log(positiveNumbers);

let numbers2 = [1, 2, 3, 4, 4, 5];
numbers2 = numbers2.filter((num, index, value) => value.indexOf(num) === index);
console.log(numbers2);

let words1 = ['apple', 'banana', 'grape', 'kiwi', 'pineapple'];
words1 = words1.filter(x => x.includes('apple'));
console.log(words1);

let elements1 = ['a', 'b', 'c', 'd', 'e'];
elements1 = elements1.filter((x, y) => y % 2 === 0);
console.log(elements1);

const mixedArray1 = [1, 'two', 3, 'four', true, false, undefined, null];
// output - 
//['two', 'four']
//[1, 3]
//[true, false]
const strings = mixedArray1.filter(item => typeof item === 'string');
const nums = mixedArray1.filter(item => typeof item === 'number');
const booleans = mixedArray1.filter(item => typeof item === 'boolean');
console.log(strings);
console.log(nums);
console.log(booleans);

const data = [1, 2, undefined, 4, null, 6, undefined, 8];
// output [1, 2, 4, 6, 8]
const filteredData = data.filter(value => value != null);
console.log(filteredData); 

const nestedArray = [[1, 2], [3, 4], [5], [], [6, 7, 8]];
//output [[1, 2], [3, 4], [5], [6, 7, 8]]
const filteredArray = nestedArray.filter(subArray => subArray.length > 0);
console.log(filteredArray);

const scores = [45, 78, 88, 92, 55, 33, 87];
//output [45, 78, 88, 92, 55, 33, 87]
console.log(scores); 

const words2 = ['madam', 'racecar', 'apple', 'level', 'banana']
//output ['madam', 'racecar', 'level']
const palindromes = words2.filter(word => word === word.split('').reverse().join(''));
console.log(palindromes); 

const users = [
    { id:1, profile: {age: 25}},
    { id:2, profile: {age: 28}},
    { id:3, profile: {age: 30}},   
];
//output [{id:3, profile: {age: 35}}]
const updatedUser = users
  .filter(user => user.id === 3)
  .map(user => ({ ...user, profile: { ...user.profile, age: 35 } }));

console.log(updatedUser);

const words3 = ['tree', 'sun', 'mountain', 'lake', 'river'];
//output ['sun']

const result = words3.filter(word => word === 'sun');
console.log(result);



//filter
//starting with letter 'a'
const items = ['apple', 'banana', 'cherry', 'apricot', 'blueberry'];
const a = items.filter(item => item.startsWith('a'));
console.log(a); 

//words whose length is longer than 4
const animals4 = ['cat', 'dog', 'elephant', 'tiger', 'lion'];
const four = words.filter(word => word.length > 4);
console.log(four); 

//filter object elements inside an array
const objArray = [1, { name: 'Jesse' }, 'hello', { age: 30 }, 42];
const objects = objArray.filter(item => typeof item === 'object' && item !== null);
console.log(objects); 

//filter array elements inside an object
const arrObj = {name: 'Alice', hobbies: ['reading', 'traveling'] }, 'hello', { age: 30, scores: [95, 85] }, 42];