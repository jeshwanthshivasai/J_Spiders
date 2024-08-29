function demo() {
    console.log("hello world");
}
setTimeout(demo, 2000);

setTimeout(() => console.log("hello world"), 2000);

setInterval(() => console.log("hello world"), 2000);

