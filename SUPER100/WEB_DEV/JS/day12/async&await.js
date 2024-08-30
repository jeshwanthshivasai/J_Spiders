//creation of a promise using constructor method
let promise = new Promise (function (resolve, reject) {
    setTimeout(function () {
        let num = 2;
        if(num % 2 === 0) {
            resolve('The number is even');
        } else {
            reject('The number is odd');
        }
    }, 2000);
});

let promise1 = new Promise ((resolve, reject) => {
    setTimeout(() => {
        resolve('my  promise is successfull');
    }, 2000);
});
function demo() {
    promise1.then(res => console.log(res));
    console.log('hello world');
}
demo();
