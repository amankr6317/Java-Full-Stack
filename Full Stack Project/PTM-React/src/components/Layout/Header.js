import PropTypes from "prop-types";
import { Component } from "react";
import { connect } from "react-redux";
import { Link } from "react-router-dom";
import { logout } from "../../redux/actions/securityActions";

class Header extends Component {
  logout() {
    this.props.logout();
    window.location.href = "/";
  }

  render() {
    const { validToken, user } = this.props.security;

    const userIsAuthenticated = (
      <>
        <ul className="nav" style={{marginRight: "30rem"}}>
          <li className="nav-item">
            <Link className="nav-link" to="/dashboard">
              Dashboard
            </Link>
          </li>
        </ul>
        <ul className="nav justify-content-end">
          <li className="nav-item">
            <Link className="nav-link" to="/dashboard">
              <i className="fas fa-user-circle mr-1" />
              {user.fullName}
            </Link>
          </li>
          <li className="nav-item">
            <Link
              className="nav-link active"
              to="/logout"
              onClick={this.logout.bind(this)}
            >
              SIGN OUT
            </Link>
          </li>
        </ul>
      </>
    );

    const userIsNotAuthenticated = (
      <>
        <ul className="nav justify-content-end">
          <li className="nav-item">
            <Link className="nav-link active" to="/register">
              SIGN UP
            </Link>
          </li>
          <li className="nav-item">
            <Link className="nav-link active" to="/login">
              SIGN IN
            </Link>
          </li>
        </ul>
      </>
    );

    let headerLinks;

    if (validToken && user) {
      headerLinks = userIsAuthenticated;
    } else {
      headerLinks = userIsNotAuthenticated;
    }

    return (
      <nav className="navbar navbar-light bg-light fixed-top">
        <div className="container">
          <Link className="navbar-brand" to="/">
            <h2 className="text-dark">PROJECT TASK MANAGEMENT</h2>
          </Link>
          {headerLinks}
        </div>
      </nav>
    );
  }
}

Header.propTypes = {
  logout: PropTypes.func.isRequired,
  security: PropTypes.object.isRequired,
};

const mapStateToProps = (state) => ({
  security: state.security,
});

export default connect(mapStateToProps, { logout })(Header);
