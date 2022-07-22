import classnames from "classnames";
import PropTypes from "prop-types";
import { Component } from "react";
import { connect } from "react-redux";
import { createNewUser } from "../../redux/actions/securityActions";

class Register extends Component {
  constructor() {
    super();
    this.state = {
      username: "",
      fullName: "",
      password: "",
      confirmPassword: "",
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
    if (nextProps.errors) {
      this.setState({ errors: nextProps.errors });
    }
  }

  onSubmit(e) {
    e.preventDefault();
    const newUser = {
      username: this.state.username,
      fullName: this.state.fullName,
      password: this.state.password,
      confirmPassword: this.state.confirmPassword,
    };
    console.log(newUser);
    this.props.createNewUser(newUser, this.props.history);
  }

  onChange(e) {
    this.setState({ [e.target.name]: e.target.value });
  }

  render() {
    const { errors } = this.state;

    return (
      <div className="container" style={{ marginTop: "6rem" }}>
        <div className="row col-md-8 m-auto">
          <span className="text-light mb-4 h1">SIGN UP</span>
          <hr className="text-light mb-5" />
          <form onSubmit={this.onSubmit}>
            <div className="input-group mb-3">
              <span className="input-group-text w-25" id="basic-addon1">
                FULL NAME <span style={{ color: "red" }}>*</span>
              </span>
              <input
                type="text"
                className={classnames("form-control form-control-lg", {
                  "is-invalid": errors.fullName,
                })}
                placeholder="Enter your Full Name"
                name="fullName"
                value={this.state.fullName}
                onChange={this.onChange}
              />
              {errors.fullName && (
                <div className="invalid-feedback">{errors.fullName}</div>
              )}
            </div>
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
            <div className="input-group mb-3">
              <span className="input-group-text w-25" id="basic-addon1">
                CONFIRM PASSWORD <span style={{ color: "red" }}>*</span>
              </span>
              <input
                type="password"
                className={classnames("form-control form-control-lg", {
                  "is-invalid": errors.confirmPassword,
                })}
                placeholder="Re-Enter your Password"
                name="confirmPassword"
                value={this.state.confirmPassword}
                onChange={this.onChange}
              />
              {errors.confirmPassword && (
                <div className="invalid-feedback">{errors.confirmPassword}</div>
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

Register.propTypes = {
  createNewUser: PropTypes.func.isRequired,
  errors: PropTypes.object.isRequired,
  security: PropTypes.object.isRequired,
};

const mapStateToProps = (state) => ({
  errors: state.errors,
  security: state.security,
});

export default connect(mapStateToProps, { createNewUser })(Register);
