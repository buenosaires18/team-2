const publicationReducer = (state = {
  body: '',
  company: '',
  description: '',
  title: '',
}, action) => {
  let newState;
  switch (action.type) {
    case 'CHANGE_BODY':
      newState = { ...state, body: action.payload };
      break;
    case 'CHANGE_COMPANY':
      newState = { ...state, company: action.payload };
      break;
    case 'CHANGE_DESCRIPTION':
      newState = { ...state, description: action.payload };
      break;
    case 'CHANGE_TITLE':
      newState = { ...state, title: action.payload };
      break;
    default: newState = { ...state
    };
    break;
  }
  return newState;
};

export default publicationReducer;
