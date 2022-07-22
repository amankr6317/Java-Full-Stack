import PropTypes from "prop-types";
import { Component } from "react";
import { connect } from "react-redux";
import { Link } from "react-router-dom";
import { getTasks } from "../../../redux/actions/taskActions";
import ProjectBoardContent from "./ProjectBoardContent";

class ProjectBoard extends Component {
  componentDidMount() {
    const { id } = this.props.match.params;
    this.props.getTasks(id);
  }

  render() {
    const { tasks } = this.props.task;
    const { id } = this.props.match.params;

    return (
      <div className="container" style={{ marginTop: "6rem" }}>
        <div className="row col-md-12 m-auto">
          <h1 className="text-light mb-4 h1">PROJECT BOARD</h1>
          <hr className="text-light mb-3" />
          <Link
            to={`/addProjectTask/${id}`}
            className="btn btn-info btn-block w-100 mb-5"
          >
            CREATE PROJECT TASK
          </Link>
          <ProjectBoardContent tasks={tasks} />
        </div>
      </div>
    );
  }
}

ProjectBoard.propTypes = {
  task: PropTypes.object.isRequired,
  getTasks: PropTypes.func.isRequired,
};

const mapStateToProps = (state) => ({
  task: state.task,
});

export default connect(mapStateToProps, { getTasks })(ProjectBoard);
