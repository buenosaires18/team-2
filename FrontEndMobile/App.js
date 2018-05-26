import { Provider } from 'react-redux';
import { StyleSheet, Text, View } from 'react-native';
import React from 'react';
import store from './store';
import { Scene, Router, Stack } from 'react-native-router-flux';

import LoginPage from './src/components/LoginPage';
import Publication from './src/components/Publication';

export default class App extends React.Component {
  render() {
    return (
      <Provider store={store}>
        <Router>
          <Scene key="root">
            <Scene key="login" component = { LoginPage } title = "Log in" />
            <Scene key="publication" component = { Publication } title = "Crear Publicación" />
          </Scene>
        </Router>
      </Provider>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
});



