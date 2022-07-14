import Header from "./components/Header";
import Layout from "./components/Layout";
import { store } from "./state/store";
import { Provider } from "react-redux";

function App() {
  return (
    <>
      <Provider store={store}>
        <Header />
        <Layout />
      </Provider>
    </>
  );
}

export default App;
