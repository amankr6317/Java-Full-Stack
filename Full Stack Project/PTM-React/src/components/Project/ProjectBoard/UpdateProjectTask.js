import PropTypes from "prop-types";
import { Component } from "react";
import { connect } from "react-redux";
import { Link } from "react-router-dom";
import classnames from "classnames";
import { getTask, createProjectTask } from "../../../redux/actions/taskActions";

class UpdateProjectTask extends Component {
  constructor() {
    super();
    this.state = {
      id: "",
      projectTaskIdentifier: "",
      summary: "",
      acceptanceCriteria: "",
      status: "",
      priority: "",
      dueDate: "",
      projectIdentifier: "",
      created_At: "",
      errors: {},
    };
    this.onChange = this.onChange.bind(this);
    this.onSubmit = this.onSubmit.bind(this);
  }

  componentDidMount() {
    const { projectid, taskid } = this.props.match.params;
    this.props.getTask(projectid, taskid, this.props.history);
  }

  componentWillReceiveProps(nextProps) {
    if (nextProps.errors) {
      this.setState({ errors: nextProps.errors });
    }
    this.setState({
      id: nextProps.task.id,
      projectTaskIdentifier: nextProps.task.projectTaskIdentifier,
      summary: nextProps.task.summary,
      acceptanceCriteria: nextProps.task.acceptanceCriteria,
      status: nextProps.task.status,
      priority: nextProps.task.priority,
      dueDate: nextProps.task.dueDate,
      projectIdentifier: nextProps.task.projectIdentifier,
      created_At: nextProps.task.created_At,
    });
  }

  onSubmit(e) {
    e.preventDefault();
    const updateTask = {
      id: this.state.id,
      projectTaskIdentifier: this.state.projectTaskIdentifier,
      summary: this.state.summary,
      acceptanceCriteria: this.state.acceptanceCriteria,
      status: this.state.status,
      priority: this.state.priority,
      dueDate: this.state.dueDate,
      projectIdentifier: this.state.projectIdentifier,
      created_At: this.state.created_At,
    };
    this.props.createProjectTask(
      this.state.projectIdentifier,
      updateTask,
      this.props.history
    );
  }

  onChange(e) {
    this.setState({ [e.target.name]: e.target.value });
  }

  render() {
    const { projectid } = this.props.match.params;
    const { errors } = this.state;

    return (
      <>
        <div className="container" style={{ marginTop: "6rem" }}>
          <div className="row  col-md-8 m-auto">
            <>
              <span className="text-light mb-4 h1">UPDATE PROJECT TASK</span>
              <hr className="text-light mb-5" />
              <form onSubmit={this.onSubmit}>
                <div className="input-group mb-3">
                  <span className="input-group-text w-25" id="basic-addon1">
                    PROJECT TASK NAME <span style={{ color: "red" }}>*</span>
                  </span>
                  <input
                    type="text"
                    className={classnames("form-control form-control-lg", {
                      "is-invalid": errors.summary,
                    })}
                    name="summary"
                    placeholder="Enter Project Task Summary"
                    value={this.state.summary}
                    onChange={this.onChange}
                  />
                  {errors.summary && (
                    <div className="invalid-feedback">{errors.summary}</div>
                  )}
                </div>
                <div className="input-group mb-3">
                  <span className="input-group-text w-25" id="basic-addon1">
                    ACCEPTANCE CRITERIA <span style={{ color: "red" }}>*</span>
                  </span>
                  <textarea
                    className="form-control form-control-lg"
                    placeholder="Enter Acceptance Criteria"
                    name="acceptanceCriteria"
                    value={this.state.acceptanceCriteria}
                    onChange={this.onChange}
                  />
                </div>
                <div className="input-group mb-3">
                  <span className="input-group-text w-25" id="basic-addon1">
                    DUE DATE <span style={{ color: "red" }}>*</span>
                  </span>
                  <input
                    type="date"
                    className="form-control form-control-lg"
                    name="dueDate"
                    value={this.state.dueDate}
                    onChange={this.onChange}
                  />
                </div>
                <div className="input-group mb-3">
                  <span className="input-group-text w-25" id="basic-addon1">
                    SELECT PRIORITY <span style={{ color: "red" }}>*</span>
                  </span>
                  <select
                    className="form-control form-control-lg"
                    name="priority"
                    value={this.state.priority}
                    onChange={this.onChange}
                  >
                    <option value={1}>HIGH</option>
                    <option value={2}>MEDIUM</option>
                    <option value={3}>LOW</option>
                  </select>
                </div>
                <div className="input-group mb-3">
                  <span className="input-group-text w-25" id="basic-addon1">
                    SELECT STATUS <span style={{ color: "red" }}>*</span>
                  </span>
                  <select
                    className="form-control form-control-lg"
                    name="status"
                    value={this.state.status}
                    onChange={this.onChange}
                  >
                    <option value="TO_DO">TO DO</option>
                    <option value="IN_PROGRESS">IN PROGRESS</option>
                    <option value="DONE">DONE</option>
                  </select>
                </div>
                <input
                  type="submit"
                  className="btn btn-info btn-block mt-4 w-100"
                  value="SUBMIT"
                />
              </form>
              <Link
                to={`/projectBoard/${projectid}`}
                className="btn btn-secondary btn-block mt-3 w-100"
              >
                BACK TO PROJECT BOARD
              </Link>
            </>
          </div>
        </div>
      </>
    );
  }
}

UpdateProjectTask.propTypes = {
  getTask: PropTypes.func.isRequired,
  task: PropTypes.object.isRequired,
  createProjectTask: PropTypes.func.isRequired,
  errors: PropTypes.object.isRequired,
};

const mapStateToProps = (state) => ({
  task: state.task.task,
  errors: state.errors,
});

export default connect(mapStateToProps, { getTask, createProjectTask })(
  UpdateProjectTask
);
