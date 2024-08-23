console.log("hello world!");
function outer() {
    function inner() {
        function sub1() {
            var x = 10;
            console.log(x);
        }
        sub1();
    }   
    inner();
}
outer();