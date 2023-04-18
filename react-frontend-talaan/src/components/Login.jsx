import React, { Component } from 'react'

class Login extends Component {
    constructor(props) {
        super(props)

        this.state = {
                 
        }
    }

    render() {
        return (
         
            <div className="ft">
                


    
                <center>
      <p class="ab1" > 
      <br></br>
      <br></br>
 
  LOGIN
  </p>
  </center>
  
  <p class="ab2">
 
 </p>

 <br></br>
  <input type="text" id="usn" class="usn" placeholder="Username"></input>      
<br></br>
  <input type="password" id="pw"  class="pw" placeholder="      Password" ></input> <button type="button" class="butshow" id="show" onclick="show()"></button> 
  
  <p class ="ab2" id="text"></p>
<br></br>
  <button type="button" class="butlog" id="login" onclick="login()">LOGIN </button>

<br></br>
<br></br>
<a href="Signup.html" class ="ab3" id="text">No account?<b>Sign up!</b></a>
<br></br>
<a href="Remember.html" class ="ab3" id="text"><b>Remember Password</b></a>


<br></br><br></br><br></br><br></br><br></br>
      


<br></br><br></br><br></br><br></br><br></br><br></br><br></br><br></br><br></br><br></br>

                
             
            </div>
            
        )
  }
  
  
}


export default Login