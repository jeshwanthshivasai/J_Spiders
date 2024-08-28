// //SPREAD

// const array = [1, 2, 3, 4, 5, 6];
// const newarr = [5, 6, ...array];
// console.log(newarr);

// //combining arrays using spread
// let arr1 = [1, 2, 3];
// let arr2 = [4, 5, 6];
// let combi_array = [...arr1, ...arr2];
// // let combi_array = [arr1,arr2];
// console.log(combi_array);

// let num_array = [1, 2, 3, 4, 5, 6];
// console.log(num_array);

// let a_copy = [num_array]
// console.log(a_copy);
// num_array[9] = 'ooo';
// console.log(a_copy);


// function sum(a, b, c) {
//     return a + b + c;
// }
// let numbers = [1, 2, 3];
// let operation = sum(...numbers);
// console.log(sum())

// export function hello() {
//     return 'Hello, World!';
// }
// console.log(hello())

//1
let arr1 = [1,2,3];
let arr2 = [...arr1,4,5,6];
console.log(arr2);


//2
let obj1 = {a:1,b:2};
let obj2 = {...obj1,c:3,d:4};
console.log(obj2);

//3
let [one,,...ttf] = ["one","two","three","four","five"]
console.log(one,ttf);

//4
let obj3 = {a:1,b:2,c:3,d:4,e:5};
let {a,b,...o1} = obj3;
console.log(o1);

//5
let arr3 = [1,2,3];
let arr4 = [4,5,6];
let arr5 = [arr1,arr2]
let arr6 = [...arr3,...arr4]
console.log(arr5);
console.log(arr6);

//6
let obj4 = {a:1,b:2};
let obj5 = {c:3,d:4};
let obj6 = {obj4,obj5};
console.log(obj6);
obj7 = {...obj4,...obj5};
console.log(obj7);

//8
let arr7 = [3,6,9];
let arr8 = [...arr7];
console.log(arr8);

//9
let arr9 = [ 
                {id:1,name:"jesse"},
                {id:2,name:"james"},
                {id:3,name:"ryder"},
                {id:4,name:"ok"}
           ];
let [first,...remaining] = arr9;
console.log(first);
console.log(remaining);

//10
let obj8 = {
    aa: [3,6,9],
    bb: [1,11,111],
    cc: [2,22,222],
    dd: [3,33,333]
  };
  
let { aa, ...remainingg } = obj8;
console.log(aa); 
console.log(remainingg); 

//11
let obj9 = {
                a1:{
                    fav:[3],
                    fav1:[33]
                },
                b1:{
                    ok:[9],
                    ok1:[9/3]
                },
                c1:{
                    nok:[123,2],
                    nok1:[369,987]
                }
           };
let {a1,...aaa1} = obj9;

console.log(a1);
console.log(aaa1);

//12
let arr10 = [1, 2, 3];
let arr11 = [4, 5, 6];
let arr12 = [...arr10, ...arr11];
console.log(arr12); 

//13
let arr13 = [1, 2, 3];
let arr14 = [...arr13];
console.log(arr13); 

//14
let obj10 = { a: 1, b: 2 };
let obj11= { c: 3, d: 4 };
let Obj12 = { ...obj10, ...obj11 };
console.log(Obj12); 

//15
let Obj13 = { a: 1, b: 2 };
let Obj14 = { ...Obj13 };
console.log(Obj14);

//16
function sum(a, b, c) {
    return a + b + c;
  }
  let arg15 = [0, 0, 3];
  console.log(sum(...arg15)); 

//17
let arr16 = [1, 2, 3];
let [first1, ...rem] = arr16;
console.log(first1); 
console.log(rem); 

let obj15 = { a0: 1, b: 2, c: 3 };
let { a0, ...rem0 } = obj15;
console.log(a0); 
console.log(rem0); 

//18
let arr17 = [
    { id: 1, name: 'jesse' },
    { id: 2, name: 'james' }
  ];
  
let arr18 = [
    { id: 3, name: 'jesse' },
    { id: 4, name: 'james' }
  ];
  
let arr19 = [...arr17, ...arr18];
console.log(arr19);
 

//19
let obj16 = {
    id: 1,
    name: 'jesse',
    roles: ['archi', 'dev']
  };
  
let obj17 = {
    id: 2,
    name: 'sai',
    roles: ['user', 'guest']
  };
  
  let obj18 = { ...obj16, roles: [...obj16.roles, ...obj17.roles] };
  console.log(obj18);
  

//20
let obj19 = {
    name: 'jesse',
    hobbies: ['sleeping', 'coding']
  };
  
let obj20 = {
    age: 30,
    hobbies: ['gaming', 'traveling']
  };
  
let obj21 = { ...obj19, ...obj20, hobbies: [...obj19.hobbies, ...obj20.hobbies] };
  console.log(obj21);