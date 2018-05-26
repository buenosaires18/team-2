import { connect } from 'react-redux';
import React from 'react';
import { Container, Header, Title, Content, Footer, FooterTab, Button, Left, Right, Body, Icon, Text } from 'native-base';
import homeActions from '../actions/homeActions';
import PublicationCard from './PublicationCard';

class Home extends React.Component {
  componentWillMount() {
    this.props.getFeed(1)
  }

  goToPublication(feed) {
    this.props.navigation.navigate("Publication", {
      feed,
      goBack: () => this.props.navigation.navigate("Home")
  });
  }

  render() {
    return (
      <Container>
        <Header>
          <Left>
            <Button transparent onPress={() => this.props.navigation.navigate("DrawerOpen")}>
              <Icon name='menu' />
            </Button>
          </Left>
          <Body>
            <Title>Home</Title>
          </Body>
          <Right />
        </Header>
        <Content>
          {this.props.feed
            .map(feed => <PublicationCard 
              feed={feed} 
              key={feed.id} 
              onPress={ () => this.goToPublication(feed)} />)
          }
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
