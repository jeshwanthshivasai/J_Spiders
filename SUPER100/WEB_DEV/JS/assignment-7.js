//----------------------*array iterable methods*--------------------
//example1
let numbers=[1.5,2.9,3.3,4,8.59,6,7,8,9];
let squareNumbers=numbers.map(x=>Math.ceil(x))
.map((number) => number * number)
console.log(squareNumbers); 

//example2
let movies= ["life of pi", "anaconda", "conjuring", "spiderman", "jurassic park"];
let movie = movies.filter(word => word === word.split("").reverse().join(""));
console.log(movie);

//example3
let users=[
    {id:1,profile:{age:25}},
    {id:2,profile:{age:30}},
    {id:3,profile:{age:35}},
    {id:4,profile:{age:28}},
]
let use=users.filter(x=>x.profile.age>30)
console.log(use);

//example4
let employe=[
    {firstName:"jesse",lastName:"ss",age:23},
    {firstName:"jeshwanth",lastName:"ss",age:24},
    {firstName:"ss",lastName:"jeshwanth",age:25},
    {firstName:"ss",lastName:"jesse",age:26},  
  ];
let employee=employe.map((x)=>{
      return x.firstName+" "+x.lastName;
  })
console.log(employee);

//example5
let triangles=[
    {base:5,height:10},
    {base:7,height:14},
    {base:10,height:20}
]
triangles=triangles.map(x=>({
    base:x.base,
    height:x.height,
    area:0.5*x.base*x.height
}))
console.log(triangles);

//example6
let fruit = [
    { name:'apple',color:'red'},
    { name:'banana',color:'yellow'},
    { name:'kiwi',color:'green'},
    { name:'orange',color:'orange'},
    { name:'pineapple',color:'yellow'}
];
let yellowFruits=fruit.filter(fruit=>fruit.color==='yellow');
console.log(yellowFruits);

//example7
let members =
  [
  {id:111, name:"jesse", workExp:3, yrExp:5, isPermanent:true},
  {id:102, name:"bdejesse", workExp:13, yrExp:10, isPermanent:false},
  {id:123, name:"jeshwanth", workExp:23, yrExp:15, isPermanent:false},
  {id:66, name:"shivasai", workExp:22, yrExp:9, isPermanent:true},
];
let permMember = members.filter((x)=>
{
  return x.isPermanent;
});
console.log(permMember)

//example8
let student =[
    {name:"jesse",rollNumber:31,marks:80},
    {name:"jess",rollNumber:15,marks:69},
    {name:"jess",rollNumber:16,marks:35},
    {name:"bdejesse",rollNumber:7,marks:55}
];
let ans=student.filter((x)=> {
return x.marks>60}).map((x)=>{return x.name});
console.log(ans);

//example9
let word3 = ['JavaScript', 'Python', 'Html', 'CSS', 'Java'];
let longestWord = word3.reduce((x,y) =>y.length > x.length ? y : x);
console.log(longestWord);

//example10
let product1 = [
    { name:'ProductA',price:10},
    { name:'ProductB',price:20},
    { name:'ProductC',price:1 },
    ];
let filteredProducts = product1.filter(x =>x.price > 15);
let ProductNames = filteredProducts.map(x =>x.name.toUpperCase());
let totalPrice = filteredProducts.reduce((total, product) => total + product.price, 0);
console.log(ProductNames);
console.log(totalPrice); 


//-----------------*higherorder function & callback function*------------------------
//example1
function outer(inner){
    let x=20;
    let y=80
    let sum=x+y
    inner()
}outer(function inner(a,b){
    let c=10;
    let d=20;
    let sum1=c+d
    console.log(sum1);
})

//example2
function circle(value, cm) {
    return cm(value);
}
let Circumference = (circumference) => circumference / (2 * Math.PI);
let circumferenceValue = 31.4;
let res = circle(circumferenceValue, Circumference);
console.log(`${res}`);

