import { connect } from 'react-redux';
import { Button, StyleSheet, Text, TextInput, View } from 'react-native';
import React from 'react';
import Hr from "react-native-hr-component";


import publicationActions from '../actions/publicationActions';

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
});

class Publish extends React.Component {

  changeBody(newBody) {
    this.props.changeBody(newBody);
  }

  changeCompany(newCompany) {
    this.props.changeCompany(newCompany);
  }
  
  changeDescription(newDescription) {
    this.props.changeDescription(newDescription);
  }
  
  changeTitle(newTitle) {
    this.props.changeTitle(newTitle);
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
    this.props.sendPublication(this.createEvent()).then(console.log);
  }

  render() {
    return (
      <View style={styles.container}>
        <Text>Crear Publicación</Text>
        <Hr lineColor="#eee" width={1} text="" />
        <TextInput placeholder="Titulo" onChangeText={ text => this.changeTitle(text)} />
        <TextInput placeholder="Descripción" onChangeText={ text => this.changeDescription(text)} />
        <TextInput placeholder="Cuerpo" onChangeText={ text => this.changeBody(text)} />
        <TextInput placeholder="Empresa" onChangeText={ text => this.changeCompany(text)} />
        <Hr lineColor="#eee" width={1} text="" />
        <Button 
          onPress={() =>this.sendPublication()}
          title="Learn More"
          color="#841584" />
      </View>
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

export default connect(mapStateToProps, mapDispatchToProps)(Publish);
