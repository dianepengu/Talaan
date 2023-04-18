
import "./App.css";

import { BrowserRouter as Router, Route, Switch } from "react-router-dom";

import HeaderComponent from "./components/HeaderComponent";
import FooterComponent from "./components/FooterComponent";
import Login from "./components/Login";
import Signup from "./components/Signup";
import Home from "./components/Home";

function App() {
  return (
    
      <div>
      <Router>

        <HeaderComponent />

        <div className="container">
          <Switch>
          
            <Route path="/Home" component={Home}></Route>
            <Route path="/sign_up" component={Signup}></Route>
            <Route path="/login" component={Login}></Route>
          </Switch>
        </div>
<br></br><br></br><br></br>
        <FooterComponent />
      </Router>
    </div>
    
  );
}

export default App;
