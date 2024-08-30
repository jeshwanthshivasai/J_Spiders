//creation of a promise using constructor method
// let promise = new Promise (function (resolve, reject) {
//     setTimeout(function () {
//         let num = 2;
//         if(num % 2 === 0) {
//             resolve('The number is even');
//         } else {
//             reject('The number is odd');
//         }
//     }, 2000);
// });

// let promise1 = new Promise ((resolve, reject) => {
//     setTimeout(() => {
//         resolve('my  promise is successfull');
//     }, 2000);
// });
// function demo() {
//     // promise1.then(res => console.log(res));
//     let result = await promise1
//     console.log(result);
//     console.log('hello world');
// }
// demo();

// console.log('start');
// let pr1 = new Promise((resolve, reject) {
//     setTimeout(() => {
//         resolve('my promise 1');
//     }, 5000);
// });
// let pr2 = new Promise((resolve, reject) => {
//     setTimeout(() => {
//         resolve('your promise 2');
//     }, 3000);
// });
// let pr3 = new Promise((resolve, reject) => {
//     setTimeout(() => {
//         resolve('my promise 3');
//     }, 2000);
// });
// async function demo() {
//     let result1 = await pr1;
//     let result2 = await pr2;
//     let result3 = await pr3;
//     console.log(result1, result2, result3);
// }

//then vs await
// let pr1 = new Promise ((resolve, reject) {
//     reject('failed to execute');    
// });
// async function demo() {
//     try {
//         let res = await pr1
//         console.log(res);
//     }
//     catch(e)
//     {
//         console.log(e);
//     }
//     finally {
//         console.log('whatever happens will be executed');
//     }

//fetch api using async function
// async function fetch() {
//     try {
//         let response = fetch('https://jsonplaceholder.typicode.com/albums');
//         console.log(response);        
//     } catch (e) {
//         console.error(e);
//     }
// }
// fetch();

//normal way
let api = 'https://jsonplaceholder.typicode.com/albums';
let normal = fetch(api);
console.log(normal);
normal.then(res => res.json()).then(val => console.log(val));
normal.catch(err => console.error(err));

let es6 = async () => {
    let newWay = fetch(api);
    let res = await newWay
    let data = res.json();
    console.log(data);
    let finalData = await data;
    console.log(finalData);
}
es6()