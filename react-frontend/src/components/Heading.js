import './Main.css';

import Navbar from './Navbar';
import ForPinoys from './ForPinoys';

import Element1 from '../imgs/talaan_pic2.png'
import LightPeng from '../imgs/logo/light.png'
import RightArrow from '../imgs/icons/right_arrow.svg'

export default function Heading(props) {
    return (
        <section className="heading row">
            <div className='col'>
                <h1>T<img src={LightPeng} style={{ width: '4vw' }}></img>laan</h1>
                <h3>An online hub of books written by Pinoys, <span style={{color: '#E49757', fontWeight: 'bold'}}>for Pinoys!</span></h3>
                <button type="button">see more</button>
            </div>
            <div className='col'>
                <img src={Element1} style={{width: '50vw'}}></img>
            </div>
        </section>
    )
}

{/* <div className='container-fluid row '>
    <div className='col d-flex justify-content-center flex-column header'>
        <h1 className='title' style={{ color: '#4A3724', fontSize: '9em' }}>T<img src={LightPeng} style={{ width: '63px' }}></img>laan</h1>
        <div>
            <h3 className='desc' style={{ color: '#6E8668', fontWeight: 'bold' }}>An online hub of books written by Pinoys,<ForPinoys className='forPinoys' style={{ alignItems: 'bottom' }} /></h3>

        </div>
        <button className='btn d-flex justify-content-around align-items-center' type="button">
            <div className='m-0' style={{ verticalAlign: '100' }}>see more</div>
            <img src={RightArrow} style={{ width: '7.5px' }}></img>
        </button>
    </div>
    <div className='col'>
        <img src={Element1}></img>
    </div>
</div> */}