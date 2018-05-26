import { connect } from 'react-redux';
import React from 'react';
import { Container, Header, Title, Content, Footer, FooterTab, Button, Left, Right, Body, Icon, Text } from 'native-base';
import homeActions from '../actions/homeActions';

// const styles = StyleSheet.create({
//   container: {
//     flex: 1,
//     alignItems: 'center',
//     justifyContent: 'center',
//     backgroundColor: 'steelblue',
//   },
// });

class Home extends React.Component {
  componentWillReceiveProps() {
    this.props.getFeed(this.props.user.id)
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
});

const mapDispatchToProps = dispatch => ({
  getFeed: userId => dispatch(homeActions.getFeed(userId)),
});

export default connect(mapStateToProps, mapDispatchToProps)(Home);
