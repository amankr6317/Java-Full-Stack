import PropTypes from "prop-types";
import classnames from "classnames";
import { Component } from "react";
import { connect } from "react-redux";
import { getProject, createProject } from "../../redux/actions/projectActions";

class UpdateProject extends Component {
  constructor() {
    super();
    this.state = {
      id: "",
      projectName: "",
      projectIdentifier: "",
      description: "",
      start_date: "",
      end_date: "",
      errors: {},
    };
    this.onChange = this.onChange.bind(this);
    this.onSubmit = this.onSubmit.bind(this);
  }

  componentDidMount() {
    const { id } = this.props.match.params;
    this.props.getProject(id, this.props.history);
  }

  componentWillReceiveProps(nextProps) {
    if (nextProps.errors) {
      this.setState({ errors: nextProps.errors });
    }
    this.setState({
      id: nextProps.project.id,
      projectName: nextProps.project.projectName,
      projectIdentifier: nextProps.project.projectIdentifier,
      description: nextProps.project.description,
      start_date: nextProps.project.start_date,
      end_date: nextProps.project.end_date,
    });
  }

  onSubmit(e) {
    e.preventDefault();
    const updateProject = {
      id: this.state.id,
      projectName: this.state.projectName,
      projectIdentifier: this.state.projectIdentifier,
      description: this.state.description,
      start_date: this.state.start_date,
      end_date: this.state.end_date,
    };
    console.log(updateProject);
    this.props.createProject(updateProject, this.props.history);
  }

  onChange(e) {
    this.setState({ [e.target.name]: e.target.value });
  }

  render() {
    const { errors } = this.state;

    return (
      <div className="container" style={{ marginTop: "6rem" }}>
        <div className="row col-md-8 m-auto">
          <span className="text-light mb-4 h1">UPDATE PROJECT</span>
          <hr className="text-light mb-5" />
          <form onSubmit={this.onSubmit}>
            <div className="input-group mb-3">
              <span className="input-group-text w-25" id="basic-addon1">
                PROJECT NAME <span style={{ color: "red" }}>*</span>
              </span>
              <input
                type="text"
                className={classnames("form-control form-control-lg", {
                  "is-invalid": errors.projectName,
                })}
                placeholder="Enter Project Name"
                name="projectName"
                value={this.state.projectName}
                onChange={this.onChange}
              />
              {errors.projectName && (
                <div className="invalid-feedback">{errors.projectName}</div>
              )}
            </div>
            <div className="input-group mb-3">
              <span className="input-group-text w-25" id="basic-addon1">
                PROJECT DESCRIPTION <span style={{ color: "red" }}>*</span>
              </span>
              <textarea
                className={classnames("form-control form-control-lg", {
                  "is-invalid": errors.description,
                })}
                placeholder="Enter Project Description"
                name="description"
                value={this.state.description}
                onChange={this.onChange}
              />
              {errors.description && (
                <div className="invalid-feedback">{errors.description}</div>
              )}
            </div>
            <div className="input-group mb-3">
              <span className="input-group-text w-25" id="basic-addon1">
                START DATE <span style={{ color: "red" }}>*</span>
              </span>
              <input
                type="date"
                className="form-control form-control-lg"
                name="start_date"
                value={this.state.start_date}
                onChange={this.onChange}
              />
            </div>
            <div className="input-group mb-3">
              <span className="input-group-text w-25" id="basic-addon1">
                ESTIMATED END DATE <span style={{ color: "red" }}>*</span>
              </span>
              <input
                type="date"
                className="form-control form-control-lg"
                name="end_date"
                value={this.state.end_date}
                onChange={this.onChange}
              />
            </div>
            <input
              type="submit"
              className="btn btn-info btn-block mt-4 w-100"
              value="SUBMIT"
            />
          </form>
        </div>
      </div>
    );
  }
}

UpdateProject.propTypes = {
  getProject: PropTypes.func.isRequired,
  createProject: PropTypes.func.isRequired,
  project: PropTypes.object.isRequired,
  errors: PropTypes.object.isRequired,
};

const mapStateToProps = (state) => ({
  project: state.project.project,
  errors: state.errors,
});

export default connect(mapStateToProps, { getProject, createProject })(
  UpdateProject
);
