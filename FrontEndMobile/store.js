import { createStore, combineReducers, applyMiddleware } from 'redux';
import promise from 'redux-promise-middleware';

import publicationReducer from './src/reducers/publicationReducer.js';
import loginReducer from './src/reducers/loginReducer.js';

export default createStore(
  combineReducers({
    publicationReducer,
    loginReducer,
  }),
  {},
  applyMiddleware(promise()),
);
