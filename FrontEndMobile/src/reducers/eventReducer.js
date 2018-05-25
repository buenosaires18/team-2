const eventReducer = (state = {}, action) => {
  let newState;
  switch (action.type) {
    default:
      newState = { ...state
      };
      break;
  }
  return newState;
};

export default eventReducer;
