const intialstate = 0;

export const reducer = (state = intialstate, action) => {
  if (action.type === "increment") {
    return state + action.payload;
  } else if (action.type === "decrement") {
    return state - action.payload;
  } else {
    return state;
  }
};