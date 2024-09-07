const express = require("express")
const user = require("./MOCK_DATA.json")
const Monggose = require("mongoose")

const app = express()
const port = 3000

app.use(express.json())

// Connection 
Monggose.connect("mongodb://localhost:27017/mydatabase")
.then(() => console.log("Connected to MongoDB"))
.catch((err) => console.log(err))



// Scehma 
const userSchema = new Monggose.Schema({
    firstName:{
        type:String,
        required:true

    },

    lastName:{
        type:String,
        required:true
        
    },

    email:{
        type:String,
        required:true,
        unique:true
    }

    })

    const User = Monggose.model("user",userSchema)


app.get('/api/user',(req,res)=>{
    res.setHeader("X-MyName","Vansh")
    console.log(res.header)
    return res.json(user)
})

app.get('/user',async (req,res)=>{
    const alldbuser = await User.find({});
    const html = `
    <ul>
    ${alldbuser.map(users => `<li>${users.firstName}</li>`).join("")})
    </ul>
    `
    res.send(html)
})
app.get('/api/users/:id', (req, res) => {
    const id = Number(req.params.id);
    const data = user.find(users => users.id === id);
    return res.json(data);
  });

  app.post('/api/user', async (req, res) => {
    const { firstName, lastName, email } = req.body;
    console.log(firstName)
    
    if (!firstName || !lastName || !email) {
        return res.status(400).json({ error: "All fields are required" });
    }

    try {
        const result = await User.create({ firstName, lastName, email });
        return res.status(201).json({ msg: "success" });
    } catch (error) {
        console.error('Error creating user:', error);
        return res.status(400).json({ error: error.message });
    }
});

app.get('/',(req,res)=>{
    return res.send('Hello welcome to my page')
})

app.listen(port,()=>{
    console.log(`server is running on port ${port}`)
})