//example3
function radius(value, calculationMethod) {
    return calculationMethod(value);
 }
 let Area = (area) => Math.sqrt(area / Math.PI);
 let area = 78.5;
 let res1 = radius(area, Area);
 console.log(`${res1}`);

 //example4
 function add(x,y) {
    return x + y;
}
function multiply(x,y) {
    return x * y;
}
let result1=add(5,3,add);     
let result2=multiply(5,3,multiply); 
console.log(result1); 
console.log(result2);

//example5
function product(pro) {
    console.log("hey jess");
    pro(2,3)
}
product(function pro(a,b){
    return a*b
})


//---------------*array & object destructuring*-----------
//example1
let x=[[2,3,8,9],[[[4,9,6,1,0]]]]
let [[d1,],[[[d3,,d4]]]]=x
let res3=[d1,d3,d4]
console.log(res3);

//example2
let u=[1,2,3,4,5]
let v=[6,7,8,9,10]
let[f1,f2,f3,f4,f5]=v
let[g1,g2,g3,g4,g5]=u
console.log(v);
console.log(u);

//example3
let z= [1, 2, 3, 4, 5];
let [head,,,,tail] = z
console.log(head); 
console.log(tail); 
let res4=[head,tail]
console.log(res4);

//example4
let arr=["jesse",100,["java","python"],"hey","there",[1,2,3,4]]
let [item1,,[,item2],,item3,[,item4,,item5]]=arr
console.log(item1,item2,item3,item4,item5);

//example5
let x1= [1, 2, 3];
let [first, , third] = x1
console.log(first); 
console.log(third); 
let res5=[first,third]
console.log(res5);

//example6
let y=[1,3]
let [e1,e2,e3=5]=y
console.log(e1,e2,e3);

//example7
let arr1=[10,[2,3,4],6,7]
let [,[c1,,],,c2]=arr1
console.log(c1,c2)

//example8
function demo(){
    return [1,2,4,5,6]
}
let [h1,,,h2]=demo()
console.log(h1,h2);

//example9
let date=Date(2024,8,7,9,1)
let[year,month,day,hours,minutes,seconds]=date
console.log(year,month,day,hours,minutes,seconds);

//example10
let fruits=['apple','banana','orange','kiwi','strawberry','grape'];
let [first1,second,third1]=fruits;
console.log(first1); 
console.log(second); 
console.log(third1);
//example11
let obj = { obj1: 1, obj2: { obj3: 2 } };
let {
  obj1,
  obj2: { obj3: d },
} = obj;
console.log(obj1);
console.log(obj.obj2.obj3);

//example12
let obj4 = {
    name: "jesse",
    age: 25,
    salary: "25k",
    skills: {
        web: ["html", "css", "js"],
        prog: {
            java: 8.9,
            python: 2.5
        }
    }
};
let { salary, skills: { web, prog: { python } } } = obj4;
let [,, pl] = web;
console.log(`Salary: ${salary}`);
console.log(`Third skill in web: ${pl}`);
console.log(`Python skill level: ${python}`);

//example13
let obj7 = {
    name: "jesse",
    age: 25,
    salary: "25k",
    skills: {
        web: ["html", "css", "js"],
        prog: {
            java: 8.9,
            python: 2.5
        }
    }
};
let { name } = obj7;
console.log(name); 

//example14
let person1 = {
    naam: 'jesse',
    address: {
        city: 'New York',
        zip: 10001
    }
};
let { name3, address: { city, zip } } = person1;
console.log(name3); 
console.log(city);
console.log(zip);

//example15
let jesseInfo = {
    personal: {
        name: "jesse",
        age: 25,
        birthDate: "Jan 29, 1999"
    },
    education: {
        degree: "B.Arch",
        college: "jnafau",
        CGPA: 6.0
    },
    goals: {
        shortTerm: "sleep",
        longTerm: "sleep"
    }
};
let { 
    personal: { name1, birthDate }, 
    education: { degree, CGPA }, 
    goals: { shortTerm } 
} = jesseInfo;
console.log(`Name: ${name}, Birthdate: ${birthDate}, Degree: ${degree}, CGPA: ${CGPA}`);
console.log(`Short-term goal: ${shortTerm}`);

