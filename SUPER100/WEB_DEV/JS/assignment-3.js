// ---------------------------------------------------------------
// MAP()
// ---------------------------------------------------------------
var names = ['Jesse', 'James', 'Ryder'];
var greetings = names.map(function(name) {
    return 'Hello ' + name;
});
console.log(greetings);


var celsius = [0, 20, 30];
var fahrenheit = celsius.map(function(temp) {
    return temp * 9/5 + 32;
});
console.log(fahrenheit);


var numbers = [1, 2, 3, 4, 5];
var addTen = numbers.map(function(num) {
    return num + 10;
});
console.log(addTen);

var numbers = [1, 2, 3, 4];
var doubled = numbers.map(function(num) {
    return num * 2;
});
console.log(doubled);

var words = ['hello', 'world'];
var uppercased = words.map(function(word) {
    return word.toUpperCase();
});
console.log(uppercased);

var words = ['apple', 'banana', 'cherry'];
var lengths = words.map(function(word) {
    return word.length;
});
console.log(lengths);

var animals = ['cat', 'dog', 'fish'];
var plural = animals.map(function(animal) {
    return animal + 's';
});
console.log(plural);

var numbers = [2, 3, 4];
var squares = numbers.map(function(num) {
    return num * num;
});
console.log(squares);

var pricesUSD = [10, 20, 30];
var exchangeRate = 0.85;
var pricesEUR = pricesUSD.map(function(price) {
    return price * exchangeRate;
});
console.log(pricesEUR);

var fullNames = ['Jesse', 'James'];
var firstNames = fullNames.map(function(name) {
    return name.split(' ')[0];
});
console.log(firstNames);

var numbers = [10, 20, 30];
var result = numbers.map(function(num, index) {
    return num + index;
});
console.log(result);

var booleans = [true, false, true];
var integers = booleans.map(function(bool) {
    return bool ? 1 : 0;
});
console.log(integers);
// ---------------------------------------------------------------
// FILTER()
// ---------------------------------------------------------------
var numbers = [1, 2, 3, 4, 5, 6];
var evens = numbers.filter(function(num) {
    return num % 2 === 0;
});
console.log(evens);

var numbers = [5, 10, 15, 20];
var greaterThanTen = numbers.filter(function(num) {
    return num > 10;
});
console.log(greaterThanTen);

var words = ['apple', 'banana', 'avocado', 'grape'];
var startsWithA = words.filter(function(word) {
    return word[0] === 'a';
});
console.log(startsWithA);

var numbers = [-3, -1, 2, 4, -5];
var positives = numbers.filter(function(num) {
    return num > 0;
});
console.log(positives);

var values = [null, 'hello', undefined, 'world'];
var validValues = values.filter(function(value) {
    return value != null;
});
console.log(validValues);

var students = [
    {name: 'Alice', age: 22},
    {name: 'Bob', age: 19},
    {name: 'Charlie', age: 23},
    {name: 'David', age: 18}
];
var youngerStudents = students.filter(function(student) {
    return student.age <= 20;
});
console.log(youngerStudents);

var items = [
    {type: 'fruit', name: 'apple'},
    {type: 'vegetable', name: 'carrot'},
    {type: 'fruit', name: 'banana'}
];
var fruits = items.filter(function(item) {
    return item.type === 'fruit';
});
console.log(fruits);

var numbers = [2, 3, 4, 5, 6, 7, 8, 9];
var isPrime = function(num) {
    for (var i = 2, sqrt = Math.sqrt(num); i <= sqrt; i++)
        if (num % i === 0) return false;
    return num > 1;
};
var primes = numbers.filter(isPrime);
console.log(primes);

var words = ['sun', 'moon', 'earth', 'mars'];
var shortWords = words.filter(function(word) {
    return word.length <= 4;
});
console.log(shortWords);

var numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9];
var divisibleByThree = numbers.filter(function(num) {
    return num % 3 === 0;
});
console.log(divisibleByThree);
// ---------------------------------------------------------------
// REDUCE()
// ---------------------------------------------------------------
var numbers = [1, 2, 3, 4];
var product = numbers.reduce(function(total, num) {
    return total * num;
}, 1);
console.log(product);

var words = ['Hello', 'world', '!'];
var sentence = words.reduce(function(sentence, word) {
    return sentence + word + ' ';
}, '');
console.log(sentence.trim());

