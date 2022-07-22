import { Component } from "react";
import { BrowserRouter as Router, Route } from "react-router-dom";
import { Provider } from "react-redux";
import store from "./redux/store";

import Header from "./components/Layout/Header";
import Landing from "./components/Layout/Landing";
import Login from "./components/User/Login";
import Register from "./components/User/Register";
import Dashboard from "./components/Project/Dashboard";
import AddProject from "./components/Project/AddProject";
import UpdateProject from "./components/Project/UpdateProject";
import ProjectBoard from "./components/Project/ProjectBoard/ProjectBoard";
import AddProjectTask from "./components/Project/ProjectBoard/AddProjectTask";
import UpdateProjectTask from "./components/Project/ProjectBoard/UpdateProjectTask";

export class App extends Component {
  render() {
    return (
      <Provider store={store}>
        <Router>
          <Header />
          <Route exact path="/" component={Landing} />
          <Route exact path="/login" component={Login} />
          <Route exact path="/register" component={Register} />
          <Route exact path="/dashboard" component={Dashboard} />
          <Route exact path="/addProject" component={AddProject} />
          <Route exact path="/updateProject/:id" component={UpdateProject} />
          <Route exact path="/projectBoard/:id" component={ProjectBoard} />
          <Route exact path="/addprojectTask/:id" component={AddProjectTask} />
          <Route exact path="/updateprojectTask/:projectid/:taskid" component={UpdateProjectTask} />
        </Router>
      </Provider>
    );
  }
}

export default App;
