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
  return fetch(`${Config.backendApi}${path}`, {
      method: 'GET',
      headers: {
        Accept: 'application/json',
        'Content-Type': 'application/json',
      },
    })
    .then(response => response.data)
    .catch(onError)
    
};

export default {
  sendPublication: publication => executePost(`/publication`, publication),
  getFeed: userId => executeGet(`${userId}/publications`),
};