var words = ['sun', 'moon', 'earth', 'mars'];
var longest = words.reduce(function(longest, word) {
    return word.length > longest.length ? word : longest;
}, '');
console.log(longest);

var items = ['apple', 'banana', 'apple', 'orange', 'banana', 'apple'];
var count = items.reduce(function(acc, item) {
    acc[item] = (acc[item] || 0) + 1;
    return acc;
}, {});
console.log(count);

var numbers = [1, 2, 3, 4, 5, 6];
var sumEvens = numbers.reduce(function(total, num) {
    return num % 2 === 0 ? total + num : total;
}, 0);
console.log(sumEvens);

var arrays = [[1, 2], [3, 4], [5, 6]];
var flatArray = arrays.reduce(function(flat, array) {
    return flat.concat(array);
}, []);
console.log(flatArray);

var words = ['apple', 'banana', 'cherry'];
var totalChars = words.reduce(function(total, word) {
    return total + word.length;
}, 0);
console.log(totalChars);

var numbers = [1, 2, 3, 4, 5];
var factorial = numbers.reduce(function(total, num) {
    return total * num;
}, 1);
console.log(factorial); // 120

var objects = [{a: 1}, {b: 2}, {c: 3}];
var merged = objects.reduce(function(acc, obj) {
    return Object.assign(acc, obj);
}, {});
console.log(merged);

var str = 'jesse james';
var frequency = str.split('').reduce(function(acc, char) {
    acc[char] = (acc[char] || 0) + 1;
    return acc;
}, {});
console.log(frequency);

var numbers = [1, 2, 3, 4, 5];
var average = numbers.reduce(function(total, num, index, array) {
    total += num;
    if (index === array.length - 1) {
        return total / array.length;
    }
    return total;
}, 0);
console.log(average);

var obj = {a: 1, b: 2, c: 3};
var keys = Object.keys(obj).reduce(function(str, key) {
    return str + key + ' ';
}, '');
console.log(keys.trim());

var prices = [29.99, 9.99, 4.99, 19.99];
var totalCost = prices.reduce(function(total, price) {
    return total + price;
}, 0);
console.log(totalCost);

var items = ['apple', 'banana', 'apple', 'orange', 'banana', 'apple'];
var mostFrequent = items.reduce(function(acc, item) {
    acc[item] = (acc[item] || 0) + 1;
    return acc;
}, {});
var frequentItem = Object.keys(mostFrequent).reduce(function(a, b) {
    return mostFrequent[a] > mostFrequent[b] ? a : b;
});
console.log(frequentItem);
// ---------------------------------------------------------------
// SORT()
// ---------------------------------------------------------------
var numbers = [5, 3, 8, 1];
var sortedNumbers = numbers.sort(function(a, b) {
    return b - a;
});
console.log(sortedNumbers);

var students = [
    {name: 'Alice', grade: 85},
    {name: 'Bob', grade: 92},
    {name: 'Charlie', grade: 87}
];
var sortedByGrade = students.sort(function(a, b) {
    return a.grade - b.grade;
});
console.log(sortedByGrade);

var words = ['apple', 'banana', 'cherry', 'date'];
var sortedByLength = words.sort(function(a, b) {
    return a.length - b.length;
});
console.log(sortedByLength);

var dates = [
    new Date(2020, 1, 1),
    new Date(2019, 6, 20),
    new Date(2021, 3, 15)
];
var sortedDates = dates.sort(function(a, b) {
    return a - b;
});
console.log(sortedDates);

var booleans = [true, false, true, false];
var sortedBooleans = booleans.sort(function(a, b) {
    return a === b ? 0 : a ? 1 : -1;
});
console.log(sortedBooleans);

var words = ['Banana', 'apple', 'Cherry', 'date'];
var sortedWords = words.sort(function(a, b) {
    return a.toLowerCase().localeCompare(b.toLowerCase());
});
console.log(sortedWords);

var arrays = [[3, 4], [1, 2, 3], [5, 6]];
var sortedBySum = arrays.sort(function(a, b) {
    return a.reduce((sum, num) => sum + num, 0) - b.reduce((sum, num) => sum + num, 0);
});
console.log(sortedBySum);

var words = ['apple', 'banana', 'cherry'];
var sortedWords = words.sort().reverse();
console.log(sortedWords);

var people = [
    {name: 'Alice', age: 25},
    {name: 'Bob', age: 20},
    {name: 'Charlie', age: 25}
];
var sortedPeople = people.sort(function(a, b) {
    return a.age - b.age || a.name.localeCompare(b.name);
});
console.log(sortedPeople);

