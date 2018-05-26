const homeReducer = (state = {
  feed: [],
}, action) => {
  let newState;
  switch (action.type) {
    case 'GET_FEED_FULFILLED':
      newState = { ...state, feed: action.payload}
      break;
    default:
      newState = { ...state
      };
      break;
  }
  return newState;
};

export default homeReducer;
