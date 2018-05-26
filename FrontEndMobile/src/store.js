import { createStore, combineReducers, applyMiddleware } from 'redux';
import promise from 'redux-promise-middleware';

import homeReducer from './reducers/homeReducer.js';
import loginReducer from './reducers/loginReducer.js';
import publicationReducer from './reducers/publicationReducer.js';

export default createStore(
  combineReducers({
    homeReducer,
    loginReducer,
    publicationReducer,
  }),
  {},
  applyMiddleware(promise()),
);
