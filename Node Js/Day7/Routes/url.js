const express = require("express")
const handleGenratedURL = require("../Controller/url")
const router = express.Router();

router.post('/',handleGenratedURL)

module.exports = router;