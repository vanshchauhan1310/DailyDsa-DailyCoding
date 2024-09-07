const shortid = require("shortid")
const URL = require("../Models/url")

async function handleGeneratedURL(req,res){
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


async function handleGetAnalytics (req,res){
    const shortId = req.params.shortId;
    const result = await URL.findOne({shortId})

    return res.json({
        totalclicks: result.visitHistory.length,
        analytics: result.visitHistory,
    })
}
module.exports = {
    handleGeneratedURL,
    handleGetAnalytics, 
};