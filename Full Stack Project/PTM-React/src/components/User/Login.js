import classnames from "classnames";
import PropTypes from "prop-types";
import { Component } from "react";
import { connect } from "react-redux";
import { login } from "../../redux/actions/securityActions";

class Login extends Component {
  constructor() {
    super();
    this.state = {
      username: "",
      password: "",
      errors: {},
    };
    this.onChange = this.onChange.bind(this);
    this.onSubmit = this.onSubmit.bind(this);
  }

  componentDidMount() {
    if (this.props.security.validToken) {
      this.props.history.push("/dashboard");
    }
  }

  componentWillReceiveProps(nextProps) {
    if (nextProps.security.validToken) {
      this.props.history.push("/dashboard");
    }
    if (nextProps.errors) {
      this.setState({ errors: nextProps.errors });
    }
  }

  onSubmit(e) {
    e.preventDefault();
    const LoginRequest = {
      username: this.state.username,
      password: this.state.password,
    };
    console.log(LoginRequest);
    this.props.login(LoginRequest);
  }

  onChange(e) {
    this.setState({ [e.target.name]: e.target.value });
  }

  render() {
    const { errors } = this.state;

    return (
      <div className="container" style={{ marginTop: "6rem" }}>
        <div className="row col-md-8 m-auto">
          <span className="text-light mb-4 h1">SIGN IN</span>
          <hr className="text-light mb-5" />
          <form onSubmit={this.onSubmit}>
            <div className="input-group mb-3">
              <span className="input-group-text w-25" id="basic-addon1">
                EMAIL ID <span style={{ color: "red" }}>*</span>
              </span>
              <input
                type="text"
                className={classnames("form-control form-control-lg", {
                  "is-invalid": errors.username,
                })}
                placeholder="Enter your Email Id"
                name="username"
                value={this.state.username}
                onChange={this.onChange}
              />
              {errors.username && (
                <div className="invalid-feedback">{errors.username}</div>
              )}
            </div>
            <div className="input-group mb-3">
              <span className="input-group-text w-25" id="basic-addon1">
                PASSWORD <span style={{ color: "red" }}>*</span>
              </span>
              <input
                type="password"
                className={classnames("form-control form-control-lg", {
                  "is-invalid": errors.password,
                })}
                placeholder="Enter your Password"
                name="password"
                value={this.state.password}
                onChange={this.onChange}
              />
              {errors.password && (
                <div className="invalid-feedback">{errors.password}</div>
              )}
            </div>
            <input
              type="submit"
              className="btn btn-info btn-block mt-4 w-100"
              value="SUBMIT"
            />
          </form>
        </div>
      </div>
    );
  }
}

Login.propTypes = {
  login: PropTypes.func.isRequired,
  errors: PropTypes.object.isRequired,
  security: PropTypes.object.isRequired,
};

const mapStateToProps = (state) => ({
  security: state.security,
  errors: state.errors,
});

export default connect(mapStateToProps, { login })(Login);
