import PropTypes from "prop-types";
import ProjectItem from "./ProjectItem";
import { Component } from "react";
import { connect } from "react-redux";
import { Link } from "react-router-dom";
import { getProjects } from "../../redux/actions/projectActions";

class Dashboard extends Component {
  componentDidMount() {
    this.props.getProjects();
  }

  render() {
    const { projects } = this.props.project;

    return (
      <div className="container" style={{ marginTop: "6rem" }}>
        <div className="row col-md-10 m-auto">
          <h1 className="text-light mb-4 h1">PROJECTS</h1>
          <hr className="text-light mb-3" />
          <Link to="/addProject" className="btn btn-info btn-block w-100 mb-5">
            CREATE A PROJECT
          </Link>
          {projects.map((project) => (
            <ProjectItem key={project.id} project={project} />
          ))}
        </div>
      </div>
    );
  }
}

Dashboard.propTypes = {
  project: PropTypes.object.isRequired,
  getProjects: PropTypes.func.isRequired,
};

const mapStateToProps = (state) => ({
  project: state.project,
});

export default connect(mapStateToProps, { getProjects })(Dashboard);
