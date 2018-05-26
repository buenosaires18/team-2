import React, { Component } from 'react';
import { Button, Icon, Title, Container, Header, Content, List, ListItem, Left, Body, Right, Thumbnail, Text } from 'native-base';

import Chat from './Chat';

export default class Comments extends Component {
  render() {
    return (
      <List>
        {this.props.chats.map(chat => <Chat key={chat.id} user={chat.user} text={chat.text} />)}
      </List>
    );
  }
}
