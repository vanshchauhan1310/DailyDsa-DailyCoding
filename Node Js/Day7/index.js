const express = require("express")
const urlRouter = require("./Routes/url")
const path = require("path");
const db = require("./connect")
const URL = require('./Models/url')
const userRoute = require("./Routes/user")
const app = express()
const port = 8001

app.set('view engine', 'ejs')
app.set("views", path.resolve("./Views"))

app.use(express.json())
app.use(express.urlencoded({ extended: false }))

db("mongodb://localhost:27017")
  .then(() => console.log("Connected to MongoDB"))
  .catch((err) => console.log("Error connecting to MongoDB:", err))

app.use("/url", urlRouter)
app.use("/user", userRoute) 

app.get('/', (req, res) => {
  res.render('home') 
})

app.get('/signup',(req,res)=>{
 return res.render('signup')
})

app.get('/login',(req,res)=>{
  return res.render('login')
 })

app.get('/:shortId', async (req, res) => {
  const { shortId } = req.params
  console.log(`Received request for shortId: ${shortId}`);
    
  try {
    const entry = await URL.findOne({ shortid: shortId })
    
    if (entry) {
      await URL.updateOne(
        { shortid: shortId },
        {
          $push: {
            visitHistory: {
              timestamp: Date.now()
            }
          }
        }
      )
      res.redirect(entry.redirecturl)
    } else {
      console.log('Short URL not found in database');
      res.status(404).send('Short URL not found')
    }
  } catch (error) {
    console.error('Error processing short URL:', error)
    res.status(500).send('An error occurred while processing your request')
  }
})

app.listen(port, () => {
  console.log(`Server is running on port ${port}`)
})