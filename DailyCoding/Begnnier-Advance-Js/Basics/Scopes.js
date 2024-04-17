var c = 300
let a = 300
if (true) {
    let a = 10
    const b = 20
    // console.log("INNER: ", a);
    
}




// var is dependent on block scope
// let is independent of block scope

 console.log(a);
 // console.log(b);
console.log(c);

// var are function-scoped or globally scoped
// let are block-scoped.


function one(){
    const username = "hitesh"

    function two(){
        const website = "youtube"
        console.log(username);
    }
    // console.log(website);

     two()

}

// one()



if (true) {
    const username = "hitesh"
    if (username === "hitesh") {
        const website = " youtube"
        // console.log(username + website);
    }
    // console.log(website);
}

// console.log(username);


// Hoisting is a mechanism in JavaScript where variable and function declarations are moved to the top of their containing scope during the compile phase,

// this keyword refer to current context 
// In Browser this is a window object
// In Node this is a global object

