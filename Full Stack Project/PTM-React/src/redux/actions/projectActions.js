import axios from "axios";

export const getProjects = () => async (dispatch) => {
  console.log({ URL: "/api/project/all" });
  const response = await axios.get("/api/project/all");
  dispatch({
    type: "GET_PROJECTS",
    payload: response.data,
  });
};

export const getProject = (id, history) => async (dispatch) => {
  try {
    console.log({ URL: `/api/project/${id}` });
    const response = await axios.get(`/api/project/${id}`);
    dispatch({
      type: "GET_PROJECT",
      payload: response.data,
    });
  } catch (error) {
    history.push("/dashboard");
  }
};

export const createProject = (project, history) => async (dispatch) => {
  try {
    console.log({ URL: "/api/project" });
    await axios.post("/api/project", project);
    history.push("/dashboard");
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

export const deleteProject = (id) => async (dispatch) => {
  if (
    window.confirm(
      "Are you sure? This will delete the project and all the data related to it"
    )
  ) {
    console.log({ URL: `/api/project/${id}` });
    await axios.delete(`/api/project/${id}`);
    dispatch({
      type: "DELETE_PROJECT",
      payload: id,
    });
  }
};
