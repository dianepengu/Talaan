import React, { Component } from 'react'

class FeaturedBooks extends Component {
    constructor(props) {
        super(props)

        this.state = {
                 
        }
    }

    render() {
        return (
         
            <div className="ft">
                


    
    <p class="ab1" > 
      <br></br>
      <br></br>
 
  Sign up
  </p>
  
  <p class="ab2">
 </p>
 <br></br>

  <input type="text" id="usn" class="usn" placeholder="Username"></input>
  
  <br></br>
  <input type="text" id="em" class="usn" placeholder="Email"></input>
  
  <br></br>
  <br></br>
 
  <input type="password" id="pw"  class="pw" placeholder="Password" ></input><button type="button" class="butshow" id="show" onclick="show()"></button>

  
  <br></br>
  <input type="password" id="pw2"  class="pw" placeholder="Password" ></input><button type="button" class="butshow" id="show2" onclick="show2()"></button>

 
  <center>
  <p class ="ab2" id="text">
<br></br><br></br>
  <button type="button" class="butlog" id="signup" onclick="signup()">Sign up</button>
</p>
</center>

<br></br><br></br><br></br><br></br><br></br><br></br>
    


<br></br><br></br><br></br><br></br><br></br><br></br><br></br><br></br><br></br><br></br>
                

                
             
            </div>
            
        )
  }
  
  
}


export default FeaturedBooks