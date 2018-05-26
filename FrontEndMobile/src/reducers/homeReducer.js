const homeReducer = (state = {
  feed: [],
}, action) => {
  let newState;
  switch (action.type) {
    default:
      newState = { ...state
      };
      break;
  }
  return newState;
};

export default homeReducer;
