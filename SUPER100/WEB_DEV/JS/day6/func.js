function crane(lift) {
    console.log("start crane");
}

function add(number1, number2) {
    console.log(number1 + number2);
}
add(1, 2);

function greet(name, message) {
    console.log(`Hello, ` + name + `! ` + message);    
}
greet(`jesse`, `how are you!?`);

function calculateArea(length, width) {
    return length * width;
}

console.log(calculateArea(5, 5));

var x = 2;
var square =  function (num) {
    var res = num * num;
    return res;
}

var square2 = square(x);
var square4 = square(4);
console.log(square2);
console.log(square4);

