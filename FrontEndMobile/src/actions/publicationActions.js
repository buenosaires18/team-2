import BackendService from '../services/backendService';

export default {
  changeBody(body) {
    return {
      type: 'CHANGE_BODY',
      payload: body,
    };
  },
  changeCompany(company) {
    return {
      type: 'CHANGE_COMPANY',
      payload: company,
    };
  },
  changeDescription(description) {
    return {
      type: 'CHANGE_DESCRIPTION',
      payload: description,
    };
  },
  changeTitle(title) {
    return {
      type: 'CHANGE_TITLE',
      payload: title,
    };
  },
  sendPublication(publication) {
    return {
      type: 'SEND_NEW_PUBLISH',
      payload: BackendService.sendPublication(publication),
    }
  }
};
