//example1
async function demo1(){
    let api1=fetch("https://fakestoreapi.com/products");
    let resapi1=await api1;
    let api1json=await resapi1.json();
    let final1=await api1json;
    console.log(final1);
    console.log(final1.filter(x=>x.price>50)
        .map(y=>y.title));
} 
demo1(); 
//example1 normal
let api1=fetch("https://fakestoreapi.com/products");
api1.then(res=>res.json()).then(res1=>console.log(res1));
normal.catch(err=>console.log(err));
//====================================================
//example2

async function demo2(){
    let api2=fetch("https://fakestoreapi.com/carts");
    let resapi2=await api2;
    let api2json=await resapi2.json();
    let final2=await api2json;
    console.log(final2);
    console.log(final2.filter(x=>x.products.quantity>2)
    .map(y=>y.date));
}
demo2();
//example2 normal 
let api2=fetch("https://fakestoreapi.com/carts");
api2.then(res=>res.json()).then(res1=>console.log(res1));
res1.catch(err=>console.log(err));
//======================================================================
//example3
async function demo3(){
    let api3=fetch("https://fakestoreapi.com/users");
    let resapi3=await api3;
    let api3json=await resapi3.json();
    let final3=await api3json;
    console.log(final3);
    console.log(final3.map(x=>x.email));
    
}
demo3();
//example3 normal
let api3=fetch("https://fakestoreapi.com/users");
api3.then(res=>res.json()).then(res1=>console.log(res1));
res1.catch(err=>console.log(err));
//example4 

async function demo4(){
    let api4=fetch("https://jsonplaceholder.typicode.com/posts");
    // console.log(api4);
    
    let resapi4=await api4;
    let api4json=await resapi4.json();
    let final4=await api4json;
    console.log(final4);
    console.log(final4.filter(x=>x.userId>5).map(y=>y.body));
    
}
demo4();
//example4 normal
let api4=fetch("https://jsonplaceholder.typicode.com/posts");
api4.then(res=>res.json()).then(res1=>console.log(res1));
res1.catch(err=>console.log(err));
//=============================================================================
//example 5

async function demo5(){
    let api5=fetch("https://jsonplaceholder.typicode.com/comments");
    // console.log(api5);
    
    let resapi5=await api5;
    let api5json=await resapi5.json();
    let final5=await api5json;
    console.log(final5);
    console.log(final5.filter(x=>x.postId>5).map(y=>y.name));
    
}
demo5();
//example5 normal
let api5=fetch("https://jsonplaceholder.typicode.com/comments");
api5.then(res=>res.json()).then(res1=>console.log(res1));
res1.catch(err=>console.log(err));
//================================================================================
//example6 

async function demo6(){
    let api6=fetch("https://jsonplaceholder.typicode.com/photos");
    // console.log(api5);
    
    let resapi6=await api6;
    let api6json=await resapi6.json();
    let final6=await api6json;
    console.log(final6);
    console.log(final6.filter(x=>x.id>50).reduce((y,z)=>y.albumId+z.title)

    );    
}
demo6();
//example6 normal
let api6=fetch("https://jsonplaceholder.typicode.com/photos");
api6.then(res=>res.json()).then(res1=>console.log(res1));
res1.catch(err=>console.log(err));
//===============================================================================
//example7

async function demo7(){
    let api7=fetch("https://jsonplaceholder.typicode.com/users/1");
    console.log(api7);
    let resapi7=await api7;
    let api7json=await resapi7.json();
    let final77=await api7json;
    console.log(final77);
};
demo7() normal
let api7=fetch("https://jsonplaceholder.typicode.com/users/1");
api7.then(res=>res.json()).then(res1=>console.log(res1));
res1.catch(err=>console.log(err));
//===================================================================
//example8

async function demo8(){
   
    let api8=fetch("https://api.escuelajs.co/api/v1/categories");
    // console.log(api7);
    let resapi8=await api8;
    let api8json=await resapi8.json();
    let final8=await api8json;
    console.log(final8);
}
demo8();
//example8 normal
let api8=fetch("https://api.escuelajs.co/api/v1/categories");
api8.then(res=>res.json()).then(res1=>console.log(res1));
res1.catch(err=>console.log(err));
//========================================================================
//example9

async function demo9(){
   
    let api9=fetch("https://fakestoreapi.com/carts");
    // console.log(api8);
    let resapi9=await api9;
    let api9json=await resapi9.json();
    let final9=await api9json;
    console.log(final9);
}
demo9(); 
//example9 normal
let api9=fetch("https://fakestoreapi.com/carts");
api9.then(res=>res.json()).then(res1=>console.log(res1));
res1.catch(err=>console.log(err));
//=======================================================================

//example10
async function demo10(){
   
    let api10=fetch("https://fakestoreapi.com/carts?userId=1");
    console.log(api10);
    let resapi10=await api10;
    let api10json=await resapi10.json();
    let final0=await api10json;
    console.log(final0);
    
};
demo10()
//example20 normal
let api10=fetch("https://fakestoreapi.com/carts?userId=1");
api10.then(res=>res.json()).then(res1=>console.log(res1));
res1.catch(err=>console.log(err));