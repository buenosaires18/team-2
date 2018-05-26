import React, { Component } from "react";
import { List, Container, Header, Content, Card, CardItem, Thumbnail, Text, Button, Icon, Left, Body, Title } from 'native-base';

import Comments from './Comments'
import AddComment from './AddComment'

export default class Publication extends Component {
  render() {
    const { navigation } = this.props;
    const feed = navigation.getParam('feed', {});
    const goBack = navigation.getParam('goBack', () => null);
    const goToComments = navigation.getParam('goToComments', () => null);
    return (
      <Container>
        <Header>
          <Left>
            <Button transparent onPress={() => goBack()}>
              <Icon name="arrow-back" />
            </Button>
          </Left>
          <Body>
            <Title>{feed.title}</Title>
          </Body>
        </Header>
        <Content>
          <Card style={{flex: 0}}>
            <CardItem>
              <Left>
                <Body>
                  <Text>{feed.company}</Text>
                  <Text note>26 de Mayo 26 2018</Text>
                </Body>
              </Left>
            </CardItem>
            <CardItem>
              <Body>
                <Text>
                  {feed.description}
                </Text>
              </Body>
            </CardItem>

          </Card>
        <Comments chats={feed.chats} />
        <AddComment />
        </Content>        
      </Container>
    );
  }
}
