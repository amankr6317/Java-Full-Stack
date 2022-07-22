import PropTypes from "prop-types";
import { Component } from "react";
import { connect } from "react-redux";
import { Link } from "react-router-dom";
import { deleteProjectTask } from "../../../redux/actions/taskActions";

class ProjectBoardItem extends Component {
  onDeleteClick(projectId, taskId) {
    this.props.deleteProjectTask(projectId, taskId);
  }

  render() {
    const { task } = this.props;

    let priorityString;
    let priorityClass;

    if (task.priority === 1) {
      priorityClass = "bg-danger text-light";
      priorityString = "HIGH";
    }

    if (task.priority === 2) {
      priorityClass = "bg-warning text-light";
      priorityString = "MEDIUM";
    }

    if (task.priority === 3) {
      priorityClass = "bg-info text-light";
      priorityString = "LOW";
    }

    return (
      <div className="card mb-1 bg-light">
        <div className={`card-header text-primary ${priorityClass}`}>
          ID: {task.projectTaskIdentifier} -- Priority: {priorityString}
        </div>
        <div className="card-body bg-light">
          <h5 className="card-title">{task.summary}</h5>
          <p className="card-text text-truncate ">{task.acceptanceCriteria}</p>
          <Link
            to={`/updateProjectTask/${task.projectIdentifier}/${task.projectTaskIdentifier}`}
            className="btn btn-primary"
          >
            View / Update
          </Link>
          <button
            className="btn btn-danger ml-4"
            onClick={this.onDeleteClick.bind(
              this,
              task.projectIdentifier,
              task.projectTaskIdentifier
            )}
          >
            Delete
          </button>
        </div>
      </div>
    );
  }
}

ProjectBoardItem.propTypes = {
  deleteProjectTask: PropTypes.func.isRequired,
};

export default connect(null, { deleteProjectTask })(ProjectBoardItem);
