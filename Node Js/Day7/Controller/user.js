const User = require("../Models/users");

async function handleUserSignUp(req, res) {
  try {
    console.log(req.body);
    const { name, email, password } = req.body;
    
    await User.create({
      name,
      email,
      password
    });
    
    return res.render("login");
  } catch (error) {
    console.error("Error in handleUserSignUp:", error);
    return res.status(500).json({ error: "Internal Server Error" });
  }
}

async function handleUserLogIn(req, res) {
    try {
      console.log(req.body);
      const {email, password } = req.body;
      
     const Validuser =  await User.findOne({
        email,
        password
      });
      
      if(!Validuser){
        return res.status(401).json({ error: "Invalid Email or Password" });

      }

      return res.render("home");
    } catch (error) {
      console.error("Error in handleUserSignUp:", error);
      return res.status(500).json({ error: "Internal Server Error" });
    }
  }
  

module.exports = {
  handleUserSignUp,
  handleUserLogIn
};