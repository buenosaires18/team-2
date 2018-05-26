import Config from '../config'

const executePost = (path, data) => {
  return fetch(`${Config.backendApi}${path}`, {
    method: 'POST',
    headers: {
      Accept: 'application/json',
      'Content-Type': 'application/json',
    },
    body: JSON.stringify(data),
  })
  .then(response => response.data)
};

const executeGet = (path, data) => {
  return fetch(`${Config.backendApi}${path}`).then(response => response.json())
    
};

export default {
  sendPublication: publication => executePost(`/publication`, publication),
  // getFeed: userId => executeGet(`${userId}/publications`),
  getFeed: userId => executeGet(`/publications`),
};
