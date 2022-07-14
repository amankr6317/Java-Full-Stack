import React from "react";
import { useSelector, useDispatch } from "react-redux";
import { increment, decrement } from "../state/actions/action";

const Layout = () => {
  const dispatch = useDispatch();
  const reducer = useSelector((state) => state.reducer);

  return (
    <div className="container" style={{ textAlign: "center" }}>
      <button
        className="btn btn-primary mx-5 my-5"
        style={{ width: "40px" }}
        onClick={() => {
          dispatch(decrement(100));
        }}
      >
        -
      </button>
      <span>{reducer}</span>
      <button
        className="btn btn-primary mx-5 my-5"
        style={{ width: "40px" }}
        onClick={() => {
          dispatch(increment(100));
        }}
      >
        +
      </button>
    </div>
  );
};

export default Layout;
