import axios from "axios";
import jwt_decode from "jwt-decode";
// import setJWTToken from "../../securityUtils/setJWTToken";

export const login = (LoginRequest) => async (dispatch) => {
  try {
    console.log({ URL: "/api/users/login" });
    const response = await axios.post("/api/users/login", LoginRequest);
    const { token } = response.data;
    localStorage.setItem("jwtToken", token);
    axios.defaults.headers.common["Authorization"] = token;
    // setJWTToken(token);
    const decoded = jwt_decode(token);
    dispatch({
      type: "SET_CURRENT_USER",
      payload: decoded,
    });
  } catch (err) {
    dispatch({
      type: "GET_ERRORS",
      payload: err.response.data,
    });
  }
};

export const createNewUser = (newUser, history) => async (dispatch) => {
  try {
    console.log({ URL: "/api/users/register" });
    const response = await axios.post("/api/users/register", newUser);
    history.push("/login");
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

export const logout = () => (dispatch) => {
  localStorage.removeItem("jwtToken");
  delete axios.defaults.headers.common["Authorization"];
  // setJWTToken(false);
  dispatch({
    type: "SET_CURRENT_USER",
    payload: {},
  });
};
