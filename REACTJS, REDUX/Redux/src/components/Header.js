import React from "react";
import { useSelector } from "react-redux";

const Header = () => {
  const reducer = useSelector(state => state.reducer );
  return (
    <>
      <nav className="navbar bg-light">
        <div className="container">
          <a className="navbar-brand fs-1" href="/">
            REDUX
          </a>
          <div>
            <button className="btn btn-danger" disabled={true}>
              {reducer}
            </button>
          </div>
        </div>
      </nav>
    </>
  );
};

export default Header;
