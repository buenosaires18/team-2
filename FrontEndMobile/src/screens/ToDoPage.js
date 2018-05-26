import { connect } from 'react-redux';
import React from 'react';
import { Container, Header, Title, Content, Button, Left, Right, Body, Icon, Text } from 'native-base';

export default class ToDoPage extends React.Component {

  render() {
    return (
      <Container>
        <Header>
          <Left>
            <Button transparent onPress={() => this.props.navigation.navigate("Home")}>
              <Icon name='arrow-back' />
            </Button>
          </Left>
          <Body>
            <Title>TODO</Title>
          </Body>
          <Right />
        </Header>
        <Content>
          <Text>TODO</Text>
        </Content>
      </Container>
    );
  }
}
