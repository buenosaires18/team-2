const express = require('express');
const bodyParser = require('body-parser');

const publications = require('./data/publications');

// const events = require('./data/events');
// const users = require('./data/users');

const router = express.Router();
const app = express();
app.use(bodyParser.json());

router.post('/publication', (req, res) => {
  console.log('asd')
  res.send('ok');
});

router.get('/publications', (req, res) => {
  res.send(publications);
});

// router.post('/register', (req, res) => {
//   res.send('ok');
// });

// router.get('/events', (req, res) => {
//   res.send(events);
// });

// router.post('/event', (req, res) => {
//   res.send('ok');
// });

// router.get('/events/:idUser', (req, res) => {
//   const result = events.filter(event => event.user.id === parseInt(req.params.idUser, 10));
//   if (result) {
//     res.send(result);
//   } else {
//     res.status(404).send('error');
//   }
// });

// router.get('/event/:idEvent', (req, res) => {
//   const result = events.find(event => event.id === parseInt(req.params.idEvent, 10));
//   if (result) {
//     res.send(result);
//   } else {
//     res.status(404).send('error');
//   }
// });

// router.delete('/event', (req, res) => {
//   res.send('ok');
// });

app.use('/', router);
app.listen(5000);
console.log('starting on 5000');