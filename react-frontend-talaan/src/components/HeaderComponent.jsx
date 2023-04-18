import React, { Component } from 'react'

class HeaderComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
                 
        }
    }

    render() {
        return (
            
            <div>
                <header>
                <div class="jumbotron">

                        <div class="text-center">
                        <br></br> 
<br></br>


                        <h1>Talaan Prototype</h1> 
                          
                        <br></br>
                        <br></br>
            

                     </div>
                    </div>

                    <div>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
       
                        
      </button>

    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
        
      <ul class="nav navbar-nav" >
    
         <li><a href="/Home">Home</a></li>
        <li><a href="/">Shop</a></li>
        <li><a href="/sign_up">Sign up</a></li>		
        <li><a href="/login">Login</a></li>
        
      </ul>
    
    </div>
  </div>
</nav>
                    </div>
                </header>
            </div>
        )
    }
}

export default HeaderComponent