import React, { Component } from 'react';
import { Container, Header, Content, Form, Item, Input, Label, Button, Text } from 'native-base';

export default class LoginForm extends Component {

  changeEmail(newEmail) {}

  changePassword(newPassword) {}

  login() {
    this.props.navigation.navigate("Home")
  }

  render() {
    return (
      <Container>
        <Header />
        <Content>
          <Form>
            <Item floatingLabel>
              <Label>Username</Label>
              <Input onChangeText={ text => this.changeUsername(text) } />
            </Item>
            <Item floatingLabel last>
              <Label>Password</Label>
              <Input onChangeText={ text => this.changePassword(text) } />/>
            </Item>
          </Form>
          <Button block style={{ margin: 15, marginTop: 50 }} onPress={() => this.login()}>
            <Text>Sign In</Text>
          </Button>
        </Content>
      </Container>
    );
  }
}
