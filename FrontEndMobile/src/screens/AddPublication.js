import { connect } from 'react-redux';
import React, { Component } from 'react';
import { Container, Header, Content, Form, Item, Input, Left, Icon, Body, Title, Right, Label, Button, Text, Textarea } from 'native-base';

import publicationActions from '../actions/publicationActions';

class AddPublication extends Component {

  changeBody(newBody) {
    // this.props.changeBody(newBody);
  }
  
  changeCompany(newCompany) {
    // this.props.changeCompany(newCompany);
  }
  
  changeDescription(newDescription) {
    // this.props.changeDescription(newDescription);
  }
  
  changeTitle(newTitle) {
    // this.props.changeTitle(newTitle);
  }
  
  createEvent() {
    return {
      body: this.props.body,
      description: this.props.description,
      company: this.props.company,
      title: this.props.title,
    }
  }
  
  sendPublication() {
    this.props.sendPublication(this.createEvent());
  }

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
            <Title>Crear Publicación</Title>
          </Body>
          <Right />
        </Header>
        <Content>
          <Form>
            <Item floatingLabel>
              <Label>Titulo</Label>
              <Input onChangeText={ text => this.changeTitle(text) } />
            </Item>
            <Item floatingLabel>
              <Label>Empresa</Label>
              <Input onChangeText={ text => this.changeCompany(text) } />/>
            </Item>
            <Item floatingLabel>
              <Label>Descripción</Label>
              <Input onChangeText={ text => this.changeDescription(text) } />/>
            </Item>
            <Item floatingLabel>
              <Label>Cuerpo</Label>
              <Textarea rowSpan={3} bordered onChangeText={ text => this.changeBody(text) } />/>
            </Item>
          </Form>
          <Button block style={{ margin: 15, marginTop: 50 }} onPress={() => this.sendPublication()}>
            <Text>Enviar Publicación</Text>
          </Button>
        </Content>
      </Container>
    );
  }
}

const mapStateToProps = state => ({
  title: state.publicationReducer.title,
  description: state.publicationReducer.description,
  body: state.publicationReducer.body,
  company: state.publicationReducer.company,
});

const mapDispatchToProps = dispatch => ({
  changeTitle: text => dispatch(publicationActions.changeTitle(text)),
  changeDescription: text => dispatch(publicationActions.changeDescription(text)),
  changeBody: text => dispatch(publicationActions.changeBody(text)),
  changeCompany: text => dispatch(publicationActions.changeCompany(text)),
  sendPublication: publication => dispatch(publicationActions.sendPublication(publication)),
});

export default connect(mapStateToProps, mapDispatchToProps)(AddPublication);
