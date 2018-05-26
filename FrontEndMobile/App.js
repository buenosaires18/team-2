import { Provider } from 'react-redux';
import { StyleSheet, Text, View } from 'react-native';
import React from 'react';
import store from './store';

import LoginPage from './src/components/LoginPage';
import Publication from './src/components/Publication';

export default class App extends React.Component {
  render() {
    return (
      <Provider store={store}>
        <View style={styles.container}>
          <Publication / >
        </View>
      </Provider>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
});
