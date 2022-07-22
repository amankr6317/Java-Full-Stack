import PropTypes from "prop-types";
import { Component } from "react";
import { connect } from "react-redux";
import { Link } from "react-router-dom";
import { deleteProject } from "../../redux/actions/projectActions";

class ProjectItem extends Component {
  onDeleteClick = (id) => {
    console.log(id);
    this.props.deleteProject(id);
  };

  render() {
    const { project } = this.props;

    return (
      <div className="container card card-body bg-light mb-3">
        <>
          <div className="row">
            <div className="col-2 text-center m-auto">
              <span className="mx-auto">{project.projectIdentifier}</span>
            </div>
            <div className="col-10">
              <p className="h3 mb-2">{project.projectName}</p>
              <p className="mb-3">{project.description}</p>
              <div className="d-flex justify-content-around">
                <button type="button" className="btn btn-success col-3">
                  <Link
                    style={{ textDecoration: "none", color: "white" }}
                    to={`/projectBoard/${project.projectIdentifier}`}
                  >
                    <i className="fa fa-flag-checkered pr-1" />
                    PROGECT BOARD
                  </Link>
                </button>
                <button type="button" className="btn btn-warning col-3">
                  <Link
                    style={{ textDecoration: "none", color: "white" }}
                    to={`/updateProject/${project.projectIdentifier}`}
                  >
                    <i className="fa fa-flag-checkered pr-1" />
                    UPDATE PROJECT
                  </Link>
                </button>
                <button
                  type="button"
                  className="btn btn-danger col-3"
                  onClick={this.onDeleteClick.bind(
                    this,
                    project.projectIdentifier
                  )}
                >
                  <i className="fa fa-minus-circle pr-1" />
                  DELETE PROJECT
                </button>
              </div>
            </div>
          </div>
        </>
      </div>
    );
  }
}

ProjectItem.propTypes = {
  deleteProject: PropTypes.func.isRequired,
};

export default connect(null, { deleteProject })(ProjectItem);
