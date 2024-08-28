let arr1 = [1, 2, 3, 4, 5, 6];
for (let x in arr1  % 2 === 0) {
    console.log(arr1[x]); 
}

let arr2 = [1, 2, 3, 4, 5, 6];
for (let x of arr2) {
    console.log(arr2[x]);
}   


//map
let arr = [1, 2, 3];
// arr.map((x, y)=>console.log(y));

arr.map((x, y)=>console.log(x * 2, y * 3));

// arr.map(x=>console.log(x+1));

// let arr_new = [18, (parameter) z: number[]]

//perform square each number in an array
arr_sq = [1, 2, 3, 3, 4, 4, 5];

let arr_sq_new = arr_sq.map(x=>x*x);
console.log(arr_sq_new);

//double each value of an array

let arr_double = [1, 2, 3, 3, 4, 4, 5];

let arr_double_new = arr_double.map(x=>x*2);
console.log(arr_double_new);

//convert each string to uppercase
let arr_strings = ['jesse', 'james', 'ryder'];
let arr_strings_new = arr_strings.map(x=>x.toUpperCase());

console.log(arr_strings_new);

//multiply each value with it's index number
let arr_values = [1, 3, 4, 5 ,6 ,7, 8, 9, 9 ,9, 9, 7];
let arr_values_new = arr_values.map((x, y)=>x*y);

console.log(arr_values_new);

let arr_names = [
{
    name1: 'jesse',
    age1: 25,
},
{
    name2: 'james',
    age2: 30,
},
{
    name3: 'ryder',
    age3: 28,
}
];

// const  products = [
//     {id: 1, name: 'laptop', price: 1200},
//     {id: 2, name: 'phone', price: 500},
//     {id: 3, name: 'tablet', price: 900};
// ];
// let data = products.map(products => {}

//input
const inputString = 'hello';
//output
[104, 101, 108, 108, 111];

let ascii = inputString.split('').map(x=>x.charCodeAt(0));
console.log(ascii);

//input
const user = [
    {name:'alice', age:25},
    {name:'bob', age: 30},
    {name:'charlie', age: 35},
];

users = user.map(x => ({
    ...x,
    isAdult: x.age >= 18
}))

console.log(users);