//api fetching
let api = fetch('https://reqres.in/api/users?page=2');  
console.log(api);

api.then((x) => {
    console.log(x.json())
}).then((y) => {
    console.log(y);
})