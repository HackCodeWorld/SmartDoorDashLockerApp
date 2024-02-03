import React, { useState } from 'react';
import axios from 'axios';
import 'bootstrap/dist/css/bootstrap.min.css';

const CourierMenuComponent = () => {
    const [menuOption, setMenuOption] = useState(0); // 0: main menu, 1: add express, etc.
    const [express, setExpress] = useState({ expressNumber: '', company: '' });
    const [message, setMessage] = useState('');

    const handleMenuOptionChange = (option) => {
        setMenuOption(option);
        // Reset states
        setExpress({ expressNumber: '', company: '' });
        setMessage('');
    };

    const handleInputChange = (e) => {
        const { name, value } = e.target;
        setExpress((prevExpress) => ({
            ...prevExpress,
            [name]: value
        }));
    };

    const handleAddExpress = async () => {
        try {
            const newExpress = {
                ...express,
                status: 0, // 设置默认状态
                // 如果还有其他字段需要默认值，也可以在这里添加
            };
            const response = await axios.post('http://localhost:8080/api/express/', newExpress);
            setMessage(response.data.message || 'food / package added successfully');
            // Fetch updated express count or list if needed
        } catch (error) {
            console.error('Error adding food / package:', error);
            setMessage('Error adding food / package');
        }
    };
    
    return (
        <div className="container mt-5" style={{ textAlign: 'center', backgroundImage: 'url("idea2.png")', backbackgroundSize: 'cover', height: '100vh' }}>
            <h2 className="mb-4">Appreciate Your Effort for the Community, lovely dasher 😄🚀💗</h2>
            <p>please choose your selection</p>
            {menuOption === 0 && (
                <div className="btn-group-vertical mb-4">
                    <button className="btn btn-primary mb-2" onClick={() => handleMenuOptionChange(1)}>Locking our yummy food in the warm block~~</button>
                    {/* ... other buttons ... */}
                </div>
            )}
            {menuOption === 1 && (
                <div>
                    <h3 className="mb-3"> 🌽 🍣 🍜 🍚 🍜 🍚 🍜 🍚 Enter Food 🦐 🦞 🍗 🦴 🌽 🍣 🦐 🦞</h3>
                    <div className="mb-3">
                        <input
                            type="text"
                            name="expressNumber"
                            className="form-control mb-2"
                            placeholder="Please enter the delivery number"
                            value={express.expressNumber}
                            onChange={handleInputChange}
                        />
                        <input
                            type="text"
                            name="company"
                            className="form-control mb-2"
                            placeholder="Please enter the company name"
                            value={express.company}
                            onChange={handleInputChange}
                        />
                        <button className="btn btn-success" onClick={handleAddExpress}>Submit</button>
                    </div>
                    {message && <div className="alert alert-info">{message}</div>}
                </div>
            )}
            {/* ... other menu options ... */}
        </div>
    );
};

export default CourierMenuComponent;
