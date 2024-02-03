import React, { useState, useEffect } from 'react';
import axios from 'axios';

const ExpressComponent = () => {
    const [expresses, setExpresses] = useState([]);
    const [loading, setLoading] = useState(true);

    // 获取所有快递信息
    useEffect(() => {
        const fetchExpresses = async () => {
            try {
                const response = await axios.get('http://localhost:8080/api/express/');
                setExpresses(response.data);
                setLoading(false);
            } catch (error) {
                console.error('Error fetching expresses:', error);
                setLoading(false);
            }
        };

        fetchExpresses();
    }, []);

    if (loading) {
        return <div>Loading...</div>;
    }

    return (
        <div>
            <h2>Express List</h2>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Express Number</th>
                        <th>Company</th>
                        <th>Code</th>
                    </tr>
                </thead>
                <tbody>
                    {expresses.map((express) => (
                        <tr key={express.id}>
                            <td>{express.id}</td>
                            <td>{express.expressNumber}</td>
                            <td>{express.company}</td>
                            <td>{express.code}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
};

export default ExpressComponent;
