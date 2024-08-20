var homo = [1, 2, 45, 6.7, -9];
console.log(homo);
var hete = [null, NaN, '', "", true];
console.log(hete);

var x = [0, 2, 8, 4, 7, 2, 5];
console.log(x.indexOf(7));

var car = {
    brand: "Ford",
    model: "Mustang",
    year: 1964,
    price: "12000USD",
    availability: true,
}
console.log(car);

console.log(car.type);
console.log(["type"]);
console.availability=false;
car.variant="auto";
delete car.availability;
console.log(car);


console.log