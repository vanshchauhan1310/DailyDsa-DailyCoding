const express = require("express")
const user = require("./MOCK_DATA.json")

const app = express()
const port = 3000

app.use(express.json())

app.get('/api/user',(req,res)=>{
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