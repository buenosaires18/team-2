import React from 'react';
import { KeyboardAvoidingView, StyleSheet, TextInput, View, Button } from 'react-native';
import { Actions } from 'react-native-router-flux';

import usernameImg from '../images/username.png';
import passwordImg from '../images/password.png';
import Input from './Input';

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
    backgroundColor: 'steelblue',
  },
});

export default class LoginPage extends React.Component {

  changeEmail(newEmail) {}

  changePassword(newPassword) {}

  render() {
    return (
      <KeyboardAvoidingView behavior="padding" style={styles.container}>
        <View style= {{ flex: 1}}/>
        <Input
          source={usernameImg}
          placeholder="Username"
          onChangeText={ text => this.changeEmail(text) }
        />
        <Input
          source={passwordImg}
          placeholder="Password"
          withSecureTextEntry={true}
          onChangeText = { text => this.changePassword(text) }
        />
        <Button title="Login" onPress={Actions.publication} />

        <View style= {{ flex: 1}}/>
      </KeyboardAvoidingView>
    );
  }
}
