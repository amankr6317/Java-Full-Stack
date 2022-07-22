import PropTypes from "prop-types";
import { Component } from "react";
import { connect } from "react-redux";
import { Link } from "react-router-dom";

class Landing extends Component {
  componentDidMount() {
    if (this.props.security.validToken) {
      this.props.history.push("/dashboard");
    }
  }

  render() {
    return (
      <div className="text-dark" style={{ marginTop: "11rem" }}>
        <div className="container">
          <div className="col-md-12 text-center">
            <h1 className="display-3 mb-4 text-light">
              Personal Project Task Management
            </h1>
            <p className="fs-3 text-light">
              Create your Account to Join, Start your own Project
            </p>
            <p className="fs-5 text-light">
              Login to continue working on our Project
            </p>
            <hr className="text-light" />
            <Link className="btn btn-lg btn-primary mx-1 " to="/register">
              SIGN UP
            </Link>
            <Link className="btn btn-lg btn-secondary mx-1" to="/login">
              SIGN IN
            </Link>
          </div>
        </div>
      </div>
    );
  }
}

Landing.propTypes = {
  security: PropTypes.object.isRequired,
};

const mapStateToProps = (state) => ({
  security: state.security,
});

export default connect(mapStateToProps)(Landing);
