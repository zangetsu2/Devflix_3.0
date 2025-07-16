const express = require('express');
const axios = require('axios');
const app = express();
const PORT = process.env.PORT || 3000;

app.use(express.json());
app.get('/movies', async (_, res) => {
  try {
    const { data } = await axios.get(`${process.env.CATALOGUE_URL}/movies`);
    res.json(data);
  } catch (e) {
    res.status(500).json({ error: e.message });
  }
});

app.listen(PORT, () => console.log(`Frontend on port ${PORT}`));