var numbers = [3, null, 1, 2];
var sortedNumbers = numbers.sort(function(a, b) {
    if (a === null) return 1;
    if (b === null) return -1;
    return a - b;
});
console.log(sortedNumbers);
// ---------------------------------------------------------------
// SCOPE-CHAINING
// ---------------------------------------------------------------
var numbers = [2, 3, 4, 5, 6];
var result = numbers
    .map(function(num) { return num * 2; })
    .filter(function(num) { return num > 10; });
console.log(result);

var people = [
    {name: 'Alice', age: 25},
    {name: 'Bob', age: 20},
    {name: 'Charlie', age: 30}
];
var result = people
    .filter(function(person) { return person.age > 20; })
    .sort(function(a, b) { return a.age - b.age; })
    .map(function(person) { return person.name; });
console.log(result);

var numbers = [1, 2, 3, 4, 5, 6];
var result = numbers
    .filter(function(num) { return num % 2 === 0; })
    .map(function(num) { return num * num; })
    .reduce(function(total, num) { return total + num; }, 0);
console.log(result);

var prices = [100, 200, 300];
var discounts = [0.1, 0.2, 0.15];
var total = prices
    .map(function(price, index) { return price * (1 - discounts[index]); })
    .reduce(function(sum, price) { return sum + price; }, 0);
console.log(total);

var words = ['hi', 'hello', 'hey', 'hola'];
var result = words
    .sort(function(a, b) { return a.length - b.length; })
    .filter(function(word) { return word.length > 2; })
    .map(function(word) { return word.toUpperCase(); });
console.log(result);
// ---------------------------------------------------------------
//CLOSURE
// ---------------------------------------------------------------
function exmp1(){
    var a=10;
    function sum_1(){
        var b=30;
        function sum_2(){
            c=a+b;
        }
        sum_2()
    }
    sum_1()
}
exmp1()
console.log(c); //output:40(c=a+b)
 

function exmp1(){
    var a=10,b=20;
    function sum_1(){
        function sum_2(){
            var c=a*b;
            console.log(c); 
        }
        return sum_2
    }
    return sum_1
}
exmp1()()()
 

var a=2;
function out(){
    var i=1;
    function inn(){
        while(i<=10)
        {
           console.log(${a}*${i}=${a*i});
           i++; 
        }
    }
    inn()
}
out()


function rev(){
    var s="sai"
    function rev_1(){
        var c=s.split("").reverse().join("").toLocaleUpperCase()
        console.log(c); 
    }
    rev_1()
}
rev()
 

function rev(){
    var s="sas"
    function rev_1(){
        c=s.split("").reverse().join("").toLocaleLowerCase()
        console.log(c); 
    }
    rev_1()
    function pall(){
        if(c==s){
           console.log("pallindrome");
        }
        else{
           console.log("not pallindrome");
        }
    }
    pall()
}
rev()


(function cou(x)
{
    var c=0;
    (function cou_1(){
       while(x>0){
        var rem=x%10;
        c++;
        x=Math.floor(x/10);
       }
    })()
    console.log(c);  
})(100)
 

var sum=function(){
    var i=1;
    sum=0;
    function sumOfN()
    {
        var n=10;
        function add()
        {
            while(i<=n)
            {
                sum+=i;
                i++
            }
        }
        add()
    }
    sumOfN()
}
sum()
console.log(sum);


var product=1
var fact=(n)=>{
    var c=50;
    return function fact1()
    {
        for(var i=n;i>0;i--)
        {
           mul*=i;
        }
        console.log(product+c); 
    }
}
fact(5)()


var sum=0
var arr=function()
{
    var a=[1,2,3,4,5]
  
    function sumArr()
    {
        for(var i=0;i<a.length;i++)
    {
        sum+=a[i]
    }
    console.log(sum-(a[0]+a[a.length-1]));
    }
    return sumArr
}
var arr1=arr();
arr1();
 
 
var a=[1,[2,3,4],5]
function product()
{
    var product1=1;
    var remainder=2;
    function subarr()
    {
        for(var i=0;i<a[1].length;i++)
        {
            if((a[1][i])%remainder==0)
            {
              product1=product1*a[1][i];
            }
        }
        function rem_2()
        {
            console.log(product1%2);
        }
        rem_2()
    }
    subarr()
}
product()