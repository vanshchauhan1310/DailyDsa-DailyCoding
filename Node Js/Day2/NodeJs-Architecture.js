const fs = require('fs')
const os = require("os")
// In Node Js Architecture clients Requests Goes to server
// and in Server all request are queue in a event-queue and 
// event-queue is handled by event-loop acc to fifo rule
// In event-loop their are two type of request blocking and non blocking 
// blocking request are handled by thread and non blocking request are handled by event-loop    
// Thread-pool it is a pool of thread basically which help Node js to Execute the request in Parrallel

// By default their are only 4 threads in thread pool 
// we can increase the number of thread in thread pool by using good cpu 
// because number of thread in thread pool = number oof core a cpu has 

// In case of blocking operations

// console.log('1')
// const result = fs.readFileSync('./test1.txt','utf-8')
// console.log(result)

// console.log('2')
// console.log('3')


// In Case Of Non-Blocking Operations 
console.log('1')
fs.readFile('./test1.txt','utf-8', (err, data) => {
    if(err) {
        console.log(err)
    } 
    else {
        console.log(data)
    }
})

console.log('2')
console.log('3')

console.log(os.cpus().length)