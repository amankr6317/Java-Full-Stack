import { Component } from "react";
import ProjectBoardItem from "./ProjectBoardItem";

class ProjectBoardContent extends Component {
  render() {
    const { tasks } = this.props;

    let todoItems = [];
    let inProgressItems = [];
    let doneItems = [];
    let backLog = [];
    let currentDate = new Date();

    const items = tasks.map((task) => (
      <ProjectBoardItem key={task.id} task={task} />
    ));

    for (let i = 0; i < items.length; i++) {
      if (items[i].props.task.status === "TO_DO") {
        todoItems.push(items[i]);
        let taskTime = new Date(items[i].props.task.dueDate);
        if (currentDate.getTime() > taskTime.getTime()) {
          backLog.push(items[i]);
        }
      }
      if (items[i].props.task.status === "IN_PROGRESS") {
        inProgressItems.push(items[i]);
        let taskTime = new Date(items[i].props.task.dueDate);
        if (currentDate.getTime() > taskTime.getTime()) {
          backLog.push(items[i]);
        }
      }
      if (items[i].props.task.status === "DONE") {
        doneItems.push(items[i]);
      }
    }
    return (
      <>
        <div className="col-md-3">
          <button
            type="button"
            className="btn btn-secondary mb-3 w-100"
            disabled
          >
            <span style={{ fontSize: "2rem" }}>TO DO</span>
          </button>
          {todoItems}
        </div>
        <div className="col-md-3">
          <button type="button" className="btn btn-primary mb-3 w-100" disabled>
            <span style={{ fontSize: "2rem" }}>IN PROGRESS</span>
          </button>
          {inProgressItems}
        </div>
        <div className="col-md-3">
          <button type="button" className="btn btn-success mb-3 w-100" disabled>
            <span style={{ fontSize: "2rem" }}>DONE</span>
          </button>
          {doneItems}
        </div>
        <div className="col-md-3">
          <button type="button" className="btn btn-danger mb-3 w-100" disabled>
            <span style={{ fontSize: "2rem" }}>BACKLOG</span>
          </button>
          {backLog}
        </div>
      </>
    );
  }
}

export default ProjectBoardContent;
