import './Main.css';

import Logo from '../imgs/logo/light.png';
import Shop from '../imgs/icons/shop.svg';
import Sell from '../imgs/icons/sell.svg';
import Cart from '../imgs/icons/cart.svg';
import User from '../imgs/icons/user.svg'

export default function Heading(props) {
    return (
        <div className="heading">
            <nav className="navbar navbar-expand-lg">
                <div className="container">
                    <div className="d-flex justify-content-start">
                        <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                            <li className="nav-item">
                                <img src={Logo} className="logo" />
                            </li>
                            <li className="nav-item">
                                <img src={Shop} alt="Left Nav Item 2" />
                            </li>
                            <li className="nav-item">
                                <img src={Sell} alt="Left Nav Item 3" />
                            </li>
                        </ul>
                    </div>

                    <div className="d-flex justify-content-center">
                        <a className="navbar-brand" href="#">
                            
                        </a>
                    </div>

                    <div className="d-flex justify-content-end">
                        <ul className="navbar-nav ms-auto mb-2 mb-lg-0">
                            <li className="nav-item">
                                <img src={Cart} alt="Right Nav Item 1" />
                            </li>
                            <li className="nav-item">
                                <img src={User} alt="Right Nav Item 2" />
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>


        </div>
    )
}