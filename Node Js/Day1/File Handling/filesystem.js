const fs = require("fs")

// Writting A File 

// this is synchronous call 
// fs.writeFileSync('./test.txt',"Hello world")

// This is asynchronus call 
// fs.writeFile('./test.txt',"This is asynchronus call",(err)=>{})



// Reading a File 

// this is synchronous call 
// const result = fs.readFileSync('./test2.txt','utf-8')
// console.log(result)

// This is asynchronus call 

// fs.readFile('./test2.txt','utf-8',(err,result)=>{
//     if(err){
//       console.log("Error")
//     }
//     else{  
//      console.log(result)
//     }
// }

// )

// Append a file 

fs.appendFileSync('./test.txt', " hello guys this is Append")

// copy a file 
fs.cpSync('./test2.txt','./copy.txt')

// delete a file 
// fs.unlinkSync("./copy.txt")

// to get statistic of file 
console.log(fs.statSync('./test.txt').isFile()) // isfile is a funtion which tell is it a file 

