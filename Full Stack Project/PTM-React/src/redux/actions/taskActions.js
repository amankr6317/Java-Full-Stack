import axios from "axios";

export const getTasks = (projectIdentifier) => async (dispatch) => {
  console.log({ URl: `/api/task/all/${projectIdentifier}` });
  const response = await axios.get(`/api/task/all/${projectIdentifier}`);
  dispatch({
    type: "GET_TASKS",
    payload: response.data,
  });
};

export const getTask =
  (projectIdentifier, projectTaskIdentifier, history) => async (dispatch) => {
    try {
      console.log({
        URL: `/api/task/${projectIdentifier}/${projectTaskIdentifier}`,
      });
      const response = await axios.get(
        `/api/task/${projectIdentifier}/${projectTaskIdentifier}`
      );
      dispatch({
        type: "GET_TASK",
        payload: response.data,
      });
    } catch (error) {
      history.push(`/projectBoard/${projectIdentifier}`);
    }
  };

export const createProjectTask =
  (projectIdentifier, task, history) => async (dispatch) => {
    try {
      console.log({ URL: `/api/task/${projectIdentifier}` });
      await axios.post(`/api/task/${projectIdentifier}`, task);
      history.push(`/projectBoard/${projectIdentifier}`);
      dispatch({
        type: "GET_ERRORS",
        payload: {},
      });
    } catch (err) {
      dispatch({
        type: "GET_ERRORS",
        payload: err.response.data,
      });
    }
  };

export const deleteProjectTask = (projectId, taskId) => async (dispatch) => {
  if (
    window.confirm(
      "Are you sure? This will delete the project task and all the data related to it"
    )
  ) {
    console.log({ URL: `/api/task/${projectId}/${taskId}` });
    await axios.delete(`/api/task/${projectId}/${taskId}`);
    dispatch({
      type: "DELETE_TASK",
      payload: taskId,
    });
  }
};
