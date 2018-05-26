import BackendService from '../services/backendService';

export default {
  getFeed(userId) {
    return {
      type: 'GET_FEED',
      payload: BackendService.getFeed(userId),
    };
  },
};
