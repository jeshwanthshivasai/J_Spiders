// function add(a, b) {
//     return a+b;
// }
// console.log(add(4, 5));

// //VAR
// { 
//     var a = 10;
//     console.log(a);
// }
// console.log(b);

// //LET
// {
//     var b = 20;
//     console.log(b);
// }
// console.log(b);

// //CONST
// {
//     const x = 10;
//     console.log(x);
// }
// console.log();

// const a = null;
// console.log(a);


var a = 10;
let b = 20;
const c = 30;
console.log(a);
console.log(window.a);
console.log(b);
console.log(window.b);
console.log(c);
console.log(window.c);


let arr1 = [1, 2, 3, 4, 5, 6, 7];
let arr2 = [true, false];
let arr_combi = [...arr1, arr2];
console.log(arr_combi);

let obj1 = {
    a:10,
    b:20,
}

let obj2 = {
    a:30,
    b:40,
}

let obj_combi = {...obj1, obj2};
console.log(obj_combi);
