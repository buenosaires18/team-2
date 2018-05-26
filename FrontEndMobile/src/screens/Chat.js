import React, { Component } from "react";
import { ListItem, Left, Body,Text, Container, Header, Content, Footer, FooterTab, Button, Icon } from 'native-base';

export default class Chat extends Component {
  render() {
    return (
      <ListItem avatar>
        <Left>
          <Icon name="person" />
        </Left>
        <Body>
          <Text>{this.props.user.username}</Text>
          <Text note>{this.props.text}</Text>
        </Body>
      </ListItem>
    );
  }
}

 
