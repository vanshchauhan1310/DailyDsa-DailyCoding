const http = require('http')
const fs = require('fs')
const url = require("url")
const myserver = http.createServer((req,res)=>{
    const log  = `${Date.now()} : ${req.url} New Request Received` 
    const myurl = url.parse(req.url,true)
    console.log(myurl)
    fs.appendFile('server.log',log+'\n', (err)=>{
        switch(myurl.pathname){
            case '/':
                res.end("Welcome to My server")
                break
            case '/about':
                res.end("This is about page");
                break
            case '/search':
                const username = myurl.query.name
                res.end(`You are searching for ${username}`)
            default:
                res.end("404 error not found ")
            }
        })
});     

myserver.listen(3000,()=>{
    console.log("Server is running on port 3000")
    })
