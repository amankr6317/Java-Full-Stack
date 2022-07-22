import { combineReducers } from "redux";
import errorReducer from "./errorReducer";
import projectReducer from "./projectReducer";
import securityReducer from "./securityReducer";
import taskReducer from "./taskReducer";

export default combineReducers({
  errors: errorReducer,
  security: securityReducer,
  project: projectReducer,
  task: taskReducer,
});