//example16
let jesseCareer = {
    currentStatus: {
        jobSearch: true,
        webDevProject: "Adiversetech web page"
    },
    skills: {
        programming: ["Python", "JavaScript", "Java"],
        webTechnologies: ["HTML", "CSS", "JS"]
    }
};
let { 
    currentStatus: { jobSearch: lookingForJob, webDevProject: currentProject },
    skills: { programming: [firstLang, , thirdLang] }
} = jesseCareer;
console.log(lookingForJob);
console.log(currentProject);
console.log(firstLang,thirdLang);

//example17
let jessTechStack = {
    frontend: ["HTML","CSS","JavaScript"],
    backend: ["Node.js","Express"],
    database: ["MySQL","MongoDB"]
};
let { frontend: [tech1, tech2], backend: [backendTech] } = jessTechStack;
console.log(tech1,tech2);
console.log(backendTech);

//example18
let languages = {
    programming: ["Python", "JavaScript", "Java"]
};
let { programming: [firstLangs, secondLang] } = languages;
console.log(firstLangs); 
console.log(secondLang); 

//example19
let jessFuture = {
    careerPath: {
        dreamJob:"Architect",
        locationPreference:"Hyderabad"
    },
    interests: {
        coding: true,
        hobbies: null
    }
};
let { 
careerPath:{dreamJob,preferredLocation ="Hyderabad" },
interests:{ hobbies ="Reading books" }
}=jesseFuture;
console.log(dreamJob,preferredLocation); 

//example20
let student1 = {
    fullName: "jesse",
    grade: "B",
    school: "SJPS"
};
let{ fullName: name2, grade: score } = student1;
console.log(name2);  
console.log(score);


//----------*closure examples*-------------

//example1
function setupButton() {
let count = 0; 
document.getElementById("myButton").addEventListener("click", function() {
count++;
console.log(`Button clicked ${count} times`);
    });
}
setupButton();

//example2
function trackKeyPresses() {
let keyPressCount = 0;
document.getElementById("textInput").addEventListener("keypress", function() {
keyPressCount++;
 console.log(`pressed a key ${keyPressCount} times`);
    });
}
trackKeyPresses();

//example3
function trackHover() {
    let hoverCount = 0;
    document.getElementById("hoverBox").addEventListener("mouseover", function() {
        hoverCount++;
        console.log(`Hovered over the box ${hoverCount} times`);
    });
}
trackHover();

//example4
function trackScroll() {
    let scrollCount = 0;
    window.addEventListener("scroll", function() {
        scrollCount++;
        console.log(`Page scrolled ${scrollCount} times`);
    });
}
trackScroll();

//example5
function setupDoubleClick() {
    let doubleClickCount = 0;
    document.getElementById("myButton").addEventListener("dblclick", function() {
        doubleClickCount++; 
        console.log(`Button double-clicked ${doubleClickCount} times`);
    });
}
setupDoubleClick();

//example6
function setupFocusCounter() {
    let focusCount = 0; 
    document.getElementById("myInput").addEventListener("focus", function() {
        focusCount++;
        console.log(`Input field focused ${focusCount} times`);
    });
}
setupFocusCounter();

//example7
function trackDropdownChange() {
    let changeCount = 0;
    document.getElementById("mySelect").addEventListener("change", function() {
        changeCount++;
        console.log(`Dropdown changed ${changeCount} times`);
    });
}
trackDropdownChange();

//example8
function trackBlurEvents() {
    let blurCount = 0;
    document.getElementById("myInput").addEventListener("blur", function() {
        blurCount++; 
        console.log(`Input field blurred ${blurCount} times`);
    });
}
trackBlurEvents();

//example9
function trackMouseRelease() {
    let releaseCount = 0;
    document.getElementById("myBox").addEventListener("mouseup",() => {
        releaseCount++;
        console.log(`Mouse button released ${releaseCount} times`);
    });
}
trackMouseRelease();

//example10
function trackMouseOut() {
    let mouseOutCount = 0;
    document.getElementById("myBox").addEventListener("mouseout", function() {
        mouseOutCount++;
        console.log(`Mouse exited the box ${mouseOutCount} times`);
    });
}
trackMouseOut();






