import { useState } from 'react'
import { Routes, Route, Link, useNavigate } from 'react-router-dom';
import { styled } from 'styled-components';
//projects
import Principal from '../../layout/Principal/Principal.jsx';
import FreeCodeCamp from '../../layout/FreeCodeCamp/FreeCodeCamp.jsx';
import PlatziJuanD from '../../layout/Platzi-JuanD/Platzi-JuanD.jsx';
import PlatziTeffy from '../../layout/Platzi-Teffy/PlatziTeffy.jsx';
import Miduved from '../../layout/Miduved/Miduved.jsx';
import {
	AppstoreOutlined,
	ContainerOutlined,
	DesktopOutlined,
	MailOutlined,
	MenuFoldOutlined,
	MenuUnfoldOutlined,
	PieChartOutlined,
} from '@ant-design/icons';
import { Button, Menu } from 'antd';


const ContentStyle = styled.div`
	margin: 24px;
	background-color: pink;
	flex-grow: 1;
`;

const Nav = () => {
	const navigate = useNavigate();
	const proyectos = [
		//*FreeCodeCamp*//
	{ key: '1', path: '/', label: 'Home', icon: <MailOutlined /> },
	{ key: '2', path: '/FreeCodeCamp', label: 'FreeCodeCamp', icon: <MailOutlined /> },
	{ key: '3', path: '/PlatziJuanD', label: 'PlatziJuanD', icon: <DesktopOutlined /> },
	{ key: '4', path: '/PlatziTeffy', label: 'PlatziTeffy', icon: <ContainerOutlined /> },
	{ key: '5', path: '/Miduved', label: 'Miduved', icon: <AppstoreOutlined /> },
	]

	//no erase because is only example of dymamic items
	const initialItems = [
		{ key: '1', icon: <PieChartOutlined />, label: 'Option 1' },
		{ key: '2', icon: <DesktopOutlined />, label: 'Option 2' },
		{ key: '3', icon: <ContainerOutlined />, label: 'Option 3' },
		{
			key: 'sub1',
			label: 'FreeCodeCamp',
			icon: <MailOutlined />,
			children: [
				{ key: '5', label: 'Testimonios' },
				{ key: '6', label: 'ClickCounter' },
				{ key: '7', label: 'Calculadora' },
				{ key: '8', label: 'Access' },
			],
		},
		{
			key: 'sub2',
			label: 'Navigation Two',
			icon: <AppstoreOutlined />,
			children: [
				{ key: '9', label: 'Option 9' },
				{ key: '10', label: 'Option 10' },
				{
					key: 'sub3',
					label: 'Submenu',
					children: [
						{ key: '11', label: 'Option 11' },
						{ key: '12', label: 'Option 12' },
					],
				},
			],
		},
	];

	const [collapsed, setCollapsed] = useState(false);
	const toggleCollapsed = () => {
		setCollapsed(!collapsed);
	};
	
	function getKey(info) {
		const selected = proyectos.find((p) => p.key === info.key);
    if (selected) {
      console.log('La key seleccionada es:', info.key);
      console.log('Redirigiendo a:', selected.path);
      navigate(selected.path); // 👈 redirección aquí
    }
	};

	return (
    <div style={{ display: 'flex', backgroundColor: 'green' }}>
      <div style={{ width: 255 , backgroundColor: 'green' }}>
        <Button
          type="primary"
          onClick={toggleCollapsed}
          style={{ marginBottom: 16 }}
        >
          {collapsed ? <MenuUnfoldOutlined /> : <MenuFoldOutlined />}
        </Button>

        <Menu
          defaultSelectedKeys={['1']}
          mode="inline"
          theme="dark"
          inlineCollapsed={collapsed}
          items={proyectos}
          onClick={getKey}
        />
      </div>
{/*
      <div style={{ marginLeft: 24, flexGrow: 1 }}>
        <nav>
          <ul>
            <li><Link to="/">Home</Link></li>
            <li><Link to="/FreeCodeCamp">FreeCodeCamp</Link></li>
            <li><Link to="/PlatziJuanD">PlatziJuanD</Link></li>
            <li><Link to="/PlatziTeffy">PlatziTeffy</Link></li>
            <li><Link to="/Miduved">Miduved</Link></li>
          </ul>
        </nav>
*/}
<ContentStyle>
		<Routes>
			<Route path="/" element={<Principal />} />
			<Route path="/FreeCodeCamp" element={<FreeCodeCamp />} />
			<Route path="/PlatziJuanD" element={<PlatziJuanD />} />
			<Route path="/PlatziTeffy" element={<PlatziTeffy />} />
			<Route path="/Miduved" element={<Miduved />} />
		</Routes>
</ContentStyle>
        
    
    </div>
  );
};

export default Nav;