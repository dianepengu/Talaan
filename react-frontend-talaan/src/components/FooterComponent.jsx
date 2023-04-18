import React, { Component } from 'react'

class FooterComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
                 
        }
    }

    render() {
        return (
            <div>
                <footer className = "footer">
             <br></br><br></br><br></br><br></br><br></br><br></br><br></br>
                <img className="footerpic" 
                             src={`${process.env.PUBLIC_URL}/assets/images/talaan logo.png`} 
                            alt="logo"/>
                    <span className="text-foot"></span>
                </footer>
            </div>
        )
    }
}

export default FooterComponent