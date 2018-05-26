import React, { Component } from "react";
import { Button, Text, Container, Header, Left, Body, Title, Right, Content, Textarea, Form } from "native-base";
export default class TextArea extends Component {
  render() {
    return (
      <Content padder>
        <Form>
          <Textarea rowSpan={5} bordered placeholder="Nuevo Comentario" />
        </Form>
        <Button block style={{ margin: 15, marginTop: 50 }} onPress={() => null}>
          <Text>Enviar Comentaio</Text>
        </Button>
      </Content>
    );
  }
}