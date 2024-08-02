const http = require('http')
const fs = require('fs')
const myserver = http.createServer((req,res)=>{
    const log  = `${Date.now()} : ${req.url} New Request Received` 
    fs.appendFile('server.log',log+'\n', (err)=>{
        switch(req.url){
            case '/':
                res.end("Welcome to My server")
                break
            case '/about':
                res.end("This is about page");
                break
            default:
                res.end("404 error not found ")
            }
        })
});     

myserver.listen(3000,()=>{
    console.log("Server is running on port 3000")
    })
