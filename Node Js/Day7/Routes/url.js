const express = require("express");
const { handleGeneratedURL, handleGetAnalytics } = require("../Controller/url");
const router = express.Router();

router.post('/', handleGeneratedURL);

router.get('/analytics/:shortid', handleGetAnalytics);

module.exports = router;