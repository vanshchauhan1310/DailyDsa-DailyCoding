const shortid = require("shortid")
const URL = require("../Models/url")

async function handleGenratedURL(req,res){
    const body  = req.body;
    if(!body.url) return res.status(400).json({ error:'url is required'})
  
    const SHORTID = shortid()

    await URL.create({
        shortid: SHORTID,
        redirecturl:body.url,
        visitHistory: [],
    })

    return res.json({ id:SHORTID })

}

module.exports = handleGenratedURL;  //exporting the function to use in routes.js file



