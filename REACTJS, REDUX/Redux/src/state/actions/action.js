export const increment = (variable) => {
  return (dispatch) => {
    dispatch({
      type: "increment",
      payload: variable,
    });
  };
};

export const decrement = (variable) => {
  return (dispatch) => {
    dispatch({
      type: "decrement",
      payload: variable,
    });
  };
};
