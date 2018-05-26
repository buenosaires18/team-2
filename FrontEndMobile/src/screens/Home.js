import { connect } from 'react-redux';
import React from 'react';
import { Container, Header, Title, Content, Footer, FooterTab, Button, Left, Right, Body, Icon, Text } from 'native-base';
import homeActions from '../actions/homeActions';
import PublicationCard from './PublicationCard';

class Home extends React.Component {
  componentWillMount() {
    this.props.getFeed(1)
  }

  render() {
    return (
      <Container>
        <Header>
          <Left>
            <Button transparent>
              <Icon name='menu' />
            </Button>
          </Left>
          <Body>
            <Title>Home</Title>
          </Body>
          <Right />
        </Header>
        <Content>
          {this.props.feed.map(feed => <PublicationCard feed={feed} />)}
        </Content>
      </Container>
    );
  }
}
const mapStateToProps = state => ({
  feed: state.homeReducer.feed,
  user: state.homeReducer.user,
});

const mapDispatchToProps = dispatch => ({
  getFeed: userId => dispatch(homeActions.getFeed(userId)),
});

export default connect(mapStateToProps, mapDispatchToProps)(Home);
