import React from "react";
import { Root } from "native-base";
import { StackNavigator, DrawerNavigator } from "react-navigation";
import { Provider } from 'react-redux';
import store from './store';

import Home from "./screens/Home.js";
import LoginPage from "./screens/LoginPage.js";
import Publication from "./screens/Publication.js";
import Comments from "./screens/Comments.js";
import SideBar from "./screens/SideBar.js";

const Drawer = DrawerNavigator(
  {
    Home: { screen: Home },
    LoginPage: { screen: LoginPage },
    Publication: { screen: Publication },
    Comments: { screen: Comments },
  },
  {
    initialRouteName: "LoginPage",
    contentOptions: {
      activeTintColor: "#e91e63"
    },
    contentComponent: () => <SideBar />
  }
);

const AppNavigator = StackNavigator(
  {
    Drawer: { screen: Drawer },
  },
  {
    initialRouteName: "Drawer",
    headerMode: "none"
  }
);

export default () =>
  <Provider store={store}>
    <Root>
      <AppNavigator />
    </Root>
  </Provider>;
