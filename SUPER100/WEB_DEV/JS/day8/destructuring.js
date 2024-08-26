var num = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
var [o1,,o3,,o5,,o7,,o9] = num;

console.log(o1, o3, o5, o7, o9); // 1, 3, 5, 7, 9

var arr = [10, [2, 3, 4], 6, 7];
var [,[a],,b] = arr;

console.log(a, b); // 2, 7

//unpack all the even numbers and store the unpacked values as an array type
/* var even = [[2, 3, 4], [[[4, 5, 6]]]];
var [[e1,[[[e2,,e3]]]]] = even;
var even = [e1, e2, e3]; */

// console.log(even); // [2, 4, 6]

var x = [1, 3];
var[a, b, c=2] = x;

console.log(a, b, c); // 1, 3, 2

//swap 2 arrays using destructuring
var a = [1, 2];
var b = [3, 4];
[a, b] = [b, a];

console.log(a, b); // [3, 4], [1, 2]

var x = 1;
var y = 2;

var [y,x] = [x, y]

console.log(x, y); // 2, 1

/* function demo() {
    return[1, 2, 4, 5, 6]
}
var [,e1,e2,,] = demo; */

// console.log(e1, e2); // 2, 4

const apiResponse = [200, 'Ok', {userId : 1, name : 'jesse'}];
//statuscode, status message, user data
var [statusCode, statusMessage, userData] = apiResponse;

console.log(statusCode, statusMessage, userData); // 200, Ok, { userId: 1, name: 'jesse' }


const csvData = 'jesse, james, 25, male';

const [myName, surname, age, gender] = csvData.split(',');

console.log(myName, surname, age, gender); // jesse, james, 25, male

var date  = new date(2022, 1, 24, 13, 8, 46);
console.log.date;

//input: [2024, 7, 26, 13, 00, 00];
//output: 'Mon Aug 26 2024 13:00:00 GMT +0000(UTC)';

var date = [2024, 7, 26, 13, 0, 0];
var [year, month, day, hours, minutes, seconds] = date;
var date = Date{year, date, }