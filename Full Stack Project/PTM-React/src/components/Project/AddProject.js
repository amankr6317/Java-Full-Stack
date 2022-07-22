import classnames from "classnames";
import PropTypes from "prop-types";
import { Component } from "react";
import { connect } from "react-redux";
import { createProject } from "../../redux/actions/projectActions";

class AddProject extends Component {
  constructor() {
    super();
    this.state = {
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

  componentWillReceiveProps(nextProps) {
    if (nextProps.errors) {
      this.setState({ errors: nextProps.errors });
    }
  }

  onSubmit(e) {
    e.preventDefault();
    const newProject = {
      projectName: this.state.projectName,
      projectIdentifier: this.state.projectIdentifier,
      description: this.state.description,
      start_date: this.state.start_date,
      end_date: this.state.end_date,
    };
    console.log(newProject);
    this.props.createProject(newProject, this.props.history);
  }

  onChange(e) {
    this.setState({ [e.target.name]: e.target.value });
  }

  render() {
    const { errors } = this.state;

    return (
      <div className="container" style={{ marginTop: "6rem" }}>
        <div className="row col-md-8 m-auto">
          <span className="text-light mb-4 h1">CREATE PROJECT</span>
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
                UNIQUE PROJECT ID <span style={{ color: "red" }}>*</span>
              </span>
              <input
                type="text"
                className={classnames("form-control form-control-lg", {
                  "is-invalid": errors.projectIdentifier,
                })}
                placeholder="Enter Unique Project ID"
                name="projectIdentifier"
                value={this.state.projectIdentifier}
                onChange={this.onChange}
              />
              {errors.projectIdentifier && (
                <div className="invalid-feedback">
                  {errors.projectIdentifier}
                </div>
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

AddProject.propTypes = {
  createProject: PropTypes.func.isRequired,
  errors: PropTypes.object.isRequired,
};

const mapStateToProps = (state) => ({
  errors: state.errors,
});

export default connect(mapStateToProps, { createProject })(AddProject);
