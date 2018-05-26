import React, { Component } from "react";
import { Container, Header, Title, Content, Button, Icon, Card, CardItem, Text, Body, Left, Right, IconNB } from "native-base";

export default class PublicationCard extends Component {

  render() {
    return (
      <Card>
        <CardItem header button onPress={() => this.props.onPress()}>
          <Text>{this.props.feed.title}</Text>
        </CardItem>
        <CardItem>
          <Body>
            <Text>{this.props.feed.introduction}</Text>
          </Body>
        </CardItem>
      </Card>
    );
  }
}