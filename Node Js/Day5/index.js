const express = require("express")
const user = require("./MOCK_DATA.json")

const app = express()
const port = 3000

app.use(express.json())

// status code 

// information Responses 100-199
// Sucessful Response 200 - 299
//redirectional response 300 - 399
// client error 400 - 499
// server error 500 - 599

// Middle ware 
// app.use((req,res,next)=>{
//     console.log("Hello from custom middleware 1")
//     next()
// })

// app.use((req,res,next)=>{
//     console.log("Hello from custom middleware 2")
//     return res.end("hey")
// })

app.get('/api/user',(req,res)=>{
    res.setHeader("X-MyName","Vansh")
    console.log(res.header)
    return res.json(user)
})

app.get('/user',(req,res)=>{
    const html = `
    <ul>
    ${user.map(users => `<li>${users.first_name}</li>`).join("")})
    </ul>
    `
    res.send(html)
})
app.get('/api/users/:id', (req, res) => {
    const id = Number(req.params.id);
    const data = user.find(users => users.id === id);
    return res.json(data);
  });

app.post('/api/user',(req,res) =>{
    // const {first_name,last_name,email} = req.body
    const body = req.body
    console.log(body)
    return res.json("pending")
})

app.get('/',(req,res)=>{
    return res.send('Hello welcome to my page')
})

app.listen(port,()=>{
    console.log(`server is running on port ${port}`)
})