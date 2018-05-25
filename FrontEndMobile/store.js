import { createStore, combineReducers, applyMiddleware } from 'redux';
import promise from 'redux-promise-middleware';

import eventReducer from './src/reducers/eventReducer.js';
import loginReducer from './src/reducers/loginReducer.js';

export default createStore(
  combineReducers({
    eventReducer,
    loginReducer,
  }),
  {},
  applyMiddleware(promise()),
);
